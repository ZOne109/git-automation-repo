package com.news18.bengalipages;

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

public class BengaliDesktopLandingPage {
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public BengaliDesktopLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	/*Homepage First article Link for news18 Bengali Page*/
	@FindBy(xpath ="//div[contains(@class,'topnews-right')]//li/a[not(contains(@href,'live'))]")
	private List<WebElement> homePageFirstArticleLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'topnews')]//a[contains(@href,'live')]")
	private List<WebElement> homePageLiveBlogArticleLnk;
	
	
	/*CricketNext link present on LineTwo Section*/
	@FindBy(xpath ="//div[contains(@class,'sub_navigation')]//ul//a[@title='খেলা']")
	private WebElement cricketNextSectionLnk;
	
	/*photo section Present in LineTwo navigation bar in Bengali HomePage */
	@FindBy(xpath="//ul[contains(@class,'nav_bar')]//a[@href='/photogallery/']")
	private WebElement photoSectionLineTwoLnk;
	
	/*Videos link present on Homepage*/
	@FindBy(xpath ="//div[contains(@class,'container')]//a[text()='ভিডিও']")
	private WebElement videosLnk;
	
	
	/*Trending Topics First Link is present in Footer of home page*/
	@FindBy(xpath="(//div[contains(@class,'link_table w3 trand')]//a)[2]")
	private WebElement trendingTopicsFirstLnks;


	/**
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		webDriverActions.clickJS(homePageFirstArticleLnk.get(0));
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
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(photoSectionLineTwoLnk);
		webDriverActions.waitForSecond(5000);
	}
	
	
	/**
	 * This method is used to click on Videos Section news 18 Hindi Home Page 
	 */
	public void navigateToVideosSection() {
		webDriverActions.click(videosLnk);
	}
	

	/**
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.continuousScrollTillElement(trendingTopicsFirstLnks, GlobalVariables.sec60);
		webDriverActions.clickJS(trendingTopicsFirstLnks);
		webDriverActions.switchToNewWindow();
	}
}

