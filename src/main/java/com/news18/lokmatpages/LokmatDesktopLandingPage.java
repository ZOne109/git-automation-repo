package com.news18.lokmatpages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class LokmatDesktopLandingPage extends WebDriverActions{
	
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public LokmatDesktopLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Menu bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'topnews-right')]//li/a[not(contains(@href,'live'))]")
	private List<WebElement> homePageArticleLnk;
	
	/*Videos link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'sub-nav')]//li//a[text()='Videos']")
	private WebElement videosLnk;
	
	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@id,'__next')]//a[contains(@href,'news-liv')]")
	private List<WebElement> homePageLiveBlogArticleLnk;
	
	/*photo section Present in L1 navigation bar */
	@FindBy(xpath="//ul[contains(@class,'nav_bar')]//a[text()='à¤«à¥‹à¤Ÿà¥‹ à¤—à¥…à¤²à¤°à¥€']")
	private WebElement photoSectionLineOneLnk;
	
	/*Sports link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]//a[text()='स्पोर्ट्स']")
	private WebElement sportsSectionLnk;
	
	/* Entertainment Link Present on the LIne One Section Of News18 Home Page*/
	@FindBy(xpath = "//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]//a[text()='मनोरंजन']")
	private WebElement entertainmentLnkNw18HomePage;
	
	/*Trending Topics Link is present in Footer of home page*/
	@FindBy(xpath="(//div[contains(@class,'side_bar ftr_grid')]//div/a)[1]")
	private WebElement trendingTopicsfirstLnk;
	
	
	

	/**
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		webDriverActions.clickJS(homePageArticleLnk.get(0));
	}
	
	
	/**
	 * This method used to click on photos section
	 */
	public void clickOnPhotosSection()
	{
		webDriverActions.clickJS(photoSectionLineOneLnk);	
	}
	
	
	/**
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnLiveBlogArticleHomePage() {
		try {
		webDriverActions.clickJS(homePageLiveBlogArticleLnk.get(0));
		}
		catch(NoSuchElementException e)
		{
			Logs.error(getClass(), "Live Blog is not present");
			assrt.assertTrue(false);
		}
		assrt.assertAll();
	}
	
	/**
	 * This method is used to click on CricketNext link present on Hamburger Menu
	 */
	public void clickOnSportsLnk()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(sportsSectionLnk);	
	}
	
	/**
	 * This method is used to click on Entertainment Link present on Line One Section
	 */
	public void clickOnEntertainmentLnk() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(entertainmentLnkNw18HomePage);
	}
	
	
	/**
	 * This method is used to click on Videos Section news 18 Hindi Home Page 
	 */
	public void navigateToVideosSection() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(videosLnk);
	}
	
	
	/**
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(trendingTopicsfirstLnk, GlobalVariables.sec30);
		webDriverActions.click(trendingTopicsfirstLnk);
		webDriverActions.switchToNewWindow();
	}
	

}
