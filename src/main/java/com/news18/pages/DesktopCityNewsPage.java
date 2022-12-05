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
 * @author Anupam 
 *
 */
public class DesktopCityNewsPage {

	public WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();
	FileUtility fileUtility = new FileUtility();

	public DesktopCityNewsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Photogallery Text Link is present RHS of Photogallery Section in Markets Page*/
	@FindBy(xpath ="//div[contains(@class,'bot_div')]//a")
	private List<WebElement> photogalleryTxtLnk;

	/*Photogallery Title Text is present Below of Line Two Section in photogallery Article Consumption Page*/
	@FindBy(xpath ="//div[contains(@class,'photo_gallery_')]/h1")
	private  WebElement photogalleryTitleTxt;

	/*Title of article present in video wall section present at RHS */
	@FindBy(xpath ="//div[contains(@class,'video_wall')]//h2[contains(@class,'video_title')]")
	private WebElement videoWallArticleTitle;

	/*Title of article mentioned in video wall page*/
	@FindBy(xpath ="//div[@class='BreadCum']//span")
	private WebElement breadcrumbTitle;

	/*Links of Social Media Icons present in Footer of the City News Page*/
	@FindBy(xpath = "//div[contains(@class,'social_net')]/a")
	private List<WebElement> footerSocialMediaLnk;

	/*More News Header in RHS of the City News Page*/
	@FindBy(xpath ="//div[contains(@class,'story')]//h2")
	private WebElement moreNewsRHSHeader;

	/*More News article links in RHS of the City News Page*/
	@FindBy(xpath ="//div[contains(@class,'story')]//ul//li//div/a")
	private List<WebElement> moreNewsRHSArticleLnks;

	/* Promoted Content link present on RHS side of Desktop Tax page */
	@FindBy(xpath ="//div[contains(@class,'ob-first')]//a//img")
	private List<WebElement> taxPagePromotedContentLnk;

	/*Outbrain Link in Desktop Tax page*/
	@FindBy(xpath = "//div[@class='ob_what']/a")
	private WebElement rhsOutbrainLnk;

	/*Close Outbrain Popup Img after clicking on Outbrain Link*/
	@FindBy(xpath = "//div[@id='ob_modal_inner']//img")
	private WebElement closeOutbrainPopUp;

	/*pagination present in bottom of CityNews page*/
	@FindBy(xpath="//div[contains(@class,'pagination')]")
	private WebElement paginationDiv;

	/*List of pages in CityNews page*/
	@FindBy(xpath="//div[contains(@class,'pagination')]//li/a")
	private List<WebElement> paginationList;

	/*Article Title present in News On CityNews page*/
	@FindBy(xpath ="//div[contains(@class,'blog_title')]/h4")
	private List<WebElement> articleTitle;

	/*Article Title Text is present below in Line Two navigation Bar in Article Consumption Page*/
	@FindBy(xpath =" //h1")
	private WebElement articleTitleTxt;
	
	/*Title of article mentioned in video wall page*/
	@FindBy(xpath ="//div[contains(@class,'hot_social')]//a")
	private List<WebElement> hotOnSocialArticlesLst;

	/**
	 * This method is used to navigate to City News page
	 */
	public void navigateToNews18CityNewsPage() {
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishCityNewsUrl"));
	}

	/**
	 * This Method is used to click the Photogallery Image present in RHS of Photogallery Section and verify the navigation of Respective Pages
	 */
	public void clickOnPhotogalleryArticle() {
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<photogalleryTxtLnk.size();i++)
		{
			webDriverActions.scrollToElement(photogalleryTxtLnk.get(i));
			String actual = webDriverActions.getAttribute("title", photogalleryTxtLnk.get(i));
			Logs.info(getClass(),"Actual title of image Before Click" + actual);
			webDriverActions.clickJS(photogalleryTxtLnk.get(i));
			String expected = webDriverActions.getTextFromElement(photogalleryTitleTxt);
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate photogallery image "+actual);
			webDriverActions.navigateBack();
		}
	}

	/**
	 * This method is used to navigate to Video wall article links present at RHS of City News Page
	 */
	public void verifyVideoWallNavigation() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.mouseHover(videoWallArticleTitle);
		String actual=webDriverActions.getTextToLowerCase(videoWallArticleTitle);
		Logs.info(getClass(),"Actual article title in VideoWall section on City News page :"+actual);
		webDriverActions.clickJS(videoWallArticleTitle);
		String expected=webDriverActions.getTextToLowerCase(breadcrumbTitle);
		Logs.info(getClass(),"Expected article title present in City News Consumption page :"+expected);
		assrt.assertTrue(genericUtility.compareTwoStrings(actual, expected),"Failed to navigate "+actual);
	}

	/**
	 * This method is used to verify social media icons navigation present in footer of the City News Page
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

	/**
	 * This method is used to Navigate to RHS More News articles in City News Page  
	 */
	public void verifyMoreNewsNavigation() 
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(moreNewsRHSHeader);
		webDriverActions.highlightElement(moreNewsRHSHeader);
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<moreNewsRHSArticleLnks.size();i++)
		{
			String actual =webDriverActions.getAttribute("href",moreNewsRHSArticleLnks.get(i));
			webDriverActions.highlightElement(moreNewsRHSArticleLnks.get(i));
			webDriverActions.click(moreNewsRHSArticleLnks.get(i));
			webDriverActions.waitForPageToLoad();
			String expected=webDriverActions.getCurrentPageUrl();
			webDriverActions.navigateBack();
			assrt.assertTrue(webDriverActions.isElementDisplayed(moreNewsRHSArticleLnks.get(i)) , "Failed to Display "+moreNewsRHSArticleLnks.get(i));
			assrt.assertEquals(actual, expected , "Failed to navigate "+actual);
		}
		assrt.assertAll("Failed to display and navigate to "+moreNewsRHSArticleLnks);
	}

	/**
	 * This method used to verify Promoted content and Outbrain in CityNews Page
	 */
	public void verifyPromotedContentAndOutbrain()
	{
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
	 * This method is used to verify the page navigation in City News Page
	 */
	public void verifyPagination() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		assrt.assertTrue(webDriverActions.isElementDisplayed(paginationDiv),"Failed to display "+paginationDiv);
		webDriverActions.waitForElementVisibility(paginationDiv, GlobalVariables.sec60);
		for(int i=0;i<paginationList.size();i++) {
			webDriverActions.waitForPageToLoad();
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
	 * This method used to navigate to all articles in City News Page
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
			assrt.assertEquals(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed to navigate "+actual);
			webDriverActions.navigateBack();
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

}
