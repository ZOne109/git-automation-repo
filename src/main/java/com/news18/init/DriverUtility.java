package com.news18.init;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class contains method to launch and close the driver and the driver actions.
 * @author Sanjeeb
 *
 */
public class DriverUtility extends GlobalVariables {

	ChromeOptions opt =new ChromeOptions();
		
	/**
	 * This Method is used to launch the browser
	 * @param browserName
	 */
	public void launchWebBrowser(String browserName, String platformName){
		try
		{
			if(browserName.equalsIgnoreCase("chrome") && platformName.equalsIgnoreCase("desktop")) {
				Logs.info(getClass(), "Launching Chrome Browser in Desktop view");
				WebDriverManager.chromedriver().setup();
				setChromeOptions();
			}
			else if (browserName.equalsIgnoreCase("chrome") && platformName.equalsIgnoreCase("mobile")) {
				Logs.info(getClass(), "Launching Chrome Browser in Mobile view");
				WebDriverManager.chromedriver().setup();
				switchToMobView(fileUtility.readDataFromPropertyFile("mobileType"));
				setChromeOptions();
			}
		}
		catch(Exception e)
		{
			Logs.error(getClass(), "Failed to launch the browser", e);
		}
	}

	/**
	 * This method is used to switch to mobile web view
	 * @param mobileType
	 */
	public void switchToMobView(String mobileType) {
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", mobileType);
		opt.setExperimentalOption("mobileEmulation", mobileEmulation);
		Logs.info(getClass(), "Launched in mobile view");
	}

	
	/**
	 * This method is used to handle all chrome options 
	 */
	public void setChromeOptions() {
		opt.addArguments("--disable-notifications");
		opt.addArguments("--disable-web-security");
		opt.addArguments("--disable-gpu");
		opt.addArguments("--disable-popup-blocking");
		opt.addArguments("--allow-running-insecure-content");
		opt.addArguments("--ignore-certificate-errors");
		Logs.info(getClass(), "Launched Chrome Browser");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	}


	/**
	 * Close All The Browser
	 */
	public void closeAllDriver() {
		Logs.info(getClass(), "Closing Browser");
		driver.quit();
	}
}