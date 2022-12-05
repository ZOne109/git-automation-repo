package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author anupam
 * This Class contains webelements and business logic for Mobile Photo Section Page
 */

public class MobilePhotoSection {

	public WebDriver driver;
	public MobilePhotoSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Breadcrumb present in top of photo page*/
	@FindBy(xpath="//div[contains(@class,'BreadCum')]//a")
	private List<WebElement> breadcrumbLnk;

	/* Latest news On Photogallery in photo page */
	@FindBy(xpath="//h2[text()='LATEST NEWS ON PHOTOGALLERY']")
	private WebElement latestOnPhotogalleryTxt;

	/* List of Images in photo page */
	@FindBy(xpath="//div[contains(@class,'heading_title')]/following-sibling::ul/li//img")
	private List<WebElement> listImg;

	/* Pagination should be present in bottom of page */ 
	@FindBy(xpath="//div[contains(@class,'pagination')]")
	private WebElement pagination;

	/* Next arrow in pagination */
	@FindBy(xpath="//li[contains(@class,'next')]/a")
	private WebElement paginationRightArrow;

	/* Previous arrow in pagination */
	@FindBy(xpath="//li[contains(@class,'prev')]/a")
	private WebElement paginationPrevArrow;

	/* List of advertisement present in photo page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/* Promoted content present above Footer Section in photo page */
	@FindBy(xpath="//span[text()='PROMOTED CONTENT']")
	private WebElement promotedContentTxt;

	/* Footer Section present at bottom of page */
	@FindBy(xpath="//footer[@class='common-footer']")
	private WebElement footerSection;
}
