package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.GlobalVariables;
import com.news18.init.WebDriverActions;

/**
 * This class contains WebElements and BusinessLogic of Desktop Photo Gallery Consumption Page 
 * @author Harshith S
 */

public class DesktopPhotoGalleryConsumptionPage {
	WebDriverActions webDriverActions = new WebDriverActions();
	SoftAssert assrt = new SoftAssert();

	public WebDriver driver;
	public DesktopPhotoGalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* Desktop_PhotoGalleryConsumption_Page List ofphotoGalleryFirstArticle*/
	@FindBy(xpath = "//a[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]//h3/a[not(text()='Cricketnext')]")
	private List<WebElement> photoGalleryFirstArticle;

	/* Desktop_PhotoGalleryConsumption_Page List of breadCrumLnk*/
	@FindBy(xpath = "//div[contains(@class,'bre')]//a//span")
	private List<WebElement> breadCrumLnk;

	/* Desktop_PhotoGalleryConsumption_Page fbShareIcon */
	@FindBy(xpath = "//div[contains(@class,'jsx-949867167 pht')]//a)[1]")
	private WebElement fbShareIcon;

	/* Desktop_PhotoGalleryConsumption_Page twitterIcon */
	@FindBy(xpath =	"//div[contains(@class,'jsx-949867167 pht')]//a)[3]")
	private WebElement twitterIcon;

	/* Desktop_PhotoGalleryConsumption_Page whatsappIcon */
	@FindBy(xpath =	"//div[contains(@class,'jsx-949867167 pht')]//a)[4]")
	private WebElement whatsappIcon;

	/* Desktop_PhotoGalleryConsumption_Page topGalleries */
	@FindBy(xpath =	"//h2[contains(@class,'photo')]")
	private WebElement topGalleries;

	/* Desktop_PhotoGalleryConsumption_Page List of rhsTopGalleriesList*/
	@FindBy(xpath = "//div[contains(@class,'jsx-1945834281 photogellary_widget')]//ul//li")
	private List<WebElement> rhsTopGalleriesList;

	/* Desktop_PhotoGalleryConsumption_Page List of htmlTag in browser source code page */
	@FindBy(xpath = "//span[@class='html-tag']")
	private List<WebElement> htmlTag;

	/* Desktop_PhotoGalleryConsumption_Page titleTag in browser source code page  */
	@FindBy(xpath =	"//*[contains(text(),'<title')]")
	private WebElement tileTag;

	/* Desktop_PhotoGalleryConsumption_Page titleText in browser source code page  */
	@FindBy(xpath =	"//*[contains(text(),'<titl')]/parent::td")
	private WebElement tileText;

	/* Desktop_PhotoGalleryConsumption_Page List of keywordsTag in browser source code page */
	@FindBy(xpath = "//span[text()='keywords']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> keywordsTag;

	/* Desktop_PhotoGalleryConsumption_Page ogImage in browser source code page  */
	@FindBy(xpath =	"//span[text()='og:image']/following-sibling::span[@class='html-attribute-value']")
	private WebElement ogImage;	

	/* Desktop_PhotoGalleryConsumption_Page ampHtmlTag in browser source code page */
	@FindBy(xpath =	"//span[text()='amphtml']/following-sibling::a[contains(@class,'html-attribute-value')]")
	private WebElement ampHtmlTag;

	/* Desktop_PhotoGalleryConsumption_Page List of outbrain*/
	@FindBy(xpath = "//a[normalize-space()='Recommended by']")
	private List<WebElement> outbrain;

	/* List of All social Icons present in PhotoGallery Consumption Page*/
	@FindBy(xpath = "//div[contains(@class,'photo_section')]/ul")
	private List<WebElement> allSocialIcons;

	/* List of All social Icons like 1= fb 2 = getpocket 3 = twitter 4 = whatsapp*/
	@FindBy(xpath = "//div[contains(@class,'photo_section')][1]/ul/li/a")
	private List<WebElement> socialIconsLnk;

	/*Outbrain Txt  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@class,'ob_what ob_what_resp')]//span[@class='ob_logo']")
	private WebElement outbrainTxt;

	/* List of Images present in photo page */
	@FindBy(xpath="//div[contains(@class,'heading_title')]/following-sibling::ul/li//img")
	private List<WebElement> listImg;

	/*List of down arrow button present on the image in photo article consumption page */
	@FindBy(xpath = "//a[contains(@class,'arrow_bottom')]")
	private List<WebElement> downArrowLnk;

	/*List of Up arrow button present on the image in photo article consumption page */
	@FindBy(xpath = "//a[contains(@class,'arrow_top')]")
	private List<WebElement> upArrowLnk;
	
	/* Article in photogallery page*/
	@FindBy(xpath = "//div//ul[contains(@class,'photoGalleryList')]//li//h3//a[contains(@href,'photonews')]")
	private List<WebElement> articleLnks;


	/**
	 * This method is used to click on the first article in the photogallery section
	 */
	public void clickOnFirstArt()
	{
		webDriverActions.click(listImg.get(0));
	}

	/**
	 * This method is used to check the Outbrain text is displayed
	 */
	public void outbrainHeader()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.mouseHover(outbrainTxt);
		assrt.assertTrue(webDriverActions.isElementDisplayed(outbrainTxt),"Failed to display "+outbrainTxt);
	}

	/**
	 * This method is used to verify social icons
	 */
	public void verifyAllSocialIcons()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForAllElementsVisible(allSocialIcons,GlobalVariables.sec60);
		for(WebElement socialLink:allSocialIcons)
		{
			assrt.assertTrue(webDriverActions.isElementDisplayed(socialLink),"Failed to display "+socialLink);
		}
	}

	
	/**
	 * This method is used to verify the navigation to social media icons 
	 */
	public void verifyNavigationToSocialMedia()
	{
		String parentTitle = webDriverActions.getPageTitle();
		for(int i=0 ;i<socialIconsLnk.size() ;i++)  
		{
			webDriverActions.waitForPageToLoad();
			webDriverActions.highlightElement(socialIconsLnk.get(i));
			String actual = webDriverActions.getAttribute("href", socialIconsLnk.get(i));
			webDriverActions.click(socialIconsLnk.get(i));
			webDriverActions.switchToNewWindow();
			String expected = webDriverActions.getCurrentPageUrl();
			webDriverActions.switchToWindow(parentTitle);
			assrt.assertTrue(webDriverActions.isElementDisplayed(socialIconsLnk.get(i)), "Failed to display "+actual);
			assrt.assertEquals(actual, expected, "Failed to navigate "+actual);
		}
	}
	
	
	/**
	 *  This method is used to verify the Up and Down arrow navigation
	 */
	public void verifyNextArticleNavigation()
	{
		webDriverActions.waitForAllElementsVisible(downArrowLnk, GlobalVariables.sec60);
		for(WebElement down :downArrowLnk)
		{
			webDriverActions.mouseHover(down);
			webDriverActions.highlightElement(down);
			webDriverActions.click(down);
			assrt.assertTrue(webDriverActions.isElementDisplayed(down),"Failed to display "+down);
		}
		webDriverActions.waitForAllElementsVisible(upArrowLnk, GlobalVariables.sec60);
		for(WebElement up:upArrowLnk)
		{
			webDriverActions.mouseHover(up);
			webDriverActions.highlightElement(up);
			webDriverActions.click(up);
			assrt.assertTrue(webDriverActions.isElementDisplayed(up),"Failed to display "+up);
		}
	}
		
	
	/**
	 * This method is used to click on First photo article link
	 */
	public void navigateToPhotogalleryFirstArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.click(articleLnks.get(0));
	}
}