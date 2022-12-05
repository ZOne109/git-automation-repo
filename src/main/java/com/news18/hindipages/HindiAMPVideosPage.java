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

public class HindiAMPVideosPage {
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	
	public HindiAMPVideosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* Entertainment Section Article Link */
	@FindBy(xpath = "//ul[contains(@class,'featured_list')]//li/a")
	private List<WebElement> videosArticleLnks;
	
	
	/**
	 * This method is used to navigate and click on First Article of English India Page 
	 */
	public void clickOnFirstVideoArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(videosArticleLnks.get(0));
		webDriverActions.switchToNewWindow();
	}
}

