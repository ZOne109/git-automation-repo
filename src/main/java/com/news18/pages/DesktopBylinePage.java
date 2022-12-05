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
 * @author Harshith S
 * This class contains webelements and business logic for News18 Byline Page
 */

public class DesktopBylinePage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt = new SoftAssert();
	FileUtility fileUtility = new FileUtility();
	public WebDriver driver;

	public  DesktopBylinePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	/*Author link for Desktop Byline Page*/
	@FindBy(xpath = "//div[contains(@class,'article_bnow_box')]//div[contains(@class,'author_box_inner')]//a")
	private List<WebElement> bylineAuthorLnk;

	/*Link of all Promoted Content in Desktop Byline Page*/
	@FindBy(xpath = "//span[@class='ob-unit ob-rec-text']")
	private List<WebElement> promotedContentLnk;

	/*Article which not contain live and cricketnxt*/
	@FindBy(xpath="(//ul[@class='lead-mstory']//a[not(contains(@href,'live')) and not(contains(@href,'cricketnext')) and not(contains(@title,'LIVE'))])[1]")
	private WebElement articleList;

	/*Author btn navigate to byline*/
	@FindBy(xpath="//div[@class='author_box_inner']//a")
	private WebElement authorBtn;

	/*List of pages in Pagination*/
	@FindBy(xpath="//div[contains(@class,'pagination')]//li/a")
	private List<WebElement> paginationList;

	/*breadcrumb link in latest section page*/
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]")
	private WebElement breadcrumbLnk;

	/*L2 Section List Links present below Main Menu Bar */
	@FindBy(xpath ="//div[contains(@class,'secondNav')]//ul/li//a")
	private List<WebElement> l2SectionListLnk;

	/*Photogallery present RHS of byline Page*/
	@FindBy(xpath ="//span[.='Photogallery']")
	private WebElement photogalleryTxtRHS;

	/*Article present under photogallery sub section in byline Page*/
	@FindBy(xpath ="//div[contains(@class,'cn_right')]")
	private List<WebElement> rHSArticlePhotoGalleryLnk;

	/*tabs Links present below the Author of Desktop Byline Page */
	@FindBy(xpath ="//div[contains(@id,'top-area-nav')]//li/a")
	private List<WebElement> tabsBelowTheAuthorLnk;

	/*Date and Time mentioned in first article*/
	@FindBy(xpath ="(//div//ul//li[contains(@class,'post-date')])[1]")
	private WebElement firstArticleDateAndTime;

	/*first article link*/
	@FindBy(xpath ="(//div//h2[contains(@class,'title')]//a)[1]")
	private WebElement firstArticleLnk;

	/*Last updated date in article consumption page*/
	@FindBy(xpath ="(//div//ul[contains(@class,'article')]//li)[2]")
	private WebElement articleLastUpdatedDate;

	/*List of social media links of author present in Byline Page*/
	@FindBy(xpath = "//div[contains(@class,'author-brief')]//ul//a")
	private List<WebElement> authorSocialMediaLnk;

	/*Article present under photogallery sub section in byline Page*/
	@FindBy(xpath ="//div[contains(@class,'cn_right')]/a")
	private List<WebElement> photoGalleryArticleLnkRHS;


	/*pagination present in bottom of Bottom of Byline page*/
	@FindBy(xpath="//div[contains(@class,'pagination')]/ul")
	private WebElement paginationDiv;


	/**
	 * This method is used to navigate to NW18 Byline page
	 */
	public void navigateToNews18BylinePage() {
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishBylineUrl"));
	}


	/**
	 * This method is used to verify the PromotedContent in ByLine Page
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
			assrt.assertTrue(webDriverActions.isElementDisplayed(promotedContentLnk.get(i)),"Failed to display element "+promotedContentLnk);
		}
	}

	
	/**
	 * This method used to verify the pagination index in ByLine page
	 */
	public void verifyPagination() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.scrollToLast();
		webDriverActions.waitForElementVisibility(paginationDiv, GlobalVariables.sec60);
		webDriverActions.mouseHover(paginationDiv);
		webDriverActions.highlightElement(paginationDiv);
		Logs.info(getClass(), "Pagination is Displayed");
		for(int i=0;i<paginationList.size();i++) {
			webDriverActions.mouseHover(paginationList.get(i));
			webDriverActions.highlightElement(paginationList.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(paginationList.get(i)), "Failed to display "+paginationList.get(i));
			webDriverActions.clickJS(paginationList.get(i));
		}
	}


	/**
	 * This method is used to verify Line Two navigation bar present below the Line one Section on home page.
	 */
	public void verifyLineTwoSection() {
		webDriverActions.click(l2SectionListLnk.get(0));
		assrt.assertTrue(webDriverActions.isElementDisplayed(l2SectionListLnk.get(0)),"Failed To navigate");
		Logs.info(getClass(), "Element is displayed");
		webDriverActions.navigateBack();
		for(int i=1;i<l2SectionListLnk.size()-1;i++)//it will iterate from 1th element to till size-1 and click and navigate back
		{
		String actual = webDriverActions.getTextFromElement(l2SectionListLnk.get(i));
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
	 * This method is used to Navigate All Articles present in RHS photogallery sub module in byline Page
	 */
	public void verifyPhotogalleryArticles() {
		webDriverActions.mouseHover(photogalleryTxtRHS);
		webDriverActions.highlightElement(photogalleryTxtRHS);
		assrt.assertTrue(webDriverActions.isElementDisplayed(photogalleryTxtRHS),"failed to display "+photogalleryTxtRHS);
		for(int i=0;i<photoGalleryArticleLnkRHS.size();i++)
		{  
			webDriverActions.highlightElement(photoGalleryArticleLnkRHS.get(i));
			webDriverActions.mouseHover(photoGalleryArticleLnkRHS.get(i));
			String actualUrl = webDriverActions.getAttribute("href", photoGalleryArticleLnkRHS.get(i));
			Logs.info(getClass(), "navigate to  "+actualUrl);
			webDriverActions.click(photoGalleryArticleLnkRHS.get(i));
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), expectedUrl);
			assrt.assertEquals(actualUrl, expectedUrl,"Failed to navigate "+actualUrl);
			webDriverActions.navigateBack();
		}
	}


	/**
	 * This Method is useed to verify the tabs present below the Author are clickable and its navigation of Desktop Byline Page
	 */
	public void verifyTabsBelowTheAuthor(){
		for(int i=1;i<tabsBelowTheAuthorLnk.size();i++)//It will iterate the element one by one
		{
			webDriverActions.highlightElement(tabsBelowTheAuthorLnk.get(i));//used to Highlight the particular element
			String actual = webDriverActions.getAttribute("href", tabsBelowTheAuthorLnk.get(i));
			webDriverActions.clickJS(tabsBelowTheAuthorLnk.get(i));
			String expected=webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate "+expected);
		}
	}


	/**
	 * This method contains the verification of article date
	 */
	public void verifyDateAndTimeArticle() {
		webDriverActions.waitForPageToLoad();
		String actual=webDriverActions.getTextFromElement(firstArticleDateAndTime);
		Logs.info(getClass(),"Navigated article: "+webDriverActions.getTextFromElement(firstArticleLnk));
		webDriverActions.clickJS(firstArticleLnk);
		webDriverActions.waitForElementVisibility(articleLastUpdatedDate,GlobalVariables.sec60);
		String text=webDriverActions.getTextFromElement(articleLastUpdatedDate);
		String date = genericUtility.split(text, 1,"LAST UPDATED:");
		assrt.assertTrue(articleLastUpdatedDate.isDisplayed(),"Date and time is not verified ");
		Logs.info(getClass(),"article date and time is verified : "+actual+" updated date in article page: "+date);
	}


	/**
	 *  This method is used to verify the author social media links
	 *  in Byline page
	 */
	public void verifyAuthorSocialMedia() {
		webDriverActions.waitForPageToLoad();
		String parentUrl = webDriverActions.getCurrentPageUrl();
		for(int i=0;i<authorSocialMediaLnk.size(); i++)
		{
			webDriverActions.mouseHover(authorSocialMediaLnk.get(i));
			webDriverActions.highlightElement(authorSocialMediaLnk.get(i));
			webDriverActions.click(authorSocialMediaLnk.get(i));
			webDriverActions.navigateToUrl(parentUrl);
			assrt.assertTrue(webDriverActions.isElementDisplayed(authorSocialMediaLnk.get(i)),"Failed to display "+authorSocialMediaLnk);
		}
	}
}




