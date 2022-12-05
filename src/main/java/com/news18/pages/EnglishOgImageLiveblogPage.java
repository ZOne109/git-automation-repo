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

public class EnglishOgImageLiveblogPage {

	public WebDriver driver;

	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public EnglishOgImageLiveblogPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Homepage LiveBlog article Link  is present below the L2 Tag  Menu in RH*/
	@FindBy(xpath ="(//div[contains(@class,'top_story')]//a[contains(@href,'live')])[2]")
	private WebElement homePageLiveBlogArticleLnk;

	/**
	 *  This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickEnglishLiveblog() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(homePageLiveBlogArticleLnk);

	}

}
