package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPage {
    //1.Global variable
	WebDriver driver;
	//4.create constructor
	public LoginPage(WebDriver driver) {  
		this.driver = driver;
	}
	//2.Global WebElement 												    //instead to this	
	@FindBy(how=How.XPATH, using="//input[@id='username']")WebElement usr;
	//instead/WebElement usr = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	@FindBy(how=How.XPATH, using="//input[@id='password']")WebElement psw;
	//instead//WebElement psw = driver.findElement(By.xpath("//*[@id=\"password\"]")); 
	@FindBy(how=How.XPATH, using="html/body/div/div/div/form/div[3]/button")WebElement lg;
	//instead//WebElement lg = driver.findElement(By.xpath("html/body/div/div/div/form/div[3]/button"));

	//3.Interactive methode1 hard but easy for maintenace:
	public void enterUN (String username) {
	usr.sendKeys(username);
	}
	public  void enterPW (String password) {
	psw.sendKeys(password);
	}
	public  void clickLG () {
	lg.click();
	}
//	//Interactive methode2 easy but hard for maintenace:
//	public void parameterization (String username, String password) {
//		usr.sendKeys(username);
//		psw.sendKeys(password);
//		lg.click();	
//	}
}
