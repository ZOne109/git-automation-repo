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
 * @author DanishR
 *
 */
public class DesktopMarketsPage {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopMarketsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Photogallery Image Link is present RHS of Photogallery Section in Markets Page*/
	@FindBy(xpath ="//div[contains(@class,'photogellary_widget')]//ul//a/img")
	private List<WebElement> photogalleryImgLnk;

	/*Photogallery Title Text is present Below of Line Two Section in photogallery Article Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'photo_gallery_')]/h1")
	private  WebElement photogalleryTitleTxt;

	/*Title of article present in video wall section present at RHS */
	@FindBy(xpath ="//div[contains(@class,'video_wall')]//h2[contains(@class,'video_title')]")
	private WebElement videoWallArticleTitle;

	/*Title of article mentioned in video wall page*/
	@FindBy(xpath ="//div[@class='BreadCum']//span")
	private WebElement breadcrumbTitle;

	/*More News Header in RHS*/
	@FindBy(xpath ="//div[contains(@class,'story')]//h2")
	private WebElement moreNewsRHSHeader;

	/*More News article links in RHS*/
	@FindBy(xpath ="//div[contains(@class,'story')]//ul//li//div/a")
	private List<WebElement> moreNewsRHSArticleLnks;

	/*More News article page Breadcrumb header*/
	@FindBy(xpath ="//h1")
	private WebElement moreNewsBreadcrumb;

	/* List of Article under Latest news Of Business Market Page */
	@FindBy(xpath = "//div[contains(@class,'blog_title')]")
	private List<WebElement> latestNewsArticleOnMarketLnk;

	/* Article header Text Present After Clicking on any Articl under Latest news Of Business Market Page */
	@FindBy(xpath = "//h1")
	private WebElement latestNewsArticleHeaderTxt;

	/*pagination present in bottom of Bottom of Byline page*/
	@FindBy(xpath="//div[contains(@class,'pagination')]/ul")
	private WebElement paginationDiv;

	/*List of pages in Pagination*/
	@FindBy(xpath="//div[contains(@class,'pagination')]//li/a")
	private List<WebElement> paginationList;

	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/* Live tv player present in Markets page*/
	@FindBy(xpath = "//div[@id='playerContainer']")
	private WebElement liveTvPlayer;
	
	/* Live tv player skip button in Markets page*/
	@FindBy(xpath = "//*[@id=\"skip-button:8\"]/span/button")
	private WebElement liveTvSkipBtn;

	/* Big play button player present in desktop minis page*/
	@FindBy(xpath = "//button[@class='vjs-big-play-button']//span[.='Play Video']")
	private WebElement bigPlayBtn;

	/*Pause button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']//span[.='Pause']")
	private WebElement pauseBtn;

	/*Play button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']//span[.='Play']")
	private WebElement playBtn;

	/*Mute button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-0']//span[.='Unmute']")
	private WebElement unmuteBtn;

	/*Unmute button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-3']//span[.='Mute']")
	private WebElement muteBtn;
	
	/*Business Markets Page Breadcrumb links  */
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]//ul//a")
	private List<WebElement> marketsBreadcrumbLstLnk;

	/*List of Promoted Content Links in Business Markets Page*/
	@FindBy(xpath = "//div[contains(@class,'items-container')]/div/a")
	private List<WebElement> promotedContentLstLnk;

	/**
	 * This method is used to navigate to Markets page
	 */
	public void navigateToNews18MarketsPage() {
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishMarketsUrl"));
	}

	/**
	 * This Method is used to click the Photogallery Image present in RHS of Photogallery Section and verify the navigation of Respective Pages
	 */
	public void clickOnPhotogalleryArticle() {
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<photogalleryImgLnk.size();i++)
		{
			webDriverActions.scrollToElement(photogalleryImgLnk.get(i));
			String actual = webDriverActions.getAttribute("title", photogalleryImgLnk.get(i));
			Logs.info(getClass(),"Actual title of image Before Click" + actual);
			webDriverActions.clickJS(photogalleryImgLnk.get(i));
			String expected = webDriverActions.getTextFromElement(photogalleryTitleTxt);
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate photogallery image "+actual);
			webDriverActions.navigateBack();
		}
	}

	/**
	 * This method is used to navigate to Video wall article links present at RHS of Market Page
	 */
	public void verifyVideoWallNavigation() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.mouseHover(videoWallArticleTitle);
		String actual=webDriverActions.getTextToLowerCase(videoWallArticleTitle);
		Logs.info(getClass(),"Actual article title in VideoWall section on Market page :"+actual);
		webDriverActions.clickJS(videoWallArticleTitle);
		String expected=webDriverActions.getTextToLowerCase(breadcrumbTitle);
		Logs.info(getClass(),"Expected article title present in Market Consumption page :"+expected);
		assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate "+actual);
	}

	/**
	 * This method is used to click on More News articles in RHS and to Navigate All Articles
	 */
	public void clickOnMarketsMoreNewsArticles() 
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(moreNewsRHSHeader);
		webDriverActions.highlightElement(moreNewsRHSHeader);
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<moreNewsRHSArticleLnks.size();i++)
		{
			String actual =webDriverActions.getAttribute("title",moreNewsRHSArticleLnks.get(i));
			Logs.info(getClass(), " Actual value of any news in Latest News On Astrology section "+actual);
			webDriverActions.highlightElement(moreNewsRHSArticleLnks.get(i));
			webDriverActions.clickJS(moreNewsRHSArticleLnks.get(i));
			webDriverActions.waitForPageToLoad();
			String expected=webDriverActions.getTextFromElement(moreNewsBreadcrumb);
			Logs.info(getClass(), "Expected value of any news in Latest News On Astrology Section "+expected);
			webDriverActions.navigateBack();
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Article Title is not equals to Breadcrumb Text");
		}
	}

	/**
	 * This method is used to verify Article present under the Latest News on Markets and their navigations
	 */
	public void verifyArticleBusinessMarketPage() {
		for(int i=0;i<latestNewsArticleOnMarketLnk.size();i++)
		{
			String actual =webDriverActions.getTextFromElement(latestNewsArticleOnMarketLnk.get(i));
			System.out.println(actual);
			Logs.info(getClass(), " Actual value of any news in Latest News On Astrology section "+actual);
			webDriverActions.highlightElement(latestNewsArticleOnMarketLnk.get(i));
			webDriverActions.clickJS(latestNewsArticleOnMarketLnk.get(i));
			webDriverActions.waitForPageToLoad();
			String expected=webDriverActions.getTextFromElement(latestNewsArticleHeaderTxt);
			System.out.println(expected);
			Logs.info(getClass(), "Navigated To "+expected);
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Article Title is not equals to Header Text");
			webDriverActions.navigateBack();
		}
	}

	/**
	 * This method is used to verify Article present under the Latest News on Markets and their navigations
	 */
	public void verifyPaginationBusinessMarketPage()
	{	
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.highlightElement(paginationDiv);
		Logs.info(getClass(), "Pagination is Displayed");
		for(int i=0;i<paginationList.size();i++) {
			String actualUrl = webDriverActions.getAttribute("href", paginationList.get(i));
			webDriverActions.mouseHover(paginationList.get(i));
			webDriverActions.highlightElement(paginationList.get(i));
			webDriverActions.clickJS(paginationList.get(i));
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), "Navigated To " +expectedUrl);
			assrt.assertEquals(actualUrl, expectedUrl,"Failed to navigate "+actualUrl);
			webDriverActions.navigateBack();
		}
	}	

	/**
	 * This method is used to verify advertisement present in Markets page
	 */
	public void verifyAds() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		for(int i=0;i<ads.size();i++) {
			webDriverActions.waitForElementVisibility(ads.get(i),GlobalVariables.sec60);
			webDriverActions.mouseHover(ads.get(i));
			webDriverActions.highlightElement(ads.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(ads.get(i)), "Failed to display");
		}
	}

	/**
	 * Verify Live tv is displayed in Markets page 
	 */
	public void verifyLiveTv(){
		webDriverActions.scrollDown();
		//vidgyor_iframe is the frame name for Live TV
		webDriverActions.switchToFrame("vidgyor_iframe");
		webDriverActions.waitForPageToLoad();
		webDriverActions.mouseHover(liveTvPlayer);
		webDriverActions.highlightElement(liveTvPlayer);
		webDriverActions.clickJS(bigPlayBtn);
		webDriverActions.waitForSecond(20000);
		webDriverActions.mouseHover(liveTvPlayer);
		webDriverActions.waitForElementVisibility(pauseBtn, GlobalVariables.sec60);
		assrt.assertTrue(webDriverActions.isElementDisplayed(pauseBtn), "failed to dsiplay pause button");
		webDriverActions.clickJS(pauseBtn);
		Logs.info(getClass(), "pause button is clicked");
		webDriverActions.waitForElementVisibility(playBtn, GlobalVariables.sec60);
		assrt.assertTrue(webDriverActions.isElementDisplayed(playBtn), "failed to dsiplay play button");
		webDriverActions.clickJS(playBtn);
		Logs.info(getClass(), "play button is clicked");
		assrt.assertTrue(webDriverActions.isElementDisplayed(unmuteBtn), "failed to dsiplay unmute button");
		webDriverActions.clickJS(unmuteBtn);
		Logs.info(getClass(), "unmute button is clicked");
		assrt.assertTrue(webDriverActions.isElementDisplayed(muteBtn), "failed to dsiplay mute button");
		webDriverActions.clickJS(muteBtn);
		Logs.info(getClass(), "mute button is clicked");
	}
	
	/**
	 *  This method is used to verify The Bredcrumb Navigation
	 *  of Business Markets Page
	 */
	public void verifyBreadCrumbNavigation()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForAllElementsVisible(marketsBreadcrumbLstLnk,GlobalVariables.sec60);
		for(int i=0;i<marketsBreadcrumbLstLnk.size();i++) {
			webDriverActions.highlightElement(marketsBreadcrumbLstLnk.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(marketsBreadcrumbLstLnk.get(i)));
			String actual = webDriverActions.getAttribute("href", marketsBreadcrumbLstLnk.get(i));
			webDriverActions.click(marketsBreadcrumbLstLnk.get(i));
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertEquals(actual,expected , "Failed to navigate "+actual);
			webDriverActions.navigateBack();
		}
		assrt.assertAll("Failed to navigate breadcrumb");
	}

	/**
	 * This method is used to verify navigation of Promoted Content in Business Markets Page
	 */
	public void verifyPromotedContentNavigation()
	{
		webDriverActions.waitForPageToLoad();
		String parentTitle = webDriverActions.getPageTitle();
		for(int i =0 ; i< promotedContentLstLnk.size(); i++)
		{
			webDriverActions.highlightElement(promotedContentLstLnk.get(i));
			String actual = webDriverActions.getAttribute("href", promotedContentLstLnk.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(promotedContentLstLnk.get(i)) , "Failed to displayed "+promotedContentLstLnk.get(i));
			webDriverActions.click(promotedContentLstLnk.get(i));
			webDriverActions.switchToNewWindow();
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parentTitle);
			assrt.assertEquals(actual, expected , "Failed to navigate "+actual);
		}
	}

}
