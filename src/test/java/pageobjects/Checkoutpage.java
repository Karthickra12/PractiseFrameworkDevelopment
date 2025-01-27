package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutpage extends Basepage {
	
	public Checkoutpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]") WebElement cartemptytext;
	

	public String checkoutmsg() {
		String shoppingcartemptymsg = cartemptytext.getText();
		return shoppingcartemptymsg;
	}
	
	private void syso() {
		// TODO Auto-generated method stub

	}
}
