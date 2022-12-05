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

public class BengaliAMPVideosPage {
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	
	public BengaliAMPVideosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Entertainment Section Article Link */
	@FindBy(xpath = "//div[contains(@class,'intro')]//a")
	private List<WebElement> videosArticleLnks;
	
	
	/**
	 * This method is used to navigate and click on First Article of English India Page 
	 */
	public void clickOnFirstVideoArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(videosArticleLnks.get(0));
		webDriverActions.switchToNewWindow();
	}
}

