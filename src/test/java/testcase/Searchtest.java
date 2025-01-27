package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.Homepage;
import testbase.Baseclass;

public class Searchtest extends Baseclass {

	@Test
	public void searchtest() {
		
		Homepage hp = new Homepage(driver);
		hp.search("mac");
		hp.searchbtn();
		
	}
	
	
}
