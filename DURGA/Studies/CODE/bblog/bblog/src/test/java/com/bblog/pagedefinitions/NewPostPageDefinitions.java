package com.bblog.pagedefinitions;

import org.openqa.selenium.WebDriver;

import com.bblog.pages.HomePage;
import com.bblog.pages.NewPostPage;
import com.bblog.pages.SignUpPage;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NewPostPageDefinitions extends HomePage  {

	NewPostPage newPost;
	
	public NewPostPageDefinitions() {
		newPost = new NewPostPage(driver);          
	}

			@And("^I click signin$")
			public void i_click_signin() throws InterruptedException {
				newPost.clickSignin();
			}
			
			@And("^I click signin button$")
			public void i_create_new_article() throws InterruptedException {
			newPost.clickSignInButton();
			}
			
			@And("^I click NewPost$")
			public void i_click_newpost() throws InterruptedException {
			newPost.createNewArticle();
			}
			
			@And("^I enter Article title \"([^\"]*)\"$")
			public void i_enter_article_title(String title) throws InterruptedException {
				newPost.enterArticleTitle(title);
			}
			
			@And("^I enter Article about \"([^\"]*)\"$")
			public void i_enter_article_about(String about) throws InterruptedException {
				newPost.enterArticleAbout(about);
			}
			
			@And("^I enter Article details \"([^\"]*)\"$")
			public void i_enter_article_details(String content) throws InterruptedException {
				newPost.enterArticleContent(content);
			}
			
			@And("^I enter Article tag \"([^\"]*)\"$")
			public void i_enter_article_tag(String tag) throws InterruptedException {
				newPost.enterArticleTag(tag);
			}
			
			@Then("^I click Publish Article$")
			public void i_click_publish_article() throws InterruptedException {
				newPost.clickPubslishArticle();

			}
			
	}