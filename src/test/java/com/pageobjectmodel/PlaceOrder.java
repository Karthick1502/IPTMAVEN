package com.pageobjectmodel;

import java.awt.print.PageFormat;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.PlaceOrderInterfaceElements;

public class PlaceOrder extends Base_Class implements PlaceOrderInterfaceElements{
	
	@FindBy (xpath = purchase_button_xpath)
	private WebElement purchaseBtn;
	
	@FindBy (xpath = greetingText_xpath)
	private WebElement greetingText;
	
	@FindBy (xpath = purchase_details_xpath)
	private WebElement purchaseDetails;
	
	@FindBy (xpath = ok_btn_xpath)
	private WebElement okBtn ;
	
	@FindBy (id = logout_id )
	private WebElement logout;
	
	public PlaceOrder(){
		PageFactory.initElements(driver, this);
	}
	
	public void placingOrder() throws IOException {
		
		waitImplicitly(30);
		click(purchaseBtn);
		getText(greetingText);
		getText(purchaseDetails);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		captureScreenshot("PurchaseDetails");
		click(okBtn);
		click(logout);
		quitBrowser();
	}
	
}
