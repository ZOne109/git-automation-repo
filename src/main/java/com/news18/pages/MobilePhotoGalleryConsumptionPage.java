package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  This class contains WebElements and BusinessLogic of Mobile PhotoGallery Consumption Page 
 *  @author Harshith S
 */

public class MobilePhotoGalleryConsumptionPage {

	public WebDriver driver;
	public MobilePhotoGalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Mobile_PhotoGalleryConsumption_Page photogalleriesLink */
	@FindBy(xpath = "//a[text()='Photogalleries']")
	private WebElement photogalleriesLnk;

	/* Mobile_PhotoGalleryConsumption_Page photogalleriesArticleLink */
	@FindBy(xpath = "//span[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='ofhidden']//li[@class='glide__slide--active']/a[2]")
	private WebElement photogalleriesArticleLnk;

	/* Mobile_PhotoGalleryConsumption_Page photogalleriesArticleImgLink */
	@FindBy(xpath = "//span[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='ofhidden']//li[not(contains(@class,'glide__slide--clone'))]//a[not(contains(@href,'cricketnext'))][1]")
	private WebElement photogalleriesArticleImgLnk;

	/* Mobile_PhotoGalleryConsumption_Page socialShareIcon */
	@FindBy(xpath = "//div[@class='jsx-1927145440 pht-artcl-shr fright']")
	private WebElement socialShareIcon;

	/* Mobile_LiveBlogPage List of footerLnk*/
	@FindBy(xpath = "//span[@class='ftr_title']/span")
	private List<WebElement> footerLnk ;

	/* Mobile_PhotoGalleryConsumption_Page headerLnk */
	@FindBy(xpath = "//img[@title='News18 English']")
	private WebElement headerLnk;

	/* Mobile_PhotoGalleryConsumption_Page firstImg  */
	@FindBy(xpath = "(//div[@class='photo-gallery vspacer30 prelative photo-gallery-slider glide--ltr glide--carousel glide--swipeable']//img)[4]")
	private WebElement firstImg;

	/* Mobile_LiveBlogPage List of imageList*/
	@FindBy(xpath = "//div[@class='jsx-1927145440 glrbox']//img")
	private List<WebElement> imageList ;

	/* Mobile_PhotoGalleryConsumption_Page footerContainer  */
	@FindBy(xpath = "//div[@class='ftr_container']")
	private WebElement footerContainer;

	/* Mobile_PhotoGalleryConsumption_Page SocialFirstImage  */
	@FindBy(xpath = "(//div[contains(@class,'glrbox')])[1]")
	private WebElement SocialFirstImage;

	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[1]")
	private WebElement fbShareIcon;

	/* Mobile_PhotoGalleryConsumption_Page getPocketIcon  */
	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[2]")
	private WebElement getPocketIcon;

	/* Mobile_PhotoGalleryConsumption_Page twitterIcon  */
	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[3]")
	private WebElement twitterIcon;

	/* Mobile_PhotoGalleryConsumption_Page whatsappIcon  */
	@FindBy(xpath = "(//div[@class='jsx-1927145440 pht-artcl-shr fright'])[1]//a[4]")
	private WebElement whatsappIcon;

	/* Mobile_LiveBlogPage List of shareIconOfImage*/
	@FindBy(xpath = "//div[contains(@class,'glrbox')][1]/figure/a/span[contains(@class,'phtsprt2 shr')]")
	private List<WebElement> shareIconOfImage ;

}
