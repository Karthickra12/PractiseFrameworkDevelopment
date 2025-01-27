package testcase;

import org.testng.annotations.Test;

import pageobjects.Cartpage;
import pageobjects.Homepage;
import pageobjects.SearchResults;
import testbase.Baseclass;

public class Shoppingcarttest extends Baseclass{

	@Test(priority=1)
	public void shoppingcartlisttable() throws InterruptedException {
	
		Homepage hp = new Homepage(driver);
		SearchResults sr = new SearchResults(driver);
		hp.search("MacBook");
		hp.searchbtn();
		sr.resultproductaddtocart();
		hp.homepagecartsymbol();
		Thread.sleep(5000);
		System.out.println("Checking table rows before printing...");
	    System.out.println("Number of rows found: " + hp.totalrows.size());
		hp.printalltablevalues();
		
	}
	
	@Test(priority=2)
	public void cartpagetable() {
		Homepage hp = new Homepage(driver);
		SearchResults sr = new SearchResults(driver);
		hp.search("MacBook");
		hp.searchbtn();
		sr.resultproductaddtocart();
		hp.homepagecartsymbol();
		hp.navitocartpage();
		Cartpage ct = new Cartpage(driver);
		ct.cartpagetabledatafetch();
	}
	
}
