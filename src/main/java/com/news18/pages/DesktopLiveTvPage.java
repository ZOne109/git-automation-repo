package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains Webelements and business logic for Desktop Live TV Page
 * @author Vipin Kumar
 **/

public class DesktopLiveTvPage {

	public WebDriver driver;
	public DesktopLiveTvPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Watch Live TV Link in Header part */
	@FindBy(xpath = "//div[@class='lnlivetv']/div[@class='nhlivetv']/a")
	private WebElement topWatchLiveTvLnk;

	/* Pause Button Of Live TV section */ 
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing' and @title='Pause']")
	private WebElement liveTvPauseBtn;

	/* Go to Previous Page Link above Promoted Content */
	@FindBy(xpath = "//div[contains(@class,'pagination')]//ul/li[contains(@class,'prev')]")
	private WebElement prevPageLnk;

	/* Go to Next Page Link above Promoted Content */
	@FindBy(xpath = "//div[contains(@class,'pagination')]//ul/li[contains(@class,'next')]")
	private WebElement nextPageLnk;

	/* List of Live TV Image in Latest section below LiveTV video player */
	@FindBy(xpath = "//div[contains(@class,'tab_content_row')]/a/figure/img")
	private List<WebElement> liveTvListingImg;

	/*List of Live TV Title in Latest section below LiveTV video player*/
	@FindBy(xpath = "//div[contains(@class,'tab_content_row')]/a/figure/h3/a")
	private List<WebElement> liveTvListingTitleLnk;

	/* List of RHS Image in LiveTV page */
	@FindBy(xpath = "//div[contains(@class,'right')]//div//img")
	private List<WebElement> liveTvRhsImg;

	/* List of Ads in Live TV Ads*/
	@FindBy(xpath = "//div[contains(@id,'google_ads') and not(contains(@id,'ROS_AL_ROS_PG_container__')) and not(contains(@id,'ROS_Skin_container__')) and not(contains(@id,'_ROS_Shosh_container__')) and not(contains(@id,'ROS_AS_ROS_PG_container__'))]/iframe")
	private List<WebElement> liveTvAds;	
}
