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
 * @author SanjeebKumarPati
 *This class contain WebElements and their Business logics of Lokmat Amp Sports Pages
 */
public class LokmatAMPSportsPage extends WebDriverActions {
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	
	public LokmatAMPSportsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*Article of lokmat sports Page*/
	@FindBy(xpath = "//ul[contains(@class,'fptr-story fright')]//a")
	private List<WebElement> sportsArticlesLnk;
	
	/*LiveBlog First Article of lokmat Sports Page*/
	@FindBy(xpath = "(//div[contains(@class,'left')]//a[(contains(@href,'live-updates'))])[1]")
	private WebElement sportsLiveBlogFirstArticleLnk;
	
	
	/**
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleSportsPage() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(sportsArticlesLnk.get(0));
	}
	
	/**
	 * This method is used to click on LiveBlog Article of English CricketNext Page 
	 */
	public void clickOnFirstLiveBlogArticleSportsPage() {
		webDriverActions.click(sportsLiveBlogFirstArticleLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(sportsLiveBlogFirstArticleLnk)," Failed to display element ");
		assrt.assertAll("Failed to navigate"+sportsLiveBlogFirstArticleLnk );
	}
}
