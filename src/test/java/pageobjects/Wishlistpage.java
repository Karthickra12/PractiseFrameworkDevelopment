package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wishlistpage extends Basepage {
	
	Actions act;
	public Wishlistpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@id = 'content']//p") WebElement emptywishlisttext;
	@FindBy(xpath = "//table[@class = 'table table-bordered table-hover']//a[contains(@href , 'product&product')][contains(text() , 'MacBook')]") WebElement wishlisttableproductname ;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']") WebElement Logout;
	@FindBy(linkText = "Continue") WebElement logoutcontinuebtn;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover']//a[contains(@href, 'wishlist&remove') and contains(@data-original-title, 'Remove')]") WebElement removeaddedwishlistproductbtn;
	@FindBy(xpath = "//a[text()= 'Continue']") WebElement continuetohome;
	
	
	public String wishlistemptytextcheck() {
		String emptytext = emptywishlisttext.getText();
		return emptytext;
	}
	
	public boolean  verifyproductentry(String expectedProductName) {
		return wishlisttableproductname.isDisplayed() && wishlisttableproductname.getText().equalsIgnoreCase(expectedProductName);
	}
	
	public void logoutbtn() {
		Logout.click();
		logoutcontinuebtn.click();
	}
	
	public void removeclick() {
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click();", removeaddedwishlistproductbtn);
		//wait.until(ExpectedConditions.elementToBeClickable(removeaddedwishlistproductbtn)).click();
		//removeaddedwishlistproductbtn.submit();
		if (wishlisttableproductname.isDisplayed()) {
	        System.out.println("Product is displayed in the wishlist.");
	        mywait.until(ExpectedConditions.elementToBeClickable(removeaddedwishlistproductbtn));
	        removeaddedwishlistproductbtn.click();
		continuetohome.click();
	}
	}
}
