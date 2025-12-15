package com.pageobjectmodel;

import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
import com.interfaceelements.LoginPageInterfaceElements;
import com.pageobjectmanager.PageObjectManager;
import com.utility.ExcelUtility;

public class LoginPage extends BaseClass implements LoginPageInterfaceElements {
	
	@FindBy(css = username_css)
	private WebElement username;
	
	@FindBy(id = password_id)
	private WebElement password;
	
	@FindBy(xpath = loginButton_xpath)
	private WebElement loginButton;
	
	@FindBy(xpath = title_xpath)
	private WebElement title;
	
	@FindBy(partialLinkText = completeProfile_partialLinkText)
	private WebElement completeProfile;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}


	public void getUsername( String userName ) {
		sendInput(username, userName);
	}


	public void getPassword( String pass) {
		sendInput(password, pass);
	}


	public void getLoginButton() {
		click(loginButton);
	}

	
	
	
	}


