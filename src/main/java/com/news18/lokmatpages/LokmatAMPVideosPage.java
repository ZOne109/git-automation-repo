package com.news18.lokmatpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;


public class LokmatAMPVideosPage extends WebDriverActions {
	
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	
	public LokmatAMPVideosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Entertainment Section First Article Link */
	@FindBy(xpath = "(//div[contains(@class,'clearfix')]//h2//a)[1]")
	private WebElement videosFirstArticleLnk;
	
	
	/**
	 * This method is used to navigate and click on First Article of lokmat India Page 
	 */
	public void clickOnFirstVideoArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(videosFirstArticleLnk);
		webDriverActions.switchToNewWindow();
	}
}

