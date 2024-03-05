package org.stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyLoginPojo extends BaseClass {
	public MyLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@autocomplete='new-password']")
	private WebElement login;

	@FindBy(xpath = "//div[text()='CONTINUE']")
	private WebElement con;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getCon() {
		return con;
	}

}