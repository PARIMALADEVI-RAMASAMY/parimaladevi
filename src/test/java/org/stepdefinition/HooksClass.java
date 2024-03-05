package org.stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before(order = 1)
	private void precondition2() {
		launchBrowser();
		System.out.println("Launch the browser");

	}

	@Before(order = 2)
	private void precondition1() {

		WindowMaximize();
		System.out.println("Max the window");
	}

	@Before(order=3)
	private void precondition3() {
		System.out.println("Precondition 3");

	}

	@After(order=4)
	private void postcondition2() {
		System.out.println("Take screenshot of scenarios");
	}

	@After(order=10)
	private void postcondition1() {
		CloseEntireBrower();
	}

}
