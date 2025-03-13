package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import util.BrowserUtil;

import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


/*Data driven testing

using data provider

*/

public class BaseTest_Dataprovider {
	
	WebDriver driver;

	@Parameters({"url", "browser"})
	@BeforeTest
	public void setup(String url, String browser) {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		
		BrowserUtil br = new BrowserUtil();
		driver = br.launchBrowser(browser);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get(url);
	}
	
	
	@DataProvider
	public Object[][] getNegativeLoginData() {
			return new Object[][] {
			
			{"testwert@gmail.com", "test!!!2233"},
			{"durgaethiraj@gmail.com", "@#@#@#"},
			{"xxxxx", "test@123"},
			{"test@gmail.@.com", "test@121212"},
			{"    ", "   "}
		};
	}
	
	@Test(dataProvider = "getNegativeLoginData")
	public void loginNegativeTest(String username, String password) {
		AssertJUnit.assertEquals(doLogin(username, password), true);
	}
	
	
	public boolean doLogin(String username, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(username);
		
		// same like clear password
		// send password
		
		//click login
		
		return false;
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
