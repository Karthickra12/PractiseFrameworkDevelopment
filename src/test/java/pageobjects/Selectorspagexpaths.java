package pageobjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Selectorspagexpaths extends Basepage {

	Actions act;
	JavascriptExecutor js;
	public  Selectorspagexpaths(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath = "//input[@placeholder = 'Enter email'][@type = 'email']") WebElement emailinput ;
	@FindBy(xpath = "//input[@name = 'Password'][@type = 'password']") WebElement passwordinput ;
	@FindBy(xpath = "//input[@name = 'company'][@placeholder = 'Enter your company'][1]") WebElement companyinput ;
	@FindBy(xpath = "//input[@name = 'mobile number'][@type= 'number']") WebElement numberinput ;
	@FindBy(xpath = "//button[@value = 'Submit']") WebElement submitbtn ;
	@FindBy(xpath = "//input[@placeholder= 'First Crush']") WebElement crushinput;
	@FindBy(xpath = "//label[normalize-space()='Can you enter name here through automation']//*[name()='svg']") WebElement enternamethroughautomation;
	@FindBy(xpath = "//input[@class = 'nameFld'][@placeholder = 'First Enter name']") WebElement Firstnameinput ;
	@FindBy(xpath = "//select[@id = 'cars'][@name = 'cars']") WebElement carsdropdown;
	@FindBy(xpath = "//button[contains(text() , 'Checkout here')]") WebElement checkouthover;
	@FindBy(xpath = "//a[@target = '_blank'][contains(text() , 'Join Training')]") WebElement checkoutoption;
	@FindBy(xpath = "//input[@class = 'hasDatepicker']") WebElement datepickerfield;
	@FindBy(xpath = "//input[@type = 'date'][@name = 'the_date']") WebElement datepickerdrp;
	@FindBy(xpath = "//input[@id= 'datepicker'][@value= 'pick a date']") WebElement datepickertextfield;
	@FindBy(xpath = "//a[contains(text() ,'Consider a small Donation')]") WebElement Donationlink;
	@FindBy(xpath = "//span[contains(text() ,'Click to Donate in INR')]") WebElement donationpagepaytext;
	@FindBy(xpath = "//div[@class ='FormFieldInput'] //input[@id='customUnitAmount'][@type = 'text']") WebElement unitamountfield;
	@FindBy(xpath = "//input[@name = 'email']") WebElement paymentpageemailfield;
	@FindBy(xpath = "//div[@class = 'hfe-nav-menu-icon']//*[name() = 'svg']") WebElement donatepagemenu;
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr") List<WebElement> userstablerows;
	@FindBy(xpath = "//table[@id = 'resultTable']/tbody/tr//td") List<WebElement> userstablecolumns;
	@FindBy(xpath = "//button[contains(text(), 'Click To Open Window Alert')]") WebElement Alert;
	@FindBy(xpath = "//button[contains(text(), 'Click To Open Window Prompt Alert')]") WebElement promptAlert;
	By shadowHost = By.className("jackPart");
	@FindBy(xpath = "//table[@id = 'tablepress-1']/tbody//tr") List<WebElement> paginationtablerows;
	@FindBy(xpath = "//table[@id = 'tablepress-1']/tbody//tr[1]//td") List<WebElement> paginationtablecols;
	@FindBy(xpath = "//div[contains(text() ,'Showing 1 to 10 of 99 entries')]") WebElement totalpagesintable;
	public void emailinputsend(String email) {
		emailinput.sendKeys(email);
	}
	
	public void passwordinputsend(String pwd) {
		passwordinput.sendKeys(pwd);
	}
	
	public void companyinputsend(String comp) {
		companyinput.sendKeys(comp);
	}
	
	public void numberinputsend(String num) {
		numberinput.sendKeys(num);
	}
	
	public void submit() {
		submitbtn.click();
	}
	
	public void crushinputsend(String crush) {
		crushinput.sendKeys(crush);
	}
	
	public void clicksvgenternamefield() {
		mywait.until(ExpectedConditions.elementToBeClickable(enternamethroughautomation));
		enternamethroughautomation.click();
	}
	
	public void firstnamenenter(String firstname) { 
		Firstnameinput.sendKeys(firstname); 
	}

	
	public void carselect() {
		Select carsdrpdown = new Select(carsdropdown);
		carsdrpdown.selectByValue("audi");
	}
	
	public void checkoutoptionselect() {
		act = new Actions(driver);
		act.moveToElement(checkouthover);
		act.moveToElement(checkoutoption).click().perform();
		mywait.until(ExpectedConditions.numberOfWindowsToBe(2)); 
		utilities.WindowHandler.switchtowindow(driver);
		String gettargetwindowtitle = utilities.WindowHandler.getcurrentwindowtitle(driver);
		System.out.println("Swicthed to window: " +gettargetwindowtitle);
		utilities.WindowHandler.closespecificwindow(driver, gettargetwindowtitle);
		 driver.switchTo().window(driver.getWindowHandles().iterator().next());  
		
	}
	
	public void datpickerinput() {
		datepickertextfield.clear();
		datepickertextfield.sendKeys("Selecting the date");
	}
	
	public void datepicker() {
		datepickerdrp.click();
		act.doubleClick();
		datepickerdrp.sendKeys("10-11-2025");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void donationlinkclick() {
		act.moveToElement(Donationlink).perform();
		Donationlink.click();
		mywait.until(ExpectedConditions.numberOfWindowsToBe(2)); 
		utilities.WindowHandler.switchtowindow(driver);
	
		System.out.println("Swicthed to window: " + driver.getTitle());
		donationpagepaytext.click();
		mywait.until(ExpectedConditions.numberOfWindowsToBe(3));
		System.out.println("Switched to Payment Page: " + driver.getTitle());
	}
	
	public void paymentdetailspage() {
		String gettargetwindowtitle = utilities.WindowHandler.getcurrentwindowtitle(driver);
		utilities.WindowHandler.closespecificwindow(driver, gettargetwindowtitle);
		driver.switchTo().window(driver.getWindowHandles().iterator().next());  
	    System.out.println("Switched back to the parent window: " + driver.getTitle());
	}
	
	public void donatepagemenuclick() {
		act.doubleClick(donatepagemenu);
		utilities.WindowHandler.getcurrentwindowtitle(driver);
		utilities.WindowHandler.switchtowindow(driver);
		utilities.WindowHandler.getcurrentwindowtitle(driver);
	}
	
	public void usertablesdata() {
		int noofrows = userstablerows.size();
		int noofcols = userstablecolumns.size();
		System.out.println("No of rows in table: " + noofrows);
		System.out.println("No of columns in table: " + noofcols);
		
		for(int i = 0; i<= noofrows -1 ;i++ ) {
			List<WebElement> cells = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr["+ i +"]//td"));
			System.out.println("Row" + i + ":");
			for(WebElement cell : cells) {
				System.out.print(cell.getText() + "|");
			}
			System.out.println();
		}
	}
	
	public void usertablesoecificdatafetch() {
		for(int i = 0;i < userstablerows.size();i++)
		{		
			WebElement celldata = driver.findElement(By.xpath("//table[@id = 'resultTable']/tbody/tr[3]//td[2]"));
			System.out.println("Row 3, Column 2: " + celldata.getText());
			if(celldata.getText().equals(celldata)) {
				WebElement approxcheckbox = driver.findElement(By.xpath("//tr[td//a[text()='Joe.Root']]//input[@type='checkbox']"));
				approxcheckbox.click();
				approxcheckbox.isEnabled();
			}
			System.out.println("Checkbox is enabled");
		}

	}
	
	public void alertpractise() {
		act = new Actions(driver);
		act.moveToElement(Alert).perform();
		Alert.click();
		driver.switchTo().alert().accept();
		promptAlert.click();
		Alert myalert=driver.switchTo().alert();
		System.out.println("Text msg on alert:"+myalert.getText());
		myalert.sendKeys("hello");
		myalert.accept();
		
	}
	
	public void shawdowdom() {
		SearchContext shadow = driver.findElement(shadowHost).getShadowRoot();
		shadow.findElement(shadowHost).sendKeys("hello");
	}
	
	public void readdatafrompaginationtable() {
		int totalpagetablerows = paginationtablerows.size();
		int totalpagetablecols = paginationtablecols.size();
		System.out.println("No of rows in table: " + totalpagetablerows);
		System.out.println("No of columns in table: " + totalpagetablecols);
		
		for(int i =0;i<=paginationtablerows.size() ;i++) {
			List<WebElement> celldataintable = driver.findElements(By.xpath("//table[@id = 'tablepress-1']/tbody//tr["+i+"]"));
			System.out.println("Rows" + i + ":");
			for(WebElement cells : celldataintable) {
				System.out.print(cells.getText() + "|");
			}
			System.out.println();
		}
}
	
	public void totalnoofpagesintable() {
		String text = totalpagesintable.getText();
		 String totalEntriesText = text.substring(text.indexOf("of") + 3, text.indexOf("entries")).trim();
		 int totalEntries = Integer.parseInt(totalEntriesText); 
		 System.out.println(totalEntries);
		 
		 int rowsPerPage = 10;
		 int totalPages = (int) Math.ceil((double) totalEntries / rowsPerPage);
		 System.out.println("Total number of pages: " + totalPages);
	}
	
	public void printspecificpagedata() {
		List<WebElement> fifthpage = driver.findElements(By.xpath("//table[@id = 'tablepress-1'][5]/tbody//tr"));
		for(WebElement row : fifthpage) {
			List<WebElement> columns = row.findElements(By.tagName("td"));
		for(WebElement cells : columns) {
			   System.out.print(cells.getText());
		}
			System.out.println();
		}
	}

}