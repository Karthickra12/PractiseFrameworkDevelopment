package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cartpage extends Basepage {

	public Cartpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Checkout") WebElement cartpagecheckoutbtn ;
	@FindBy(xpath = "//table[@class = 'table table-bordered']//tbody//tr") List<WebElement> cartpagetablerow ;
	
	public void navitocartpagecheckout() {
		cartpagecheckoutbtn.click();
	}
	 public void cartpagetabledatafetch() {
		 for(int r = 0; r < cartpagetablerow.size(); r++) {
			 List<WebElement> cells = cartpagetablerow.get(r).findElements(By.xpath(".//td"));
			 for (int c =0 ; c < cells.size(); c++) {
				 String celltext = cells.get(c).getText().trim();
				 System.out.println("Row " + (r + 1) + ", Column " + (c + 1) + ": " + celltext.trim());
			 }
			 
		 }
		 
	 }
	
}
