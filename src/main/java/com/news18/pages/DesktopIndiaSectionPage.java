package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains Webelements and business logics for Desktop India Section Page
 * @author Vipin Kumar
 */

public class DesktopIndiaSectionPage {

	public WebDriver driver;
	public DesktopIndiaSectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/* Image of TopStory in India section */
	@FindBy(xpath = "//div[contains(@class,'top_story_left')]//img")
	private WebElement indiaTopStoryImg;

	/* List of links in Latest News On India in India Section */
	@FindBy(xpath = "//div[contains(@class,'blog_list')]/child::a")
	private List<WebElement> latestNwsIndiaLstLnk;

	/* List of Topstory link in India section */
	@FindBy(xpath = "//div[contains(@class,'top_story')]//child::a")
	private List<WebElement> indiaTopStoryLstLnk;

	/* List of more News in India Section [RHS]*/
	@FindBy(xpath = "//div[contains(@class,'recomeded_story')]/child::ul//a")
	private List<WebElement> indiaMoreNewsListLnk;

	/* List of images in Latest News On India in India Section */
	@FindBy(xpath = "//div[contains(@class,'blog_list')]//div[contains(@class,'blog_list')]//img")
	private List<WebElement> latestNwsIndiaListImg;

}
