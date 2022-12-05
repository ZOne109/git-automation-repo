package com.news18.pages;

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

public class EnglishOgImageFirstArticlePage {

	public WebDriver driver;
	
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public EnglishOgImageFirstArticlePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*Homepage First article Link*/
	@FindBy(xpath ="(//div[contains(@class,'top_story_right')]//li/a[not(contains(@href,'live'))])[1]")
	private WebElement homePageArticleLnk;
	
/**
 *  This method is used to click on First Article of English Home Page 
 */
	public void clickEnglishArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(homePageArticleLnk);
	}
}

