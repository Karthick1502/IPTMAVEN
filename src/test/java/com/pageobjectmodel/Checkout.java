package com.pageobjectmodel;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_Class;
import com.interfaceelements.CheckoutInterfaceElements;
import com.pageobjectmanger.PageObjectManager;

public class Checkout extends Base_Class implements CheckoutInterfaceElements{
	
	@FindBy( xpath = cart_xpath)
	private WebElement cart;
	@FindBy (xpath = place_order_button_xpath)
	private WebElement placeOrderBtn;
	@FindBy (id = input_name_id)
	private WebElement inputName;
	@FindBy( id = input_country_id)
	private WebElement inputCountry;
	@FindBy (id =input_city_id)
	private WebElement inputCity;
	@FindBy (id =input_card_id)
	private WebElement inputCard;
	@FindBy( id = input_month_id)
	private WebElement inputMonth;
	@FindBy (id =input_year_id)
	private WebElement inputYear;

	public Checkout() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkoutProduct() throws IOException {

		waitImplicitly(30);
		click(cart);
		try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		captureScreenshot("Cart");
		click(placeOrderBtn);
		sendInput(inputName, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("name") );
		sendInput(inputCountry, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("country") );
		sendInput(inputCity, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("city") );
		sendInput(inputCard, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("card") );
		sendInput(inputMonth, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("month") );
		sendInput(inputYear, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("year") );
			
	}
}
