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
 * @author SanjeebKumarPati
 *This Class Contains elements and business logics for hindi Cricket next Page 
 */
public class HindiAMPCricketNextPage {
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	
	public HindiAMPCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*first Article of Hindi CricketNext Page*/
	@FindBy(xpath = "(//div[contains(@class,'cn-story-wrap')]//a)[1]")
	private WebElement cricketNxtFirstArticleLnk;
	
	/*LiveBlog First Article of HIndi CricketNext Page*/
	@FindBy(xpath = "//div[contains(@class,'cn-story-wrap')]//a[(contains(@href,'live'))]")
	private List<WebElement> cricketNextLiveBlogArticleLnks;
	
	
	/**
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleCricketNextPage() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(cricketNxtFirstArticleLnk);
	}
	
	/**
	 * This method is used to click on LiveBlog Article of English CricketNext Page 
	 */
	public void clickOnFirstLiveBlogArticleCricketNextPage() {
		webDriverActions.click(cricketNextLiveBlogArticleLnks.get(0));
	}
}
