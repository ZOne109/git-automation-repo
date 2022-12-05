package com.news18.hindipages;

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

public class HindiDesktopLandingPage {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public HindiDesktopLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage articles Link for news18 Hindi Page*/
	@FindBy(xpath ="//div[contains(@class,'topnews dflex justify')]//li/a[not(contains(@href,'live'))]")
	private List<WebElement> homePageArticlesLnk;

	/*CricketNext link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'nav_wapper')]//ul[contains(@class,'nav_bar')]//a[text()='à¤•à¥�à¤°à¤¿à¤•à¥‡à¤Ÿ']")
	private WebElement cricketNextSectionLnk;

	/*Videos link present on Homepage*/
	@FindBy(xpath ="(//div[contains(@class,'lazyload-wrapper')]//a[contains(text(),'à¤µà¥€à¤¡à¤¿à¤¯à¥‹')])[1]")
	private WebElement videosLnk;

	/*Trending Topics First Link is present in Footer of home page*/
	@FindBy(xpath="(//div[contains(@class,'side_bar ftr_grid')]//div/a)[1]")
	private WebElement trendingTopicsfirstLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@id,'__next')]//a[contains(@href,'live-updates')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*photo section Present in L1 navigation bar */
	@FindBy(xpath="//ul[contains(@class,'sub_navigation_ul')]//a[text()='फोटो']")
	private WebElement photoSectionLineTwoLnk;


	/**
	 * This method is used to click on CricketNext link present on Hamburger Menu
	 */
	public void clickOnCricketNextLnk()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(cricketNextSectionLnk);	
	}


	/**
	 * This method used to click on photos section of Hindi Homepage
	 */
	public void clickOnPhotoSection()
	{
		webDriverActions.click(photoSectionLineTwoLnk);
	}


	/**
	 * This method is used to click on Videos Section news 18 Hindi Home Page 
	 */
	public void navigateToVideosSection() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(videosLnk, GlobalVariables.sec30);
		webDriverActions.click(videosLnk);
	}


	/**
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(trendingTopicsfirstLnk);
		webDriverActions.switchToNewWindow();
	}

	/**
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		webDriverActions.clickJS(homePageArticlesLnk.get(0));
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

}
