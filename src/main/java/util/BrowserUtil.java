package util;

import org.openqa.selenium.WebDriver;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * this method is used to initialize the driver on the basis of browser name
	 * 
	 * @param browser
	 * @throws Exception
	 */
	public WebDriver launchBrowser(String browser) {
		System.out.println("browser name is : " + browser);

		switch (browser.toLowerCase()) {
		case "chrome":
			// System.setProperty("webdriver.chrome.driver",")
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
//			System.setProperty("webdriver.gecko.driver","../geckodriver");
//			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser.....");
			//throw new Exception("WRONGBROWSER");
		// break;
		}

		return driver;
	}


	public void launchUrl(String url) throws Exception {
	
		if (url == null) {
			System.out.println("url is null");
			throw new Exception("URLISNULL");
		}

		if (url.length() == 0) {
			System.out.println("url is blank");
			throw new Exception("URLBLANKEXCEPTION");
		}

		// http(s) -- 
		// http://www.google.com
		// https
		if (url.indexOf("http") != 0 && url.indexOf("https") != 0) {
			System.out.println("http(s) is missing in url");
			throw new Exception("HTTP(s)MISSINGEXCEPTION");
		}

		driver.get(url);

	}


	public void closeBrowser() {
		if (driver != null) {
			driver.close();
			System.out.println("browser is closed.....");
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
			System.out.println("browser is closed.....");

		}
	}

}
