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
 * @author Danish R
 * This class contains webelements and business logic for News18 Cryptocurrency Page
 */
public class DesktopCryptocurrencyPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();
	FileUtility fileUtility = new FileUtility();
	public WebDriver driver;

	public DesktopCryptocurrencyPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*pagination present in bottom of Cryptocurrency page*/
	@FindBy(xpath="//div[contains(@class,'pagination')]")
	private WebElement paginationDiv;

	/*List of pages in Cryptocurrency page*/
	@FindBy(xpath="//div[contains(@class,'pagination')]//li/a")
	private List<WebElement> paginationList;

	/* List of Tending topics links present in footer of the Cryptocurrency Page*/
	@FindBy(xpath = "//div[contains(@class,'trending-row')]//a")
	private List<WebElement> trendingTopicsLst;

	/*List of Network18 Group Sites link present in footer of the Cryptocurrency Page */
	@FindBy(xpath = "//span[text()='Network18 ']/ancestor::div[@class='ftr_row']//a")
	private List<WebElement> networkGroupSitesLnkLst;

	/*LiveTv video player displaying in RHS of cryptocurrency page*/
	@FindBy(xpath = "//div[@id='playerContainer']")
	private WebElement liveTvPlayer;

	/*Big play button displaying in below of video player to play the liveTV*/
	@FindBy(xpath = "//div//button[@class='vjs-big-play-button']")
	private WebElement videoPlayBtn;

	/*Pause and play button displaying in below of video player*/
	@FindBy(xpath = "//div//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']//span[contains(text(),'Pause')]")
	private WebElement pauseBtn;

	/*Play button displaying in below of video player*/
	@FindBy(xpath = "//div//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']//span[contains(text(),'Play')]")
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

	/*Article Title Text is present below in Line Two navigation Bar in CryptoCurrency Article Consumption Page*/
	@FindBy(xpath =" //h1[contains(@class,'article_heading')]")
	private WebElement articleTitleTxt;

	/*Article Blog Image present inside Latest News On Cryptocurrency*/
	@FindBy(xpath ="//div[contains(@class,'blog_img')]//img")
	private List<WebElement> articleBlogImg;

	/*CryptoCurrency Breadcrumb is present below in Line Two navigation Bar in CryptoCurrency Article Consumption Page*/
	@FindBy(xpath ="//span[@class='act']")
	private WebElement breadcrumbHeader;

	/*Blog Title present inside Latest News On Cryptocurrency*/
	@FindBy(xpath ="//div[contains(@class,'blog_title')]/h4")
	private List<WebElement> blogTitle;

	/*Click and Navigate in Line One section dynamic drop down articles in Nw18 Business Cryptocurrency Page */
	@FindBy(xpath ="//ul[contains(@class,'List')]/li//div/a")
	private List<WebElement> lineOneDropeDownLnks;

	/*Click and Navigate in Line One section dynamic drop down articles in Nw18 Business Cryptocurrency Page */
	@FindBy(xpath ="//ul[contains(@class,'List')]/li")
	private List<WebElement> lineOneLnks;

	/*First article link in Line one section bar navigations */
	@FindBy(xpath ="//h1")
	private WebElement firstArticleLnk;

	/*List of all articles present in More News Section present in RHS and excludes ads link*/
	@FindBy(xpath ="//div[@class='recomeded_story']//div/a")
	private List<WebElement> moreNwsArticlesList;

	/*Title of article present in video wall section present in RHS */
	@FindBy(xpath ="//div[contains(@class,'video_wall')]//h2[contains(@class,'video_title')]")
	private WebElement videoWallArticleTitle;

	/*Title of article mentioned in video wall page*/
	@FindBy(xpath ="//div[@class='BreadCum']//span")
	private WebElement breadcrumbTitle;

	/*Line one links present at Header Part of crypto currency page*/
	@FindBy(xpath="//ul[contains(@class,'topNavList')]//li/a")
	private List<WebElement> lineOneLnk;

	/*news18 logo present at Header Part of page*/
	@FindBy(xpath="//div[contains(@class,'topLogoWrap')]/a/img")
	private WebElement news18LogoLnk;

	/*Language list Button present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'languagebox')]//a")
	private List<WebElement> languageLnk;

	/*Change Language Button present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'languagebox')]")
	private WebElement changeLanguageBtn;

	/*Desktop List of Cryptocurrency Breadcrum link  */
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]//a")
	private List<WebElement> cryptocurrencyBreadcrumLnk;

	/*Link of all Promoted Content in Desktop Cryptocurrency Page*/
	@FindBy(xpath = "//span[@class='ob-unit ob-rec-text']")
	private List<WebElement> promotedContentLnk;

	/*Photogallery present RHS of CryptoCurrency Article Consumption Page*/
	@FindBy(xpath ="//span[.='Photogallery']")
	private WebElement photogalleryTxtRHS;

	/*Article present under photogallery sub section in CryptoCurrency Article Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'cn_right')]/a")
	private List<WebElement> photoGalleryArticleLnkRHS;

	/*BreadCrumb headline text present below header */
	@FindBy(xpath ="//span[@class='brade_crum_headline']")
	private WebElement breadcrumbHeadlineTxt;

	/*Hamburger Menu List Link present at the Top Main Menu in CryptoCurrency Page*/
	@FindBy(xpath ="//ul[contains(@class,'h-links clearfix')]/li//a")
	private List<WebElement> hamburgerMenuListLnk;

	/*Hamburger Menu Link is present in the Top Main Menu*/
	@FindBy(xpath ="//div[contains(@class,'hamburger')]")
	private WebElement hamburgerMenuLnk;

	/*cross hamburger Menu Link is present in  hamburger Menu*/
	@FindBy(xpath ="//div[contains(@class,'cross hamburger')]")
	private WebElement crossHamburgerMenuLnk;

	/*language sites present in footer section of cryptocurrency page */
	@FindBy(xpath ="//div[(@class='footer_right')]//span[.='LANGUAGE ']")
	private WebElement languageSitesTxt;

	/*language sites List Link present in footer section of cryptocurrency page*/
	@FindBy(xpath ="//span[.='LANGUAGE ']/parent::span/following-sibling::div//a")
	private List<WebElement> languageSitesListLnk;

	/*Title of article mentioned in video wall page*/
	@FindBy(xpath ="//div[@class='ftr_row footer-icon-img hot_social']//a")
	private List<WebElement> hotOnSocialArticlesLst;

	/*page header title*/
	@FindBy(xpath ="//div//h1")
	private WebElement headTitle;

	/*Link Table Components present at footer section right of news 18 logo of Crypto currency Page*/
	@FindBy(xpath="//div[@class='link_table w4']/a")
	private List<WebElement> linkTableFooterLnk;

	/*Bsi Image Link present in  footer section of CryptoCurrency Page*/
	@FindBy(xpath ="//div[contains(@class,'bsi_logo')]//img")
	private  WebElement bsiImgLnk;

	/*Live Tv on Footer*/
	@FindBy(xpath ="//footer//span[text()='LIVE TV']//..//a")
	private WebElement liveTVFooter;

	/*Live Tv on Top after Change Language*/
	@FindBy(xpath ="//a[@href='/livetv/']")
	private WebElement liveTvTop;

	/*Download News18 App Lnk is present on top above Trending Topics in CryptoCurrency Page */
	@FindBy(xpath ="//div[contains(@class,'lnlapp')]/a")
	private WebElement downloadNews18AppLnkTop;

	/*Download News18 App Text is present on top above Trending Topics in CryptoCurrency Page */
	@FindBy(xpath ="//div[contains(@class,'lnlapp')]/a//strong")
	private WebElement downloadNews18AppTxt;

	/*Live Tv Title text is present below the Line Two Navigation Bar in Live Tv Page */
	@FindBy(xpath ="//div[contains(@class,'livetv-container')]//h1")
	public WebElement liveTvTitleTxt;

	/*Live Tv Text  on Top after Change Language present in CryptoCurrency Page*/
	@FindBy(xpath ="//a[@href='/livetv/']//strong")
	public WebElement liveTvTxtTop;

	/*Google play and Ios Image Links is present below line Two Navigation Bar in CryptoCurrency App Download Page */
	@FindBy(xpath ="//div[contains(@class,'gpaimg')]/a/img")
	private  List<WebElement> googlePlayIosImgLnk;

	/*Live Tv Text  on footer above the Follow us On Links present in CryptoCurrency Page */
	@FindBy(xpath ="//footer//span[text()='LIVE TV']//..//a/../span")
	public WebElement liveTvTxtFooter;


	/**
	 * This method is used to navigate to cryptocurrency page
	 */
	public void navigateToNews18cryptocurrencyPage() {
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishCryptoUrl"));
	}

	/**
	 * This method is used to verify functionality of liveTV in cryptocurrency page
	 */
	public void verifyLiveTvPlayer(){
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
	 * This method is used to Navigate All Articles with Image Link And Title of Latest News On Cryptocurrency Page
	 */
	public void navigateAllArticles() {
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<articleBlogImg.size();i++)
		{
			String actual = webDriverActions.getAttribute("title", articleBlogImg.get(i));
			Logs.info(getClass(), "Actual value of article news as Image in Latest News On Cryptocurrency section: " + actual);
			webDriverActions.clickJS(articleBlogImg.get(i));
			webDriverActions.waitForPageToLoad();
			String expected=webDriverActions.getTextFromElement(articleTitleTxt);
			Logs.info(getClass(), "Expected value of article title present in Cryptocurrency Article page: "+expected);
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
		}
		for(int j=0;j<blogTitle.size();j++)
		{
			String actual=webDriverActions.getTextFromElement(blogTitle.get(j));
			Logs.info(getClass(), "Actual value of article news as title in Latest News On Cryptocurrency section"+actual);
			webDriverActions.clickJS(blogTitle.get(j));
			String expected=webDriverActions.getTextFromElement(articleTitleTxt);
			Logs.info(getClass(), "Expected value of article title present in Cryptocurrency Article page"+expected);
			assrt.assertEquals(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
		}
	}

	/**
	 * This method is to click and navigate in Line One section Articles
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
	 * This method is used to navigate to More News article links
	 */
	public void navigationOfMoreNewsArticles() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		for(int i=0;i<moreNwsArticlesList.size();i++)
		{
			String actual =webDriverActions.getTextFromElement(moreNwsArticlesList.get(i));
			Logs.info(getClass(), "Actual article title in More News section On Cryptocurrency page"+actual);
			webDriverActions.clickJS(moreNwsArticlesList.get(i));
			String expected=webDriverActions.getTextFromElement(headTitle);
			Logs.info(getClass(), "Expected article title present in Cryptocurrency Consumption page"+expected);
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
			Logs.info(getClass(), "Navigated to respective page");
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
		}
	}


	/**
	 * This method is used to navigate to Video wall article links
	 */
	public void verifyVideoWallNavigationRHS() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.mouseHover(videoWallArticleTitle);
		String actual=webDriverActions.getTextToLowerCase(videoWallArticleTitle);
		Logs.info(getClass(),"Actual article title in VideoWall section on Cryptocurrency page :"+actual);
		webDriverActions.clickJS(videoWallArticleTitle);
		String expected=webDriverActions.getTextToLowerCase(breadcrumbTitle);
		Logs.info(getClass(),"Expected article title present in Cryptocurrency Consumption page :"+expected);
		assrt.assertTrue(genericUtility.compareStringsWithEquals(actual, expected),"Failed to navigate "+actual);
	}


	/**
	 * This Method used to change Languages and verify the Navigations in Crypto currency page
	 */
	public void verifyLineOneNavigation()
	{
		String cryptoCurrency = webDriverActions.getCurrentPageUrl();
		for(int i=1;i<lineOneLnk.size()-1;i++)//It will iterate the element one by one
		{
			webDriverActions.highlightElement(lineOneLnk.get(i));//used to Highlight the particular element
			webDriverActions.click(lineOneLnk.get(i));
			webDriverActions.highlightElement(news18LogoLnk);
			webDriverActions.click(news18LogoLnk);
			String actual = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, "https://www.news18.com/"),"Failed To Navigate "+actual);
			webDriverActions.navigateToUrl(cryptoCurrency);
		}
	}


	/**
	 * This Method used to change Languages and verify the Navigations in Crypto currency page
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
			webDriverActions.switchToWindow(parentTitle);
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate "+actual);
			webDriverActions.switchToParentWindow();
		}
	}


	/**
	 * This method is used  verify BreadCrumb Header of Cryptocurrency Page
	 */
	public void verifyBreadcrumbLnk() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForAllElementsVisible(cryptocurrencyBreadcrumLnk,GlobalVariables.sec60);
		for(int i=0;i<cryptocurrencyBreadcrumLnk.size();i++) {
			String url = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareTwoStrings(url,"news"), "Failed To Navigate "+url);			
			webDriverActions.highlightElement(cryptocurrencyBreadcrumLnk.get(i));
			webDriverActions.click(cryptocurrencyBreadcrumLnk.get(i));
			webDriverActions.waitForPageToLoad();
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
		}
	}


	/**
	 * This method is used to verify the PromotedContent in Cryptocurrency Page
	 */
	public void verifyPromotedContent() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForAllElementsVisible(promotedContentLnk,GlobalVariables.sec60);
		for(int i=0;i<promotedContentLnk.size();i++) {
			webDriverActions.waitForElementVisibility(promotedContentLnk.get(i),GlobalVariables.sec60);
			webDriverActions.click(promotedContentLnk.get(i));
			webDriverActions.mouseHover(promotedContentLnk.get(i));
			webDriverActions.highlightElement(promotedContentLnk.get(i));
			webDriverActions.switchToParentWindow();	
			assrt.assertTrue(webDriverActions.isElementDisplayed(promotedContentLnk.get(i)),"Failed to display "+promotedContentLnk.get(i));
		}
	}


	/**
	 * This method is used to verify the page navigation 
	 *  in Cryptocurrency page
	 */
	public void verifyPagination() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		webDriverActions.scrollToLast();
		assrt.assertTrue(webDriverActions.isElementDisplayed(paginationDiv),"Failed to display "+paginationDiv);
		webDriverActions.waitForElementVisibility(paginationDiv, GlobalVariables.sec60);
		for(int i=0;i<paginationList.size();i++) {
			webDriverActions.waitForPageToLoad();
			webDriverActions.waitForElementVisibility(paginationList.get(i),GlobalVariables.sec60);
			webDriverActions.highlightElement(paginationList.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(paginationList.get(i)) , "Failed to display " +paginationList.get(i));
			String actual = webDriverActions.getAttribute("href", paginationList.get(i));
			webDriverActions.click(paginationList.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertEquals(actual, expected,"Failed to navigate "+actual);
		}
	}


	/**
	 *  This method is used to verify the Trending topics section
	 *  present in the footer of the Cryptocurrency Page
	 */
	public void verifyTrendingTopics()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		for(int i=0;i<trendingTopicsLst.size();i++)
		{
			webDriverActions.waitForSecond(1000);
			webDriverActions.highlightElement(trendingTopicsLst.get(i));
			webDriverActions.click(trendingTopicsLst.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.scrollDown();
			webDriverActions.scrollToLast();
			assrt.assertTrue(webDriverActions.isElementDisplayed(trendingTopicsLst.get(i)),"Failed to display "+trendingTopicsLst.get(i));
		}
	}


	/**
	 *  This method is used to verify the Network18 Groups Site section
	 *  present in the footer of the Cryptocurrency Page
	 */
	public void verifyNetworkGroupSites()
	{
		webDriverActions.waitForPageToLoad();
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.scrollDown();
		for(int i=0;i<networkGroupSitesLnkLst.size();i++)
		{
			webDriverActions.waitForSecond(1000);
			webDriverActions.highlightElement(networkGroupSitesLnkLst.get(i));
			String actual = webDriverActions.getAttribute("href", networkGroupSitesLnkLst.get(i));
			webDriverActions.click(networkGroupSitesLnkLst.get(i));
			webDriverActions.switchToNewWindow();
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.switchToWindow(parentTitle);
			assrt.assertEquals(actual, expected,"Failed to navigate "+actual);
			assrt.assertTrue(webDriverActions.isElementDisplayed(networkGroupSitesLnkLst.get(i)),"Failed to display "+networkGroupSitesLnkLst.get(i));
		}
	}


	/**
	 * This method is used to Navigate All Articles present in RHS photogallery sub module in Cryptocurrency Page
	 */
	public void verifyPhotogalleryArticles() {
		webDriverActions.mouseHover(photogalleryTxtRHS);
		webDriverActions.highlightElement(photogalleryTxtRHS);
		assrt.assertTrue(webDriverActions.isElementDisplayed(photogalleryTxtRHS),"Failed to display "+photogalleryTxtRHS);
		for(int i=0;i<photoGalleryArticleLnkRHS.size();i++)
		{  
			webDriverActions.highlightElement(photoGalleryArticleLnkRHS.get(i));
			webDriverActions.mouseHover(photoGalleryArticleLnkRHS.get(i));
			String actual = webDriverActions.getAttribute("href", photoGalleryArticleLnkRHS.get(i));
			Logs.info(getClass(), "navigate to  "+actual);
			webDriverActions.click(photoGalleryArticleLnkRHS.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertEquals(actual, expected,"failed to navigate "+actual);
			webDriverActions.navigateBack();
		}
	}


	/**
	 * This method is used to Navigate  All section present in hamburger menu in Cryptocurrency Page
	 */
	public void verifyHambugerMenu(){ 
		webDriverActions.highlightElement(hamburgerMenuLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(hamburgerMenuLnk),"Failed to display "+hamburgerMenuLnk);
		webDriverActions.clickJS(hamburgerMenuLnk);
		for(int i=0;i<hamburgerMenuListLnk.size();i++)
		{  
			webDriverActions.highlightElement(hamburgerMenuListLnk.get(i));
			String actual = webDriverActions.getAttribute("href", hamburgerMenuListLnk.get(i));
			Logs.info(getClass(), "navigate to  "+actual);
			webDriverActions.click(hamburgerMenuListLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expected);
			assrt.assertEquals(actual, expected,"failed to navigate "+actual);
			webDriverActions.navigateBack();
			String currentPage = webDriverActions.getCurrentPageUrl();
			if(genericUtility.compareStringsWithEquals(currentPage, expected)) {
				webDriverActions.navigateBack();
			}
			webDriverActions.clickJS(hamburgerMenuLnk);
		}
		webDriverActions.highlightElement(crossHamburgerMenuLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(crossHamburgerMenuLnk),"Failed to display "+crossHamburgerMenuLnk);
		webDriverActions.clickJS(crossHamburgerMenuLnk);
	}


	/**
	 * This method is used to verify language sites and its navigation present in footer
	 */
	public void verifyLanguageSites(){ 
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		webDriverActions.highlightElement(languageSitesTxt);
		assrt.assertTrue(webDriverActions.isElementDisplayed(languageSitesTxt),"Failed to display "+languageSitesTxt);
		String parentTitle = webDriverActions.getPageTitle();
		for(int i=0;i<languageSitesListLnk.size();i++)
		{  
			WebElement language = languageSitesListLnk.get(i);
			webDriverActions.highlightElement(language);
			webDriverActions.mouseHover(language);
			String actual = webDriverActions.getAttribute("href", language);
			Logs.info(getClass(), "navigate to  "+actual);
			webDriverActions.clickJS(language);
			webDriverActions.switchToNewWindow();
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertEquals(actual, expected,"failed to navigate "+actual);
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parentTitle);
		}
	}

	/**
	 * This method is used to Navigate all links present in Hot on social at footer
	 */
	public void verifyHotOnSocialArticlesNavigation() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		String parentTitle=webDriverActions.getPageTitle();
		for(WebElement hot:hotOnSocialArticlesLst){
			webDriverActions.waitForAllElementsVisible(hotOnSocialArticlesLst, GlobalVariables.sec60);
			webDriverActions.mouseHover(hot);
			String actual=webDriverActions.getAttribute("href",hot);
			webDriverActions.click(hot);
			webDriverActions.waitForPageToLoad();
			String expected=webDriverActions.getCurrentPageUrl();
			if(genericUtility.compareStringsWithIgnoreCase(actual, expected)) {
				assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate");
			}else {
				webDriverActions.switchToNewWindow();
				webDriverActions.waitForPageToLoad();
				String expectedUrl=webDriverActions.getCurrentPageUrl();
				assrt.assertTrue(genericUtility.compareTwoStrings(actual, expectedUrl),"Failed to navigate");
				webDriverActions.switchToWindow(parentTitle);
			}
		}
	}


	/**
	 *This Method is used to verify Link table components and their Navigations present right side of News18 logo on footer section of CryptoCurrency Page
	 */
	public void verifyLinkTableComponents(){
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		for(int i=0;i<linkTableFooterLnk.size();i++)//It will iterate the element one by one
		{
			webDriverActions.highlightElement(linkTableFooterLnk.get(i));//used to Highlight the particular element
			webDriverActions.click(linkTableFooterLnk.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(linkTableFooterLnk.get(i)),"Failed To display "+linkTableFooterLnk.get(i));
			webDriverActions.switchToParentWindow();
		}
	}


	/**
	 * This Method is used to click and navigate on Bsi present in the footer
	 */
	public void clickOnBsiLogo() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.click(bsiImgLnk);
		Logs.info(getClass(),"Navigation done Sucessfully");
		assrt.assertTrue(webDriverActions.isElementDisplayed(bsiImgLnk),"Failed to Navigate "+bsiImgLnk);
	}


	/**
	 * This method is used to download News18 App present in header
	 * @throws InterruptedException
	 */
	public void verifyDownloadNews18App (){
		String actual = webDriverActions.getAttribute("href", downloadNews18AppLnkTop);
		webDriverActions.clickJS(downloadNews18AppLnkTop);
		String expected = webDriverActions.getCurrentPageUrl();
		assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to Navigate Download-app");
		webDriverActions.switchToNewWindow();
		for(int i=0;i<=googlePlayIosImgLnk.size()-1;i++)
		{
			String actualApp=webDriverActions.getAttribute("src",googlePlayIosImgLnk.get(i));	
			webDriverActions.clickJS(googlePlayIosImgLnk.get(i));
			webDriverActions.switchToParentWindow();
			String expectedApp= webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareTwoStrings(actualApp, expectedApp),"Failed to navigate "+actualApp);
		}
	}


	/**
	 * This method is used to Click and Verify Live Tv Icon present in Top and Navigate on Live Tv Page
	 */
	public void verifyHeaderLiveTv() {
		String actual=webDriverActions.getTextFromElement(liveTvTxtTop);
		webDriverActions.clickJS(liveTvTop);	
		String expected=webDriverActions.getTextFromElement(liveTvTitleTxt);
		assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate");
	}


	/**
	 * This method is used to click and Verify Live Tv Icon present in Footer and navigate on Live Tv Page
	 */
	public void verifyFooterLiveTv() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		String actual = webDriverActions.getTextFromElement(liveTvTxtFooter);
		webDriverActions.clickJS(liveTVFooter);	
		webDriverActions.switchToNewWindow();
		String expected =webDriverActions.getTextFromElement(liveTvTitleTxt);
		assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate "+actual);	
	}
}

