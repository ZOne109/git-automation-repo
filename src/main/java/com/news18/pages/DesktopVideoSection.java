package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author anupam
 * This Class contains webelements and business logic for Desktop Video Section Page
 */

public class DesktopVideoSection {
	
	public WebDriver driver;
	public DesktopVideoSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	/* Video section present in L1 Section */
	@FindBy(xpath="//ul[@class='fleft nav-box']//a[text()='Videos']")
	private WebElement videoSectionL1;
	
	/* Breadcrumb text present in top of video page */
	@FindBy(xpath="//div[contains(@class,'BreadCum')]//a")
	private List<WebElement> breadcrumbLnk;

	/* Listing of images  in video page */
	@FindBy(xpath="//div[contains(@class,'video-videoListingTopVideos') or contains(@class,'videoListsrow')]//li//img")
	private List<WebElement> videosListImg;

	/* Hamburger menu present in video page  */
	@FindBy(xpath="//div[contains(@class,'hamburger')]")
	private WebElement hamburgerMenuBtn;

	/* List of more video button present in video page */
	@FindBy(xpath="//div[@class='load_more']/a")
	private List<WebElement> moreVideoBtn;

	/* Promoted content present above Footer Section in video page */
	@FindBy(xpath="//span[text()='PROMOTED CONTENT']")
	private WebElement promotedContentTxt;

	/* Footer Section present at bottom of video page */
	@FindBy(xpath="//footer[@class='common-footer']")
	private WebElement footerSection;

}