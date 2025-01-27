package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage extends Basepage {

	
	public Homepage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = ("//span[normalize-space()='My Account']")) WebElement Myacc;
	@FindBy(xpath = ("//a[normalize-space()='Login']")) WebElement login;
	@FindBy(xpath = "//input[@type = 'submit'][@value = 'Login']") WebElement loginbtn;
	@FindBy(xpath = "//a[normalize-space()='Register']") WebElement Register;
	@FindBy(xpath = "//input[@placeholder='Search']") WebElement searchfield;
	@FindBy(xpath = "//div[contains(@id ,'search')]/descendant::span") WebElement SearchButton;
	@FindBy(xpath = "//div[@id = 'cart']//button[@type = 'button']") WebElement shoppingcartbtn;
	@FindBy(xpath = "//p[@class = 'text-right']/descendant::i[1]") WebElement homewizardcartpagebtn;
	@FindBy(xpath = "//div[@id= 'cart']/descendant::i[4]") WebElement homewizardcheckout ;
	@FindBy(css = "a.dropdown-toggle") WebElement desktop;
	@FindBy(linkText = "Show AllDesktops") WebElement alldesktops;
	@FindBy(xpath = "//a[contains(@title , 'Checkout')]") WebElement checkoutbtn;
	@FindBy(xpath = "//table[@class='table table-bordered']//td[text()='$602.00']") WebElement shoppingcarttableprice;
	@FindBy(xpath = "//span[contains(text(), 'Wish List')]") WebElement  wishlistpagebtn;
	@FindBy(xpath = "//table[@class = 'table table-bordered']//tbody//tr") public List<WebElement> totalrows;
	
	
	
	public void myaccbtn() {
		Myacc.click();
	}
	
	public void loginbtn() {
		login.click();
	}
	
	public void regitserbtn() {
		Register.click();
	}
	
	public void search(String value) {
		mywait.until(ExpectedConditions.visibilityOf(searchfield));
		searchfield.clear();
		searchfield.sendKeys(value);
	}
	
	public void searchbtn() {
		SearchButton.click();
	}
	
	
	public void desktop() {
		desktop.click();
	}
	
	public void desktopnavi() {
		alldesktops.click();
	}
	
	public void checkoutnavigate() {
		checkoutbtn.click();
	}
	
	public void homepagecartsymbol() {
		mywait.until(ExpectedConditions.elementToBeClickable(shoppingcartbtn));
		shoppingcartbtn.click();
	}
	
	public void navitocartpage() {
		homewizardcartpagebtn.click();
	}
	
	public String verifyprice() {
		String pricemsg =shoppingcarttableprice.getText();
		return pricemsg;
	}
	
	public void navihomewizardcheckout() {
		homewizardcheckout.click();
	}
	
	public void naviwishlistpagebtnt() {
		wishlistpagebtn.click();
	}
	
	public void loginnavi() {
		loginbtn.click();
	}
	
	public void printalltablevalues() {
		mywait.until(ExpectedConditions.visibilityOfAllElements(totalrows));
	    for (int r = 0; r < totalrows.size(); r++) {
	        List<WebElement> cells = totalrows.get(r).findElements(By.xpath(".//td"));
	        for (int c = 0; c < cells.size(); c++) {
	            String celltext = cells.get(c).getText().trim();
	            System.out.println("Raw cell text: '" + celltext + "'");
	            if (celltext.isEmpty()) {
	                List<WebElement> childElements = cells.get(c).findElements(By.xpath(".//*"));
	                for (WebElement child : childElements) {
	                    celltext += child.getText().trim() + " ";  // Concatenate text from child elements
	                }
	            }
	            System.out.println("Row " + (r + 1) + ", Column " + (c + 1) + ": " + celltext.trim());
	        }
	    }
	}

}
