package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountspage extends Basepage {


	public Myaccountspage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class = 'row']//div/h2[contains(text() , 'My Account')]") WebElement myaccounttext;
	
	
	
	
	public boolean myaccountetxtvisible() {
		return myaccounttext.isDisplayed();
	}
	
}
