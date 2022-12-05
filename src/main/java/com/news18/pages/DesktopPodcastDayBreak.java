package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  @author Sanjeeb
 *  This class contains elements and the business logics for Podcast_DayBreak Page Templates (navigating after clicking 
 *  under any article present inside podcast module present in home page.)
 **/

public class DesktopPodcastDayBreak {

	public WebDriver driver;
	public DesktopPodcastDayBreak(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Breadcrumb presenting in Podcast_DayBreak homepage.*/
	@FindBy(xpath="//div[@class='bredcrum-txt']")
	private WebElement breadcrumbLnk;

	/*trending videos presenting in rhs side of Podcast_DayBreak homepage.*/
	@FindBy(xpath="//div[@class='trand-vdo']")
	private WebElement trendingVideosSection;

	/*show more presenting below of every article present inside Podcast_DayBreak homepage.*/
	@FindBy(xpath="//div[@class='vdomore']//a[text()='SHOW MORE']")
	private List<WebElement> readMoreBtn;

	/* video images presenting start of every article present inside Podcast_DayBreak homepage.*/
	@FindBy(xpath="//div[@id='podcast_div']//figure[@class='pod-embade']")
	private List<WebElement> videoImagesBtn;

	/*audio presenting start of every article present inside Podcast_DayBreak homepage.*/
	@FindBy(xpath="//div[contains(@class,'vdo-container vspacer')]//iframe")
	private List<WebElement> audio;

	/*audio button presenting start of every article present inside Podcast_DayBreak homepage.*/
	@FindBy(xpath="//button[@class='v4-embed-play-btn btn btn-link']")
	private List<WebElement> audioBtn;

	/* play status presenting in Podcast_DayBreak homepage.*/
	@FindBy(xpath="//button[@aria-label='pause audio']")
	private WebElement playStatusBtn;

	/* pause status presenting in Podcast_DayBreak homepage.*/
	@FindBy(xpath="//button[@aria-label='play audio']")
	private WebElement pauseStatusBtn;

	/*  presenting in video containing page of Podcast_DayBreak homepage.*/
	@FindBy(xpath="//div[contains(@class,'vdo-container')]//p/a")
	private WebElement textBtn;

}
