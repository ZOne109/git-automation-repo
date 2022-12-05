package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  @author Sanjeeb
 *  This class contains elements and business logics for mobile web Podcast_DayBreak Page Templates( navigating after clicking under
 *  any article present inside podcast module present in home page.)
 */

public class MobilePodcastDaybreak {

	public WebDriver driver;
	public MobilePodcastDaybreak(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*podcast link presenting in Podcast news 18 mobile web homepage. */
	@FindBy(xpath="//li[@class='glide__slide--active']//a[contains(@href,'podcast')][2]")
	private WebElement podcastLnk;

	/*breadcrumb link presenting in Podcast_daybreak home page in news 18 mobile web homepage.*/
	@FindBy(xpath="//div[@class='vdo-bradcrum']")
	private WebElement breadcrumbLnk;

	/*see more button present below every article of Podcast_daybreak home page in news 18 mobile web homepage.*/
	@FindBy(xpath="//div[@id='podcast_div']//a[text()='See More']")
	private List<WebElement> seemoreBtn;

	/*video images present on the top every article of Podcast_daybreak home page in news 18 mobile web homepage.*/
	@FindBy(xpath="//div[@id='podcast_div']//figure")
	private List<WebElement> videoImg;

	/*video images full section  present on the top every article of Podcast_daybreak home page in news 18 mobile web homepage.*/
	@FindBy(xpath="//div[contains(@class,'vdo-container')][1]//iframe")
	private WebElement videoImageFullSection;

	/*play button present on the video image of Podcast_daybreak home page in news 18 mobile web homepage.*/
	@FindBy(xpath="//button[@aria-label='play audio']")
	private List<WebElement> playBtn;

	/*pause button present on the video image of Podcast_daybreak home page in news 18 mobile web homepage.*/
	@FindBy(xpath="//button[@aria-label='pause audio']")
	private WebElement pauseBtn;

	/*Static play  button present on the video image of Podcast_daybreak home page in news 18 mobile web homepage.*/
	@FindBy(xpath="//button[@class='v4-embed-play-btn btn btn-link']")
	private List<WebElement> staticPlayBtn;

	/*2nd video image full section */
	@FindBy(xpath="//div[contains(@class,'vdo-container')][2]//iframe")
	private WebElement secondVideoSection;

	/*bold text present inside one article in podcast_daybreak homepage.*/ 
	@FindBy(xpath="//div[@class='container vdo-consumption']//p/strong/a")
	private List<WebElement> boldTxt;

	/*Headline Text of any article present on podcast_daybreak homepage.*/
	@FindBy(xpath="//div[@id='podcast_div']//h1")
	private List<WebElement> headlineTxt;

}
