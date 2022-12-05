package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author anupam
 * This Class contains webelements and business logic for AMP Photo Section Page
 */

public class AMPPhotoSection {

	public WebDriver driver;
	public AMPPhotoSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* photo section Present in L1 bar of home page */
	@FindBy(xpath="//div[@class='mobheader']//a[text()='Photos ']")
	private WebElement photoSectionL1;

	/* Latest news On Photogallery in photo page */
	@FindBy(xpath="//h2[text()='LATEST NEWS ON PHOTOGALLERY']")
	private WebElement latestOnPhotogalleryTxt;

	/* Breadcrumb text present in top of photo page */
	@FindBy(xpath="//div[contains(@class,'BreadCum')]//a")
	private List<WebElement> breadcrumbLnk;

	/* List of Images present in photo page  */
	@FindBy(xpath="//ul[contains(@class,'top_story_list')]/li//amp-img")
	private List<WebElement> listingImg;

	/* pagination present in bottom of photo page */
	@FindBy(xpath="//ul[@class='jsx-1275880598 pagination']")
	private WebElement pagination;

	/* Previous arrow present in pagination */
	@FindBy(xpath="//ul[contains(@class,'pagination')]//a[text()='Prev']")
	private WebElement prevArrow;

	/* Next arrow present in pagination */
	@FindBy(xpath="//ul[contains(@class,'pagination')]//a[text()='Next']")
	private WebElement nextArrow;

	/* Promoted content present above Footer Section in photo page */
	@FindBy(xpath="//span[text()='PROMOTED CONTENT']")
	private WebElement promotedContentTxt;

	/* List of advertisement present in photo page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

}
