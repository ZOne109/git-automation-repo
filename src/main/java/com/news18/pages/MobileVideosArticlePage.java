package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Danish R
 * This class contain WebElements and their Business logics
 */

public class MobileVideosArticlePage {

	public WebDriver driver;

	public MobileVideosArticlePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* HomePage Videos Article Section below Business section*/
	@FindBy(xpath = "//span[text()='Videos']//ancestor::h2/following-sibling::div[@class='ofhidden']//li[not(contains(@class,'glide__slide--clone'))][1]//a[not(contains(@href,'cricketnext'))][1]")
	private WebElement videosTxt;

	/* HomePage Videos Article Section links*/
	@FindBy(xpath = "//span[text()='Videos']//ancestor::h2/following-sibling::div[@class='ofhidden']//li[not(contains(@class,'glide__slide--clone'))][1]//a[not(contains(@href,'cricketnext'))][1]//following-sibling::a")
	private WebElement videosArticlesLnk;

	/* Videos Page Breadcrumb Header Text Display*/
	@FindBy(xpath = "//div[@class='BreadCum']")
	private WebElement breadcrumbTxt;

	/* Videos Page Header News18Logo*/
	@FindBy(xpath = "//div[contains(@class,'logo')]")
	private WebElement nw18Logo;

	/* Videos Page News18Logo*/
	@FindBys(@FindBy(xpath = "//div[contains(@class,'videoSection')]/div/div[contains(@class,'vshre')]/a"))
	private List<WebElement> socialMediaIcons;

	/* Videos Page Ads*/
	@FindBy(xpath = "//iframe[@aria-label='Advertisement']")
	private WebElement videosPageAds;

	/* Videos Page Footer*/
	@FindBy(xpath = "//footer")
	private WebElement videosPageFooter;

	/* Videos Page Header*/
	@FindBy(xpath = "//header")
	private WebElement videosPageHeader;

}
