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

public class BengaliDesktopPhotoGalleryConsumptionPage {
	
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public   BengaliDesktopPhotoGalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*Homepage First article Link  is present below the LineTwo Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'pht-tp')]//ul/li//a//img")
	private List<WebElement> photogalleryArticleLink ;
	
	
	/**
	 * This method is used to click on First article link
	 */
	public void clickPhotogalleryFirstArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(photogalleryArticleLink.get(0));
	}

}
