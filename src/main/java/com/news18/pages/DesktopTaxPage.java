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
 * This class contains webelements and business logic for News18 Tax Page
 */
public class DesktopTaxPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();
	SoftAssert assrt = new SoftAssert();
	public WebDriver driver;

	public DesktopTaxPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Live tv player present in desktop tax page*/
	@FindBy(xpath = "//div[@id='playerContainer']")
	private WebElement liveTvPlayer;

	/*Pause button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-playing']//span[.='Pause']")
	private WebElement pauseBtn;

	/*Play button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-play-control vjs-control vjs-button vjs-paused']//span[.='Play']")
	private WebElement playBtn;

	/*Mute button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-0']//span[.='Unmute']")
	private WebElement muteBtn;

	/*Unmute button displaying in below of video player*/
	@FindBy(xpath = "//button[@class='vjs-mute-control vjs-control vjs-button vjs-vol-3']//span[.='Mute']")
	private WebElement unmuteBtn;

	/*More news link present on RHS side of Desktop Tax page */
	@FindBy(xpath ="//div[contains(@class,'recomeded_story')]//div/a")
	private List<WebElement> moreNewsTxtLnk;

	/*Video Wall caption link present on RHS side of Desktop Tax page */
	@FindBy(xpath ="//div[contains(@class,'video_wall')]/a")
	private WebElement taxPageVideoWallTxtLnk;

	/* Photo gallery Text link present on RHS side of Desktop Tax page */
	@FindBy(xpath ="//div[contains(@class,'photogellary_widget')]//div/a")
	private List<WebElement> taxPageRHSPhotoGalleryTxtLnk;

	/* Promoted Content link present on RHS side of Desktop Tax page */
	@FindBy(xpath ="//div[contains(@class,'ob-first')]//a//img")
	private List<WebElement> taxPagePromotedContentLnk;

	/*Outbrain Link in Desktop Tax page*/
	@FindBy(xpath = "//div[@class='ob_what']/a")
	private WebElement rhsOutbrainLnk;

	/*Close Outbrain Popup Img after clicking on Outbrain Link*/
	@FindBy(xpath = "//div[@id='ob_modal_inner']//img")
	private WebElement closeOutbrainPopUp;

	/*BreadCrumb Present After clicking on more News present RHS of Tax Page*/
	@FindBy(xpath ="//div[contains(@class,'bredcrum')]//span[@class='act']")
	private  WebElement breadcrumbTaxMoreNewsPage;

	/*BreadCrumb Present After clicking on Video wall present RHS of Tax Page*/
	@FindBy(xpath ="//div[contains(@class,'BreadCum')]//span[@class='breadCumHeading']")
	private  WebElement breadcrumbTaxVideoWallPage;

	/*Business Tax Page Breadcrumb list links  */
	@FindBy(xpath = "//div[@class='jsx-2582612972 brade_crum']//ul//a")
	private List<WebElement> taxPageBreadcrumbLstLnk;

	/* List of images under Latest news Of Tax section*/
	@FindBy(xpath = "//div[@class='logo']//a//img")
	private List<WebElement> latestNewsOnTaxImgLst;

	/* List of blogs under Latest news Of Tax section*/
	@FindBy(xpath = "//div[contains(@class,'blog_list_row')]")
	private List<WebElement> latestNewsOnTaxTitleLst;

	/* Title of the article after clicking on the Latest news on Tax articles*/
	@FindBy(xpath = "//div[contains(@class,'artic')]//h1")
	private WebElement latestNewsOnTaxArtTitle;
	
	/*Big play button displaying in below of video player to play the liveTV*/
	@FindBy(xpath = "//div//button[@class='vjs-big-play-button']")
	private WebElement videoPlayBtn;


	/**
	 * This method is used to naviagate to DesktopTaxPage
	 */
	public void navigateToNews18TaxPage() {
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishTaxUrl"));
	}

	/**
	 * Verify Live tv is displayed in desktop tax page 
	 */
	public void verifyLiveTvTaxPage(){
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
	 * This Method is used to verify More news Present on Desktop tax page
	 */
	public void verifyRHSMorenews() {
		for(int i=0;i<moreNewsTxtLnk.size();i++)//It will iterate the element one by one
		{
			String actual = webDriverActions.getAttribute("href", moreNewsTxtLnk.get(i));
			webDriverActions.highlightElement(moreNewsTxtLnk.get(i));//used to Highlight the particular element
			webDriverActions.click(moreNewsTxtLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected),"Failed To Navigate "+actual);
			webDriverActions.navigateBack();
		}
	}


	/**
	 * This Method is used to verify Video Wall Present RHS of Desktop tax page
	 */
	public void verifyRHSVideoWall() {  
		String actual = webDriverActions.getAttribute("href", taxPageVideoWallTxtLnk);
		webDriverActions.highlightElement(taxPageVideoWallTxtLnk);//used to Highlight the particular element
		webDriverActions.clickJS(taxPageVideoWallTxtLnk);	
		String expected = webDriverActions.getCurrentPageUrl();
		assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected),"Failed To Navigate "+actual);
		webDriverActions.navigateBack();
	}


	/**
	 * This Method is used to verify Photo Gallery Present on Desktop tax page
	 */
	public void verifyRHSPhotogallery()  
	{
		for(int i=0;i<taxPageRHSPhotoGalleryTxtLnk.size();i++)//It will iterate the element one by one
		{
			String actual = webDriverActions.getTextFromElement(taxPageRHSPhotoGalleryTxtLnk.get(i));
			webDriverActions.highlightElement(taxPageRHSPhotoGalleryTxtLnk.get(i));//used to Highlight the particular element
			webDriverActions.clickJS(taxPageRHSPhotoGalleryTxtLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), "Start Navigating "+actual);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected),"Failed To Navigate "+actual);
			webDriverActions.navigateBack();
		}
	}


	/**
	 * This method is used to verify all the "promoted content" right side of tax page.
	 */
	public void verifyPromotedContent() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForAllElementsVisible(taxPagePromotedContentLnk,GlobalVariables.sec60);
		for(int i=0;i<taxPagePromotedContentLnk.size();i++) {
			webDriverActions.waitForElementVisibility(taxPagePromotedContentLnk.get(i),GlobalVariables.sec60);
			webDriverActions.mouseHover(taxPagePromotedContentLnk.get(i));
			webDriverActions.highlightElement(taxPagePromotedContentLnk.get(i));
			webDriverActions.clickJS(taxPagePromotedContentLnk.get(i));			
			webDriverActions.switchToParentWindow();	
			Logs.info(getClass(),"All promoted Contens are displayed");
			assrt.assertTrue(webDriverActions.isElementDisplayed(taxPagePromotedContentLnk.get(i)),"Failed to display ");		
		}
	}


	/**
	 * This method is used to click on RHS Outbrain link 
	 * And verify the navigation to pop-up present on tax page
	 */
	public void verifyOutbrainLogo()
	{
		webDriverActions.refreshPage();
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForSecond(2000);
		webDriverActions.clickJS(rhsOutbrainLnk);
		webDriverActions.waitForElementVisibility(closeOutbrainPopUp, GlobalVariables.sec30);
		webDriverActions.highlightElement(closeOutbrainPopUp);
		webDriverActions.getTextFromElement(closeOutbrainPopUp);
		assrt.assertTrue(webDriverActions.isElementDisplayed(closeOutbrainPopUp),"Failed to display "+closeOutbrainPopUp);
	}


	/**
	 * This method is used to Verify Business Tax Page Breadcrum Link and their navigations
	 */
	public void verifyBusinessTaxBreadcrumb() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForAllElementsVisible(taxPageBreadcrumbLstLnk,GlobalVariables.sec60);
		for(int i=0;i<taxPageBreadcrumbLstLnk.size();i++) {
			String url = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareTwoStrings(url,"news"), "Failed To Navigate");
			webDriverActions.highlightElement(taxPageBreadcrumbLstLnk.get(i));
			webDriverActions.click(taxPageBreadcrumbLstLnk.get(i));
			webDriverActions.waitForPageToLoad();
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad();
		}
	}

	/**
	 * This methods is used to verify all the images and blogs  are displayed and their navigations
	 *  in Latest News on Tax section
	 */
	public void verifyLatestNewsOnTaxNavigation()
	{
		webDriverActions.waitForPageToLoad();
		for( int i = 0 ; i<latestNewsOnTaxTitleLst.size(); i++) // This iterator is used to verify the blogs and image is displayed and their navigation
		{
			String actual = webDriverActions.getTextFromElement(latestNewsOnTaxTitleLst.get(i));
			webDriverActions.highlightElement(latestNewsOnTaxTitleLst.get(i));
			webDriverActions.click(latestNewsOnTaxTitleLst.get(i));
			String expected = webDriverActions.getTextFromElement(latestNewsOnTaxArtTitle);
			webDriverActions.navigateBack();
			assrt.assertEquals(actual, expected,"Failed to display "+actual);
		}
	}
}




