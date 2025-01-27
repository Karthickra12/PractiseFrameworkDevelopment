package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.SearchResults;
import testbase.Baseclass;

public class SearchResultsTest extends Baseclass{

	
	@Test
	public void searchresultproductslist() {
		
		SearchResults SR = new SearchResults(driver) ;
		Homepage hp = new Homepage(driver);
		hp.search("macbook");
		hp.searchbtn();
		SR.searchstate();
		SR.clickresultproduct();
		SR.quantityincrease("1");
		SR.atttocart();
		SR.priceofsearchedproduct();
		
		hp.homepagecartsymbol();
		if(SR.priceofsearchedproduct().equals(hp.verifyprice())) {
			System.out.println("Prices are equal proceeding to checkout");
			hp.navihomewizardcheckout();
		}else {
			System.out.println("Prices do not match. Not proceeding to checkout.");
		}
	}
}
;
