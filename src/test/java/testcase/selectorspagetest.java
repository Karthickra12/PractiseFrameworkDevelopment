package testcase;

import org.testng.annotations.Test;

import pageobjects.Selectorspagexpaths;
import testbase.Baseclass;

public class selectorspagetest extends Baseclass{

	/*
	@Test
	public void selectostest() throws InterruptedException {
		Selectorspagexpaths spx = new Selectorspagexpaths(driver);
		spx.emailinputsend("karthick@gmail.com");
		spx.passwordinputsend("admin@123");
		spx.companyinputsend("cloud");
		spx.numberinputsend("985684585");
		spx.submit();
		spx.crushinputsend("Naz");
		spx.clicksvgenternamefield();
		spx.firstnamenenter("kart");
		spx.carselect();
		Thread.sleep(5000);
		spx.checkoutoptionselect();
		spx.datpickerinput();
		spx.datepicker();
		spx.donationlinkclick();
		spx.paymentdetailspage();
	}
	*/
	
	/*
	@Test
	public void userstabledatafetch() {
		Selectorspagexpaths spx = new Selectorspagexpaths(driver);
		spx.usertablesdata();
		spx.usertablesoecificdatafetch();
	}
	*/
	
	/*
	@Test
	public void alerts() {
		Selectorspagexpaths spx = new Selectorspagexpaths(driver);
		spx.alertpractise();
	}
	*/
	
	/*
	@Test
	public void shadowdom() {
		Selectorspagexpaths spx = new Selectorspagexpaths(driver);
		spx.shawdowdom();
		System.out.println("Message is printed");
	}
	*/
	
	@Test
	public void systemtable() {
		Selectorspagexpaths spx = new Selectorspagexpaths(driver);
		//spx.readdatafrompaginationtable();
		//spx.totalnoofpagesintable();
		spx.printspecificpagedata();
	}
	
}
