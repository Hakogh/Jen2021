package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	int i = RAND(555);
	
	
	public void SELECT(WebElement Welement, String visibiletext) {
		Select sel = new Select(Welement);
		sel.selectByVisibleText(visibiletext);
	}

	public int RAND(int i) {
		Random rnd = new Random();
		int dom = rnd.nextInt(i);
		return dom;
	}
}
