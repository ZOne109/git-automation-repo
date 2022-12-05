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
 * @author sivaguru.s
 * This class contains WebElements and Business logic of Desktop Savings and Investments Page
 */

public class DesktopSavingsAndInvestmentsPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	FileUtility fileUtility = new FileUtility();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();

	public WebDriver driver;
	public DesktopSavingsAndInvestmentsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/*Article Title Text is present below in Line Two navigation Bar in Savings and Investment Article Consumption Page*/
	@FindBy(xpath =" //h1[contains(@class,'article_heading')]")
	private WebElement articleTitleTxt;

	/*Article header Text in Savings and Investments Page after Clicking on article */
	@FindBy(xpath = "//h1[contains(@class,'article')]")
	private WebElement articleTxt;

	/*List of all articles present in More News Section present in RHS and excludes ads link*/
	@FindBy(xpath ="//div[contains(@class,'story')]//div/a")
	private List<WebElement> moreNwsArticlesList;

	/*LiveTv video player displaying in RHS of Savings and Investment page*/
	@FindBy(xpath = "//div[@id='playerContainer']")
	private WebElement liveTvPlayer;

	/*Big play button displaying in below of video player to play the liveTV*/
	@FindBy(xpath = "//div//button[@class='vjs-big-play-button']")
	private WebElement videoPlayBtn;

	/*Pause and play button displaying in below of video player*/
	@FindBy(xpath = "//div//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']//span")
	private WebElement pauseBtn;

	/*Play button displaying in below of video player*/
	@FindBy(xpath = "//div//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']//span")
	private WebElement playBtn;

	/*Mute button displaying in below of video player*/
	@FindBy(xpath = "//div//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-0']")
	private WebElement unmuteBtn;

	/*Unmute button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-3']//span[.='Mute']")
	private WebElement muteBtn;

	/*Go to live button displaying in below of video player*/
	@FindBy(xpath = "//div//button[@class='vjs-seek-to-live-control vjs-control']")
	private WebElement GoToLiveBtn;

	/*Share button displaying in below of video player*/
	@FindBy(xpath = "//div//button[@class='vjs-control vjs-button vjs-icon-share']")
	private WebElement shareBtn;

	/*Quality level button displaying in below of video player*/
	@FindBy(xpath = "//div//button[@class='vjs-quality-menu-button vjs-menu-button vjs-menu-button-popup vjs-button']")
	private WebElement QualityLvlBtn;

	/*Full screen and Non-full screen button displaying in below of video player*/
	@FindBy(xpath = "//div//button[@class='vjs-fullscreen-control vjs-control vjs-button']")
	private WebElement fullScreenAndNonFullScreenBtn;

	/*Close button in LiveTv player*/
	@FindBy(xpath = "//div[@id='vgr_share_close']")
	private WebElement closeBtn;

	/*Saving And Investment Logo Text is present below the Line Two Navigation Bar in Saving And Investment Page*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')]//h2")
	private  WebElement savingAndInvestmentLogoTxt;

	/*Saving And Investment Logo Link is present below the Line Two Navigation Bar in Saving And Investment Page*/
	@FindBy(xpath ="//div[contains(@class,'headerContainer')]//a/img")
	private  WebElement savingAndInvestmentLogoLnk;

	/*News18  Logo Link is present below the Line Two Navigation Bar in Home Page*/
	@FindBy(xpath ="//div[contains(@class,'Logo')]//a/img")
	private  WebElement news18LogoLnk;

	/*Photogallery Image Link is present RHS of Photogallery Section in Savings and Investments Page*/
	@FindBy(xpath ="//div[contains(@class,'photogellary_widget')]//ul//a/img")
	private List<WebElement> photogalleryImgLnk;

	/*Photogallery Title Text is present Below of Line Two Section in photogallery Article Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'photo_gallery_')]/h1")
	private  WebElement photogalleryTitleTxt;

	/*pagination present in bottom of saving and investment page*/
	@FindBy(xpath="//div[contains(@class,'pagination')]/ul")
	private WebElement paginationDiv;

	/*List of page navigation in saving and investment page*/
	@FindBy(xpath="//div[contains(@class,'pagination')]//li/a")
	private List<WebElement> paginationList;

	/*Footer present in saving and investment page */
	@FindBy(xpath ="//footer")
	private WebElement liveTVFooter;

	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/*Hamburger Menu List Link present at the Top Main Menu in Savings and Investments Page*/
	@FindBy(xpath ="//ul[contains(@class,'h-links clearfix')]/li//a")
	private List<WebElement> hamburgerMenuListLnk;

	/*Hamburger Menu Link is present in the Top Main Menu*/
	@FindBy(xpath ="//div[contains(@class,'hamburger')]")
	private WebElement hamburgerMenuLnk;

	/*cross hamburger Menu Link is present in  hamburger Menu*/
	@FindBy(xpath ="//div[contains(@class,'cross hamburger')]")
	private WebElement crossHamburgerMenuLnk;

	/*Link of all Promoted Content in Desktop Savings and Investments Page*/
	@FindBy(xpath = "//span[@class='ob-unit ob-rec-text']")
	private List<WebElement> savingspromotedContentLnk;


	/*Link of all Bread crumb in Desktop Savings and Investments Page*/
	@FindBy(xpath = "//ul//li[@class='jsx-2582612972']//a")
	private List<WebElement> savingsBreadCrumbLnk;

	/*List of Articles in Latest News On Savings and Investments */
	@FindBy(xpath = "//div[contains(@class,'blog_list')]//div//a")
	private List<WebElement> latestNewsArticleLnkLst;

	/* RHS Outbrain Link in Savings and Investments page*/
	@FindBy(xpath = "//div[@class='ob_what']/a")
	private WebElement rhsOutbrainLnk;

	/*Close Outbrain Popup Img after clicking on Outbrain Link*/
	@FindBy(xpath = "//div[@id='ob_modal_inner']//img")
	private WebElement closeOutbrainPopUp;

	/*List of icons(Ads) present in Line two navigation bar*/
	@FindBy(xpath = "//div[contains(@class,'secondNav')]//li//img")
	private List<WebElement> iconsLstInLineTwoNavigationBar;

	/*Trending Topics First Link is present in Footer of home page*/
	@FindBy(xpath="//span[contains(.,'TRENDING')]/following-sibling::div//a")
	private List<WebElement> trendingTopicsfirstLnk;

	/*App Store Link present at Footer part of Saving And Investment Page*/
	@FindBy(xpath ="//div[contains(@class,'device')]/a")
	private List<WebElement> appStoreFooterLnk;

	/*Download News-18 App Link is present on the Top before the Follow us on link*/
	@FindBy(xpath ="//div[contains(@class,'lnlapp')]/a")
	private WebElement downloadNews18AppLnk;

	/* List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[@class='gpaimg']//a//img")
	private List<WebElement> playStoreImg;

	/*Language list Button present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'languagebox')]//a")
	private List<WebElement> languageLnk;

	/*Change Language Button present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'languagebox')]")
	private WebElement changeLanguageBtn;

	/*Line Two Section List Links present below Main Menu Bar and not contains image*/
	@FindBy(xpath ="//div[contains(@class,'secondNav')]//ul/li[not(contains(@class,'influential'))]//a")
	private List<WebElement> lineTwoSectionListLnk;

	/*Covid Tracker link in  Desktop Savings And Investment Page*/
	@FindBy(xpath = "(//ul[@class='jsx-179543753 topNavList']/li['jsx-179543753 entryPointCovid'])[13]//a")
	private WebElement trackerLnk;

	/*language sites present in footer section of saving and investment page */
	@FindBy(xpath ="//div[(@class='footer_right')]//span[.='LANGUAGE ']")
	private WebElement languageSitesTxt;

	/*language sites List Link present in footer section of saving and investment page*/
	@FindBy(xpath ="//span[.='LANGUAGE ']/parent::span/following-sibling::div//a")
	private List<WebElement> languageSitesListLnk;

	/*Click and Navigate in Line One section dynamic drop down articles in Nw18 Business Cryptocurrency Page */
	@FindBy(xpath ="//ul[contains(@class,'List')]/li")
	private List<WebElement> lineOneLnks;

	/*Click and Navigate in Line One section dynamic drop down articles in Nw18 Business Cryptocurrency Page */
	@FindBy(xpath ="//ul[contains(@class,'List')]/li//div/a")
	private List<WebElement> lineOneDropDownLnks;

	/*First article link in Line one section bar navigations */
	@FindBy(xpath ="//h1")
	private WebElement firstArticleLnk;

	/*Footer Links present at footer section right of news 18 logo of Desktop Saving and Investment Page*/
	@FindBy(xpath="//div[@class='link_table w4']/a")
	private List<WebElement> linkTableFooterLnk;

	/*Title of article mentioned in video wall page*/
	@FindBy(xpath ="//div[@class='ftr_row footer-icon-img hot_social']//a")
	private List<WebElement> hotOnSocialArticlesLst;

	/*page header title*/
	@FindBy(xpath ="//div//h1")
	private WebElement headTitle;

	/*List of Network18 Group Sites link present in footer of the Savings and Investments Page */
	@FindBy(xpath = "//span[text()='Network18 ']/ancestor::div[@class='ftr_row']//a")
	private List<WebElement> networkGroupSitesLnkLst;

	/*Bsi Image Link present in  footer section of the Savings and Investment Page*/
	@FindBy(xpath ="//div[contains(@class,'bsi_logo')]//img")
	private  WebElement bsiImgLnk;

	/*List of social media links of author present in Byline Page*/
	@FindBy(xpath = "//div[contains(@class,'author-brief')]//ul//a")
	private List<WebElement> authorSocialMediaLnk;

	/*Trending Topics Links present on the Header below DownLoad News18 App in Savings and Investment Page*/
	@FindBy(xpath="//div[contains(@class,'trandingTopics')]/a")
	private List<WebElement> trendingTopicsLnks;

	/*Link of all popular categories in Desktop Savings And Investment Page*/
	@FindBy(xpath = "//div[@class='link_table']//a")
	private List<WebElement> popularCategoryLnks;

	/*Trending Topics All Links are present in Footer Section*/
	@FindBy(xpath ="//span[contains(.,'TRENDING')]/following-sibling::div//a")
	private List<WebElement> footerTrendingTopicsLnk;
	
	/*Click and Navigate in Line One section dynamic drop down articles in Nw18 Business Cryptocurrency Page */
	@FindBy(xpath ="//ul[contains(@class,'List')]/li//div/a")
	private List<WebElement> lineOneDropeDownLnks;


	/**
	 * This method is used to navigate to Savings and Investment page
	 */
	public void navigateToNews18SavingsAndInvestmentPage() {
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishSavingsUrl"));
	}


	/**
	 * This method is used to navigate all articles in more news section On Savings and Investment page
	 */
	public void moreNewsArticlesNavigation() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		for(int i=0;i<moreNwsArticlesList.size();i++)
		{
			String actual=webDriverActions.getTextFromElement(moreNwsArticlesList.get(i));
			Logs.info(getClass(), "Actual article title in More News section On Savings and Investments page :"+actual);
			webDriverActions.clickJS(moreNwsArticlesList.get(i));
			String expected= webDriverActions.getTextFromElement(headTitle);
			Logs.info(getClass(), "Expected article title present in Savings and Investments page :"+expected);
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
		}
	}

	/**
	 * This method is used to verify functionality of liveTV in Savings and Investments page
	 */
	public void verifyFunctionalityOfLiveTvPlayer() {
		webDriverActions.scrollDown();
		//vidgyor_iframe is the frame name for Live TV
		webDriverActions.waitForPageToLoad();
		webDriverActions.switchToFrame("vidgyor_iframe");
		webDriverActions.waitForPageToLoad();
		webDriverActions.mouseHover(liveTvPlayer);
		webDriverActions.highlightElement(liveTvPlayer);
		Logs.info(getClass(),"Navigated to LiveTV player");
		webDriverActions.waitForElementVisibility(videoPlayBtn, 60);
		webDriverActions.clickJS(videoPlayBtn);
		Logs.info(getClass(),"LiveTv player enabled");
		assrt.assertTrue(webDriverActions.isElementDisplayed(liveTvPlayer),"Failed to display "+liveTvPlayer);
		webDriverActions.clickJS(pauseBtn);
		Logs.info(getClass(),"LiveTv is playing");
		webDriverActions.clickJS(playBtn);
		Logs.info(getClass(),"LiveTV is paused");
		webDriverActions.clickJS(unmuteBtn);
		Logs.info(getClass(),"audio is unmuted");
		webDriverActions.clickJS(muteBtn);
		Logs.info(getClass(),"audio is muted");
		assrt.assertTrue(webDriverActions.isElementDisplayed(unmuteBtn),"Failed to display "+unmuteBtn);
	}


	/**
	 * This Method is used to click the Photogallery Image present in RHS of Photogallery Section and verify the navigation of Respective Pages
	 */
	public void clickOnPhotogalleryRHS() {
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
	 * This method is used to navigate to news18 Logo from Savings And Investment Page
	 */
	public void verifyNew18Logo() {
		webDriverActions.waitForPageToLoad();
		String actual = webDriverActions.getAttribute("alt",savingAndInvestmentLogoLnk);
		webDriverActions.click(savingAndInvestmentLogoLnk);
		String expected = webDriverActions.getAttribute("alt",news18LogoLnk);
		assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
	}


	/**
	 * This method is used to verify pagination is displayed at below and its navigation
	 */
	public void verifyPagination() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		webDriverActions.waitForElementVisibility(paginationDiv, GlobalVariables.sec60);
		webDriverActions.mouseHover(paginationDiv);
		webDriverActions.highlightElement(paginationDiv);
		for(int i=0;i<paginationList.size();i++) {
			webDriverActions.mouseHover(paginationList.get(i));
			webDriverActions.highlightElement(paginationList.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(paginationList.get(i)), "Failed to display "+paginationList.get(i));
			webDriverActions.clickJS(paginationList.get(i));
		}
		assrt.assertTrue(webDriverActions.isElementDisplayed(paginationDiv), "Failed to display "+paginationDiv);
	}


	/**
	 * This method is used to verify advertisement present in Savings and Investment page
	 */
	public void verifyAds() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForElementVisibility(liveTVFooter,GlobalVariables.sec60);
		for(int i=0;i<ads.size();i++) {
			webDriverActions.waitForElementVisibility(ads.get(i),GlobalVariables.sec60);
			webDriverActions.mouseHover(ads.get(i));
			webDriverActions.highlightElement(ads.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(ads.get(i)), "Failed to display");
		}
	}


	/**
	 * This method is used to Navigate  All section present in hamburger menu in Savings and Investment Page
	 */
	public void verifyHambugerMenu() { 
		webDriverActions.highlightElement(hamburgerMenuLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(hamburgerMenuLnk),"Failed to display "+hamburgerMenuLnk);
		webDriverActions.clickJS(hamburgerMenuLnk);
		for(int i=0;i<hamburgerMenuListLnk.size();i++)
		{  
			webDriverActions.highlightElement(hamburgerMenuListLnk.get(i));
			String actual = webDriverActions.getAttribute("href", hamburgerMenuListLnk.get(i));
			webDriverActions.click(hamburgerMenuListLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertEquals(actual, expected,"failed to navigate "+actual);
			webDriverActions.navigateBack();
			webDriverActions.clickJS(hamburgerMenuLnk);
		}
		webDriverActions.highlightElement(crossHamburgerMenuLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(crossHamburgerMenuLnk),"Failed to display "+crossHamburgerMenuLnk);
		webDriverActions.clickJS(crossHamburgerMenuLnk);
	}


	/**
	 * This method is used  verify BreadCrumb Header of Promoted Content in Savings and Investment News Page
	 */
	public void verifyBreadcrumbLnk() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForAllElementsVisible(savingsBreadCrumbLnk,GlobalVariables.sec60);
		for(int i=0;i<savingsBreadCrumbLnk.size();i++) {
			String url = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareTwoStrings(url,"news"), "Failed To Navigate");
			webDriverActions.highlightElement(savingsBreadCrumbLnk.get(i));
			webDriverActions.clickJS(savingsBreadCrumbLnk.get(i));
			webDriverActions.waitForPageToLoad();
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();	
		}
	}


	/**
	 * This method is used to verify Promoted Content in Savings and Investment News Page 
	 */
	public void verifyPromotedContent() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForAllElementsVisible(savingspromotedContentLnk,GlobalVariables.sec60);
		for(int i=0;i<savingspromotedContentLnk.size();i++) {
			webDriverActions.waitForElementVisibility(savingspromotedContentLnk.get(i),GlobalVariables.sec60);
			webDriverActions.highlightElement(savingspromotedContentLnk.get(i));
			webDriverActions.clickJS(savingspromotedContentLnk.get(i));
			webDriverActions.mouseHover(savingspromotedContentLnk.get(i));
			webDriverActions.switchToParentWindow();	
			assrt.assertTrue(webDriverActions.isElementDisplayed(savingspromotedContentLnk.get(i)),"Failed to display ");
		}
	}


	/**
	 * This methos used to verify article links in NW18 savings and Investments Page
	 */
	public void verifyLatestNewsArticle()
	{
		webDriverActions.waitForPageToLoad();
		for(int i=0 ; i < latestNewsArticleLnkLst.size() ;i++)
		{
			webDriverActions.mouseHover(latestNewsArticleLnkLst.get(i));
			webDriverActions.highlightElement(latestNewsArticleLnkLst.get(i));
			String actual = webDriverActions.getAttribute("href", latestNewsArticleLnkLst.get(i));
			webDriverActions.click(latestNewsArticleLnkLst.get(i));
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.navigateBack();
			assrt.assertEquals(actual, expected  , "Failed to Navigate :- "+actual);
		}
	}


	/**
	 * This method is used to click on RHS Outbrain link 
	 * And verify the navigation to pop-up 
	 */
	public void verifyOutbrainLogo()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(rhsOutbrainLnk);
		webDriverActions.waitForElementVisibility(closeOutbrainPopUp, GlobalVariables.sec30);
		webDriverActions.highlightElement(closeOutbrainPopUp);
		assrt.assertTrue(webDriverActions.isElementDisplayed(closeOutbrainPopUp),"Failed to displayed"+closeOutbrainPopUp);
	}


	/**
	 * This method is used to verify the Line two bar icons and their navigations
	 */
	public void verifyIconsInLineTwoBar() {
		webDriverActions.waitForPageToLoad();
		String parentTitle = webDriverActions.getPageTitle();
		for(int i=0 ; i<iconsLstInLineTwoNavigationBar.size() ; i++){
			webDriverActions.waitForAllElementsVisible(iconsLstInLineTwoNavigationBar, GlobalVariables.sec3);
			webDriverActions.mouseHover(iconsLstInLineTwoNavigationBar.get(i));
			webDriverActions.highlightElement(iconsLstInLineTwoNavigationBar.get(i));
			String actual = webDriverActions.getAttribute("href", iconsLstInLineTwoNavigationBar.get(i));
			webDriverActions.click(iconsLstInLineTwoNavigationBar.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();
			String expected =webDriverActions.getCurrentPageUrl();
			webDriverActions.switchToWindow(parentTitle);
			assrt.assertTrue(webDriverActions.isElementDisplayed(iconsLstInLineTwoNavigationBar.get(i)),"Failed to display");
			assrt.assertEquals(actual, expected,"Failed to navigate "+actual);
		}
	}


	/**
	 * This method is used to verify the download app link present at the Header and Footer and its navigations on Saving And Investment page
	 */
	public void verifyDownloadApp()
	{
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(downloadNews18AppLnk);
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		for(WebElement store : playStoreImg)
		{
			webDriverActions.highlightElement(store);
			assrt.assertTrue(webDriverActions.isElementDisplayed(store));
		}
		webDriverActions.switchToWindow(parentTitle);
		webDriverActions.scrollToLast();
		for(int i=0;i<appStoreFooterLnk.size();i++)
		{
			WebElement appStoreLnk = appStoreFooterLnk.get(i);
			webDriverActions.highlightElement(appStoreLnk);//used to Highlight the particular element
			String actual = webDriverActions.getAttribute("href", appStoreLnk);
			webDriverActions.clickJS(appStoreLnk);
			String expected = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate "+actual);
			webDriverActions.navigateBack();			
		}
	}


	/**
	 * This Method used to change Languages and verify the Navigations in Savings and Investments page
	 */
	public void verifyChangeLanguageNavigation(){	
		String parentTitle = webDriverActions.getPageTitle();
		for(int i=1;i<languageLnk.size();i++)//It will iterate the element one by one
		{
			webDriverActions.mouseHover(changeLanguageBtn);
			webDriverActions.highlightElement(languageLnk.get(i));//used to Highlight the particular element
			String actual = webDriverActions.getAttribute("href", languageLnk.get(i));
			webDriverActions.clickJS(languageLnk.get(i));
			webDriverActions.switchToNewWindow();
			String expected=webDriverActions.getCurrentPageUrl();
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parentTitle);
			Logs.info(getClass(), "Start Navigating "+actual);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed to navigate "+actual);
			webDriverActions.switchToParentWindow();
		}
	}


	/**
	 * This method is used to verify Line Two navigation bar in Savings and Investment page
	 */
	public void verifyLineTwoSection() {
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<lineTwoSectionListLnk.size();i++ ){
			webDriverActions.waitForAllElementsVisible(lineTwoSectionListLnk, GlobalVariables.sec60);
			String actual=webDriverActions.getTextToLowerCase(lineTwoSectionListLnk.get(i));
			webDriverActions.clickJS(lineTwoSectionListLnk.get(i));
			Logs.info(getClass(),"Clicked on :"+actual);
			String expect=webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(),"Navigated to : "+expect);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expect) || genericUtility.compareTwoStrings(expect, "news"),"Failed to Navigate");
			webDriverActions.navigateBack();
		}
	}


	/**
	 * This method is used to validate Covid Tracker Link navigation
	 */
	public void verifycovidTracker() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElementVisibility(trackerLnk,60);
		webDriverActions.waitForSecond(8000);
		webDriverActions.click(trackerLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(trackerLnk),"Failed to display "+trackerLnk);		
		Logs.info(getClass(),"Traker Link is displayed");
		String attribute =trackerLnk.getAttribute("text").toUpperCase();
		String text = webDriverActions.getTextFromElement(trackerLnk).toUpperCase();
		assrt.assertTrue(genericUtility.compareTwoStrings(text,attribute),"Failed to navigate ");
	}


	/**
	 * This method is used to verify language sites and its navigation present at footer in saving and investment page
	 */
	public void verifyLanguageSites(){ 
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		webDriverActions.highlightElement(languageSitesTxt);
		assrt.assertTrue(webDriverActions.isElementDisplayed(languageSitesTxt),"Failed to display "+languageSitesTxt);
		String page = webDriverActions.getPageTitle();
		for(int i=0;i<languageSitesListLnk.size();i++)
		{  
			webDriverActions.highlightElement(languageSitesListLnk.get(i));
			webDriverActions.mouseHover(languageSitesListLnk.get(i));
			String actual = webDriverActions.getAttribute("href", languageSitesListLnk.get(i));
			Logs.info(getClass(), "navigate to  "+actual);
			webDriverActions.clickJS(languageSitesListLnk.get(i));
			webDriverActions.switchToNewWindow();
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertEquals(actual, expected,"failed to navigate "+actual);
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(page);
		}
	}


	/**
	 * This method is to click and navigate in Line One section Articles of Saving And Investment page
	 */
	public void clickOnLineOneDropDownArticles()
	{
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<lineOneLnks.size()-1;i++)
		{
			String lineOne = webDriverActions.getTextFromElement(lineOneLnks.get(i));
			Logs.info(getClass(), lineOne);
			webDriverActions.mouseHover(lineOneLnks.get(i));
			for(int j=0;j<lineOneDropeDownLnks.size();j++)
			{  
				webDriverActions.highlightElement(lineOneDropeDownLnks.get(j));
				String actual= webDriverActions.getTextFromElement(lineOneDropeDownLnks.get(j));
				Logs.info(getClass(),actual);
				webDriverActions.clickJS(lineOneDropeDownLnks.get(j));
				webDriverActions.waitForPageToLoad();
				String expected= webDriverActions.getTextFromElement(firstArticleLnk);
				Logs.info(getClass(),expected);
				assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected));
				webDriverActions.navigateBack();
				webDriverActions.mouseHover(lineOneLnks.get(i));
			}
		}
	}


	/**
	 *This Method is used to verify Footer Links and their Navigations present right side of News18 logo on footer section of 
	 *Desktop Saving and Investment Page
	 */
	public void verifyFooterLinkComponents() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		String parentTitle = driver.getTitle();
		for(int i=0;i<linkTableFooterLnk.size();i++)//It will iterate the element one by one
		{
			webDriverActions.highlightElement(linkTableFooterLnk.get(i));//used to Highlight the particular element
			String actual = webDriverActions.getAttribute("href", linkTableFooterLnk.get(i));
			webDriverActions.clickJS(linkTableFooterLnk.get(i));
			webDriverActions.switchToNewWindow();
			String expected=webDriverActions.getCurrentPageUrl();
			webDriverActions.switchToWindow(parentTitle);
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate"+actual);
			webDriverActions.switchToParentWindow();
		}	
	}

	/**
	 * This method contains navigation of Hot On Social section articles in Savings And Investments Page
	 */
	public void navigateToHotOnSocialArticles() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		String parentTitle=webDriverActions.getPageTitle();
		for(WebElement hot:hotOnSocialArticlesLst){
			webDriverActions.waitForAllElementsVisible(hotOnSocialArticlesLst, GlobalVariables.sec60);
			webDriverActions.highlightElement(hot);
			String actual=webDriverActions.getAttribute("href",hot);
			webDriverActions.click(hot);
			webDriverActions.waitForPageToLoad();
			String expected=webDriverActions.getCurrentPageUrl();
			if(genericUtility.compareStringsWithIgnoreCase(actual, expected)) {
				assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate "+actual);
				Logs.info(getClass(),"actual:"+actual+" expected:"+expected);
			}else {
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String expectedUrl=webDriverActions.getCurrentPageUrl();
				assrt.assertTrue(genericUtility.compareTwoStrings(actual, expectedUrl),"Failed to navigate "+actual);
				Logs.info(getClass(),"actual:"+actual+" expected:"+expectedUrl);
				webDriverActions.switchToWindow(parentTitle);
			}
		}
	}


	/**
	 *  This method is used to verify the Network18 Groups Site section
	 *  present in the footer of the Savings and Investments Page
	 */
	public void verifyNetworkGroupSites()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		String parentTitle = webDriverActions.getPageTitle();
		for(int i=0;i<networkGroupSitesLnkLst.size();i++)
		{
			webDriverActions.waitForSecond(1000);
			webDriverActions.highlightElement(networkGroupSitesLnkLst.get(i));
			webDriverActions.mouseHover(networkGroupSitesLnkLst.get(i));
			String actual = webDriverActions.getAttribute("href", networkGroupSitesLnkLst.get(i));
			webDriverActions.click(networkGroupSitesLnkLst.get(i));
			webDriverActions.switchToNewWindow();
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parentTitle);
			assrt.assertTrue(webDriverActions.isElementDisplayed(networkGroupSitesLnkLst.get(i)),"Failed to display "+networkGroupSitesLnkLst);
			assrt.assertEquals(actual, expected,"Failed to navigate "+actual);
		}
	}

	/**
	 * This Method is used to click and navigate on Bsi present in the footer 
	 * of the Savings and Investments Page
	 */
	public void verifyBsiLogoNavigation() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		String actual = webDriverActions.getAttribute("href", bsiImgLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(bsiImgLnk));
		webDriverActions.click(bsiImgLnk);
		webDriverActions.switchToNewWindow();
		String expected = webDriverActions.getCurrentPageUrl();
		assrt.assertEquals(actual, expected,"Failed to navigate "+actual);
	}


	/**
	 * This method is used to navigate to all Trending Topics section links
	 */
	public void verifyTrendingTopicsHeader() {
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<trendingTopicsLnks.size();i++)
		{
			String actual = webDriverActions.getAttribute("href",trendingTopicsLnks.get(i));
			webDriverActions.clickJS(trendingTopicsLnks.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to display "+actual);
			webDriverActions.navigateBack();
			String currentPage = webDriverActions.getCurrentPageUrl();
			if(genericUtility.compareStringsWithEquals(currentPage, expected)) {
				webDriverActions.navigateBack();
			}
		}
	}


	/**
	 * This method used to navigate to footer popular Categories links
	 */
	public void verifyPopularCategoryFooter() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForAllElementsVisible(popularCategoryLnks,60);
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<popularCategoryLnks.size();i++) {
			webDriverActions.getTextFromElement(popularCategoryLnks.get(i));
			String actual =   webDriverActions.getTextFromElement(popularCategoryLnks.get(i));
			webDriverActions.highlightElement(popularCategoryLnks.get(i));
			webDriverActions.click(popularCategoryLnks.get(i));
			String expected =  webDriverActions.getCurrentPageUrl();
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
			assrt.assertTrue(genericUtility.compareTwoStrings(expected,actual) ||genericUtility.compareTwoStrings(expected,"news"),"Failed to navigate ");				   
		}
	}


	/**
	 * This Method is used to navigate All Link of Trending Topics present on Footer in Desktop Saving and Investment
	 */
	public void verifyTrendingTopicsFooter() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		for(int i=0;i<footerTrendingTopicsLnk.size();i++)
		{
			String actual = webDriverActions.getAttribute("href",footerTrendingTopicsLnk.get(i));
			webDriverActions.clickJS(footerTrendingTopicsLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			if(genericUtility.compareStringsWithIgnoreCase(actual, expected))
			{
				assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to Navigate Same Window");
				webDriverActions.navigateBack();
			}
			else {
				webDriverActions.switchToParentWindow();
				String expectedUrl= webDriverActions.getCurrentPageUrl();
				assrt.assertTrue(genericUtility.compareTwoStrings(actual, expectedUrl),"failed To Navigate Child Window");
			}
		}
	}   
}



