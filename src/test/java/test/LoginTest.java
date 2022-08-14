package test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class LoginTest {

	// 1.Global variable
	WebDriver driver;
	ExcelReader XLR = new ExcelReader("TestData\\DataTest.xlsx");
	String UserName = XLR.getCellData("LoginInfo", "UserName", 2);                   //getCellData("LoginInfo", "UserName",2);
	String PassWord = XLR.getCellData("LoginInfo", "PassWord", 2);                  //getCellData("LoginInfo", "PassWord",2);
	@Test
	public void loginTest1() {
		driver = BrowserFactory.inut(); 
	}
	@Test
	public void loginTest2() {
		// create object : LoginPage log = new LoginPage();
		LoginPage Pagex = PageFactory.initElements(driver, LoginPage.class); // PageFactory transfer WebDriver deiver to
																				// LoginPage
		Pagex.enterUN(UserName);
		Pagex.enterPW(PassWord);
		Pagex.clickLG();
	}
	@Test
	public void loginTest3() {
// create object
		DashboardPage pgx = PageFactory.initElements(driver, DashboardPage.class);
// 	pgx.dashboard();
		pgx.dashboard("DashBoard", "DashBoard", "title not found");
	}

}
