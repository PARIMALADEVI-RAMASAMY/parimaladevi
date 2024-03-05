package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegativeofFb extends BaseClass {
	FbLoginPojo f;

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		f = new FbLoginPojo();
		passText("7845974997", f.getPassword());

	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		f = new FbLoginPojo();
		ClickBtn(f.getLoginBtn());

	}

	@Given("to launch the chrome browser anad maximize window")
	public void to_launch_the_chrome_browser_anad_maximize_window() {
		launchBrowser();
		WindowMaximize();
	}

	@When("To launch url of the facebook application")
	public void to_launch_url_of_the_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("to pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		f = new FbLoginPojo();
		passText("seleinuminmakes@gmailcom", f.getEmail());

	}

	@When("To check whether it navigate to the homepage or not")
	public void to_check_whether_it_navigate_to_the_homepage_or_not() {
		System.out.println("to check whether navigate to home page or not");
	}

	@Then("To close browser")
	public void to_close_browser() {
		CloseEntireBrower();
	}

	@When("user has to pass the data {string} in email field")
	public void user_has_to_pass_the_data_in_email_field(String em) {
		f = new FbLoginPojo();
		passText(em, f.getEmail());
	}

	@When("USer has to pass the data{string} in password field")
	public void user_has_to_pass_the_data_in_password_field(String password) {
		f = new FbLoginPojo();
		passText(password, f.getPassword());

	}

	@When("user has to click the login button")
	public void user_has_to_click_the_login_button() {
		f = new FbLoginPojo();
		ClickBtn(f.getLoginBtn());
	}

}
