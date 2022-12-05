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

public class BengaliAMPCricketNextPage {
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	
	public BengaliAMPCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Article of English CricketNext Page*/
	@FindBy(xpath = "//div[contains(@class,'ctgr-rgt fright')]//a")
	private List<WebElement> cricketNxtArticleLnks;
	
	/*LiveBlog Article of English CricketNext Page*/
	@FindBy(xpath = "//div[contains(@class,'hmlft fleft')]//a[(contains(@href,'live'))]")
	private List<WebElement> cricketNextLiveBlogArticleLnks;
	
	
	/**
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleCricketNextPage() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(cricketNxtArticleLnks.get(0));
	}
	
	/**
	 * This method is used to click on LiveBlog Article of English CricketNext Page 
	 */
	public void clickOnFirstLiveBlogArticleCricketNextPage() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(cricketNextLiveBlogArticleLnks.get(0));
	}
}
