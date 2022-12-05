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

public class DesktopBudgetPage {
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopBudgetPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Top Header Article Link Present on Budget page*/
	@FindBy(xpath = "//div[contains(@class,'landing_tilte')]//p/..")
	private WebElement topHeaderArticleLnk;

	/*Breadcrumb header links present in Desktop Budget Page */
	@FindBy(xpath = "//div[contains(@class,'breadcrumb')]//a")
	private List<WebElement> budgetBreadcrumbLnk;

	/*Breadcrumb header is present in Desktop Budget Page */
	@FindBy(xpath = "//div[contains(@class,'breadcrumb')]")
	private WebElement budgetBreadcrumbHeader;

	/*Article Links present under Desktop Budget Page*/
	@FindBy(xpath = "//div[contains(@class,'live_budget_right')]//a")
	private List<WebElement> ArticleLnks;

	/*More Stories Link present under Article Section*/
	@FindBy(xpath = "//div[contains(@class,'more_story')]/a")
	private WebElement moreStoriesLnk;

	/*Article Links present under Budget Graphics Page*/
	@FindBy(xpath ="//div[contains(@class,'budget_graphic_box')]//a")
	private List<WebElement>ArticleBudgetGraphicsLnks;

	/*More Budget Graphics Link present under Article Section*/
	@FindBy(xpath = "//a[contains(text(),'Graphics')]")
	private WebElement moreBudgetGraphicsLnk;
	
	/*Top Article Title present in Budget page*/
	@FindBy(xpath ="//div[contains(@class,'landing_tilte')]//li/a")
	private List<WebElement> topArticleTitle;
	
	/* List of article Links under Sectorial Report section in Budget Page */
	@FindBy(xpath = "//div[contains(@class,'sectoral_report')]//div[contains(@class,'active')]/ul/li/a")
	private List<WebElement> sectorialReportArticleLnk ;

	/*List of Read More Links under Sectorial Report section in Budget Page */
	@FindBy(xpath = "//div[contains(@class,'sectoral_report')]//div[contains(@class,'active')]/a")
	private List<WebElement> readMoreLnk;

	/*Article Header Text of Sectorial Report Article Consumption in Budget Page*/
	@FindBy(xpath = "//div[contains(@class,'article-box')]/h1")
	private WebElement sectorialReportArticleHeader;
	
	/*List of Promoted Contents Links present in body of the Budget Page */
	@FindBy(xpath = "//div[contains(@class,'items-container')]/div/a")
	private List<WebElement> bodyPromotedContentLnk;
	
	/*Outbrain link present in body of the Bank Holidays Page  */
	@FindBy(xpath = "//div[contains(@class,'widget-header')]/div/a")
	private WebElement bodyOutbrainLogo;

	/*Close Outbrain Popup Image in Bank Holidays Page */
	@FindBy(xpath = "//div[contains(@id,'modal_inner')]/img")
	private WebElement closeOutbrainPopUp;


	/**
	 * This method is used to navigate Budget Article Consumption page
	 */
	public void verifyTopArticle() {
		webDriverActions.waitForPageToLoad();
		String actual = webDriverActions.getAttribute("href", topHeaderArticleLnk);
		webDriverActions.clickJS(topHeaderArticleLnk);
		String expected = webDriverActions.getCurrentPageUrl();
		assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual,expected), "Failed To Navigate"+actual);
	}

	/**
	 * This method is used  verify BreadCrumb Header of Desktop Budget Page 
	 */
	public void verifyBreadcrumbLnk() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.highlightElement(budgetBreadcrumbHeader);
		webDriverActions.isElementDisplayed(budgetBreadcrumbHeader);
		for(int i=0;i<budgetBreadcrumbLnk.size();i++) {
			String actual = webDriverActions.getAttribute("href", budgetBreadcrumbLnk.get(i));			
			webDriverActions.highlightElement(budgetBreadcrumbLnk.get(i));
			webDriverActions.clickJS(budgetBreadcrumbLnk.get(i));
			String expected= webDriverActions.getCurrentPageUrl();
			webDriverActions.waitForPageToLoad();
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate "+actual);
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
		}
	}

	/**
	 * this method is used to Click on Article Links of Desktop Budget Page
	 */
	public void verifyArticleLinks() {
		for(int i=0;i<ArticleLnks.size()-1;i++)
		{
			webDriverActions.mouseHover(ArticleLnks.get(i));
			String actual = webDriverActions.getAttribute("href",ArticleLnks.get(i));
			webDriverActions.clickJS(ArticleLnks.get(i));
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(),"Navigated to : "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected), "Failed to navigate "+actual);
			webDriverActions.navigateBack();	
		}
		webDriverActions.click(moreStoriesLnk);
		Logs.info(getClass(), "More Stories Link clicked");
		assrt.assertTrue(webDriverActions.isElementDisplayed(moreStoriesLnk),"Failed to display "+moreStoriesLnk);
	}


	/**
	 * this method is used to Click on Article Links of Desktop Budget Page
	 */
	public void verifyArticleUnderBudgetGraphicsLinks() {
		for(int i=0;i<ArticleBudgetGraphicsLnks.size()-1;i++)
		{
			webDriverActions.mouseHover(ArticleBudgetGraphicsLnks.get(i));
			String actual = webDriverActions.getAttribute("href",ArticleBudgetGraphicsLnks.get(i));
			webDriverActions.clickJS(ArticleBudgetGraphicsLnks.get(i));
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(),"Navigated to : "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected), "Failed to navigate "+actual);
			webDriverActions.navigateBack();	
		}
		webDriverActions.click(moreBudgetGraphicsLnk);
		Logs.info(getClass(), "More Stories Link clicked");
		assrt.assertTrue(webDriverActions.isElementDisplayed(moreBudgetGraphicsLnk),"Failed to display "+moreStoriesLnk);
	}
	
	/**
	 * This method is used to navigate to all top article present in Budget page
	 */
	public void verifyTopArticles() {
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<topArticleTitle.size();i++)
		{
			webDriverActions.mouseHover(topArticleTitle.get(i));
			webDriverActions.highlightElement(topArticleTitle.get(i));
			String actual=webDriverActions.getAttribute("href", topArticleTitle.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.clickJS(topArticleTitle.get(i));
			String expected=webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expected);
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
			webDriverActions.navigateBack();
		}
	}
	
	/**
	 * This method is used to navigate to all the articles under Sectorial Report in Budget Page
	 */
	public void verifySectorialReportArticleNavigation()
	{
		for(int i=0 ; i<sectorialReportArticleLnk.size() ; i++)
		{
			webDriverActions.mouseHover(sectorialReportArticleLnk.get(i));
			String actualTxt = webDriverActions.getTextFromElement(sectorialReportArticleLnk.get(i));
			Logs.info(getClass(), actualTxt);
			webDriverActions.click(sectorialReportArticleLnk.get(i));
			String expectedTxt = webDriverActions.getTextFromElement(sectorialReportArticleHeader);
			Logs.info(getClass(), expectedTxt);
			webDriverActions.navigateBack();
			assrt.assertTrue(webDriverActions.isElementDisplayed(sectorialReportArticleLnk.get(i)) , "Failed to Displayed "+sectorialReportArticleLnk);
			assrt.assertEquals(actualTxt, expectedTxt , "Failed to Navigate "+actualTxt);
		}
		assrt.assertAll("Failed to Displaye and Navigate "+sectorialReportArticleLnk);
	}

	/**
	 * This method is used to navigate to all The Read More Links under Sectorial Report in Budget Page
	 */
	public void verifyReadMoreNavigation()
	{
		for(int i=0 ; i<readMoreLnk.size() ; i++)
		{
			webDriverActions.mouseHover(readMoreLnk.get(i));
			webDriverActions.highlightElement(readMoreLnk.get(i));
			String actual = webDriverActions.getAttribute("href", readMoreLnk.get(i));
			webDriverActions.click(readMoreLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.navigateBack();
			assrt.assertTrue(webDriverActions.isElementDisplayed(readMoreLnk.get(i)) , "Failed to Display "+readMoreLnk);
			assrt.assertEquals(actual, expected , "Failed to Navigate "+actual);
		}
		assrt.assertAll();
	}
	
	/**
	 * This method is used to verify the navigation of Promoted Content articles present in body of the Budget Page
	 */
	public void verifyPromotedContentBody()
	{
		webDriverActions.waitForPageToLoad();
		String parentTitle = webDriverActions.getPageTitle();
		for(int i=0;i<bodyPromotedContentLnk.size();i++)
		{
			webDriverActions.mouseHover(bodyPromotedContentLnk.get(i));
			webDriverActions.highlightElement(bodyPromotedContentLnk.get(i));
			String actual = webDriverActions.getAttribute("href", bodyPromotedContentLnk.get(i));
			webDriverActions.click(bodyPromotedContentLnk.get(i));
			webDriverActions.switchToNewWindow();
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parentTitle);
			assrt.assertTrue(webDriverActions.isElementDisplayed(bodyPromotedContentLnk.get(i)) , "Failed To Display "+bodyPromotedContentLnk);
			assrt.assertEquals(actual, expected , "Failed to Navigate "+actual);
		}
	}
	
	/**
	 *  This method is used to verify the Outbrain Logo is displayed and their navigation To Outbrain PopUp in Budget Page
	 */
	public void verifyOutbrainPopupBody()
	{
		webDriverActions.mouseHover(bodyOutbrainLogo);
		webDriverActions.highlightElement(bodyOutbrainLogo);
		webDriverActions.clickJS(bodyOutbrainLogo);
		webDriverActions.highlightElement(closeOutbrainPopUp);
		assrt.assertTrue(webDriverActions.isElementDisplayed(closeOutbrainPopUp) , "Failed to Display "+closeOutbrainPopUp);
	}


}
