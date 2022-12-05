package com.news18.hindipages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/**
 * @author Anupam 
 *
 */
public class HindiMobileLandingPage {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public HindiMobileLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*Homepage List of article Link for news18 Hindi Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live'))]")
	private List<WebElement> homePageArticleLnk;
	
	/*Homepage List of Live article Link for news18 Hindi Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveArticleLnk;
	
	/*photo section Present in LineTwo navigation bar in Hindi HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[.='फोटोगैलरी']")
	private WebElement photoSectionLnk;
	
	/**
	 * This method is used to click on First Article of HIndi Home Page 
	 */
	public void clickOnFirstArticleHindiHomePage() {
		webDriverActions.clickJS(homePageArticleLnk.get(0));
	}
	
	
	/**
	 * This method is used to click on First Live Article of HIndi Home Page 
	 */
	public void clickOnFirstLiveArticleHindiHomePage() {
		webDriverActions.clickJS(homePageLiveArticleLnk.get(0));
	}
	
	/**
	 * This method used to click on photos section of Hindi Homepage
	 */
	public void clickOnPhotoSection()
	{
		webDriverActions.click(photoSectionLnk);
	}

}
