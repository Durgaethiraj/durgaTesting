package com.bblog.pages;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteArticle {
	
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-outline-danger'])[1]")
	public WebElement deleteButton;

	private WebDriver driver;

	public DeleteArticle(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void deleteArticle() throws InterruptedException {
		Thread.sleep(1000);	
		deleteButton.click();	
	}	
}

