package com.bblog.pagedefinitions;

import org.openqa.selenium.WebDriver;
import com.bblog.pages.EditArticle;
import com.bblog.pages.HomePage;
import com.bblog.pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class EditArticlePageDefinitions extends HomePage  {

	EditArticle editPost;
	
	public EditArticlePageDefinitions() {
		editPost = new EditArticle(driver);          
	}
			@And("^I click username link$")
			public void i_click_username_link() throws InterruptedException {
			editPost.clickUserNameLink();
			}
		
			@And("^I click article$")
			public void i_click_article() throws InterruptedException {
			editPost.clickArticle();
			}
			
			@Given("^I click Edit Article$")
			public void i_click_Edit_Article() throws Throwable {
				editPost.editArticle();
			}		
	}