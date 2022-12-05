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


/**
 * @author Vipin 
 *
 */
public class DesktopBreakingNewsPage {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopBreakingNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/*Priority Panel Article Link in Desktop Breaking News Page */
	@FindBy(xpath ="//div[contains(@class,'top_story')]/a")
	private WebElement priorityPanelArticleLink;

	/*Article Title Text is present below in Desktop Breaking News Page */
	@FindBy(xpath =" //h1")
	private WebElement articleTitleTxt;

	/*pagination present in bottom of Breaking News page*/
	@FindBy(xpath="//ul[contains(@class,'pagination')]")
	private WebElement paginationDiv;

	/*List of pages in Breaking News page*/
	@FindBy(xpath="//ul[contains(@class,'pagination')]/li/a")
	private List<WebElement> paginationList;

	/*Article Title present in News On Breaking News page*/
	@FindBy(xpath ="//div[contains(@class,'blog_title')]/h4")
	private List<WebElement> articleTitle;

	/*Language list Button present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'languagebox')]//a")
	private List<WebElement> languageLnk;

	/*Change Language Button present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'languagebox')]")
	private WebElement changeLanguageBtn;
	
	/*Breadcrumb header links present in Desktop Breaking News*/
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]//ul//a")
	private List<WebElement> businessBreadcrumbLnk;

	/*Breadcrumb header is present in Desktop Breaking News*/
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]")
	private WebElement breakingBreadcrumbHeader;
	
	/*More News Header in RHS of the Breaking News Page*/
	@FindBy(xpath ="//div[contains(@class,'recomeded_story')]//h2")
	private WebElement moreNewsRHSHeader;

	/*More News article links in RHS of the Breaking News Page*/
	@FindBy(xpath ="//div[contains(@class,'recomeded_story')]//ul//li//div/a")
	private List<WebElement> moreNewsRHSArticleLnks;
	
	/*Title of article present in video wall section present at RHS */
	@FindBy(xpath ="//div[contains(@class,'video_wall')]//h2[contains(@class,'video_title')]")
	private WebElement videoWallArticleTitle;

	/*Title of article mentioned in video wall page*/
	@FindBy(xpath ="//div[@class='BreadCum']//span")
	private WebElement breadcrumbTitle;
	
	/*List of Promoted Contents Links present in body of the Breaking News Page */
	@FindBy(xpath = "//div[contains(@class,'items-container')]/div/a")
	private List<WebElement> bodyPromotedContentLnk;

	/*Outbrain link present in body of the Breaking News Page  */
	@FindBy(xpath = "//div[contains(@class,'widget-header')]/div/a")
	private WebElement bodyOutbrainLogo;

	/*Close Outbrain Popup Image in Breaking News Page */
	@FindBy(xpath = "//div[contains(@id,'modal_inner')]/img")
	private WebElement closeOutbrainPopUp;

	/*List of Promoted Contents ads present in Breaking News page*/
	@FindBy(xpath = "//div[@class='ob-widget-section ob-first']/child::ul//li/a")
	private List<WebElement> promotedContentRHSLnk;

	/*Outbrain Link in Breaking News page*/
	@FindBy(xpath = "//div[@class='ob_what']/a")
	private WebElement outbrainLnkRHS;

	/*Article present under photogallery sub section in byline Page*/
	@FindBy(xpath ="//div[contains(@class,'photogellary')]//div/a")
	private List<WebElement> photoGalleryArticleRHSLnk;
	

	/**
	 * This method is used to navigate to Breaking News page
	 */
	public void navigateToBreakingNews()
	{
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishBreakingNewsUrl"));
	}


	/**
	 * This method is used to click Priority Panel Article
	 */
	public void clickOnPriorityPanel()
	{
		webDriverActions.waitForPageToLoad();
		String actual=webDriverActions.getTextFromElement(priorityPanelArticleLink);
		Logs.info(getClass(), actual);
		webDriverActions.mouseHover(priorityPanelArticleLink);
		webDriverActions.highlightElement(priorityPanelArticleLink);
		webDriverActions.clickJS(priorityPanelArticleLink);
		webDriverActions.highlightElement(articleTitleTxt);
		String expected=webDriverActions.getTextFromElement(articleTitleTxt);
		Logs.info(getClass(), expected);
		assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
	}

	/**
	 * This method is used to verify the page navigation in Breaking News Page
	 */
	public void verifyPagination() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		assrt.assertTrue(webDriverActions.isElementDisplayed(paginationDiv),"Failed to display "+paginationDiv);
		for(int i=0;i<paginationList.size();i++) {
			webDriverActions.waitForElementVisibility(paginationList.get(i),GlobalVariables.sec60);
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
	 * This method is used to navigate to all article present in Breaking News page
	 */
	public void navigateAllArticles() {
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<articleTitle.size();i++)
		{
			String actual=webDriverActions.getTextFromElement(articleTitle.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.mouseHover(articleTitle.get(i));
			webDriverActions.highlightElement(articleTitle.get(i));
			webDriverActions.clickJS(articleTitle.get(i));
			webDriverActions.highlightElement(articleTitleTxt);
			String expected=webDriverActions.getTextFromElement(articleTitleTxt);
			Logs.info(getClass(), expected);
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
			webDriverActions.navigateBack();
		}
		assrt.assertAll();
	}

	/**
	 * This Method used to change Languages and verify the Navigations in Breaking News page
	 */
	public void verifyChangeLanguageNavigation(){	
		String parentTitle = webDriverActions.getPageTitle();
		for(int i=1;i<languageLnk.size();i++)
		{
			webDriverActions.mouseHover(changeLanguageBtn);
			webDriverActions.highlightElement(languageLnk.get(i));
			String actual = webDriverActions.getAttribute("href", languageLnk.get(i));
			webDriverActions.clickJS(languageLnk.get(i));
			webDriverActions.switchToNewWindow();
			String expected=webDriverActions.getCurrentPageUrl();
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parentTitle);
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate "+actual);
		}
	}
	
	/**
	 * This method is used  verify BreadCrumb Header of Breaking News Page
	 */
	public void verifyBreadcrumbLnk() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.highlightElement(breakingBreadcrumbHeader);
		webDriverActions.isElementDisplayed(breakingBreadcrumbHeader);
		for(int i=0;i<businessBreadcrumbLnk.size();i++) {
			String actual = webDriverActions.getAttribute("href", businessBreadcrumbLnk.get(i));			
			webDriverActions.highlightElement(businessBreadcrumbLnk.get(i));
			webDriverActions.clickJS(businessBreadcrumbLnk.get(i));
			String expected= webDriverActions.getCurrentPageUrl();
			webDriverActions.waitForPageToLoad();
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate "+actual);
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
		}
	}
	
	/**
	 * This method is used to Navigate to RHS More News articles in Breaking News Page  
	 */
	public void verifyMoreNewsNavigation() 
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(moreNewsRHSHeader);
		webDriverActions.highlightElement(moreNewsRHSHeader);
		webDriverActions.waitForPageToLoad();
		int size = moreNewsRHSArticleLnks.size();
		System.out.println(size);
		for(int i=0;i<moreNewsRHSArticleLnks.size();i++)
		{
			String actual =webDriverActions.getAttribute("href",moreNewsRHSArticleLnks.get(i));
			webDriverActions.highlightElement(moreNewsRHSArticleLnks.get(i));
			webDriverActions.clickJS(moreNewsRHSArticleLnks.get(i));
			webDriverActions.waitForPageToLoad();
			String expected=webDriverActions.getCurrentPageUrl();
			webDriverActions.navigateBack();
			assrt.assertTrue(webDriverActions.isElementDisplayed(moreNewsRHSArticleLnks.get(i)) , "Failed to Display "+moreNewsRHSArticleLnks.get(i));
			assrt.assertEquals(actual, expected , "Failed to navigate "+actual);
		}
		assrt.assertAll("Failed to display and navigate to "+moreNewsRHSArticleLnks);
	}
	
	/**
	 * This method is used to navigate to Video wall article links present at RHS of Breaking News Page
	 */
	public void verifyVideoWallNavigation() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.mouseHover(videoWallArticleTitle);
		String actual=webDriverActions.getTextToLowerCase(videoWallArticleTitle);
		Logs.info(getClass(),"Actual article title in VideoWall section on Breaking News page :"+actual);
		webDriverActions.clickJS(videoWallArticleTitle);
		String expected=webDriverActions.getTextToLowerCase(breadcrumbTitle);
		Logs.info(getClass(),"Expected article title present in Breaking News Consumption page :"+expected);
		assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate "+actual);
	}

	/**
	 * This method is used to verify the navigation of Promoted Content articles present in body of the Breaking News Page
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
	 *  This method is used to verify the Outbrain Logo is displayed and their navigation To Outbrain PopUp in Breaking News Page
	 */
	public void verifyOutbrainPopupBody()
	{
		webDriverActions.mouseHover(bodyOutbrainLogo);
		webDriverActions.highlightElement(bodyOutbrainLogo);
		webDriverActions.clickJS(bodyOutbrainLogo);
		webDriverActions.highlightElement(closeOutbrainPopUp);
		assrt.assertTrue(webDriverActions.isElementDisplayed(closeOutbrainPopUp) , "Failed to Display "+closeOutbrainPopUp);
	}


	/**
	 * This method is used verify the navigation of promoted contents 
	 *  Ads link present in RHS of the Breaking News page
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
	 * This method is used to Navigate All Articles present in RHS photogallery section of Breaking News Page
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



}


