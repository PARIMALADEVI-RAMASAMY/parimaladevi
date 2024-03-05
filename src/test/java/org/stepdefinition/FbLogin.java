package org.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	MyLoginPojo m;

	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		launchBrowser();
		WindowMaximize();
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		launchUrl("https://www.myntra.com/login");
	}

	@When("User enters UserName and Password")
	public void user_enters_UserName_and_Password() {
		m = new MyLoginPojo();
		passText("9789590888", m.getLogin());

	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() {
		m = new MyLoginPojo();
		ClickBtn(m.getCon());
	}

}