package com.bblog.pages;

import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditArticle {

	
	@FindBy(xpath = "/html/body/app-root/app-navbar/nav/div/ul/li[2]/a")
	public WebElement usernamelink;
	
	@FindBy(xpath="(//li[@class='tag-default tag-pill tag-outline'])[1]")
	public WebElement article;

	@FindBy(xpath = "//input[@placeholder='Article Title']")
	public WebElement articleTitle;

	@FindBy(xpath = "(//input[@class='form-control form-control-lg ng-untouched ng-pristine ng-invalid'])[2]")
	public WebElement articleAbout;

	@FindBy(xpath = "//textarea[@placeholder='Write your article (in markdown)']")
	public WebElement myarticleContent;

	@FindBy(xpath = "//input[@placeholder='Enter Tags']")
	public WebElement articleTag;

	@FindBy(className = "btn btn-lg pull-xs-right btn-primary")
	public WebElement publishArticle;

	@FindBy(xpath = "(//a[@class='btn btn-sm btn-outline-secondary'])[1]")
	public WebElement editArticle;

	private WebDriver driver;

	public EditArticle(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickUserNameLink() throws InterruptedException {
		Thread.sleep(1000);
		usernamelink.click();
	}

	public void clickArticle() throws InterruptedException {
		Thread.sleep(1000);
		article.click();	
	}
	
	public void editArticle() throws InterruptedException {
		Thread.sleep(1000);
		editArticle.click();	
	}
			
	public void enterArticleTitle(String title) throws InterruptedException{
		articleTitle.click();
		articleTitle.sendKeys(title);
	}
	
	public void enterArticleAbout(String about) throws InterruptedException{
	  	articleAbout.click();
		articleAbout.sendKeys(about);
	}
	public void enterArticleContent(String content) throws InterruptedException{
		myarticleContent.click();
		myarticleContent.sendKeys(content);
	}
	public void enterArticleTag(String tag) throws InterruptedException{
		articleTag.click();
		articleTag.sendKeys(tag);
	}
	public void clickPubslishArticle() throws InterruptedException{
		
		publishArticle.click();
	}
}

