package com.news18.malayalampages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class MalayalamDesktopLandingPage {
	
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public MalayalamDesktopLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage First article Link  is present below the Line Two Menu bar in RHS*/
	@FindBy(xpath ="//div[contains(@class,'topnews-right')]//ul//li//a")
	private List<WebElement> homePageArticleLnk;
	
	/*Videos link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'sub-nav')]//li//a[text()='Videos']")
	private WebElement videosLnk;
	
	/*Homepage LiveBlog article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'top_news_right')]//a[contains(@href,'live')]")
	private List<WebElement> homePageLiveBlogArticleLnk;
	
	/*photo section Present in Line One navigation bar */
	@FindBy(xpath="//ul[contains(@class,'nav_bar')]//a[@href='/photogallery/']")
	private WebElement photoSectionLineOneLnk;

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
	


}
