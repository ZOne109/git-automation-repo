package com.news18.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains Webelements and business logics for Mobile Live TV Page
 * @author Vipin Kumar
 */

public class MobileLiveTV {

	public WebDriver driver;
	public MobileLiveTV(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	/* Live TV Link in mobileWeb after clicking hamburger menu */
	@FindBy(xpath="//ul[@class='other_links']/child::li//a[contains(@href,'livetv')]")
	private WebElement mobileLiveTvLnk;

	/* Pause Button Of mobileWeb Live TV section */
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing' and @title='Pause']")
	private WebElement liveTvPauseBtn;

}
