package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import pageobjects.Myaccountspage;
import pageobjects.SearchResults;
import pageobjects.Wishlistpage;
import testbase.Baseclass;

public class Wishlisttest extends Baseclass {

	Homepage hp ;
	Loginpage lp;
	SearchResults sr ;
	Wishlistpage wl;
	Myaccountspage mcp ;
	
	@Test(priority = 1)
	public void wishlistpageempty() {
		
		hp = new Homepage(driver);
		lp = new Loginpage(driver);
		hp.myaccbtn();
		hp.loginbtn();
		lp.setusename(p.getProperty("username"));
		lp.setpassword(p.getProperty("password"));
		hp.loginnavi();
		hp.naviwishlistpagebtnt();
		wl = new Wishlistpage(driver);
		wl.wishlistemptytextcheck();
		if(wl.wishlistemptytextcheck().equals("Your wish list is empty.")) {
			System.out.println("Empty Text is equal");
		}else {
			Assert.assertFalse(false);
		}
		wl.logoutbtn();
	}	
		
	@Test(priority = 2)
	public void addtowishlist() {
		hp.myaccbtn();
		hp.loginbtn();
		lp.setusename(p.getProperty("username"));
		lp.setpassword(p.getProperty("password"));
		hp.loginnavi();
		hp.search("macbook");
		hp.searchbtn();
		sr = new SearchResults(driver);
		sr.resultproductaddtowishlist();
		hp.naviwishlistpagebtnt();
		wl = new Wishlistpage(driver);
		Assert.assertTrue(wl.verifyproductentry("MacBook"), "Product is not added to the wishlist!");
		System.out.println("Product is diaplying in wishlist!");
		wl.removeclick();
		mcp = new Myaccountspage(driver);
		Assert.assertTrue(mcp.myaccountetxtvisible(),"My account text is visbible");
		wl.logoutbtn();
	}
	
}
