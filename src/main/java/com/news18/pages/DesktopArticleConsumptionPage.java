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
 * @author sivaguru.s
 * This class contains WebElements and Business logic of Desktop Article Consumption page
 */

public class DesktopArticleConsumptionPage {

	WebDriverActions webDriverActions = new WebDriverActions();
	SoftAssert assrt = new SoftAssert();
	public WebDriver driver;

	public DesktopArticleConsumptionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*Link of all main articles except live and CricketNext in home page*/
	@FindBy(xpath = "//div[contains(@class,'top_story_right')]/ul/li/a[not(contains(@href,'live')) and not(contains(@href,'cricketnext'))]")
	private List<WebElement> articleLst;

	/*breadcrumb link*/
	@FindBy(xpath = "//div[(contains(@class,'bredcrum'))]//a")
	private List<WebElement> breadcrumbLnk;

	/*article main featured image*/
	@FindBy(xpath = "//div[contains(@class,'article_bimg')]//img")
	private List<WebElement> featuredImg;

	/*Link of Tags mentioned below of main article */
	@FindBy(xpath = "//div[@class='tags_box']//li/a[contains(@href,'news18')]")
	private List<WebElement> TagsLnk;

	/*Google ads displayed in page*/
	@FindBy(xpath = "//div[contains(@id,'google_ads_iframe_/1039154/') and not(contains(@id,'ROS_AL_ROS_PG_1x1_0__container__')) and  not(contains(@id,'ROS_Skin_OOP_0__container__')) and not(contains(@id,'_ROS_Shosh_OOP_0__container__')) and not(contains(@id,'ROS_AS_ROS_PG_1x1_0__container__')) and not(contains(@id,'AS_ROS_NAT1'))]/iframe")
	private List<WebElement> googleAdds;

	/*List of recommended stories mentioned in more news section*/
	@FindBy(xpath = "//div[contains(@class,'recomeded_story')]//li")
	private List<WebElement> recommendStories;

	/*List of links mentioned in photo gallery section in RHS*/
	@FindBy(xpath = "//div[@data-url]//ul[contains(@class,'photo_listing')]//li/a")
	private List<WebElement> photoglryLst;

	/*List of meta tags in browser source code page*/
	@FindBy(xpath = "//*[contains(text(),'meta')]")
	private List<WebElement> metaTagTitle;

	/*List of keywords in browser source code page*/
	@FindBy(xpath = "//span[text()='keywords']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> keyWordsLst;

	/*Description in browser source code page*/
	@FindBy(xpath = "(//span[text()='description']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement dscrptnTxt;

	/*Og image in browser source code page*/
	@FindBy(xpath = "//span[text()='og:image']/following-sibling::span[@class='html-attribute-value']")
	private List<WebElement> ogImgTxt;

	/*AmpHtml in browser source code page*/
	@FindBy(xpath = "//span[text()='amphtml']/following-sibling::a[contains(@class,'html-attribute-value')]")
	private WebElement ampHtmlTxt;

	/*titleText in browser source code page*/
	@FindBy(xpath = "//*[contains(text(),'<title ')]/parent::td")
	private List<WebElement> titleTxt;

	/*LiveTV in RHS*/
	@FindBy(xpath = "//div[contains(@class,'news18-special vwall')]//h2[contains(@class,'title')]")
	private WebElement liveTV;

	/*LiveTv player container in RHS*/
	@FindBy(xpath = "//div[@id='playerContainer']")
	private WebElement liveTVPlyr ;

	/*Author name in main article*/
	@FindBy(xpath = "//div[@class='text']/a")
	private WebElement authorName;

	/*List of Related news displayed in page*/
	@FindBy(xpath = "(//div[@class='article_related_story']//li)/a")
	private List<WebElement> relatedNews;

	/*Footer section in article consumption page*/
	@FindBy(xpath = "//section[@class='bottom_footer']")
	private WebElement footerSection;

	/*Header section in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'headerContainer')]")
	private WebElement headerSection;

	/*First Published date displayed in below of tags*/
	@FindBy(xpath = "(//div[contains(@class,'published_date')])[1]")
	private WebElement firstPubDate;

	/*HeaderInner section in Header part*/
	@FindBy(xpath = "//div[contains(@class,'jsx-515945483 headerInner')]")
	private WebElement headerInner;

	/*Logo in header section*/
	@FindBy(xpath = "(//div//img[@alt='News18 Logo'])[1]")
	private WebElement nw18Logo;

	/*Main header part in header section*/
	@FindBy(xpath = "//header[contains(@class,'mainHeader')]")
	private WebElement mainHeader;

	/*Headline of desktop article mentioned in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'article-box')]//h1")
	private WebElement deskHeadlne;

	/*Outbrain in promoted content*/
	@FindBy(xpath = "//div[text()='PROMOTED CONTENT']")
	private WebElement outbrainTxt;

	/*list of all outbrain*/
	@FindBy(xpath = "//div[@class='OUTBRAIN']")
	private List<WebElement> outbrainBx;

	/*Outbrain list in RHS side*/
	@FindBy(xpath = "//div[@id='right']//div[@class='OUTBRAIN']")
	private List<WebElement> outbrainRHSLst;

	/*Og image width mentioned in browser source code page*/
	@FindBy(xpath = "(//span[text()='og:image:width']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement ogImgWidth;

	/*Og image height mentioned in browser source code page*/
	@FindBy(xpath = "(//span[text()='og:image:height']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement ogImgHeight;

	/*Photo gallery text mentioned in RHS*/
	@FindBy(xpath = "//div[contains(@class,'photogellary_widget')]/h2/span[contains(text(),'Photogallery')]")
	private List<WebElement> PhotoglryTxt;

	/*Article title text*/
	@FindBy(xpath = "//*[contains(@class,'article_heading')]")
	private List<WebElement> artTitle;

	/*Article content explanation*/
	@FindBy(xpath = "//div[contains(@class,'article_bnow_box')]/h2[contains(@class,'jsx')]")
	private List<WebElement> artExpln;

	/*Robot tag mentioned in browser source code page*/
	@FindBy(xpath = "//*[contains(text(),'robots')]/following-sibling::span[contains(text(),'max-image-preview:large')]")
	private WebElement robotTag;

	/*Follow No-follow href links mentioned above tags*/
	@FindBy(xpath = "//article[contains(@class,'article-content-box first_big_character')]/div/p/a[contains(@href,'http')  and not (contains(@id,'__NEXT_DATA__'))]")
	private List<WebElement> hrefLnks;

	/*List of FB share icons should be displayed in articles displaying in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'share')]//a[contains(@href,'facebook')]")
	private List<WebElement> fbShareIcn;

	/*List of getPocket share icons should be displayed in articles displaying in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'share')]//a[contains(@href,'getpocket')]")
	private List<WebElement> getpocketShareIcn;

	/*List of twitter share icons should be displayed in articles displaying in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'share')]//a[contains(@href,'twitter')]")
	private List<WebElement> twitterShareIcn;

	/*List of twitter share icons should be displayed in articles displaying in article consumption page*/
	@FindBy(xpath = "//div[contains(@class,'share')]//a[contains(@href,'whatsapp')]")
	private List<WebElement> watsappShareIcn;

	/*Twitter content mentioned in browser source code page*/
	@FindBy(xpath = "(//span[text()='twitter:image']/following-sibling::span[@class='html-attribute-value'])[1]")
	private WebElement twitterContent;

	/*List of all social media share icon in article consumption page*/
	@FindBy(xpath="//div[contains(@class,'articleshare-new-in')]//a")
	private List<WebElement> socialShareIconsLnk;

	/*All share icons division*/
	@FindBy(xpath = "//div[contains(@class,'articleshare-new-in')]")
	private WebElement allShareIcons;


	/**
	 * This method is used to click on First Article on Homepage
	 */
	public void firstArticleClick()
	{
		webDriverActions.waitForElementVisibility(articleLst.get(0),GlobalVariables.sec60);
		webDriverActions.click(articleLst.get(0));
	}


	/**
	 * This method is used to verify the social icons navigation after clicking on first article
	 */
	public void verifySocialMediaNavigation()
	{
		for(int i=0 ;i<socialShareIconsLnk.size() ;i++)  
		{
			webDriverActions.waitForPageToLoad();
			webDriverActions.highlightElement(socialShareIconsLnk.get(i));
			webDriverActions.click(socialShareIconsLnk.get(i));
			webDriverActions.switchToParentWindow();
			assrt.assertTrue(webDriverActions.isElementDisplayed(socialShareIconsLnk.get(i)), "Failed to Display Element"+socialShareIconsLnk.get(i));
		}
		assrt.assertTrue(webDriverActions.isElementDisplayed(allShareIcons)," Failed to display element "+allShareIcons);
	}

	/**
	 * This method is used to verify Social Icons
	 */
	public void verifySocialIcons()
	{
		webDriverActions.waitForElementVisibility(allShareIcons,GlobalVariables.sec60);
		assrt.assertTrue(webDriverActions.isElementDisplayed(allShareIcons),"Failed to display element "+allShareIcons);
	}
}
