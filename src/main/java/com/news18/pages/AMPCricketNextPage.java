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

/**
 * @author Danish R
 * This class contain WebElements and their Business logics.
 */

public class AMPCricketNextPage {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	
	public AMPCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*LiveBlog Article of English CricketNext Page*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[contains(@href,'live')]")
	private List<WebElement> cricketNextLiveBlogArticleLnks;

	/* CricketNext Title Header in AMPHompage*/
	@FindBy(xpath = "//h2[contains(@class,'title')]/span[contains(text(),'Cricketnext')]")
	private WebElement cricketNxtTitleTxt;

	/* CricketNext Articles Links in AMPHomepage*/
	@FindBy(xpath = "//span[contains(text(),'Cricketnext')]//parent::h2//following-sibling::ul//li/a")
	private List<WebElement> cricketNxtArticleLnks;

	/* CricketNext Page Links*/
	@FindBy(xpath = "https://www.news18.com/cricketnext/")
	private List<WebElement> cricketNxtPageLnks;

	/* CricketNext Page Ads*/
	@FindBy(xpath = "//iframe[@aria-label='Advertisement']")
	private List<WebElement> cricketNxtPageAds;

	/* CricketNext Page Footer*/
	@FindBy(xpath = "//footer")
	private WebElement cricketPageFooter;

	/* CricketNext Page Header*/
	@FindBy(xpath = "//header")
	private WebElement cricketPageHeader;
	
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
	public void clickOnLiveBlogArticleCricketNextPage() {
		webDriverActions.click(cricketNextLiveBlogArticleLnks.get(0));
	}

}
