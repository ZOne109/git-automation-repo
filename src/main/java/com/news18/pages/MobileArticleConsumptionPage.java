package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author anupam
 * This Class contains webelements and business logic for Mobile Article Consumption Page
 */

public class MobileArticleConsumptionPage {

	public WebDriver driver;
	public MobileArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* First article present in header of home page */
	@FindBy(xpath="//div[@class='mlead-story']/h1")
	private WebElement headerArticleLnk;

	/* Link of all main articles except live and cricketnext */
	@FindBy(xpath="//div[@class='mstory-thumb-wrap']//a[not(contains(@href,'live')) and not(contains(@href,'cricketnext')) and not(contains(@title,'LIVE'))]")
	private List<WebElement> articleLnk;

	/* Breadcrumb present in top of article consumption page */
	@FindBy(xpath = "//div[(contains(@class,'breadcum'))]//a")
	private List<WebElement> breadcrumbLnk;

	/* Img present in article consumption page*/
	@FindBy(xpath = "(//div[contains(@class,'article_img_inner')]//img)[2]")
	private WebElement featuredImg;

	/* List of advertisement present in article consumption page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/* Tags present in bottom of the article consumption page */
	@FindBy(xpath="//ul[contains(@class,'tags')]//li//a")
	private WebElement tags;

	/* List of meta tags in source code page */
	@FindBy(xpath = "//*[contains(text(),'meta')]")
	private List<WebElement> metaTagTitleInSourceCode;

	/* Author name in main article */
	@FindBy(xpath = "//span[contains(@class,'postedby')]")
	private List<WebElement> authorName;

	/* Keyword in source code page */
	@FindBy(xpath = "//span[text()='keywords']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> keywordsInSourceCode;

	/* Description in source code page */
	@FindBy(xpath = "(//span[text()='description']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement descriptionInSourceCode;

	/* AmpHtml in source code page */
	@FindBy(xpath = "//span[text()='amphtml']/following-sibling::a[contains(@class,'html-attribute-value')]")
	private WebElement ampHtmlInSourceCode;

	/* Ogimage in source code page */
	@FindBy(xpath = "//span[text()='og:image']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> ogImgInSourceCode;

	/* Whatsapp icon present in article consumption page */
	@FindBy(xpath = "//ul[contains(@class,'article_socials')]//li/a[contains(@href,'whatsapp')]")
	private List<WebElement> whatsappIcon;

	/* Fb icon present in article consumption page */
	@FindBy(xpath = "//ul[contains(@class,'article_socials')]//li/a[contains(@href,'facebook')]")
	private List<WebElement> fbIcon;

	/* Twitter icon present in article consumption page */
	@FindBy(xpath = "//ul[contains(@class,'article_socials')]//li/a[contains(@href,'twitter')]")
	private List<WebElement> twitterIcon;

	/* Header present in article consumption page  */
	@FindBy(xpath = "//div[contains(@class,'main_header')]")
	private List<WebElement> headerTxt;

	/* All social icon present in article consumption page*/ 
	@FindBy(xpath = "//ul[contains(@class,'article_socials')]//li")
	private List<WebElement> iconList;

	/* Outbrain present in bottom of article consumption page */
	@FindBy(xpath = "//div[@class='ob_what ob_what_resp']/a/span [contains(@title,'Outbrain')]")
	private WebElement outbrain;

	/* Outbrain box present in bottom of article consumption page */
	@FindBy(xpath = "//div[@class='OUTBRAIN']")
	private List<WebElement> outbrainBox;

	/* Robot tag present in Meta */
	@FindBy(xpath = "//*[contains(text(),'robots')]/following-sibling::span[contains(text(),'max-image-preview:large')]")
	private WebElement robotsInSourceCode;

}
