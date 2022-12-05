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

public class BengaliAMPEntertainmentPage {

	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	
	public BengaliAMPEntertainmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Entertainment Link Present on the LIne One Section Of News18 bengali Home Page*/
	@FindBy(xpath = "//div[contains(@class,'container')]//a[text()='বিনোদন']")
	private WebElement entertainmentLnkNw18HomePage;
	
	/* Entertainment Section  Article Link */
	@FindBy(xpath = "//div[contains(@class,'ctgr-rgt fright')]//a")
	private List<WebElement> entertainmentArticleLnks;
	
	
	/**
	 * This method is used to navigate and click on First Article of English India Page 
	 */
	public void clickOnFirstArticleEntertainmentPage() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(entertainmentLnkNw18HomePage);
		webDriverActions.click(entertainmentArticleLnks.get(0));
	}
}
