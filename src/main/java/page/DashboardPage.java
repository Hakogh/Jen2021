package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver driver;
	
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="//*[@id=\\\"page-wrapper\\\"]/div[2]/div/h2")WebElement dsh;
	

//public void dashboard() {
//	Assert.assertEquals("DashBoard", "DashBoard", "title not found");
    
   public void dashboard(String actual, String expected, String message) {
	Assert.assertEquals(actual, expected, message);
	
}
}