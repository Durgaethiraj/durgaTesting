	package com.bblog.pages;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author kxloganathan
 *To find 
 */
/**
 * 
 */
public class SignUpPage {

	@FindBy(xpath = "(//a[@class='nav-link'])[3]")
	@CacheLookup
	public  WebElement signUpButton;
	

	@FindBy(xpath ="//button[@type='submit']")
	public  WebElement submit;

	@FindBy(xpath = "//input[@placeholder='Username']")
	public  WebElement username;

	@FindBy(xpath = "//input[@placeholder='Email']")
	public  WebElement emailid;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public  WebElement enterpassword;

// WebElement username1=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	
	 private WebDriver driver;

	public SignUpPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void clickSignup() {
		signUpButton.click();
		System.out.println("CLICKED: SIGNUP!!!");
	}
	public void enterUsername(String userName) {

		username.click();
		username.sendKeys(userName);
	}
	public void enterEmailid(String emailId) {
		
		emailid.click();
		emailid.sendKeys(emailId);
	}

	public void enterPassword(String password) {
		enterpassword.click();
		enterpassword.sendKeys(password);
	}


	public void submit() throws InterruptedException {
		submit.click();
		Thread.sleep(1000);
		System.out.println("Signup Succesfully");

	}
}
