
package util;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserFactory {

	// String browser = null; // read from here
	static WebDriver driver;
	static String browser;
	static String url;
	
	//Login
//	String user_name = "demo@techfios.com";
//	String pass_word = "abc123";
	

	public static void readConfig() {
	
		Properties prop = new Properties(); 

		try {
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties"); 
			prop.load(input); 
		
			browser = prop.getProperty("browser");
			System.out.println("Browser used now:" + browser);
			
			url = prop.getProperty("url");
			System.out.println("url deal with:" + url);
			
		} catch (IOException e) { 
			e.printStackTrace();
		}

	}

    @Test
	public static WebDriver inut() {
    	readConfig();
		if (browser.equalsIgnoreCase("chrome")) { 						
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
	}

	
	public static void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
