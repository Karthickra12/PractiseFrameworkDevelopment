package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {

	WebDriver driver;
	WebDriverWait mywait;
	
	public Basepage(WebDriver driver) 
	{
		this.driver = driver;
		mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
	}
}
