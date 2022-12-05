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
 * This class contains webelements and business logic for News18 Astrology Page
 */
public class DesktopAstrologyPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	SoftAssert assrt=new SoftAssert();
	public WebDriver driver;

	public DesktopAstrologyPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*First Article news Link present inside Astrology News in Astrology Page*/
	@FindBy(xpath ="//div[@class='blog_img']/img[1]")
	private WebElement astrologyNewsLnk;

	/*Astrology Breadcrumb is present below in Line Two navigation Bar in Astrology Article Consumption Page*/
	@FindBy(xpath ="//h1")
	private WebElement astrologyBreadcrumb;

	/*Astrology Link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//li//a[text()='Astrology']")
	private WebElement astrologyLnk;

	/*Hamburger Menu Link is present in the Top Main Menu*/
	@FindBy(xpath ="//div[contains(@class,'hamburger')]")
	private WebElement hamburgerMenuLnk;

	/*More Stories Link is present inside Astrology news in Astrology page*/
	@FindBy(xpath ="//span[text()='More Stories']")
	private WebElement moreStoriesLnk;

	/*Links present inside Latest News On Astrology present in  Astrology News Page*/
	@FindBy(xpath ="//div[contains(@class,'blog_list')]/..//img")
	private List<WebElement> astrologyNewsLatestLnk;

	/*Pagination Index present in footer of Astrology News Page*/
	@FindBy(xpath ="//ul[contains(@class,'pagination')]//li/a")
	private List<WebElement> paginationIndex;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//div[contains(@class,'cursor')]")
	private  List<WebElement> astrologySignsBtn;

	/*Astrology Signs present under Horoscope sub module*/
	@FindBy(xpath ="//span[text()='Read More']")
	private  WebElement readMoreLnk;

	/*BreadCrumb Present After clicking on read more option below HoroScope*/
	@FindBy(xpath ="//div[@class='brade_crum fleft']//h1")
	private  WebElement breadcrumbReadMorePage;

	/* Description for daily, weekly ,monthly and yearly,  Horoscope*/
	@FindBy(xpath ="//div[@class='rashifal-horoscope-tabs-left']//a")
	private List<WebElement> horoscopeList;

	/*List of google ads present in Astrology page*/
	@FindBy(xpath = "//div[@class='ob-widget-section ob-first']/child::ul//li/a")
	private List<WebElement> promotedContentLstLnk;

	/*Outbrain Link in Astrology page*/
	@FindBy(xpath = "//div[@class='ob_what']/a")
	private WebElement rhsOutbrainLnk;

	/*Close Outbrain Popup Img after clicking on Outbrain Link*/
	@FindBy(xpath = "//div[@id='ob_modal_inner']//img")
	private WebElement closeOutbrainPopUp;

	/* Description for each astro sign present under Horoscope sub module */
	@FindBy(xpath ="//p[@id='horoscopeResult']")
	private WebElement horoscopeDescription;

	/* Next button present in Horoscope sub module*/
	@FindBy(xpath ="//div[@class=\"glide__arrows\"]/button[.='next']")
	private WebElement nextBtn;

	/* Previous button present in Horoscope sub module*/
	@FindBy(xpath ="//div[@class=\"glide__arrows\"]/button[.='prev']")
	private WebElement previousBtn;

	/*Desktop List of ZodiacTraits Breadcrum link  */
	@FindBy(xpath = "//div[@class='brade_crum fleft']/a")
	private List<WebElement> zodiacTraitsBreadcrumLnk;

	/*Desktop ZodiacTraits Link  */
	@FindBy(xpath = "(//a[contains(@href,'https://www.news18.com/astrology/zodiac-wise-personality')])[2]")
	private WebElement zodiacTraitsLnk;


	/**
	 * This method is used to click on Astrology link present inside NW18 Hamburger section
	 */
	public void clickOnAstrologyLnk()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(hamburgerMenuLnk);
		webDriverActions.click(astrologyLnk);	
	}


	/**
	 * This method is used to Click First Astrology News and Navigate to Respective News
	 */
	public void clickOnFirstAstrologyNewsArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(astrologyNewsLnk);
		String actual =webDriverActions.getAttribute("title",astrologyNewsLnk);
		Logs.info(getClass(), "Actual value of news in astrology section: "+actual);
		webDriverActions.highlightElement(astrologyNewsLnk);
		webDriverActions.click(astrologyNewsLnk);
		webDriverActions.waitForPageToLoad();
		String expected=webDriverActions.getTextFromElement(astrologyBreadcrumb);
		Logs.info(getClass(), "Expected value of news in Astrology news Page Breadcrumb"+expected);
		assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Failed To Navigate Astrology Article Page");
	}


	/**
	 * This method is used to click on Astrology News more stories and to Navigate All Articles
	 */
	public void clickOnAstrologyMoreStoriesArticles() 
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(moreStoriesLnk);
		webDriverActions.clickJS(moreStoriesLnk);
		webDriverActions.waitForPageToLoad();
		for(int i=0;i<astrologyNewsLatestLnk.size();i++)
		{
			String actual =webDriverActions.getAttribute("title",astrologyNewsLatestLnk.get(i));
			Logs.info(getClass(), " Actual value of any news in Latest News On Astrology section "+actual);
			webDriverActions.highlightElement(astrologyNewsLatestLnk.get(i));
			webDriverActions.clickJS(astrologyNewsLatestLnk.get(i));
			webDriverActions.waitForPageToLoad();
			String expected=webDriverActions.getTextFromElement(astrologyBreadcrumb);
			Logs.info(getClass(), "Expected value of any news in Latest News On Astrology Section "+expected);
			webDriverActions.navigateBack();
			assrt.assertTrue(genericUtility.compareStringsWithIgnoreCase(actual, expected),"Article Title is not equals to Breadcrumb Text");
		}
	}


	/**
	 * This method is use to check every Horoscope Timeline contain Description 
	 * And clicking Next and Previous Arrow button
	 */
	public void horoscopeTimeLineDescription(){
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(previousBtn);
		//This loop is used for clicking each astro sign
		for(int i=0;i<astrologySignsBtn.size();i++)
		{
			String original = webDriverActions.getTextFromElement(astrologySignsBtn.get(i));
			Logs.info(getClass(), original);
			webDriverActions.highlightElement(astrologySignsBtn.get(i));
			webDriverActions.clickJS(astrologySignsBtn.get(i));
			//This is for daily , weekly , monthly and yearly horoscope timeline description
			for(int j=0;j<horoscopeList.size();j++)
			{  
				String type= webDriverActions.getTextFromElement(horoscopeList.get(j));
				Logs.info(getClass(),type+" TimeLine");
				webDriverActions.clickJS(horoscopeList.get(j));
				webDriverActions.waitForSecond(300);
				webDriverActions.mouseHover(horoscopeDescription);
				webDriverActions.highlightElement(horoscopeDescription);
				assrt.assertTrue(webDriverActions.isElementDisplayed(horoscopeDescription),"failed to display discription");
			}
			webDriverActions.clickJS(nextBtn);
		}
	}


	/**
	 * This Method is used to verify the Astrology Signs present under Horoscope of Astrology Homepage.
	 */
	public void verifyAstrologySign() {  
		for(int i=0;i<astrologySignsBtn.size();i++){//It will iterate the element one by one
			String expected = webDriverActions.getTextFromElement(astrologySignsBtn.get(i));
			webDriverActions.waitForSecond(2000);
			webDriverActions.highlightElement(astrologySignsBtn.get(i));
			webDriverActions.mouseHover(astrologySignsBtn.get(i));
			webDriverActions.clickJS(astrologySignsBtn.get(i));
			webDriverActions.waitForSecond(2000);
			webDriverActions.highlightElement(readMoreLnk);
			webDriverActions.clickJS(readMoreLnk);
			String actual = webDriverActions.getTextFromElement(breadcrumbReadMorePage);
			Logs.info(getClass(), "Start Navigating "+expected);
			assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected), "Failed To Navigate"+expected);
			webDriverActions.navigateBack();
		}
	}

	/**
	 * This method is used to verify ZodiacTraits Breadcrum link
	 */
	public void verifyZodiacTraitsBreadcrum() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForAllElementsVisible(zodiacTraitsBreadcrumLnk,GlobalVariables.sec60);
		for(int i=0;i<zodiacTraitsBreadcrumLnk.size();i++) {
			String url = webDriverActions.getCurrentPageUrl();
			assrt.assertTrue(genericUtility.compareTwoStrings(url, "news") , "Failed To Navigate");
			webDriverActions.highlightElement(zodiacTraitsBreadcrumLnk.get(i));
			zodiacTraitsBreadcrumLnk.get(i).click();
			webDriverActions.waitForPageToLoad();
			webDriverActions.navigateBack();
			webDriverActions.waitForPageToLoad(); 
		}
	}

	/**
	 * This method is used to verify clicking On ZodiacTraits Link
	 */
	public void verifyZodiacTraitsLnk() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToElement(zodiacTraitsLnk);;
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(zodiacTraitsLnk);
		assrt.assertTrue(webDriverActions.isElementDisplayed(zodiacTraitsLnk),"Link is not displayed");
	}

	/**
	 * This method is used verify the navigation of promoted contents 
	 *  Ads link present in RHS of the Astrology page
	 */
	public void verifyRHSPromotedContentNavigation()
	{
		String parentTitle = webDriverActions.getPageTitle();
		webDriverActions.waitForPageToLoad();
		for(int i=0 ; i<promotedContentLstLnk.size() ; i++)
		{
			webDriverActions.waitForAllElementsVisible(promotedContentLstLnk, GlobalVariables.sec60);
			webDriverActions.mouseHover(promotedContentLstLnk.get(i));
			String actualUrl = webDriverActions.getAttribute("onmousedown", promotedContentLstLnk.get(i));
			webDriverActions.click(promotedContentLstLnk.get(i));
			webDriverActions.switchToNewWindow();
			webDriverActions.waitForPageToLoad();
			String expectedUrl = webDriverActions.getCurrentPageUrl();
			webDriverActions.switchToWindow(parentTitle );
			assrt.assertTrue(webDriverActions.isElementDisplayed(promotedContentLstLnk.get(i)) , "Failed to Display element :-" +promotedContentLstLnk.get(i));
			assrt.assertTrue(genericUtility.compareTwoStrings(actualUrl, expectedUrl), "Failed to navigate :-" +promotedContentLstLnk.get(i));
		}
	}


	/**
	 * This method is used to click on RHS Outbrain link 
	 * And verify the navigation to pop-up 
	 */
	public void verifyOutbrainPopUp()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(rhsOutbrainLnk);
		webDriverActions.waitForElementVisibility(closeOutbrainPopUp, GlobalVariables.sec30);
		webDriverActions.highlightElement(closeOutbrainPopUp);
		assrt.assertTrue(webDriverActions.isElementDisplayed(closeOutbrainPopUp) , "Failed to Display OutbrainPop Close Image");
	}
}

