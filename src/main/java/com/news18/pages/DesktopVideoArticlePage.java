package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Danish R
 * This class contain WebElements and their Business logics
 */

public class DesktopVideoArticlePage {

	public WebDriver driver;
	
	public DesktopVideoArticlePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/* Videos Article Header Title below Photogallery and Movies sections in HomePage*/
	@FindBy(xpath = "//h2/span[text()='Videos']")
	private WebElement videosArticleSectionTitle;

	/* HomePage Videos Section Active Articles links*/
	@FindBy(xpath = "//h2/span[text()='Videos']/parent::h2/following-sibling::div[@class='pnv-gallery']/ul//li[contains(@class,'slick-active')]/a")
	private List<WebElement> videosActiveArticlesLnks;

	/* Videos Page Breadcrumb Header Text */
	@FindBy(xpath = "//div[contains(@class,'BreadCum')]//a")
	private WebElement breadcrumbHeaderTxt;

	/* Videos Page social medias share icons) */
	@FindBy(xpath = "//span[contains(text(),'Share')]//parent::div//a")
	private List<WebElement> shareIconsList;

	/* Videos Page RHS Articles links*/
	@FindBy(xpath = "//div[@id='right']//div[contains(@class,'cn_right')]/a")
	private List<WebElement> rhsArticleslnks;

	/* Videos Page Trending Videos Text at RHS*/
	@FindBy(xpath = "//h2//span[contains(text(),'TRENDING VIDEOS')]")
	private WebElement trendingVideosText;

	/* Videos Page Trending Videos List at RHS  */
	@FindBy(xpath = "//span[contains(text(),'TRENDING VIDEOS')]/parent::h2/following-sibling::ul/li/a")
	private List<WebElement> trendingVideosList;

	/* Videos Page Trending Photos Text at RHS */
	@FindBy(xpath = "//h2//span[contains(text(),'TRENDING PHOTOS')]")
	private WebElement trendingPhotosTxt;

	/* Videos Page Trending Photos list at RHS */
	@FindBy(xpath = "//span[contains(text(),'TRENDING PHOTOS')]/parent::h2/following-sibling::ul/li/a")
	private List<WebElement> trendingPhotosList;

	/*Videos Page Footer*/
	@FindBy(xpath = "//footer[@class='common-footer']")
	private WebElement footer;

	/* Videos Page Header */
	@FindBy(xpath = "//header[contains(@class,'mainHeader')]")
	private WebElement header;

	/* Videos page Advertisements */
	@FindBy(xpath = "//div[contains(text(),'Advertisement:')]")
	private List<WebElement> videosAds;

}
