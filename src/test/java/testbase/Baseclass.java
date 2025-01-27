package testbase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Baseclass {

public Properties p ;
public static WebDriver driver;
	
	@BeforeClass
	public void setup() throws IOException {
		

		FileReader f = new FileReader("./src//test//resources/config.properties");
		p = new Properties();
		p.load(f);
		
	
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appurl"));
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	 public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
	
	public String randomString() {
		String randonalpha = RandomStringUtils.randomAlphabetic(3);
		return randonalpha;
	}
	
	public String screencapture(String tname) throws IOException{
		
		String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SourceFile = ts.getScreenshotAs(OutputType.FILE) ;
		String TargetFilepath = System.getProperty("user.dir")+"\\screenshots\\"+ tname + "_" + timestamp + ".png";
		File targetfile = new File (TargetFilepath);
		SourceFile.renameTo(targetfile);
		
		return TargetFilepath;
		
	}
	
	
	
	
}
