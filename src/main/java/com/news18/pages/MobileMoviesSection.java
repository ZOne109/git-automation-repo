package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains Webelements and business logics for Mobile Movies Section Page
 * @author Vipin
 */

public class MobileMoviesSection {

	public WebDriver driver;	
	public MobileMoviesSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	
	/* Navigation link for Movies section in hamburger menu */
	@FindBy(xpath = "//div[contains(@class,'nav_main')]/child::div//a[text()='Movies ']")
	private WebElement moviesSectionLnk;
	
	/* Top Story First Image In Movies section*/
	@FindBy(xpath = "//div[contains(@class,'top_first_story')]//img")
	private WebElement topStoryImg;
	
	/* List of Images In Movies Section */
	@FindBy(xpath = "//div[contains(@class,'news_page')]//img")
	private List<WebElement> moviesListingImg;
	
	/* List of Top Story in Movies Section */
	@FindBy(xpath = "//div[contains(@class,'top_story')]//ul[contains(@class,'top_story_list')]//li/a")
	private List<WebElement> topStoryListingLnk;
	
	/* List of images in Latest news on Movies for Movies Section */
	@FindBy(xpath = "//div[contains(@class,'latest_news')]//ul[contains(@class,'top_story_list')]/li//img")
	private List<WebElement> latestNewsListingImg;
	
}
