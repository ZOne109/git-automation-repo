package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Danish R
 * This class contain WebElements and their Business logics
 */

public class AMPVideosConsumptionPage {

	public WebDriver driver;

	public AMPVideosConsumptionPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* AMP videos section in home page l1 navigation bar */
	@FindBy(xpath = "//div[@class='mobheader']//a[text()='Videos']")
	private WebElement videosL1Lnk;

	/* AMP Videos Page Breadcrumb Header Title */
	@FindBy(xpath = "//div[contains(@class,'BreadCum')]")
	private WebElement breadcrumbTitleTxt;

	/* AMP Videos Page Article Links */
	@FindBy(xpath = "//ul[contains(@class,'videoLists')]//li//following-sibling::div//a")
	private List<WebElement> videosArticleLnks;

	/* AMP Videos Page Ads*/
	@FindBy(xpath = "//iframe[@aria-label='Advertisement']")
	private List<WebElement> videosPageAds;

	/* AMP Videos Page Footer */
	@FindBy(xpath = "//footer")
	private WebElement videosPageFooter;

	/* AMP Videos Page Header */
	@FindBy(xpath = "//header")
	private WebElement videosPageHeader;

}