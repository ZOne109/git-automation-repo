package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.WebDriverActions;

/** 
 * 
 * @author anupam
 * This Class contains webelements and business logic for Desktop Photo Section Page
 */

public class DesktopPhotoSection {
	WebDriverActions webDriverActions = new WebDriverActions();
	SoftAssert assrt = new SoftAssert();

	public WebDriver driver;
	public DesktopPhotoSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* List of photos present in rhsPhotogallery in photo page */
	@FindBy(xpath="//h2/span[text()='Photogallery']/parent::h2/following-sibling::ul/li/a")
	private List<WebElement> rhsPhotoGalList;

	/* Latest news On Photogallery in photo page */
	@FindBy(xpath="//h2[text()='LATEST NEWS ON PHOTOGALLERY']")
	private WebElement latestOnPhotogalleryTxt;

	/* List of Images present in photo page */
	@FindBy(xpath="//div[contains(@class,'heading_title')]/following-sibling::ul/li//img")
	private List<WebElement> listImg;

	/* Listing of Images present in photo page */
	@FindBy(xpath="//div[@id='__next']//figure//img")
	private List<WebElement> listingImg;

	/* Whatsapp icon present in page after clicking any article  */ 
	@FindBy(xpath="//span[contains(@class,'whatsapp')]/parent::a")
	private List<WebElement> whatsappIcon;

	/* pagination present in bottom of photo page */
	@FindBy(xpath="//div[contains(@class,'pagination')]")
	private WebElement pagination;

	/* List of pages in Pagination */
	@FindBy(xpath="//div[contains(@class,'pagination')]//li")
	private List<WebElement> paginationList;

	/* Next arrow present in pagination */ 
	@FindBy(xpath="//div[contains(@class,'pagination')]//li[contains(@class,'next')]/a")
	private WebElement nextArrow;

	/* Previous arrow present in pagination */
	@FindBy(xpath="//div[contains(@class,'pagination')]//li[contains(@class,'prev')]/a")
	private WebElement prevArrow;

	/* Breadcrumb link present in top of photo page */
	@FindBy(xpath="//div[contains(@class,'BreadCum')]//a")
	private List<WebElement> breadcrumbLnk;

	/* List of advertisement present in page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/* Promoted content present above Footer Section in photo page */
	@FindBy(xpath="//div[text()='PROMOTED CONTENT']")
	private WebElement promotedContentTxt;

	/* Footer Section present at bottom of page*/
	@FindBy(xpath="//footer[@class='common-footer']")
	private WebElement footerSection;


}
