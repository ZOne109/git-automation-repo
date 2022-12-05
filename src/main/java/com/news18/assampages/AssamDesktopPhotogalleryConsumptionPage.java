package com.news18.assampages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

public class AssamDesktopPhotogalleryConsumptionPage {
	
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public AssamDesktopPhotogalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*Homepage First article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'pht-tp')]//a")
	private List<WebElement> photogalleryArticleLnk ;
	

	/**
	 * This method is used to click on First article link
	 */
	public void clickPhotogalleryFirstArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(photogalleryArticleLnk.get(0));
	}
	
}
