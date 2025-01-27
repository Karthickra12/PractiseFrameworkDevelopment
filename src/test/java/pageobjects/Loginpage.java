package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {
	
	public Loginpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='input-email']") WebElement usename ;
	@FindBy(xpath = "//input[@id='input-password']") WebElement pasword ;
	@FindBy(xpath = "//a[normalize-space()='Login']") WebElement loginbtn;

	public void setusename(String username) {
		usename.sendKeys(username);
	}
	
	public void setpassword(String password) {
		pasword.sendKeys(password);
	}
	
	public void login() {
		loginbtn.click();
	}
	
	

}
