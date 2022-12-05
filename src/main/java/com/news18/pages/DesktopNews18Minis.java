package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Sivaguru
 * This class contains webelements and business logic of News18 Minis page
 */

public class DesktopNews18Minis {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();

	public DesktopNews18Minis(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Link of video wall present in RHS*/
	@FindBy(xpath = "//div//h2[contains(@class,'video_title')]/../../img")
	private WebElement videoWallTitleLnk;

	/*List of icons present in Line two navigation bar*/
	@FindBy(xpath = "//div[contains(@class,'secondNav')]//ul//li//img//..")
	private List<WebElement> lineTwoNavigationBarIcons;

	/* Live tv player present in desktop minis page*/
	@FindBy(xpath = "//div[@id='playerContainer']")
	private WebElement liveTvPlayer;

	/* Big play button player present in desktop minis page*/
	@FindBy(xpath = "//button[@class='vjs-big-play-button']//span[.='Play Video']")
	private WebElement bigPlayBtn;

	/*Pause button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']//span[.='Pause']")
	private WebElement pauseBtn;

	/*Hamburger Menu List Link present at the Top Main Menu in News-18 Mini Page*/
	@FindBy(xpath ="//ul[contains(@class,'h-links clearfix')]/li//a")
	private List<WebElement> hamburgerMenuListNw18MiniLnk;

	/*Hamburger Menu Link is present in the Top Main Menu*/
	@FindBy(xpath ="//div[contains(@class,'hamburger')]")
	private WebElement hamburgerMenuLnk;

	/*LineOne Section List Links present in Desktop Minis Page */
	@FindBy(xpath ="//ul[contains(@class,'secondNav_inner')]//li//a")
	private List<WebElement> l2SectionListLnk;

	/*LineOne Section List Links present in Desktop Minis Page */
	@FindBy(xpath ="//li[contains(@class,'top_nav')] //a[not(text()='Home')]")
	private List<WebElement> l1SectionListLnk;

	/*See More link present in news18 minis section in home page*/
	@FindBy(xpath = "//div[contains(@class,'minis')]/a[contains(.,'See More')]")
	private WebElement seeMoreLnk;

	/*Download News-18 App Link is present on the Top before the Follow us on link*/
	@FindBy(xpath ="//div[contains(@class,'lnlapp')]/a")
	private WebElement downloadNews18AppLnk;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[@class='gpaimg']//a//img")
	private List<WebElement> playStoreImg;

	/*List Of articles in News18Mini Page*/
	@FindBy(xpath ="//div[contains(@class,'minis_grid_col')]")
	private List<WebElement> news18MiniArticleLst;

	/*List Of App Store Image after clicking on News18 Download App present in header*/
	@FindBy(xpath ="//div[contains(@class,'bredcrum-txt')]/span")
	private WebElement articleBreadcrumbTxt;

	/*social media icons link button present under article widget of Desktop News minis Page*/
	@FindBy(xpath="//div[contains(@class,'minis_grid_col')][1]//ul[contains(@class,'ftr_social')]//a")
	private List<WebElement> socialMediaIconsLnk;

	/*Change Language Button present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'languagebox')]")
	private WebElement changeLanguageBtn;

	/*Language list Button present at Header Part*/
	@FindBy(xpath="//div[contains(@class,'languagebox')]//a")
	private List<WebElement> languageLnk;

	/*Click on Tracker Link present in Line One Navigation Bar in NW18 Minis Page*/
	@FindBy(xpath="//div//ul//li[@id='entrypoint_covid']/a")
	private WebElement trackerLnk ;

	/*Outbrain Link in News18 Mini page*/
	@FindBy(xpath = "//div[@class='ob_what']/a")
	private WebElement rhsOutbrainLnk;

	/*Close Outbrain Popup Img after clicking on Outbrain Link*/
	@FindBy(xpath = "//div[@id='ob_modal_inner']//img")
	private WebElement closeOutbrainPopUp;

	/*trending topics present in Header of news18 minis */
	@FindBy(xpath = "//div[contains(@class,'trandingTopics')]/span[.='Trending Topics :']")
	private WebElement trendingsTopicTxt;

	/*Links of trending topics present in Header of news18 minis */
	@FindBy(xpath = "//div[contains(@class,'trandingTopics')]//a")
	private List<WebElement> trendingsTopicLnk;


	/**
	 * This method is used to click on VideoWall article present at RHS in News18Minis Page
	 */
	public void clickOnVideoWallArticleInRHS() {
		try {
			webDriverActions.switchToNewWindow();
			webDriverActions.scrollToLast();
			webDriverActions.waitForElementVisibility(videoWallTitleLnk,GlobalVariables.sec60);
			webDriverActions.mouseHover(videoWallTitleLnk);
			webDriverActions.click(videoWallTitleLnk);
			Logs.info(getClass(),"Navigated to videowall page");
		}catch (Exception e) {
			Logs.error(getClass(),"Not able to find videowall article");
		}
	}

	/**
	 * This method is used to verify the VideoPage Urls
	 */
	public void verifyVideoPageUrl() {
		try {
			webDriverActions.waitForPageToLoad();
			String url=webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(),"URL:"+url);
			assrt.assertTrue(genericUtility.compareTwoStrings(url, "videos"),"Failed to navigate ");
		}
		catch (Exception e) {
			Logs.error(getClass(),"Not able to fetch URL");
		}
	}


	/**
	 * This method is used to verify the navigation of icons in Line two navigation bar
	 */
	public void verifyIconsInLineTwoNavigationBar() {
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		String parentTitle=webDriverActions.getPageTitle();
		for(WebElement icons:lineTwoNavigationBarIcons){
			webDriverActions.waitForAllElementsVisible(lineTwoNavigationBarIcons, GlobalVariables.sec60);
			webDriverActions.mouseHover(icons);
			String actual=webDriverActions.getAttribute("href",icons);
			webDriverActions.clickJS(icons);
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
			webDriverActions.switchToWindow(parentTitle);
		}
	}


	/**
	 * Verify Live tv is displayed in desktop minis page 
	 */
	public void verifyLiveTvMinisPage(){
		webDriverActions.switchToNewWindow();
		webDriverActions.scrollDown();
		//vidgyor_iframe is the frame name for Live TV
		webDriverActions.switchToFrame("vidgyor_iframe");
		webDriverActions.waitForPageToLoad();
		webDriverActions.mouseHover(liveTvPlayer);
		webDriverActions.highlightElement(liveTvPlayer);
		assrt.assertTrue(webDriverActions.isElementDisplayed(liveTvPlayer));
		assrt.assertTrue(webDriverActions.isElementDisplayed(bigPlayBtn));
		webDriverActions.clickJS(bigPlayBtn);
		Logs.info(getClass(), "big play button is clicked");
		assrt.assertTrue(webDriverActions.isElementDisplayed(pauseBtn),"Failed to display "+pauseBtn);
	}

	/**
	 * This method is used to click on Hamburger Menu
	 */
	public void clickOnHambugerMenu()
	{
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(hamburgerMenuLnk);	
	}


	/**
	 * this method is used to Click All Section Link inside Humburger Menu inside News-18 Mini's Page
	 */
	public void clickAllSectionLink() {
		for(int i=0;i<hamburgerMenuListNw18MiniLnk.size()-1;i++)
		{
			webDriverActions.mouseHover(hamburgerMenuListNw18MiniLnk.get(i));
			String actual = webDriverActions.getAttribute("href",hamburgerMenuListNw18MiniLnk.get(i));
			webDriverActions.clickJS(hamburgerMenuListNw18MiniLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected), "Failed to navigate "+actual);
			webDriverActions.navigateBack();
			String currentPage = webDriverActions.getCurrentPageUrl();
			if(genericUtility.compareStringsWithEquals(currentPage, expected)) {
				webDriverActions.navigateBack();
			}
			clickOnHambugerMenu();	
		}
	}


	/**
	 * This method is used to verify Line Two navigation bar present below the Line one Section on home page.
	 */
	public void verifyLineTwoSection()  {
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		List<WebElement> lineTwo = l2SectionListLnk;
		for(int i=0;i<lineTwo.size();i++ ){
			webDriverActions.waitForAllElementsVisible(l2SectionListLnk, GlobalVariables.sec60);
			String actual=webDriverActions.getTextToLowerCase(lineTwo.get(i));
			webDriverActions.clickJS(lineTwo.get(i));
			Logs.info(getClass(),"Clicked on :"+actual);
			String expect=webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(),"Navigated to : "+expect);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expect) || genericUtility.compareTwoStrings("news", expect),"Failed to navigate ");
			webDriverActions.navigateBack();
		}
	}

	/**
	 * This method is used to click on seemore link in News18Minis section
	 */
	public void clickOnSeeMoreLinkInNews18Minis() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollDown();
			webDriverActions.click(seeMoreLnk);
			Logs.info(getClass(),"Navigated to nw18 Minis page");
		}catch (Exception e) {
			Logs.error(getClass(),"Not able to click on Seemore link");
		}
	}



	/**
	 * This method is used to verify Line One navigation bar present below the Line one Section on home page.
	 */
	public void verifyLineOneSection()  {
		webDriverActions.click(l1SectionListLnk.get(0));
		assrt.assertTrue(webDriverActions.isElementDisplayed(l1SectionListLnk.get(0)),"Failed to display "+l1SectionListLnk.get(0));
		webDriverActions.navigateBack();		
		for(int i=1;i<l1SectionListLnk.size()-1;i++)//it will iterate from 1th element to till size-1 and click and navigate back
		{
			String actual = webDriverActions.getTextFromElement(l1SectionListLnk.get(i));
			Logs.info(getClass(), actual);
			webDriverActions.click(l1SectionListLnk.get(i)); 
			String expected = webDriverActions.getCurrentPageUrl();		
			Logs.info(getClass(), expected);
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
			webDriverActions.waitForPageToLoad();
			webDriverActions.navigateBack();	
			String currentPage = webDriverActions.getCurrentPageUrl();
			if(genericUtility.compareStringsWithEquals(currentPage, expected)) {
				webDriverActions.navigateBack();
			}
		}
	}


	/**
	 * This Method used to change Languages and verify the Navigations in News 18 Minis page
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
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate"+actual);
			webDriverActions.switchToParentWindow();
		}
	}


	/**
	 * This method is used to navigate to Download News18 App link in header of News18
	 * Mini Page and verify the navigation of Play Store
	 */
	public void verifyDownloadAppNavigation()
	{
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		String actual = webDriverActions.getAttribute("href", downloadNews18AppLnk);
		webDriverActions.click(downloadNews18AppLnk);
		webDriverActions.switchToNewWindow();
		String expected = webDriverActions.getCurrentPageUrl();
		assrt.assertEquals(actual, expected,"Failed to navigate "+actual);
		webDriverActions.waitForPageToLoad();
		for(WebElement store : playStoreImg)
		{
			webDriverActions.highlightElement(store);
			assrt.assertTrue(webDriverActions.isElementDisplayed(store),"Failed to display "+store);
		}
	}


	/**
	 * This method is used to verify the breadcrumb text after clicking on
	 * first Article in News18 Mini page 
	 */
	public void verifyFirstArticleBreadcrumb() 
	{
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForAllElementsVisible(news18MiniArticleLst, GlobalVariables.sec30);
		String actual = webDriverActions.getTextFromElement(news18MiniArticleLst.get(0));
		webDriverActions.click(news18MiniArticleLst.get(0));
		webDriverActions.switchToNewWindow();
		webDriverActions.highlightElement(articleBreadcrumbTxt);
		String expected = webDriverActions.getTextFromElement(articleBreadcrumbTxt);
		assrt.assertEquals(actual, expected,"Failed to navigate "+actual);
	}

	/**
	 * This Method is used to verify the social media icons and its navigations under article widget of Desktop News minis Page
	 */
	public void verifyArticleSocialMediaIcons(){
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		for(int i=1;i<socialMediaIconsLnk.size();i++){//It will iterate the element one by one  
			webDriverActions.highlightElement(socialMediaIconsLnk.get(i));//used to Highlight the particular element
			webDriverActions.clickJS(socialMediaIconsLnk.get(i));
			webDriverActions.switchToParentWindow();
			assrt.assertTrue(webDriverActions.isElementDisplayed(socialMediaIconsLnk.get(i)),"Failed to display ");
		}
	}


	/**
	 * This method clicks on Tracker link
	 */
	public void clickOnTrackerLink(){
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForSecond(2000);
		webDriverActions.highlightElement(trackerLnk);
		webDriverActions.waitForSecond(5000);
		webDriverActions.clickJS(trackerLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(trackerLnk),"Failed to display "+trackerLnk);
	}

	/**
	 * This method is used to click on RHS Outbrain link 
	 * And verify the navigation to pop-up 
	 */
	public void verifyOutbrainPopup()
	{
		//		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(rhsOutbrainLnk);
		webDriverActions.waitForElementVisibility(closeOutbrainPopUp, GlobalVariables.sec30);
		webDriverActions.highlightElement(closeOutbrainPopUp);
		assrt.assertTrue(webDriverActions.isElementDisplayed(closeOutbrainPopUp),"Failed to display "+closeOutbrainPopUp);
	}


	/**
	 * this method is used to verify trending topic and its navigation inminis page
	 */
	public void verifyTrendingTopics() {
		webDriverActions.switchToNewWindow();
		assrt.assertTrue(webDriverActions.isElementDisplayed(trendingsTopicTxt), "Failed to display "+trendingsTopicTxt);
		for(int i=0;i<trendingsTopicLnk.size();i++)
		{  
			webDriverActions.highlightElement(trendingsTopicLnk.get(i));
			String actual = webDriverActions.getAttribute("href", trendingsTopicLnk.get(i));
			webDriverActions.click(trendingsTopicLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertEquals(actual, expected,"failed to navigate "+actual);
			webDriverActions.navigateBack();
			if(genericUtility.compareStringsWithEquals(webDriverActions.getCurrentPageUrl(), expected)) {
				webDriverActions.navigateBack();
			}
		}
	}
}


