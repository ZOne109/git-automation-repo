package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains elements and business methods for Mobile Article LandingPage 
 * @author Sanjeeb
 *
 */
public class MobileArticleLandingPage {
	
	public WebDriver driver;
	public MobileArticleLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/* Mobile_ArticleMobileLandingPage articleLnk */
	@FindBy(xpath = "//div[@class='mlead-story']/h1")
	private WebElement articleLnk;

	/* Mobile_ArticleMobileLandingPage breadCum */
	@FindBy(xpath = "//div[contains(@class,'brad')]//a")
	private List<WebElement> breadCumLnk;

	/* Mobile_ArticleMobileLandingPage landinPageImg */
	@FindBy(xpath = "//div[contains(@class,' article_')]//img")
	private List<WebElement> landinPageImg;

	/* Mobile_ArticleMobileLandingPage Tags in browser source code page */
	@FindBy(xpath = "//ul[contains(@class,' tags')]//a")
	private List<WebElement> Tags;

	/* Mobile_ArticleMobileLandingPage googleAds */
	@FindBy(xpath = "//div[contains(@id,'google_ad')]/iframe")
	private List<WebElement> googleAds;
	
}