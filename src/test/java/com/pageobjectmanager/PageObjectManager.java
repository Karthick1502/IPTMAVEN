package com.pageobjectmanager;

import com.pageobjectmodel.LoginPage;
import com.utility.FileReaderManger;

public class PageObjectManager {
	
	private static PageObjectManager pageObjectManager;
	private FileReaderManger fileReaderManger;
	private LoginPage loginPage;
	
	public static PageObjectManager getPageObjectManager() {
		if( pageObjectManager == null ) {
			pageObjectManager = new PageObjectManager();
		}
		return pageObjectManager;
	}
	
	public FileReaderManger getFileReaderManger() {
		if( fileReaderManger == null ) {
			fileReaderManger = new FileReaderManger();
		}
		return fileReaderManger;
	}

	public LoginPage getLoginPage() {
		if( loginPage == null ) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}

	
	
	
	
	

	
	
	
}
