package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  This class contains WebElements and BusinessLogic of Mobile Liveblog Page
 *  @author Harshith S
 */

public class MobileLiveblogPage {
	
	public WebDriver driver;
	public MobileLiveblogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/* Mobile_LiveBlogPage List of livebloglnk*/
	@FindBy(xpath = "//section[@class='mstory-wrap']//a[contains(@href,'live-updates-') or contains(@href,'live-news-update') and not(contains(@href,'cricketnext'))]")
	private List<WebElement> livebloglnk ;

	/* Mobile_LiveBlogPage List of googleAds*/
	@FindBy(xpath = "//div[contains(@id,'google_ads_iframe_/1039154/') and not(contains(@id,'ROS_AL_ROS_PG_1x1_0__container__')) and  not(contains(@id,'ROS_Skin_OOP_0__container__')) and not(contains(@id,'_ROS_Shosh_OOP_0__container__')) and not(contains(@id,'ROS_AS_ROS_PG_1x1_0__container__'))]/iframe")
	private List<WebElement> googleAds;
	
}
