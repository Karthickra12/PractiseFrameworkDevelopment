package testcase;

import org.testng.annotations.Test;

import pageobjects.Homepage;
import pageobjects.Loginpage;
import testbase.Baseclass;

public class LoginTest extends Baseclass {

	
	@Test
	public void logintest() {
		
		Homepage Hp = new Homepage(driver);
		Hp.myaccbtn();
		Hp.loginbtn();
		
		Loginpage lp = new Loginpage(driver);
		lp.setusename(p.getProperty("username"));
		lp.setpassword(p.getProperty("password"));
	}
}
