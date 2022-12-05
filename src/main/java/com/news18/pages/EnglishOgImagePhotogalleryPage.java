package com.news18.pages;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

/***
 * 
 * @author SharonJasphin
 *
 */

public class EnglishOgImagePhotogalleryPage{
	
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	
	public EnglishOgImagePhotogalleryPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Homepage First article Link  is present below the L2 Tag  Menu in RHS
	 */
	@FindBy(xpath ="//div[contains(@class,'PhotoLeft')]//ul/li//figure//a[not(contains(@href,'cricket'))]")
	private List <WebElement> photogalleryArticleLink ;
	
	/*photo section Present in L1 navigation bar */
	@FindBy(xpath="//ul[contains(@class,'topNavList')]//a[text()='Photos']")
	private WebElement photoSectionL1;
	
	/**
	 *  This method used to click on photos section
	 */
	public void clickEnglishphogalleryLnk() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(photoSectionL1);
		webDriverActions.clickJS(photogalleryArticleLink.get(0));
	}
	
}



