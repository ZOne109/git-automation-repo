package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopFootballPage {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopFootballPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*LineTwo Section List Links present in Desktop Football Page */
	@FindBy(xpath ="//ul[contains(@class,'secondNav_inner')]//li//a[not(contains(@title, 'Byju'))]")
	private List<WebElement> l2SectionListLnk;

	/*Article Links present in Isl page */
	@FindBy(xpath ="//div[contains(@class,'contentbox')]//a")
	private List<WebElement> articleLnk;

	/*ISL link present in Line two in Football page */
	@FindBy(xpath ="//div[contains(@class,'secondNav')]//a[.='ISL']")
	private WebElement islLink;
	
	/*pagination present in bottom of Football page*/
	@FindBy(xpath="//div[contains(@class,'pagination')]/ul")
	private WebElement paginationDiv;

	/*List of page navigation in Football page*/
	@FindBy(xpath="//div[contains(@class,'pagination')]//li/a")
	private List<WebElement> paginationList;
	
	/*List of Promoted Contents ads present in Football page*/
	@FindBy(xpath = "//div[@class='ob-widget-section ob-first']/child::ul//li/a")
	private List<WebElement> promotedContentRHSLnk;

	/* RHS Outbrain Link in Football page*/
	@FindBy(xpath = "//div[@class='ob_what']/a")
	private WebElement outbrainLnkRHS;
	
	/*Close Outbrain Popup Image in Football Page */
	@FindBy(xpath = "//div[contains(@id,'modal_inner')]/img")
	private WebElement closeOutbrainPopUp;
	
	/*Article present under RHS photogallery section in Football Page*/
	@FindBy(xpath ="//div[contains(@class,'photogellary')]//div/a")
	private List<WebElement> photoGalleryArticleRHSLnk;

	/*Links of Social Media Icons present in Footer of the Football Page*/
	@FindBy(xpath = "//div[contains(@class,'social_net')]/a")
	private List<WebElement> footerSocialMediaLnk;

	/**
	 * This method is used to navigate to Football page
	 */
	public void navigateToNews18FootballPage() {
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishFootballUrl"));
	}


	/**
	 * This method is used to verify Line Two navigation bar present below the Line one Section on Football page.
	 */
	public void verifyLineTwoSection() {
		webDriverActions.click(l2SectionListLnk.get(0));
		assrt.assertTrue(webDriverActions.isElementDisplayed(l2SectionListLnk.get(0)),"Failed To navigate");
		Logs.info(getClass(), "Element is displayed");
		webDriverActions.navigateBack();
		for(int i=1;i<l2SectionListLnk.size()-1;i++)//it will iterate from 1th element to till size-1 and click and navigate back
		{
			String actual = webDriverActions.getAttribute("href",l2SectionListLnk.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.click(l2SectionListLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expected);
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate"+expected);
			webDriverActions.waitForPageToLoad();
			webDriverActions.navigateBack();
		}
	}

	/**
	 * This method used to verify articles in ISL football page
	 */
	public void verifyIslArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(islLink);
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<articleLnk.size();i++) {
			String actual = webDriverActions.getAttribute("href", articleLnk.get(i));			
			webDriverActions.highlightElement(articleLnk.get(i));
			webDriverActions.clickJS(articleLnk.get(i));
			String expected= webDriverActions.getCurrentPageUrl();
			webDriverActions.waitForPageToLoad();
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate "+actual);
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();

		}
	}
	
	/**
	 * This method is used to verify pagination is displayed at below and its navigation in Football page
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
		assrt.assertAll();
	}
	
	/**
	 * This method is used verify the navigation of promoted contents 
	 *  Ads link present in RHS of the Football page
	 */
	public void verifyRHSPromotedContent()
	{
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		for(int i=0 ; i<promotedContentRHSLnk.size() ; i++)
		{
			webDriverActions.waitForAllElementsVisible(promotedContentRHSLnk, GlobalVariables.sec60);
			webDriverActions.mouseHover(promotedContentRHSLnk.get(i));
			String actualUrl = webDriverActions.getAttribute("onmousedown", promotedContentRHSLnk.get(i));
			webDriverActions.click(promotedContentRHSLnk.get(i));
			webDriverActions.switchToNewWindow();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parentTitle );
			assrt.assertTrue(webDriverActions.isElementDisplayed(promotedContentRHSLnk.get(i)) , "Failed to Display element :-" +promotedContentRHSLnk.get(i));
			assrt.assertTrue(genericUtility.compareTwoStrings(actualUrl, expectedUrl), "Failed to navigate :-" +promotedContentRHSLnk.get(i));
		}
	}

	/**
	 * This method is used to click on RHS Outbrain link 
	 * And verify the navigation to pop-up 
	 */
	public void verifyRHSOutbrainPopUp()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.mouseHover(outbrainLnkRHS);
		webDriverActions.click(outbrainLnkRHS);
		webDriverActions.waitForElementVisibility(closeOutbrainPopUp, GlobalVariables.sec30);
		webDriverActions.highlightElement(closeOutbrainPopUp);
		assrt.assertTrue(webDriverActions.isElementDisplayed(closeOutbrainPopUp) , "Failed to Display OutbrainPop Close Image "+closeOutbrainPopUp);
	}
	
	/**
	 * This method is used to Navigate All Articles present in RHS photogallery section of Football Page
	 */
	public void verifyRHSPhotogalleryNavigation() 
	{
		for(int i=0;i<photoGalleryArticleRHSLnk.size();i++)
		{  
			webDriverActions.highlightElement(photoGalleryArticleRHSLnk.get(i));
			webDriverActions.mouseHover(photoGalleryArticleRHSLnk.get(i));
			String actualUrl = webDriverActions.getAttribute("href", photoGalleryArticleRHSLnk.get(i));
			Logs.info(getClass(), "navigate to  "+actualUrl);
			webDriverActions.click(photoGalleryArticleRHSLnk.get(i));
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expectedUrl);
			assrt.assertTrue(webDriverActions.isElementDisplayed(photoGalleryArticleRHSLnk.get(i)));
			assrt.assertEquals(actualUrl, expectedUrl,"Failed to navigate "+actualUrl);
			webDriverActions.navigateBack();
		}
		assrt.assertAll();
	}
	
	/**
	 * This method is used to verify social media icons navigation present in footer of the Football Page
	 */
	public void verifySocialMediaFooter()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		String parentTitle = webDriverActions.getPageTitle();
		for(int i=0 ; i<footerSocialMediaLnk.size() ; i++)
		{
			webDriverActions.highlightElement(footerSocialMediaLnk.get(i));
			String actual = webDriverActions.getAttribute("href", footerSocialMediaLnk.get(i));
			webDriverActions.click(footerSocialMediaLnk.get(i));
			webDriverActions.switchToNewWindow();
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parentTitle);
			assrt.assertTrue(webDriverActions.isElementDisplayed(footerSocialMediaLnk.get(i)) , "Failed to Display " +footerSocialMediaLnk.get(i));
			assrt.assertEquals(actual, expected , "Failed to Navigate "+actual);
		}
	}
}
