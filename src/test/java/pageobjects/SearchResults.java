package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResults extends Basepage {

	
	public SearchResults (WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[text() = 'MacBook']") WebElement result;
	@FindBy(xpath = "//input[@name = 'quantity']") WebElement Quantity;
	@FindBy(xpath = "//button[@id= 'button-cart']") WebElement addtocartbtn;
	@FindBy(xpath = "//div[@id = 'content']//li//h2") WebElement priceofproduct;
	@FindBy(xpath = "//a[text()='MacBook']/ancestor::div[@class='caption']/following-sibling::div[@class='button-group']/button[@data-original-title='Add to Wish List']")
	WebElement resultproductaddtowishlist ;
	@FindBy(xpath = "//a[text() = 'MacBook']/ancestor::div[@class = 'caption']/following-sibling::div[@class = 'button-group']//span[text() = 'Add to Cart']") 
	WebElement resultproductaddtocartlist;
	

	
	public boolean searchstate() {
		boolean searchstatus = result.isDisplayed();
		return searchstatus;
	}
	
	public void clickresultproduct() {
		result.click();
	}
	
	public void quantityincrease(String quan) {
		Quantity.clear();
		Quantity.sendKeys(quan);
	}
	
	public void atttocart() {
		addtocartbtn.click();
	}
	
	public String priceofsearchedproduct() {
		String productprice = priceofproduct.getText();
		return productprice;
	}
	
	public void resultproductaddtowishlist() {
		result.isDisplayed();
		resultproductaddtowishlist.click();
	}
	
	public void resultproductaddtocart() {
		resultproductaddtocartlist.click();
	}
	
	
	
}
