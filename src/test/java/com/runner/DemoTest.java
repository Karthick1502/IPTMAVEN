package com.runner;

import java.io.IOException;

import com.base.Base_Class;
import com.pageobjectmanger.PageObjectManager;

public class DemoTest extends Base_Class{

	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser(PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("browser"));
		launchUrl(PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("url"));
		PageObjectManager.getPageObjectManager().getLoginPage().login();
		PageObjectManager.getPageObjectManager().getLaptopSession().navigatelaptopSession();
		PageObjectManager.getPageObjectManager().getCheckout().checkoutProduct();
		PageObjectManager.getPageObjectManager().getPlaceOrder().placingOrder();
	}

}
