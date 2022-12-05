package com.news18.init;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class MobileCommonConfig extends WebDriverActions{
	
	public static InitializePages pages;

	@BeforeClass
	public void setUp(){
		launchWebBrowser(chrome, mobile);
		pages = new InitializePages(driver);
	}	
	
	@AfterClass
	private void afterClassSetup() {
		driver.close();
	}


}
