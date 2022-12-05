package com.news18.bengalipages;

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
public class BengaliMobileLandingPage {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public BengaliMobileLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*Homepage List of article Link for news18 Bengali Page*/
	@FindBy(xpath ="//div[contains(@class,'newstrendvideo-box')]//li/a[not(contains(@href,'live')) and not(contains(@href,'cricket'))]")
	private List<WebElement> homePageArticleLnk;
	
	/*photo section Present in LineTwo navigation bar in Bengali HomePage */
	@FindBy(xpath="//div[contains(@class,'top_links_cont')]//a[.=' ছবি']")
	private WebElement photoSectionLnk;
	
	/**
	 * This method is used to click on First Article of Bengali Home Page 
	 */
	public void clickOnFirstArticleBengaliHomePage() {
		webDriverActions.clickJS(homePageArticleLnk.get(0));
	}
	
	
	/**
	 * This method used to click on photos section of Bengali Homepage
	 */
	public void clickOnPhotoSection()
	{
		webDriverActions.click(photoSectionLnk);
	}
}
