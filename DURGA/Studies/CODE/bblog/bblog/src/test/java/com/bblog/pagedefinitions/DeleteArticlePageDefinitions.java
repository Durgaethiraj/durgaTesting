package com.bblog.pagedefinitions;

import org.openqa.selenium.WebDriver;
import com.bblog.pages.DeleteArticle;
import com.bblog.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DeleteArticlePageDefinitions extends HomePage  {

	DeleteArticle deletePost;
	
	public DeleteArticlePageDefinitions() {
		// TODO Auto-generated constructor stub
		deletePost = new DeleteArticle(driver);          
	}
		
			@Then("^I click delete article$")
			public void i_delete_article() throws InterruptedException {
				deletePost.deleteArticle();
			}
			
	}