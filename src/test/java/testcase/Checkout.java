package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Checkoutpage;
import pageobjects.Homepage;
import testbase.Baseclass;

public class Checkout extends Baseclass {

	@Test
	public void checkout() {
		
		Homepage hp = new Homepage(driver);
		hp.checkoutnavigate();
		Checkoutpage chp = new Checkoutpage(driver);
		Assert.assertEquals(chp.checkoutmsg(), "Your shopping cart is empty!");
	}
	
}