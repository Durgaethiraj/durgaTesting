package com.bblog.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	public static WebDriver driver;

	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Dependencies/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://candidatex:qa-is-cool@qa-task.backbasecloud.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

}
