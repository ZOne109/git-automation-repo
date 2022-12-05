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
 * @author Danish R
 * This class contains webelements and business logic for News18 CricketNext Page
 */
public class DesktopCricketNextPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt=new SoftAssert();
	public WebDriver driver;

	public DesktopCricketNextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	

	/* Team ranking text present in RHS of cricket next sub page*/
	@FindBy(xpath ="//div[contains(@class,'CN-TeamRanking')]/h2")
	private WebElement teamRankingTxt;

	/*Share Twitter Division in Twitter Sectiom in CricketNext page*/
	@FindBy(xpath = "(//div[contains(@class,'timeline-Tweet')]//ul//div[@class='timeline-ShareMenu-container'])[1]")
	private WebElement shareTweetDiv;

	/* Team ranking  present in RHS of cricket next sub page*/
	@FindBy(xpath ="//div[contains(@class,'CN-TeamRanking')]")
	private WebElement teamRanking;

	/* Test ,ODI and T20I links present under Team ranking sub section*/
	@FindBy(xpath ="//div[contains(@class,'CN-TeamRanking')]/ul//a")
	private  List<WebElement> matchTypeLnk;

	/* Full ranking link present under Team ranking sub section*/
	@FindBy(xpath ="//div[contains(@class,'tmrnk-tbl')]//tr//a")
	private  WebElement fullRankingLnk;

	/* First ranking team name present in Team ranking sub section*/
	@FindBy(xpath ="//table/tbody/tr[2]/td[2]")
	private  WebElement firstTeamName;

	/* First ranking team name present in Team ranking Page*/
	@FindBy(xpath ="//table/tbody/tr[1]/td[2]//h3")
	private  WebElement teamRankingFirstName;

	/*More Videos button present below videos section of CricketNext Page */
	@FindBy(xpath ="//a[text()='More Videos']")
	private WebElement cricketNextMoreVideosBtn;

	/*Video article links present below feature section of CricketNext Page*/
	@FindBy(xpath ="//ul[contains(@class,'cn-h-video')]//div/h3")
	private List<WebElement> videoArticleLnk;

	/*More Videos button present below videos section of CricketNext Page */
	@FindBy(xpath ="//div[contains(@class,'brade_crum')]//li/h1")
	private WebElement cricketNextMoreVideosBreadCrumbTxt;

	/*Latest News article links present below Video section of CricketNext Page*/
	@FindBy(xpath ="//ul[contains(@class,'CN-latestStory-widget')]//a/p")
	private List<WebElement> latestNewsArticleLnk;

	/*Article header Text present after clicking on the article below latest news of CricketNext Page*/
	@FindBy(xpath ="//h1")
	private WebElement articleHeaderTxt;

	/* RHS Tweets Text in CricketNext Page*/
	@FindBy(xpath = "//h1[text()='Tweets ']")
	private WebElement rhsTweetTxt;

	/* List of first Like and Share  buttons in RHS Tweet Section In CricketNext Page*/
	@FindBy(xpath = "(//ul[contains(@class,'timeline-Tweet')])[1]/li/a")
	private List<WebElement> firstTweetLikeShareBtn;

	/*Links of all promoted content in RHS*/
	@FindBy(xpath ="//div[@class='ob-widget-section ob-first']//ul")
	private List<WebElement> promotedContentLstLnk;

	/*Outbrain link in RHS*/
	@FindBy(xpath ="//div//span[@class='ob_logo']")
	private WebElement rhsOutbrainLnk;

	/* Schedulelink present after clicking on CricketNext */
	@FindBy(xpath ="//a[@href='/cricketnext/cricket-schedule/']")
	private WebElement scheduleLnk;

	/*Link of all Promoted Content in Desktop Cricket Next Schedule Page*/
	@FindBy(xpath = "//span[@class='ob-unit ob-rec-text']")
	private List<WebElement> cricketNxtpromotedContentLnk;

	/*Link of Outbrain in Desktop Cricket Next Schedule Page*/
	@FindBy(xpath = "(//span[@title='Outbrain - content marketing'])[1]")
	private WebElement cricketNxtOutbrainLnk;

	/*Link of all Bread crumb in Desktop Cricket Next Schedule Page*/
	@FindBy(xpath = "//ul[contains(@class,'breadcum')]//a")
	private List<WebElement> cricketNxtBreadCrumbLnk;

	/*Live Score section present in Navigation bar*/
	@FindBy(xpath = "//div[contains(@class,'top')]//ul//li//a[contains(@href,'live-scorecard')]")
	private WebElement liveScoreSection;

	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/*Link of all Promoted Content in Desktop Cricket Live Score Page*/
	@FindBy(xpath = "//span[@class='ob-unit ob-rec-text']")
	private List<WebElement> promotedContentLnk;

	/*Desktop List of LiveScore Breadcrumb link  */
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]//ul//li//a")
	private List<WebElement> liveScoreSectionBreadcrumLnk;

	/*upcoming matches Section Link is present Below The Team Ranking at RHS of LiveScore Page*/
	@FindBy(xpath = "//div[contains(@class,'upcomming-matches-widget')]//ul/li/a  |  //a[text()='Complete Schedule']")
	private List<WebElement> upcomingmatchesLnk;
	
	/*List of Also Check Links in Live Matches section 
	 * after navigating to Live Score section 
	 */
	@FindBy(xpath = "//div[contains(@class,'result-box')]//ul[contains(@class,'alsocheck')]/li/a")
	private List<WebElement>  liveMatchUpdateLnkLst;

	/*Score Card Division after clicking on Full ScoreCrad Link*/
	@FindBy(xpath = "//ul[contains(@class,'tab')]/li[contains(@class,'active')]")
	private WebElement activeScoreCardTab;
	
	/*Latest News Link on Desktop Cricket Next Live Score Page*/
	@FindBy(xpath = "//div[contains(@class,'latest_news_row')]/p")
	private List<WebElement> cricketLatestNewsTextLnk;

	/*Header Text Present after Clicking on Latest News article of Cricket Live Score Page*/
	@FindBy(xpath = "//h1")
	private WebElement latestNewsheaderTxt; 

	/*More From the Archives present below Latest News article of Cricket Live Score Page*/
	@FindBy(xpath = "//div/a[contains(text(),'More From the Archives')]")
	private WebElement moreFromTheArchivesLnk; 


	/**
	 * This method is used to verify videos and its navigation present below the feature section
	 */
	public void verifyVideosSection()
	{
		for(int i=0;i<videoArticleLnk.size();i++)//It will iterate the element one by one
		{
			String actual = webDriverActions.getTextFromElement(videoArticleLnk.get(i));
			webDriverActions.highlightElement(videoArticleLnk.get(i));//used to Highlight the particular element
			webDriverActions.clickJS(videoArticleLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected),"Failed To Navigate "+actual);
			webDriverActions.navigateBack();
		}
		webDriverActions.highlightElement(cricketNextMoreVideosBtn);
		webDriverActions.clickJS(cricketNextMoreVideosBtn);
		webDriverActions.highlightElement(cricketNextMoreVideosBreadCrumbTxt);
		assrt.assertTrue(webDriverActions.isElementDisplayed(cricketNextMoreVideosBreadCrumbTxt),"Failed to display "+cricketNextMoreVideosBreadCrumbTxt);
	}


	/**
	 * This method is used to verify Latest News and its navigation present below the Videos section of Cricket Next page.
	 */
	public void verifyLatestNewsSection(){
		for(int i=0;i<latestNewsArticleLnk.size();i++)//It will iterate the element one by one
		{
			String actual = webDriverActions.getTextFromElement(latestNewsArticleLnk.get(i));
			webDriverActions.highlightElement(latestNewsArticleLnk.get(i));//used to Highlight the particular element
			webDriverActions.clickJS(latestNewsArticleLnk.get(i));
			String expected = webDriverActions.getTextFromElement(articleHeaderTxt);
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertEquals(actual,expected,"Failed To Navigate "+actual);
			webDriverActions.navigateBack();
		}
	}

	/**
	 * This method is used to verify team ranking is displayed and navigation
	 */
	public void verifyTeamRanking() {
		webDriverActions.waitForPageToLoad();
		assrt.assertTrue(webDriverActions.isElementDisplayed(teamRankingTxt),"Failed to dispaly "+teamRankingTxt);
		webDriverActions.mouseHover(teamRanking);
		webDriverActions.highlightElement(teamRanking);
		for(int i=0;i<matchTypeLnk.size();i++)
		{  
			String type= webDriverActions.getTextFromElement(matchTypeLnk.get(i));
			Logs.info(getClass(),"Cricket match format "+type);
			webDriverActions.highlightElement(matchTypeLnk.get(i));
			webDriverActions.clickJS(matchTypeLnk.get(i));
			webDriverActions.highlightElement(firstTeamName);
			String firstTeam=webDriverActions.getTextFromElement(firstTeamName);
			webDriverActions.clickJS(fullRankingLnk);
			webDriverActions.highlightElement(teamRankingFirstName);
			String firstTeamRanking = webDriverActions.getTextFromElement(teamRankingFirstName);
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(firstTeamRanking, firstTeam),"failed to navigate "+fullRankingLnk);
			webDriverActions.navigateBack();
		}
	}


	/**
	 * This method is used to click on the First Like and Share Button
	 * and verify their navigation
	 */
	public void clickOnFirstLikeAndShareBtn()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.scrollUp();
		webDriverActions.switchToFrame("twitter-widget-0");
		for( int i=0; i<firstTweetLikeShareBtn.size(); i++)
		{
			webDriverActions.waitForElementVisibility(firstTweetLikeShareBtn.get(i), GlobalVariables.sec30);
			webDriverActions.highlightElement(firstTweetLikeShareBtn.get(i));
			webDriverActions.click(firstTweetLikeShareBtn.get(i));
			webDriverActions.switchToParentWindow();
			webDriverActions.switchToFrame("twitter-widget-0");
			assrt.assertTrue(webDriverActions.isElementDisplayed(firstTweetLikeShareBtn.get(i)),"Failed to display "+firstTweetLikeShareBtn);
		}
		assrt.assertTrue(webDriverActions.isElementDisplayed(shareTweetDiv), "Failed to display" +shareTweetDiv);
	}


	/**
	 * This method is used verify the navigation of promoted contents and outbrain in RHS of CricketNext Page
	 */
	public void verifyPromotedContentAndOutbrainInRHS() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		for(WebElement promotedContent:promotedContentLstLnk)
		{
			webDriverActions.waitForAllElementsVisible(promotedContentLstLnk, GlobalVariables.sec60);
			webDriverActions.mouseHover(promotedContent);
			webDriverActions.highlightElement(promotedContent);
			webDriverActions.clickJS(promotedContent);
			webDriverActions.waitForPageToLoad();
			webDriverActions.switchToParentWindow();
			webDriverActions.waitForPageToLoad();
			assrt.assertTrue(webDriverActions.isElementDisplayed(promotedContent),"Failed to display ");
		}
		webDriverActions.waitForPageToLoad();
		webDriverActions.highlightElement(rhsOutbrainLnk);
		webDriverActions.clickJS(rhsOutbrainLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(rhsOutbrainLnk),"Failed to navigate");
	}


	/**
	 * This method is used to verify Promoted Content in Cricket Next Schedule Page 
	 */
	public void verifyPromotedContent() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForAllElementsVisible(cricketNxtpromotedContentLnk,GlobalVariables.sec60);
		for(int i=0;i<cricketNxtpromotedContentLnk.size();i++) {
			webDriverActions.waitForElementVisibility(cricketNxtpromotedContentLnk.get(i),GlobalVariables.sec60);
			webDriverActions.highlightElement(cricketNxtpromotedContentLnk.get(i));
			webDriverActions.clickJS(cricketNxtpromotedContentLnk.get(i));
			webDriverActions.mouseHover(cricketNxtpromotedContentLnk.get(i));
			webDriverActions.switchToParentWindow();	
			assrt.assertTrue(webDriverActions.isElementDisplayed(cricketNxtpromotedContentLnk.get(i)),"Failed to display "+cricketNxtpromotedContentLnk);
		}	
	}


	/**
	 * This method is used for navigation of Outbrain Link
	 */
	public void verifyOutbrainLnk() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForElementVisibility(cricketNxtOutbrainLnk,GlobalVariables.sec60);
		webDriverActions.highlightElement(cricketNxtOutbrainLnk);
		webDriverActions.clickJS(cricketNxtOutbrainLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(cricketNxtOutbrainLnk),"Failed to display "+cricketNxtOutbrainLnk);			
	}


	/**
	 * This method is used  verify BreadCrumb Header of Cricket Next Page
	 */
	public void verifyBreadCrumbLnk() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForAllElementsVisible(cricketNxtBreadCrumbLnk,GlobalVariables.sec60);
		for(int i=0;i<cricketNxtBreadCrumbLnk.size();i++) {
			assrt.assertTrue(genericUtility.compareTwoStrings(webDriverActions.getCurrentPageUrl(),"news"), "Failed To Navigate");
			webDriverActions.highlightElement(cricketNxtBreadCrumbLnk.get(i));
			webDriverActions.clickJS(cricketNxtBreadCrumbLnk.get(i));
			webDriverActions.waitForPageToLoad();
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();	
		}
	}


	/**
	 * This method is used to click on Schedule Page
	 */
	public void clickOnScheduleLink() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.highlightElement(scheduleLnk);
		webDriverActions.clickJS(scheduleLnk);
	}

	/**
	 * This method is used to click on LiveScore Section in CricketNext Page
	 */
	public void clickOnLiveScore() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(liveScoreSection);
	}

	/**
	 * This method is used to verify Ad's are displaying or not
	 */
	public void verifyAdsInLiveScorePage() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		for(int i=0;i<ads.size();i++) {
			webDriverActions.waitForElementVisibility(ads.get(i),GlobalVariables.sec60);
			webDriverActions.mouseHover(ads.get(i));
			webDriverActions.highlightElement(ads.get(i));
			assrt.assertTrue(ads.get(i).isDisplayed(),"Failed to display ");
			Logs.info(getClass(),"Dsiplaying Ad's count:"+(i+1));
		}
	}


	/**
	 * This method is used verify PromotedContents of Cricket Next Livescore Page
	 */
	public void verifyPromotedContents() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		for(WebElement promotedContent:promotedContentLnk)
		{
			webDriverActions.waitForAllElementsVisible(promotedContentLnk, GlobalVariables.sec60);
			webDriverActions.mouseHover(promotedContent);
			webDriverActions.highlightElement(promotedContent);
			webDriverActions.clickJS(promotedContent);
			webDriverActions.waitForPageToLoad();
			webDriverActions.switchToParentWindow();
			webDriverActions.waitForPageToLoad();
			assrt.assertTrue(webDriverActions.isElementDisplayed(promotedContent),"Promoted Content is not displayed");
		}
	}

	/**
	 * This method is used  verify BreadCrumb Header of Cricket Next Livescore Page
	 */
	public void verifyBreadCrumbLnks() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForAllElementsVisible(liveScoreSectionBreadcrumLnk,GlobalVariables.sec60);
		for(int i=0;i<liveScoreSectionBreadcrumLnk.size();i++) {
			String url = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareTwoStrings(url,"news"), "Failed To Navigate");			
			webDriverActions.highlightElement(liveScoreSectionBreadcrumLnk.get(i));
			webDriverActions.click(liveScoreSectionBreadcrumLnk.get(i));
			webDriverActions.waitForPageToLoad();
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
		}
	}


	/**
	 * This Method is used for Navigate To all Links Present inside Upcoming Matches Section of Live Score Page
	 */
	public void upcomingMatchesSection() {
		for(int i=0;i<upcomingmatchesLnk.size();i++)
		{
			String actual = webDriverActions.getAttribute("href",upcomingmatchesLnk.get(i));
			webDriverActions.click(upcomingmatchesLnk.get(i));
			webDriverActions.waitForPageToLoad();
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate"+actual);
			webDriverActions.navigateBack();
		}
	}
	
	/**
	 * This method is used to verify the live match updates
	 */
	public void verifyLiveMatchUpdates()
	{
		webDriverActions.waitForPageToLoad();
		for(int i =0 ; i< liveMatchUpdateLnkLst.size() ; i++)
		{
			webDriverActions.mouseHover(liveMatchUpdateLnkLst.get(i));
			webDriverActions.highlightElement(liveMatchUpdateLnkLst.get(i));
			String actual = webDriverActions.getAttribute("href", liveMatchUpdateLnkLst.get(i));
			webDriverActions.click(liveMatchUpdateLnkLst.get(i));
			webDriverActions.highlightElement(activeScoreCardTab);
			String expected = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(webDriverActions.isElementDisplayed(activeScoreCardTab), "Failed to Display "+activeScoreCardTab);
			webDriverActions.navigateBack();
			assrt.assertEquals(actual, expected , "Failed to Navigate "+actual);
		}
		assrt.assertAll("Failed to Navigate Live Score Update " + activeScoreCardTab);
	}
	
	/**
	 * This method used to verify latest cricket news
	 */
	public void verifyLatestCricketNews()
	{
		for(int i=0;i<cricketLatestNewsTextLnk.size();i++)//It will iterate the element one by one
		{
			webDriverActions.highlightElement(cricketLatestNewsTextLnk.get(i));//used to Highlight the particular element
			String actual = webDriverActions.getTextFromElement(cricketLatestNewsTextLnk.get(i));
			webDriverActions.clickJS(cricketLatestNewsTextLnk.get(i));
			String expected=webDriverActions.getTextFromElement(latestNewsheaderTxt);
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate"+actual);
			webDriverActions.navigateBack();
		}	
		assrt.assertTrue(webDriverActions.isElementDisplayed(moreFromTheArchivesLnk),"Failed To Displayed "+moreFromTheArchivesLnk);
		webDriverActions.click(moreFromTheArchivesLnk);
	}
	

}

