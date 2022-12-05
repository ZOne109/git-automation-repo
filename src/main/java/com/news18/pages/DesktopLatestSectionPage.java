package com.news18.pages;

import java.text.ParseException;
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
 * @author sivaguru.s
 * This class contains WebElements and Business logic of Desktop Latest section page
 */

public class DesktopLatestSectionPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericActions = new GenericUtility();
	SoftAssert assrt = new SoftAssert();

	public WebDriver driver;
	public 	DesktopLatestSectionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*Latest section link in home page*/
	@FindBy(xpath = "//div[contains(@class,'second')]//ul//li/a[contains(@href,'/news/')]")
	private WebElement latestLnk;

	/*breadcrumb link in latest section page*/
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]//a")
	private List<WebElement> breadcrumbLnk;

	/*Amp Html status mentioned in browser source code page*/
	@FindBy(xpath = "//span[text()='amphtml']/following-sibling::a[contains(@class,'html-attribute-value')]")
	private WebElement ampHtmlStatus;

	/*Title tag mentioned in browser source code page*/
	@FindBy(xpath = "//*[contains(text(),'</title>')]")
	private WebElement titleTag;

	/*Google adds displaying in latest section page*/
	@FindBy(xpath = "//div[contains(@id,'google_ads_iframe')]/iframe")
	private List<WebElement> googleAdds;

	/*Keyword status mentioned in browser source code page*/
	@FindBy(xpath = "//span[text()='keywords']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> keywrdStatus;

	/*Description status mentioned in browser source code page*/
	@FindBy(xpath = "(//span[text()='description']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement descrptnStatus;

	/*Og image status mentioned in source code page*/
	@FindBy(xpath = "//span[text()='og:image']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> ogImgStatus;

	/*Live Tv text mentioned in RHS*/
	@FindBy(xpath = "//div[contains(@class,'livetv')]//h2")
	private WebElement liveTVTxt;

	/*Image present in Video wall section in RHS*/
	@FindBy(xpath = "//div[contains(@class,'video_wall')]//img")
	private List<WebElement> videoWalImg;

	/*Photo gallery section mentioned in RHS*/
	@FindBy(xpath = "//div[contains(@class,'photogellary')]//a[contains(@href,'photogallery')]")
	private List<WebElement> photoGlrySect;

	/*Featured image in main article*/
	@FindBy(xpath = "//div[contains(@class,'top_img')]//img")
	private WebElement featrdImg;

	/*page number list mentioned in pagination*/
	@FindBy(xpath = "//div[contains(@class,'pagination')]//li")
	private List<WebElement> paginationLst;

	/*Images list of all article*/
	@FindBy(xpath = "//div[contains(@class,'blog_list')]//div[contains(@class,'blog_list_row')]//img")
	private List<WebElement> imgList;

	/*Images list of all article with content*/
	@FindBy(xpath = "//div[contains(@class,'blog_list_row')]//figure")
	private List<WebElement> imgListContent;

	/*Links of all latest article in latest section*/
	@FindBy(xpath = "//div[contains(@class,'top_story_right')]//a[not(contains(@href,'cricket'))and not(contains(@href,'live'))]")
	private List<WebElement> latestArtcleLst;

	/*First Article in latest section page*/
	@FindBy(xpath = "(//div[contains(@class,'top')]//h3)[1]")
	private WebElement firstArticleLnk;

	/*First published date mentioned in latest article*/
	@FindBy(xpath = "(//div[contains(@class,'published_date')])[1]")
	private WebElement firstPublishedDate;

	
	/**
	 * This method is used to click on Latest Section
	 */
	public void clickOnlatestSection() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(latestLnk);
			Logs.info(getClass(),"Clicked on latest section");
		}catch (Exception e) {
			Logs.error(getClass(),"Not finding latest section");
		}
	}
	
	/**
	 * This method used to click on latest section page
	 */
	public void clickOnLatestSectionAnyArticle() {
		try {
			webDriverActions.clickJS(firstArticleLnk);
			Logs.info(getClass(),"Navigated to latest article");
		}catch (Exception e) {
			Logs.error(getClass(),"Latest section article is not clickable");
		}
	}


	/**
	 * This method is used to verify articles update time
	 * @throws ParseException 
	 */
	public void verifyArticleUpdatedTime() throws ParseException  {
		webDriverActions.scrollToLast();
		webDriverActions.waitForElementVisibility(firstPublishedDate,GlobalVariables.sec60);
		String date1=webDriverActions.getTextFromElement(firstPublishedDate);
		String date = genericActions.split(date1, 1,"FIRST PUBLISHED:");
		Logs.info(getClass(),"Article date :"+date);
		long minutes = genericActions.dateTimeDifference(date);
		Logs.info(getClass(),"Article is updated before: "+minutes+" minutes");
		assrt.assertTrue(minutes<15,"Article is not updated");
		assrt.assertAll();
	}
}
