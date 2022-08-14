package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCuctomer;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;

	@Test
	public void loginTest1() {
		driver = BrowserFactory.inut();

	}

	@Test
	public void loginTest2() {

		LoginPage Pagex = PageFactory.initElements(driver, LoginPage.class);
		Pagex.enterUN("demo@techfios.com");
		Pagex.enterPW("abc123");
		Pagex.clickLG();
	}

	@Test
	public void loginTest3() {
		DashboardPage pgx = PageFactory.initElements(driver, DashboardPage.class);

		pgx.dashboard("DashBoard", "DashBoard", "title not found");
	}

	@Test
	public void loginTest4() {
		AddCuctomer fil = PageFactory.initElements(driver, AddCuctomer.class);
		fil.custom();
		fil.adding();
		fil.naming("jonifer");
		fil.companing("BITS");
		fil.emailing("abc123@gmail.com");
	    fil.phoneing("8575434");
		fil.addressing("rtx140");
		fil.citing("goodland");
		fil.stating("gogg");
		fil.ziping("45034");
		fil.countring("United States");
		
	}
	 //BrowserFactory.teardown();
}
