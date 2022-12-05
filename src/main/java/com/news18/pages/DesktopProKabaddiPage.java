package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopProKabaddiPage {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopProKabaddiPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*pagination present in bottom of Prokabaddi page*/
	@FindBy(xpath="//ul[contains(@class,'pagination')]")
	private WebElement paginationDiv;

	/*List of pages in Prokabaddi page*/
	@FindBy(xpath="//ul[contains(@class,'pagination')]//a")
	private List<WebElement> paginationList;
	
	/*Priority Panel Article Link in Prokabaddi Page */
	@FindBy(xpath ="//div[contains(@class,'lbox prelative')]/h1/a")
	private WebElement priorityPanelArticleLink;

    /*Article Title Text is present below breadcrumb in Prokabaddi Page */
	@FindBy(xpath =" //h1")
	private WebElement articleTitleTxt;
	
	/*Article Links present of cwg navigation bar under breadcrumb of Dektop Prokabadi Page*/
	@FindBy(xpath ="//ul[contains(@class,'cwg-nav')]//li/a")
	private List<WebElement>cwgNavigationBarLnks;
	
	/*RHS More News Header in Pro Kabaddi Page*/
	@FindBy(xpath ="//div[contains(@class,'story')]//h2")
	private WebElement moreNewsRHSHeader;

	/*RHS More News article links in Pro Kabaddi Page*/
	@FindBy(xpath ="//div[contains(@class,'story')]//ul//li//div/a")
	private List<WebElement> moreNewsRHSArticleLnks;

	/*Breadcrumb header of RHS More News article Consumption in Pro Kabddi Page */
	@FindBy(xpath ="//div[contains(@class,'article-box')]/h1")
	private WebElement moreNewsBreadcrumb;
	
	/*Breadcrumb header links present in Desktop ProKabaddi*/
	@FindBy(xpath = "//div[contains(@class,'leftPanel')]/ul[contains(@class,'brade_crum')]//a")
	private List<WebElement> proKabaddiBreadcrumbLnk;

	/*Breadcrumb header is present in Desktop ProKabaddi*/
	@FindBy(xpath = "//div[contains(@class,'leftPanel')]/ul[contains(@class,'brade_crum')]")
	private WebElement proKabaddiBreadcrumbHeader;

	/**
	 * This method is used to navigate to Prokabaddi page
	 */
	public void navigateToNews18ProkabaddiPage() {
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishProkabaddiUrl"));
	}
	

	/**
	 * This method is used to verify the page navigation in Prokabaddi Page
	 */
	public void verifyPagination() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		assrt.assertTrue(webDriverActions.isElementDisplayed(paginationDiv),"Failed to display "+paginationDiv);
		for(int i=0;i<paginationList.size();i++) {
			webDriverActions.mouseHover(paginationList.get(i));
			webDriverActions.highlightElement(paginationList.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(paginationList.get(i)) , "Failed to display " +paginationList.get(i));
			String actual = webDriverActions.getAttribute("href", paginationList.get(i));
			webDriverActions.clickJS(paginationList.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertEquals(actual, expected,"Failed to navigate "+actual);
		}
	}
	
	/**
	 * This method is used to click Priority Panel Article
	 */
	public void clickOnPriorityPanel()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.mouseHover(priorityPanelArticleLink);
		webDriverActions.highlightElement(priorityPanelArticleLink);
		String actual=webDriverActions.getTextFromElement(priorityPanelArticleLink);
		Logs.info(getClass(), actual);
		webDriverActions.clickJS(priorityPanelArticleLink);
		webDriverActions.highlightElement(articleTitleTxt);
		String expected=webDriverActions.getTextFromElement(articleTitleTxt);
		Logs.info(getClass(), expected);
		assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
	}
	
	/**
	 * this method is used to Click on Article Links under cwg navigation bar of Dektop Prokabadi Page
	 */
	public void verifyCwgNavigationBarLinks() {
		for(int i=1;i<cwgNavigationBarLnks.size();i++)
		{
			webDriverActions.mouseHover(cwgNavigationBarLnks.get(i));
			String actual = webDriverActions.getAttribute("href",cwgNavigationBarLnks.get(i));
			webDriverActions.clickJS(cwgNavigationBarLnks.get(i));
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(),"Navigated to : "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected), "Failed to navigate "+actual);
			webDriverActions.navigateBack();	
		}
		assrt.assertAll();
	}	
	
	
	/**
	 * This method is used to click on RHS More News articles and Navigate All Articles in Pro Kabaddi Page
	 */
	public void verifyRHSMoreNewsNavigation() 
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(moreNewsRHSHeader);
		webDriverActions.highlightElement(moreNewsRHSHeader);
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<moreNewsRHSArticleLnks.size();i++)
		{
			String actual =webDriverActions.getAttribute("href" , moreNewsRHSArticleLnks.get(i));
			webDriverActions.highlightElement(moreNewsRHSArticleLnks.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.click(moreNewsRHSArticleLnks.get(i));
			webDriverActions.waitForPageToLoad();
			String expected=webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expected);
			webDriverActions.navigateBack();
			assrt.assertTrue(webDriverActions.isElementDisplayed(moreNewsRHSArticleLnks.get(i)) , "Failed to Display "+moreNewsRHSArticleLnks.get(i));
			assrt.assertEquals(actual, expected , "Failed to navigate "+actual);
		}
		assrt.assertAll("Failed to display and navigate to "+moreNewsRHSArticleLnks);
	}
	
	/**
	 * This method is used  verify BreadCrumb Header of ProKabaddi Page
	 */
	public void verifyBreadCrumbLnk() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.highlightElement(proKabaddiBreadcrumbHeader);
		webDriverActions.isElementDisplayed(proKabaddiBreadcrumbHeader);
		for(int i=0;i<proKabaddiBreadcrumbLnk.size();i++) {
			String actual = webDriverActions.getAttribute("href", proKabaddiBreadcrumbLnk.get(i));			
			webDriverActions.highlightElement(proKabaddiBreadcrumbLnk.get(i));
			webDriverActions.clickJS(proKabaddiBreadcrumbLnk.get(i));
			String expected= webDriverActions.getCurrentPageUrl();
			webDriverActions.waitForPageToLoad();
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate "+actual);
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
		}
	}




}