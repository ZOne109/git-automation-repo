package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains Webelements and business logics for Mobile India Section Page
 * @author Vipin Kumar
 *
 */
public class MobileIndiaSection {
	
	public WebDriver driver;
	public MobileIndiaSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
		
	/* Navigation link for India section in hamburger menu */
	@FindBy(xpath ="//div[contains(@class,'nav_main')]/child::div//a[text()='India']")
	private WebElement indiaSectionLnk;
	
	/* List of Images In India Section */
	@FindBy(xpath = "//div[contains(@class,'news_page')]//img")
	private List<WebElement> indiaLstImg;
	
	/* Top Story First Image In India section*/
	@FindBy(xpath = "//div[contains(@class,'top_first_story')]//img")
	private WebElement topStoryImg;
	
	/* List of Top Story in India Section */
	@FindBy(xpath = "//div[contains(@class,'top_story')]//ul[contains(@class,'top_story_list')]//li/a")
	private List<WebElement> topStoryLstLnk;
	
	/* List of images in Latest news on India for India Section */
	@FindBy(xpath = "//div[contains(@class,'latest_news')]//ul[contains(@class,'top_story_list')]/li//img")
	private List<WebElement> indiaLatestNewsLstImg;
	
}
