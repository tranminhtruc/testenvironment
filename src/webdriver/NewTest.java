package webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Example to demonstrate use of @AfterClass annotation of TestNG framework
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class NewTest {

	WebDriver driver;
	@BeforeClass
	public void beforeclass() {
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.hahalolo.com/sign-in/?appId=production_newsfeed_app_id&redirect=https%3A%2F%2Fwww.hahalolo.com%2F");
	}
	@Test
	public void TC_01_ValidateCurrentUrl() {
	

	}
	

}
