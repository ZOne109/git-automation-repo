package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains Webelements and business logics for Mobile Lifestyle Section Page
 * @author Vipin
 */

public class MobileLifestyleSection {
	
    public WebDriver driver;
	public MobileLifestyleSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}	
	
	
	/* Navigation link for Lifestyle section in hamburger menu */
	@FindBy(xpath = "//div[contains(@class,'nav_main')]/child::div//a[text()='Lifestyle']")
	private WebElement lifestyleSectionLnk;
	
	/* Top Story First Image In Lifestyle section*/
	@FindBy(xpath = "//div[contains(@class,'top_first_story')]//img")
	private WebElement topStoryImg;
	
	/* List of Images In Lifestyle Section */
	@FindBy(xpath = "//div[contains(@class,'news_page')]//img")
	private List<WebElement> lifestyleLstImg;
	
	/* List of Top Story in Lifestyle Section */
	@FindBy(xpath = "//div[contains(@class,'top_story')]//ul[contains(@class,'top_story_list')]//li/a")
	private List<WebElement> topStoryLstLnk;
	
	/* List of images in Latest news on Lifestyle for Lifestyle section */
	@FindBy(xpath = "//div[contains(@class,'latest_news')]//ul[contains(@class,'top_story_list')]/li//img")
	private List<WebElement> latestNewsLstImg;
	
}
