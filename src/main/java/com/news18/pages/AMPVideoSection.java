package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author anupam
 * This Class contains webelements and business logic for AMP Video Section Page
 */

public class AMPVideoSection {

	public WebDriver driver;
	public AMPVideoSection(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Video section present in L1 menu of home page */
	@FindBy(xpath="//div[@class='mobheader']//a[text()='Videos']")
	private WebElement videoSectionL1;

	/* Breadcrumb text present in top of video page */
	@FindBy(xpath="//div[contains(@class,'BreadCum')]//a")
	private List<WebElement> breadcrumbLnk;

	/* Listing of image in video page */
	@FindBy(xpath="//ul[@class='videoLists']/li//img")
	private List<WebElement> videosListImg;

	/* List of more video button present in video page */
	@FindBy(xpath="//div[@class='vdomore']/a")
	private List<WebElement> moreVideoBtn;

	/* Footer Section present at bottom of video page */
	@FindBy(xpath="//footer[@class='common-footer']")
	private WebElement footerSection;

	/* Slider present in top of video page */
	@FindBy(xpath="//div[@class='i-amphtml-carousel-scroll']")
	private WebElement videoSlider;

	/* Next arrow present in slider */
	@FindBy(xpath="//div[contains(@class,'carousel-button-next')]")
	private WebElement nextArrow;

	/* Previous arrow present in slider */
	@FindBy(xpath="//div[contains(@class,'carousel-button-prev')]")
	private WebElement prevArrow;

	/* Header of video page */
	@FindBy(xpath="//div[contains(@class,'main_header')]")
	private WebElement headerSection;

	/* First title of each subsection article*/
	@FindBy(xpath="//div[@class='contentbox']//h2")
	private List<WebElement> firstTitle;

}
