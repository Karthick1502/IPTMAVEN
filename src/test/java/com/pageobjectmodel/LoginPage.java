package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.LoginPageInterfaceElements;
import com.pageobjectmanger.PageObjectManager;

public class LoginPage extends Base_Class implements LoginPageInterfaceElements  {
	
	@FindBy(id = login_id)
	private WebElement login;
	
	@FindBy(css = username_css)
	private WebElement loginUsername;
	
	@FindBy(css = password_css)
	private WebElement loginPassword;
	
	@FindBy(xpath = loginButton_xpath)
	private WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login() throws IOException, InterruptedException {
		click(login);
		waitImplicitly(30);
		sendInput(loginUsername,PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("username"));
		sendInput(loginPassword,PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("password"));
		click(loginButton);
		Thread.sleep(3000);
		captureScreenshot("HomePage");
	}
}
