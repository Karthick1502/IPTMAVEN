package com.stepdefination;

import java.io.IOException;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NaukriStepDefination extends BaseClass {
	@Given("User must launch the browser and url")
	public void user_must_launch_the_browser_and_url() throws IOException {
		launchBrowser(PageObjectManager.getPageObjectManager().getFileReaderManger().getDataProperty("browser")) ;
		launchUrl(PageObjectManager.getPageObjectManager().getFileReaderManger().getDataProperty("url"));
	}@When("User must enter {string} in username field")
	public void user_must_enter_in_username_field(String username) {
		PageObjectManager.getPageObjectManager().getLoginPage().getUsername(username);
	}
	@When("User must enter {string} in password field")
	public void user_must_enter_in_password_field(String password) {
		PageObjectManager.getPageObjectManager().getLoginPage().getPassword(password);
	}
	@Then("User must click the login button")
	public void user_must_click_the_login_button() {
		PageObjectManager.getPageObjectManager().getLoginPage().getLoginButton();
	}
	@Then("It should navigate to Home page {string}")
	public void it_should_navigate_to_home_page(String string) {
	}
}
