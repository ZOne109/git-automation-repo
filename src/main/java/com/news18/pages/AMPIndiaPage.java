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
 * @author SanjeebKumarPati
 *This class contain WebElements and their Business logics for India Section
 */
public class AMPIndiaPage {
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public WebDriver driver;
	public AMPIndiaPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/* India Link Present on the LIne One Section Of News18 Home Page*/
	@FindBy(xpath = "//div[contains(@class,'topNavContainer')]//li[contains(@class,'top_nav')]/a[text()='India']")
	private WebElement indiaLnkNw18HomePage;
	
	/* India Section  Article Link */
	@FindBy(xpath = "//div[contains(@class,'top_story_right')]//a")
	private List<WebElement> indiaArticleLnks;
	
	
	/**
	 * This method is used to navigate and click on First Article of English India Page 
	 */
	public void clickOnFirstArticleIndiaPage() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(indiaLnkNw18HomePage);
		webDriverActions.click(indiaArticleLnks.get(0));
	}
}
