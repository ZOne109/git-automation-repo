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
public class DesktopBankHolidaysPage {
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopBankHolidaysPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*Breadcrumb header links present in Desktop Bank Holidays*/
	@FindBy(xpath = "//div[contains(@class,'BreadCum')]//a")
	private List<WebElement> businessBreadcrumbLnk;

	/*Breadcrumb header is present in Desktop Bank Holidays*/
	@FindBy(xpath = "//div[contains(@class,'BreadCum')]")
	private WebElement breakingBreadcrumbHeader;

	/*Bsi Image Link present in  footer section of the Bank Holidays Page*/
	@FindBy(xpath ="//div[contains(@class,'bsi_logo')]//img")
	private  WebElement bsiImgLnk;

	/*Photogallery present RHS of Bank Holidays Page*/
	@FindBy(xpath ="//div[contains(@class,'photogellary_widget')]//span[.='Photogallery']")
	private WebElement photogalleryTxtRHS;

	/*Article present under photogallery sub section in Bank Holidays Page*/
	@FindBy(xpath ="//div[contains(@class,'cn_right')]/a")
	private List<WebElement> photoGalleryArticleLnkRHS;

	/*Footer Links present at footer section right of news 18 logo of Bank Holidays Page*/
	@FindBy(xpath="//div[@class='link_table w4']/a")
	private List<WebElement> linkTableFooterLnk;
	
	/*hotOnSocial links present at the footer of Desktop Bank Holidays*/
	@FindBy(xpath = "//div[contains(@class,'hot_social')]//a")
	private List<WebElement> hotOnSocialLnk;
	
	/* List of Bank Holidays Links for all States in Bank Holidays Page */
	@FindBy(xpath = "//div[contains(@class,'BankHolidays')]/ul/li/a")
	private List<WebElement> allStateBankHolidaysLnk;

	/* Header of the Bank Holidays for all the States in Bank Holidays Consumption Page */
	@FindBy(xpath = "//div[contains(@class,'heading_title')]/h1")
	private WebElement allStateBankHolidayHeaderTxt;
	
	/*List of Promoted Contents Links present in body of the Bank Holidays Page */
	@FindBy(xpath = "//div[contains(@class,'items-container')]/div/a")
	private List<WebElement> bodyPromotedContentLnk;

	/*Outbrain link present in body of the Bank Holidays Page  */
	@FindBy(xpath = "//div[contains(@class,'widget-header')]/div/a")
	private WebElement bodyOutbrainLogo;

	/*Close Outbrain Popup Image in Bank Holidays Page */
	@FindBy(xpath = "//div[contains(@id,'modal_inner')]/img")
	private WebElement closeOutbrainPopUp;

	/*List of Promoted Contents ads present in Bank Holidays page*/
	@FindBy(xpath = "//div[@class='ob-widget-section ob-first']/child::ul//li/a")
	private List<WebElement> promotedContentRHSLnk;

	/* RHS Outbrain Link in Bank Holidays page*/
	@FindBy(xpath = "//div[@class='ob_what']/a")
	private WebElement outbrainLnkRHS;
	
	/*Download News-18 App Link is present on the header of the Bank Holidays Page*/
	@FindBy(xpath ="//div[contains(@class,'lnlapp')]/a")
	private WebElement downloadNews18AppLnk;

	/* List Of App Store Image after clicking on News18 Download App present in Bank Holidays Consumption Page*/
	@FindBy(xpath ="//div[@class='gpaimg']//a//img")
	private List<WebElement> playStoreImg;
	
	/*App Store Link present at Footer part of Bank Holidays Page*/
	@FindBy(xpath ="//div[contains(@class,'device')]/a")
	private List<WebElement> appStoreFooterLnk;
	
	/*Links of Social Media Icons present in Footer of the Bank Holidays Page*/
	@FindBy(xpath = "//div[contains(@class,'social_net')]/a")
	private List<WebElement> footerSocialMediaLnk;



	/**
	 * This method is used to navigate to Bank Holidays page
	 */
	public void navigateToNews18BankHolidaysPage() {
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishBankHolidaysUrl"));
	}

	/**
	 * This method is used  verify BreadCrumb Header of Bank Holidays Page
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
	 * This Method is used to click and navigate on Bsi present in the footer 
	 * of the Bank Holidays Page
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
	 * This method is used to Navigate All Articles present in RHS photogallery sub module in Bank Holidays Page
	 */
	public void verifyPhotogalleryArticles() {
		webDriverActions.waitForPageToLoad();
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
	 *This Method is used to verify Footer Links and their Navigations present right side of News18 logo in Bank Holidays Page
	 */
	public void verifyFooterLinkComponents() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		String parentTitle = driver.getTitle();
		for(int i=0;i<linkTableFooterLnk.size();i++)
		{
			webDriverActions.mouseHover(linkTableFooterLnk.get(i));
			webDriverActions.highlightElement(linkTableFooterLnk.get(i));
			String actual = webDriverActions.getAttribute("href", linkTableFooterLnk.get(i));
			webDriverActions.clickJS(linkTableFooterLnk.get(i));
			webDriverActions.switchToNewWindow();
			String expected=webDriverActions.getCurrentPageUrl();
			webDriverActions.closeDriver();
			webDriverActions.switchToWindow(parentTitle);
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate"+actual);
		}	
	}
	
	/**
	 * This Method is used to verify Hot On Social Section at the footer of Desktop Bank Holidays Page 
	 */
	public void verifyHotOnSocial()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		String parentTitle=webDriverActions.getPageTitle();
		for(WebElement hot:hotOnSocialLnk){
			webDriverActions.waitForAllElementsVisible(hotOnSocialLnk, GlobalVariables.sec60);
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
	 * This method is used to navigate To all State Bank Holiday links in Bank Holidays Page 
	 */
	public void verifyAllStatesLinks()
	{
		webDriverActions.waitForPageToLoad();
		for(int i=0; i<allStateBankHolidaysLnk.size() ; i++)
		{
			webDriverActions.mouseHover(allStateBankHolidaysLnk.get(i));
			webDriverActions.highlightElement(allStateBankHolidaysLnk.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(allStateBankHolidaysLnk.get(i)) , "Failed to Displayed "+allStateBankHolidaysLnk.get(i));
			String actualText = webDriverActions.getTextFromElement(allStateBankHolidaysLnk.get(i));
			Logs.info(getClass(), actualText);
			webDriverActions.click(allStateBankHolidaysLnk.get(i));
			webDriverActions.waitForPageToLoad();
			String expectedText = webDriverActions.getTextFromElement(allStateBankHolidayHeaderTxt);
			Logs.info(getClass(), expectedText);
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase( expectedText , actualText) , "Failed to Navigate "+actualText);
			webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("englishBankHolidaysUrl"));
		}
	}
	
	/**
	 * This method is used to verify the navigation of Promoted Content articles present in body of the Bank Holidays Page
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
	 *  This method is used to verify the Outbrain Logo is displayed and their navigation To Outbrain PopUp in Bank Holidays Page
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
	 *  Ads link present in RHS of the Bank Holidays page
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
	 * This method is used to verify the download app link present at the Header and Footer and its navigations on Bank Holidays page
	 */
	public void verifyDownloadApp()
	{
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		webDriverActions.highlightElement(downloadNews18AppLnk);
		webDriverActions.click(downloadNews18AppLnk);
		webDriverActions.switchToNewWindow();
		webDriverActions.waitForPageToLoad();
		for(WebElement store : playStoreImg)
		{
			webDriverActions.highlightElement(store);
			assrt.assertTrue(webDriverActions.isElementDisplayed(store));
		}
		webDriverActions.closeDriver();
		webDriverActions.switchToWindow(parentTitle);
		webDriverActions.scrollToLast();
		for(int i=0;i<appStoreFooterLnk.size();i++)
		{
			webDriverActions.highlightElement(appStoreFooterLnk.get(i));//used to Highlight the particular element
			String actual = webDriverActions.getAttribute("href", appStoreFooterLnk.get(i));
			webDriverActions.clickJS(appStoreFooterLnk.get(i));
			String expected = webDriverActions.getCurrentPageUrl();
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate "+actual);
			webDriverActions.navigateBack();		
		}
	}
	
	/**
	 * This method is used to verify social media icons navigation present in footer of the Bank Holidays Page
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
