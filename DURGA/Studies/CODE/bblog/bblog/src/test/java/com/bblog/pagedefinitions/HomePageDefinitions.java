package com.bblog.pagedefinitions;

import com.bblog.pages.HomePage;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageDefinitions extends HomePage {
	
	HomePage homepage;
	public HomePageDefinitions() {
		// TODO Auto-generated constructor stub
		homepage = new HomePage();
	}
	
	@Given("^I Landed in bblog Home page$")
    public void i_landed_in_bblog_Home_page() throws InterruptedException {    
		homepage.launchBrowser();
		System.out.println("browser launched");
		Thread.sleep(5000);
    }

	@Then("^I close the browser$")
	 public void i_close_the_browser() throws InterruptedException { 
			Thread.sleep(3000);
			homepage.closeBrowser();
			System.out.println("browser closed");
	    }
}
