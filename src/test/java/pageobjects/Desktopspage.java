package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Desktopspage extends Basepage {

	public Desktopspage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(partialLinkText = "Apple Cinema") WebElement prodselect;
	
}