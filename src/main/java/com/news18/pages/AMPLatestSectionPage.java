package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.WebDriverActions;

/**
 * @author sivaguru.s
 * This class contains WebElements and business logic of latest section page in AMP
 * URL:https://www.news18.com/amp/news/
 */

public class AMPLatestSectionPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	SoftAssert assrt = new SoftAssert();

	public WebDriver driver;
	public AMPLatestSectionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*Link of latest section in home page*/
	@FindBy(xpath = "//div[@class='mobheader']//a[contains(@href,'news')]")
	private WebElement latestLnk;

	/*Link of all articles except cricketNext*/
	@FindBy(xpath = "//ul[contains(@class,'top_story')]//li//a[not(contains(@href,'cricketnext'))]")
	private List<WebElement> latestArticles;

	/*Breadcrumb link*/
	@FindBy(xpath = "//div[contains(@class,'breadcum')]//a")
	private List<WebElement> breadcrumbLnk;

	/*list of images in AMP latest section*/
	@FindBy(xpath = "//div[contains(@class,'story')]//li//img")
	private List<WebElement> imgList;

	/*Trending articles list*/
	@FindBy(xpath = "//ul[contains(@class,'Trend')]//li")
	private List<WebElement> trendingLst;

	/*Images of main articles*/
	@FindBy(xpath = "//ul[contains(@class,'top_story')]//li//amp-img")
	private List<WebElement> articleImgs;

	/*Footer section of amp latest section page*/
	@FindBy(xpath = "//footer[contains(@class,'footer-text')]")
	private WebElement footerSection;

	/*Header section of amp latest section page*/
	@FindBy(xpath = "//header[contains(@class,'mobile_header')]")
	private WebElement headerSection;

}
