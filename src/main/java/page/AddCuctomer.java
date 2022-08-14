package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCuctomer extends BasePage {

	WebDriver driver;

	public AddCuctomer(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement customer;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement add;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement name;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement company;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement email;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement phone;
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement address;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement city;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement state;
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement zip;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement country;

	public void custom() {
		customer.click();
	}

	public void adding() {
		add.click();
	}

	public void naming(String name1) {
		name.sendKeys(name1 + i);
	}

	public void companing(String company1) {
		company.sendKeys(company1);
	}

	public void emailing(String email1) {
		email.sendKeys(email1 + i);
	}

	public void phoneing(String phone1) {
		phone.sendKeys(phone1);
	}

	public void addressing(String address1) {
		address.sendKeys(address1);
	}

	public void citing(String city1) {
		city.sendKeys(city1);
	}

	public void stating(String state1) {
		state.sendKeys(state1);
	}

	public void ziping(String zip1) {
		zip.sendKeys(zip1);
	}

	public void countring(String country1) {
		country.sendKeys(country1);
	}
//instead to create select and random class  create inheritance from base_page//////////////////////
//	public void SELECT(WebElement Welement, String visibiletext) {
//		Select sel = new Select(Welement);
//		sel.selectByVisibleText(visibiletext);
//	}
//
//	public int RAND(int i) {
//		Random rnd = new Random();
//		int dom = rnd.nextInt(i);
//		return dom;
//	}
}
