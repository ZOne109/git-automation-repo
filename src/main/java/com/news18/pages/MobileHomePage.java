package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  @author Sanjeeb
 *  This class contains elements and business logics for mobile web Home Page.
 */

public class MobileHomePage {


	public WebDriver driver;
	public  MobileHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	/* First news of the top article present on the mobile web home page. */
	@FindBy(xpath="//div[@class='mstory-row']/div[@class='text']/h2/a")
	private  List<WebElement> firstNewsTxt;

	/*News 18 Logo present on the mobile web home page.*/
	@FindBy(xpath="//div[@class='logo_box']")
	private  WebElement news18Logo;

	/* PROMOTED CONTENT text present on the footer of mobile web home page. */
	@FindBy(xpath="//span[text()='PROMOTED CONTENT']")
	private  WebElement promotedContentTxt;

	/* Search button present on the top corner of mobile web home page. */
	@FindBy(xpath="//li[@class='search_icon']//a")
	private  WebElement SearchBtn;

	/* Homepage links present on the top of mobile web home page. */
	@FindBy(xpath="//div[@class='headerNav_accordion']//div[@class='headerNav_slide']")
	private List<WebElement> homePageLnks;

	/* Hamburger icon present on the top corner of mobile web home page. */
	@FindBy(xpath="//div[@class='Hamburger_icon']")
	private  WebElement hamburgerIcon;

	/* amp hamburger Menu icon present on the top corner of amp home page. */
	@FindBy(xpath="//button[@class='menu-btn mbl-nav']")
	private  WebElement ampHamburgerIcon;

	/*Number of Language  present on the change language section of mobile web home page.*/
	@FindBy(xpath="//ul[contains(@class,'lang_list')]//li")
	private List<WebElement> languagesCount;

	/* Download app text present on the top of mobile web home page. */
	@FindBy(xpath="//span[text()='Open in App']/parent::a")
	private  WebElement downloadAppTxt;

	/* top article image present on the article section of mobile web home page. */
	@FindBy(xpath="//div[@class='mlead-story']/figure//img")
	private  WebElement topArticleImg;

	/* top article Text present on the article section of mobile web home page. */
	@FindBy(xpath="//h1[@class='mlead-head']/a")
	private  WebElement topArticleTxt;

	/*Sub Article sections present under the article section of mobile web homepage.*/
	@FindBy(xpath="//div[@class='mstory-thumb-wrap']//div[@class='mstory-row']")
	private List<WebElement> subArticlePageNews;

	/* list of article present under TopNews section of mobile web home page. */
	@FindBy(xpath="//div[@class='mtopstory-wrap']//li")
	private List<WebElement> listOfTopNewsArticle;

	/* live tv section present under top stories section of mobile web home page. */
	@FindBy(xpath="//div[@class='vspacer20 news18-special vwall']//span[text()=' LIVE TV']")
	private  WebElement liveTvBtn;

	/* Facebook icon present at the footer portion of mobile web home page. */
	@FindBy(xpath="//div[@class='social_net_icon']//i[@class='facebook']")
	private  WebElement facebookBtn;

	/* Twitter icon present at the footer portion of mobile web home page. */
	@FindBy(xpath="//div[@class='social_net_icon']//i[@class='twitter']")
	private  WebElement twitterBtn;

	/* Instagram icon present at the footer portion of mobile web home page. */
	@FindBy(xpath="//div[@class='social_net_icon']//i[@class='insta']")
	private  WebElement instagramBtn;

	/* Youtube icon present at the footer portion of mobile web home page. */
	@FindBy(xpath="//div[@class='social_net_icon']//i[@class='youtube']")
	private  WebElement youtubeBtn;

	/* jio news icon present at the footer portion of mobile web home page. */
	@FindBy(xpath="//div[@class='social_net_icon']//i[@class='jionews']")
	private  WebElement jioNewsBtn;

	/*list of article  present under Hot and trending  section of mobile web home page.*/
	@FindBy(xpath="//div[@class='hntranding']//ul/li[not(@style='display:none;')]")
	private List<WebElement> listOfHotAndTrendingTopics;

	/*more on hot and trending button present under Hot and trending  section of mobile web home page.*/
	@FindBy(xpath="//span[text()='More Hot & Trending']")
	private WebElement moreOnHotAndTrendingBtn;

	/*list of article present under Hot and trending  section of mobile web home page.*/
	@FindBy(xpath="//div[@class='hntranding']//ul/li")
	private List<WebElement> listOfArticleHotAndTrending;

	/* photoGallery Article of mobile web home page. */
	@FindBy(xpath="//span[text()='Photogalleries']")
	private WebElement  photoGalleryTxt;

	//list of article present under photoGallery  section of mobile AMP home page.
	@FindBy(xpath="//div[@class='hntranding']//ul/li")
	private List<WebElement> listPhotoGalleryAMP;

	/* first article text of photoGallery Article of mobile web home page.*/
	@FindBy(xpath="//span[text()='Photogalleries']/../following-sibling::div//li[@class='glide__slide--active']/a[2]")
	private WebElement  firstArticleTxtphotoGalleryTxt;

	/* first article image of photoGallery Article of mobile web home page. */
	@FindBy(xpath="//span[text()='Photogalleries']/../following-sibling::div//li[@class='glide__slide--active']//img")
	private WebElement  firstArticleImgphotoGalleryTxt;

	/* Right click button photoGallery Article of mobile web home page. */
	@FindBy(xpath="//span[text()='Photogalleries']/../following-sibling::div//li[@class='glide__slide--active']//img")
	private WebElement  photoRightBtn;

	/*list of article present under photoGallery  section of mobile web home page.*/
	@FindBy(xpath="//span[text()='Photogalleries']/../following-sibling::div[@class='ofhidden']//li[not(@class='glide__slide--clone')]")
	private List<WebElement> listOfPhoto;

	/* podcast Article of mobile web home page.*/
	@FindBy(xpath="//h2//span[text()='Podcast']")
	private WebElement  podcastTxt;

	/*First Article text under Podcast module  of mobile web home page.*/
	@FindBy(xpath="//span[text()='Podcast']/../following-sibling::div//li[@class='glide__slide--active']/a[2]")
	private WebElement firstPodcastArticleTxt;

	/* First Article Image under Podcast module of mobile web home page. */
	@FindBy(xpath="//span[text()='Podcast']/../following-sibling::div//li[@class='glide__slide--active']//img")
	private WebElement firstArticleImg;

	/* Right Click button under Podcast Article of mobile web home page. */
	@FindBy(xpath="//div[contains(@class,'podcast-gallery-slider')]//a[@class='right-arrow l1 act']")
	private WebElement podcastRightBtn;

	/* Left Click button under Podcast Article of mobile web home page. */
	@FindBy(xpath="//div[contains(@class,'podcast-gallery-slider')]//a[@class='left-arrow l1 act']")
	private WebElement podcastLeftBtn;

	/* list of sub article present under podcast section of mobile web home page. */
	@FindBy(xpath="//span[text()='Photogalleries']/../following-sibling::div[@class='ofhidden']//li[not(@class='glide__slide--clone')]")
	private List<WebElement> listOfSubArticle;

	/* videos Article of mobile web home page. */
	@FindBy(xpath="//h2//span[text()='Videos']")
	private WebElement  videosTxt;

	/* First Article text under videos module of mobile web home page. */
	@FindBy(xpath="//span[text()='Videos']/../following-sibling::div//li[@class='glide__slide--active']/a[2]")
	private WebElement firstVideoArticleTxt;

	/* First Article Image under videos module of mobile web home page. */
	@FindBy(xpath="//span[text()='Videos']/../following-sibling::div//li[@class='glide__slide--active']//img")
	private WebElement firstVideoArticleImg;

	/* Right Click button under videos Article of mobile web home page. */
	@FindBy(xpath="//div[contains(@class,'video-gallery-slider')]//a[@class='right-arrow r1 act']")
	private WebElement videoRightBtn;

	/* left Click button under videos Article of mobile web home page. */
	@FindBy(xpath="//div[contains(@class,'video-gallery-slider')]//a[@class='left-arrow l1 act']")
	private WebElement videoLeftBtn;

	/* list of sub article present under video section of mobile web home page. */
	@FindBy(xpath="//span[text()='Videos']/../following-sibling::div[@class='ofhidden']//li[not(@class='glide__slide--clone')]")
	private List<WebElement> listOfSubArticleVideo;	

	/* videoWall Article of mobile web home page. */
	@FindBy(xpath="//h2//span[text()='Video Wall']")
	private WebElement  videoWallTxt;

	/* First Article text under videoWall module of mobile web home page. */
	@FindBy(xpath="//span[text()='Video Wall']/../following-sibling::div//li[@class='glide__slide--active']//h2/a")
	private WebElement firstVideoWallArticleTxt;

	/* First Article Image under videoWall module of mobile web home page. */
	@FindBy(xpath="//span[text()='Video Wall']/../following-sibling::div//li[@class='glide__slide--active']//img")
	private WebElement firstVideoWallArticleImg;

	/* Right Click button under videoWall Article of mobile web home page. */
	@FindBy(xpath="//div[contains(@class,'video-wall-slider')]//a[@class='right-arrow r1 act']")
	private WebElement videoWallRightBtn;

	/* left Click button under videoWall Article of mobile web home page. */
	@FindBy(xpath="//div[contains(@class,'video-wall-slider')]//a[@class='left-arrow l1 act']")
	private WebElement videoWallLeftBtn;

	/* Tech Section of mobile web home page. */
	@FindBy(xpath="//h2/span[text()='Tech']")
	private WebElement  techSectionTxt;

	/* list of sub article present under Tech section of mobile web home page. */
	@FindBy(xpath="//span[text()='Tech']/parent::h2/following-sibling::ul/li")
	private List<WebElement> listOfSubArticleTech;

	/* Tech Section top article in bold with img of mobile web home page. */
	@FindBy(xpath="//span[text()='Tech']/parent::h2/following-sibling::ul/li[1]")
	private WebElement  techSectionTopArticle;

	/* Tech Section top article img of mobile web home page. */
	@FindBy(xpath="//span[text()='Tech']/parent::h2/following-sibling::ul/li[1]//img")
	private WebElement  techSectionTopArticleImg;

	/*more Tech Articles Button present bellow the tech section top article img of mobile web home page.*/
	@FindBy(xpath="//a[@class='more-listing' and @href='https://www.news18.com/tech/']")
	private WebElement moreTechArticles ;

	/* more Movie Articles Button present bellow the tech section top article img of mobile web home page.*/
	@FindBy(xpath="//a[@class='more-listing' and @href='https://www.news18.com/movies/']")
	private WebElement moreMovieArticles ;

	/* more CricketNext Articles Button present bellow the tech section top article img of mobile web home page.*/
	@FindBy(xpath="//a[@class='more-listing' and @title='Cricketnext']")
	private WebElement moreCricketNextArticles ;

	/* more Buzz Articles Button present bellow the tech section top article img of mobile web home page.*/
	@FindBy(xpath="//a[@class='more-listing' and @title='Buzz']")
	private WebElement moreBuzzArticles ;

	/* more Sports Articles Button present bellow the tech section top article img of mobile web home page.*/
	@FindBy(xpath="//a[@class='more-listing' and @title='Sports']")
	private WebElement moreSportsArticles ;

	/* more Auto Articles Button present bellow the tech section top article img of mobile web home page.*/
	@FindBy(xpath="//a[@class='more-listing' and @title='Auto']")
	private WebElement moreAutoArticles ;

	/* list of ads present mobile web home page.*/
	@FindBy(xpath="//div[contains(@id,'google_ads_iframe') and not(contains(@id,'ROS_AL_ROS_PG_1x1_0__container__')) and  not(contains(@id,'ROS_Skin_OOP_0__container__')) and not(contains(@id,'_ROS_Shosh_OOP_0__container__')) and not(contains(@id,'ROS_AS_ROS_PG_1x1_0__container__'))]/iframe")
	private List<WebElement> listOfAds;	

	/* list of Amp ads present mobile web home page. */
	@FindBy(xpath="//amp-ad[contains(@data-slot,'AMP/NW18_ENG_AMP') and not(contains(@data-slot,'AMP/NW18_ENG_AMP_HP_FBN_320'))]")
	private List<WebElement> listOfAMPAds;

	/*outBrain mobile web home page.*/
	@FindBy(xpath="//a[@class='more-listing' and @title='Auto']")
	private WebElement outBrainLnk ;

	/*From our show section under videowall section on  mobile web home page.*/
	@FindBy(xpath="//div[@class='our-show vspacer30']//h2")
	private WebElement fromOurShow ;

	/*list of article present under From our show section mobile web home page.*/
	@FindBy(xpath="//div[@class='our-show vspacer30']//ul/li")
	private List<WebElement> listOfArticleFromOurShow;

	/* list of article present under From our show section mobile web home page. */
	@FindBy(xpath="//select[@id='show_drop_down']/option")
	private List<WebElement> listOfJumpToShows;

	/*jump to show drop down section under From our show section on  mobile web home page.*/
	@FindBy(xpath="//select[@id='show_drop_down']")
	private WebElement jumpToShowDrpdwnBtn ;

	/* full footer Section on mobile web home page. */
	@FindBy(xpath="//select[@id='show_drop_down']")
	private WebElement fullFooterSection ;

	/*list of homepage links  present on mobile amp home page.*/
	@FindBy(xpath="//select[@id='show_drop_down']/option")
	private List<WebElement> listOfHomepageLnks;

	/*Covid Tracker present at top right corner on  mobile web home page.*/
	@FindBy(xpath="//ul[@class='header_right']/li[@class='corona-toolbarbtn']/a")
	private WebElement covidTrackerLnk;

	/*update date of Covid Tracker present after clicking on covid tracker logo at top right corner on  mobile web home page.*/
	@FindBy(xpath="//div[@class='corona-m-ftr']/ul[@class='corona-m-box']/li/span[@id='UpdatedStateTimeStamp']")
	private WebElement updatedDateCovidTracker;

	/*photo sub section present on the l1 section of mobile web home page.*/
	@FindBy(xpath="//*[contains(@class,'L1_menu')]//a[contains(@href,'photogallery')]")
	private WebElement photoSubSectionL1;

	/*Outbrain box present under From my shows of mobile web home page.*/
	@FindBy(xpath="//div[@class='outbrain_box_home']")
	private WebElement outbrainBox;

	/*list of Trending topics present on the footer part of  mobile web home page.*/
	@FindBy(xpath="//div[@class='link_table w3 trand']//a[contains(@href,'topics') and contains(@onclick,'TRENDING')]")
	private List<WebElement> listOfTrendingTopics;

	/*Mobile Live Tv present under hamburger menu of mobile web home page.*/
	@FindBy(xpath="//div[@class='nav_header']//div[@class='icon livetv_icon']")
	private WebElement mobileLiveTv;

	/*mob web movies first article present on the mobile web movies home page.*/
	@FindBy(xpath="//div[contains(@class,'top_story')]//li[1]/a")
	private  WebElement mobWebMoviesFirstArticle;

	/*mob web Photo first article present on the mobile web Photo home page.*/
	@FindBy(xpath="(//ul//div[contains(@class,'story_title')]//h3/a)[2]")
	private  WebElement mobWebPhotoFirstArticle;

	/*Buzz,Politics section first article present on l1 layer of home page.*/
	@FindBy(xpath="(//ul//div[contains(@class,'story_title')]//h3/a)[2]")
	private  WebElement mobWebBuzzOrPoliticsFirstArticle;

}
