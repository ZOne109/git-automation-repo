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

public class LokmatAMPEntertainmentPage extends WebDriverActions {

	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	
	public LokmatAMPEntertainmentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Entertainment Section First Article Link */
	@FindBy(xpath = "//ul[contains(@class,'fptr-story fright')]//a")
	private List<WebElement> entertainmentArticleLnks;
	
	
	/**
	 * This method is used to navigate and click on First Article of Lokmat Entertainment Page 
	 */
	public void clickOnFirstArticleEntertainmentPage() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(entertainmentArticleLnks.get(0));
	}
}
