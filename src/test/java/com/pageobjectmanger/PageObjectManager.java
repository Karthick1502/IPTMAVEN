package com.pageobjectmanger;

import com.pageobjectmodel.Checkout;
import com.pageobjectmodel.LaptopSession;
import com.pageobjectmodel.LoginPage;
import com.pageobjectmodel.PlaceOrder;
import com.utlity.FileReaderManager;

public class PageObjectManager {
	
	private LoginPage loginPage;
	private FileReaderManager fileReaderManager;
	private LaptopSession laptopSession ;
	private Checkout checkout;
	private PlaceOrder placeOrder;
	private static PageObjectManager pageObjectManager;

	public PlaceOrder getPlaceOrder() {
		if( placeOrder == null ) {
			placeOrder = new PlaceOrder();
		}
		return placeOrder;
	}
	public Checkout getCheckout() {
		if( checkout == null ) {
			checkout = new Checkout();
		}
		return checkout;
	}
	public LoginPage getLoginPage() {
		if( loginPage == null ) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}
	public LaptopSession getLaptopSession() {
		if( laptopSession == null ) {
			laptopSession = new LaptopSession();
		}
		return laptopSession;
	}
	public FileReaderManager getFileReaderManager() {
		if( fileReaderManager == null ) {
			fileReaderManager = new FileReaderManager();
		}
		return fileReaderManager;
	}

	public static PageObjectManager getPageObjectManager() {
		if( pageObjectManager == null ) {
			pageObjectManager = new PageObjectManager();
		}
		return pageObjectManager;
	}
	
	

}
