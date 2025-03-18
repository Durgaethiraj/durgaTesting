package com.bblog.pagedefinitions;

import org.openqa.selenium.WebDriver;
import com.bblog.pages.HomePage;
import com.bblog.pages.SignUpPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignupPageDefinitions extends HomePage  {

SignUpPage signup;

	public SignupPageDefinitions()
	{
		signup = new SignUpPage(driver);
	}

	@And("^I click signup$")
	public void i_click_signup() throws InterruptedException {
		signup.clickSignup();
}
	 @And("^I enter username \"([^\"]*)\"$")
	public void i_enter_username(String uname) throws InterruptedException {
		signup.enterUsername(uname);

}
	@And("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String password) throws InterruptedException {

		signup.enterPassword(password);

}
	@And("^I enter emailid \"([^\"]*)\"$")
	public void i_enter_emailID(String emailid) throws InterruptedException {
		signup.enterEmailid(emailid);

}

	@Then("^I should able to click Sign Up$")
	public void i_click_submit() throws InterruptedException {
		signup.submit();

}
}
