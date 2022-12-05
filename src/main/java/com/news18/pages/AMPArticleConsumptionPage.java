package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author anupam
 * This Class contains webelements and business logic for AMP Article Consumption Page
 */

public class AMPArticleConsumptionPage {

	public WebDriver driver;
	public AMPArticleConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Breadcrumb present in top of article consumption page */
	@FindBy(xpath = "//div[(contains(@class,'breadcum'))]//a")
	private List<WebElement> breadcrumbLnk;

	/* Image present in article consumption page*/
	@FindBy(xpath = "(//div[contains(@class,'article_img_inner')]//img)[2]")
	private WebElement featuredImg;

	/* List of advertisement present in article consumption page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/* Tags present in bottom of every article in article consumption page */
	@FindBy(xpath="//div[contains(@class,'tags')]//li//a")
	private List<WebElement> tags;

	/* List of meta tags in source code page */
	@FindBy(xpath = "//*[contains(text(),'meta')]")
	private List<WebElement> metaTagTitleInSourceCode;

	/* Keyword in source code page */
	@FindBy(xpath = "//span[text()='keywords']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> keywordsInSourceCode;

	/* Description in source code page */
	@FindBy(xpath = "(//span[text()='description']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement descriptionInSourceCode;

	/* amphtml in source code page */
	@FindBy(xpath = "//span[contains(text(),'amphtml')]/following-sibling::a[contains(@class,'html-attribute-value')]")
	private WebElement amphtmlInSourceCode;

	/* Ogimage in source code page */
	@FindBy(xpath = "//span[text()='og:image']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> ogImgInSourceCode;

	/* Footer Section present at bottom of article consumption page */
	@FindBy(xpath="//footer[@class='common-footer']")
	private WebElement footerSection;

	/* First article present in header of article consumption page */
	@FindBy(xpath="//div[contains(@class,'article_main')]//h1")
	private WebElement headlineTxt;

}
