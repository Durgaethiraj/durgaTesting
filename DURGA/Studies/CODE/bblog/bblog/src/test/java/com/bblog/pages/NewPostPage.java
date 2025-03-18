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

public class NewPostPage {

	@FindBy(xpath = "(//a[@class='nav-link'])[2]")
	public WebElement newPost;

	@FindBy(xpath = "//input[@placeholder='Article Title']")
	public WebElement articleTitle;

	@FindBy(xpath = "/html/body/app-root/app-article-editor/div/div/div/div/app-dynamic-form/form/app-input[2]/fieldset/input")
	public WebElement articleAbout;

	@FindBy(xpath = "/html/body/app-root/app-article-editor/div/div/div/div/app-dynamic-form/form/app-textarea/fieldset/textarea")
	public WebElement myarticleContent;

	@FindBy(xpath = "//input[@placeholder='Enter Tags']")
	public WebElement articleTag;

	@FindBy(xpath = "//button[text()= ' Publish Article ']")
	public WebElement publishArticle;

	@FindBy(xpath = "//button[text()= ' Sign in ']")
	public WebElement signinButton;

	@FindBy(linkText = "Sign in")
	public WebElement clickSigin;

	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement usernameSignin;

	@FindBy(xpath = "//input[@placeholder='Password']")
	public WebElement passwordSignin;

	private WebDriver driver;

	public NewPostPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickSignin() throws InterruptedException {

		clickSigin.click();
		Thread.sleep(1000);
	}

	public void enterUsername(String userName) throws InterruptedException {
		usernameSignin.click();
		usernameSignin.sendKeys(userName);
		Thread.sleep(1000);
	}

	public void enterPassword(String password) throws InterruptedException {
		passwordSignin.click();
		passwordSignin.sendKeys(password);
		Thread.sleep(1000);
	}
	
	public void clickSignInButton() throws InterruptedException {
		Thread.sleep(2000);
		signinButton.click();	
	}

	public void createNewArticle() throws InterruptedException{
	Thread.sleep(1000);
		newPost.click();
		
		
	}
	public void enterArticleTitle(String title) throws InterruptedException{
		Thread.sleep(2000);
		articleTitle.click();
		articleTitle.clear();
		articleTitle.sendKeys(title);
		
	}
	
	public void enterArticleAbout(String about) throws InterruptedException{
	  	articleAbout.click();
		articleAbout.sendKeys(about);
		Thread.sleep(2000);
	}
	public void enterArticleContent(String content) throws InterruptedException{
		myarticleContent.click();
		myarticleContent.sendKeys(content);
		Thread.sleep(2000);
	}
	public void enterArticleTag(String tag) throws InterruptedException{
		articleTag.click();
		articleTag.sendKeys(tag);
		Thread.sleep(1000);
	}
	public void clickPubslishArticle() throws InterruptedException{
		Thread.sleep(2000);
		publishArticle.click();
	}
}
;
