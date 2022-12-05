
package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  This class contains WebElements and BusinessLogic of Desktop Liveblog Page 
 * @author Harshith S
 */

public class DesktopLiveblogPage {

	public WebDriver driver;
	public DesktopLiveblogPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/* Desktop_LiveBlogPage List of Liveblog article*/
	@FindBy(xpath = "//*[contains(@class,'lead-mstory') or contains(@class,'lead-story')]//a[contains(@href,'live-news-updates') or contains(@href,'live-updates') or contains(@href,'live-update') and not(contains(@tag,'img'))]")
	private List<WebElement> liveBlogList;

	/* Desktop_LiveBlogPage List of googleAds*/
	@FindBy(xpath = "//div[contains(@id,'google_ads_iframe_/1039154/') and not(contains(@id,'ROS_AL_ROS_PG_1x1_0__container__')) and  not(contains(@id,'ROS_Skin_OOP_0__container__')) and not(contains(@id,'_ROS_Shosh_OOP_0__container__')) and not(contains(@id,'ROS_AS_ROS_PG_1x1_0__container__'))]/iframe")
	private List<WebElement> googleAds;

	/*Desktop_LiveBlogPage title*/
	@FindBy(xpath = "(//*[contains(text(),'<title')])[1]")
	private WebElement title;

	/*Desktop_LiveBlogPage ampHtmlStatus in browser source code page */
	@FindBy(xpath = "//span[text()='amphtml']/following-sibling::a[contains(@class,'html-attribute-value')]")
	private WebElement ampHtmlStatus;

	/*Desktop_LiveBlogPage autoRefreshButton*/
	@FindBy(xpath = "//span[contains(text(),'Auto Refresh')]")
	private WebElement autoRefreshBtn;

	/*Desktop_LiveBlogPage autoRefreshOff*/
	@FindBy(xpath = "//div[contains(@class,'jsx-3533517042 auto-slider')]//span[text()='Off']")
	private WebElement autoRefreshOff;

	/*Desktop_LiveBlogPage autoRefreshON*/
	@FindBy(xpath = "//div[contains(@class,'jsx-3533517042 auto-slider')]//span[text()='On']")
	private WebElement autoRefreshOn;

	/*Desktop_LiveBlogPage liveTvLink*/
	@FindBy(xpath = "//div[contains(@class,'vspacer20 news18-special vwall')]//h2")
	private WebElement liveTvLnk;
	
	/* Desktop_LiveBlogPage List of featuredImg*/
	@FindBy(xpath = "//div[@class='css-1dbjc4n r-1ets6dv r-1q9bdsx r-1phboty r-rs99b7 r-1s2bzr4 r-1udh08x']//img")
	private List<WebElement> featuredImg;	

	/* Desktop_LiveBlogPage List of keywordStatus in browser source code page */
	@FindBy(xpath = "//span[text()='keywords']/following-sibling::span[@class='html-attribute-value'][1]")
	private WebElement keywordStatus;

	/*Desktop_LiveBlogPage descriptionStatus in browser source code page */
	@FindBy(xpath = "//span[text()='description']")
	private WebElement descriptionStatus;	

	/*Desktop_LiveBlogPage ogimgStatus in browser source code page */
	@FindBy(xpath = "//span[text()='og:image']/following-sibling::span[@class='html-attribute-value'][1]")
	private WebElement ogimgStatus;

	/*Desktop_LiveBlogPage parentTitle in browser source code page  */
	@FindBy(xpath = "(//*[contains(text(),'<title')]/parent::td)[1]")
	private WebElement parentTitle;

}



