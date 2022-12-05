package com.news18.lokmatpages;

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
public class LokmatMobileLandingPage {
	
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public LokmatMobileLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*Homepage List of article Link for news18 Lokmat Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;
	
	/*Homepage List of Live article Link for news18 Lokmat Page*/
	@FindBy(xpath ="//div[contains(@class,'wapper')]//li/a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveArticleLnk;
	
	/*photo section Present in LineTwo navigation bar in Lokmat HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[.='फोटो गॅलरी']")
	private WebElement photoSectionLnk;
	
	/**
	 * This method is used to click on First Article of Lokmat Home Page 
	 */
	public void clickOnFirstArticleLokmatHomePage() {
		webDriverActions.clickJS(homePageArticleLnk.get(0));
	}
	
	
	/**
	 * This method is used to click on First Live Article of Lokmat Home Page 
	 */
	public void clickOnFirstLiveArticleLokmatHomePage() {
		webDriverActions.clickJS(homePageLiveArticleLnk.get(0));
	}
	
	/**
	 * This method used to click on photos section of Lokmat Homepage
	 */
	public void clickOnPhotoSection()
	{
		webDriverActions.click(photoSectionLnk);
	}

}
