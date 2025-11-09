package com.pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.LapSessionInterfaceElements;

public class LaptopSession extends Base_Class  implements LapSessionInterfaceElements {

	@FindBy (xpath = laptop_link_xpath)
	private WebElement laptop_link;
	
	@FindBy (xpath = sony_vaio_i5_xpath)
	private WebElement sony_vaio_i5;
	
	@FindBy (xpath = add_to_cart_xpath)
	private WebElement add_to_cart;
	
	public LaptopSession() {
		PageFactory.initElements(driver, this);
	}
	public void navigatelaptopSession() throws InterruptedException {
//		waitImplicitly(30);
		Thread.sleep(3000);
//		waitExplicitly(30, laptop_link , "clickable");
		click(laptop_link);
		Thread.sleep(3000);
		click(sony_vaio_i5);
		click(add_to_cart);
		Thread.sleep(3000);
		alertAction("gettext");
		alertAction("accept");
		
	}
	
	
}
