package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.GlobalVariables;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

/**
 * @author Abhishek raj
 */

public class DesktopLandingPage  {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*photo section Present in Line One navigation bar */
	@FindBy(xpath="//ul[contains(@class,'topNavList')]//a[text()='Photos']")
	private WebElement photoSectionLineOneLnk;

	/*Homepage LiveBlog article Link  is present below the Line Two  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'home_wrapper')]//a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveBlogArticleLnk;

	/*Homepage article Link  is present below the Line Two Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'top_story_right')]//li/a[not(contains(@href,'live'))]")
	private List<WebElement> homePageArticleLnks;

	/*Videos link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//div[contains(@class,'sub-nav')]//li//a[text()='Videos']")
	private WebElement videosSectionLnk;

	/* Video Article Link present on Video Page*/
	@FindBy(xpath ="//div[contains(@class,'videoListingTopVideos')]//ul/li/a")
	private List<WebElement> VideosArticleLnks;

	/*Homepage LiveBlog article Link  is present below the LineTwo Tag  Menu in RHS*/
	@FindBy(xpath ="//div[contains(@class,'top_story')]//a[contains(@href,'live')]")
	private List<WebElement> homePageLiveBlogArticleLnks;

	/*News-18 Logo is present in Headerpart */
	@FindBy(xpath ="//div[@class='logonsection']//img[@alt='News18 Logo']")
	private WebElement nw18Logo;

	/*List of All Languages Link  present in Change Language DropDown */
	@FindBy(xpath ="//div[@class='lddnav']/a")
	private List<WebElement> changeLang;

	/*L2 Section List Links present below Main Menu Bar */
	@FindBy(xpath ="//div[contains(@class,'secont-lnav')]//ul/li")
	private List<WebElement> l2SectionListLnk;

	/*Latest Bengali News in Bengali Home Page*/
	@FindBy(xpath ="//ul[contains(@class,'topnews-left-list')]/li")
	private List<WebElement> bengaliLatestNewsListLnk;

	/*Marathi Top News Link present above Web Stories in Marathi Home Page*/
	@FindBy(xpath ="//ul[contains(@class,'topnews-left-list')]/li")
	private List<WebElement> marathiTopNewsLnk;

	/*All L1 Navigation Link present in Top Main Menu Bar in English Language */
	@FindBy(xpath ="//ul[@class='fleft nav-box']/li")
	private List<WebElement> l1NavigationLnk;

	/*Latest News Article Link  present inside Latest News at RHS of page  */
	@FindBy(xpath ="//span[text()='Latest News']/../..//li")
	private List<WebElement> latestNewsArticleLnk;

	/*Top Story First Article Text is present below L2 Section */
	@FindBy(xpath ="//h1")
	private WebElement firstTopStoryArticleTxt;

	/*List of Languages in change Language Drop Down Menu*/
	@FindBy(xpath ="//div[contains(@class,'languagebox')]//a")
	private List<WebElement> listOfLanguageCount;

	/*Hamburger Menu List Link present in L1 Section*/
	@FindBy(xpath ="//ul[@class='h-links clearfix']/li")
	private List<WebElement> hamburgerMenuListLnk;

	/*Top Story First Article Link is present below L2 Section*/
	@FindBy(xpath ="//h1/..")
	private WebElement  firstTopStoryLnk;

	/*News-18 Minis Article Section Links in Home Page*/
	@FindBy(xpath ="//div[@class='slick-track']/div[contains(@class,'slick-slide')]")
	private List<WebElement> nw18MinisArticleLnk;

	/*Promoted Content All Article List present inside Outbrain*/
	@FindBy(xpath ="//div[@class='ob-widget-items-container']//section/span[1]")
	private List<WebElement> promotedContentArticleList;

	/*All Footer Links present in Footer*/
	@FindBy(xpath ="//div[contains(@class,'ftr_row_section')]//a")
	private List<WebElement> allFooterLnk;

	/*RHS Promoted Content present in All Pages Except Home Page */
	@FindBy(xpath ="//div[@id='outbrain_widget_1' or @class='OUTBRAIN']//ul")
	private List<WebElement> rhsPromotedContentArticle;

	/*Promoted Content Articles present in Entertainment Page */
	@FindBy(xpath ="//div[@id='outbrain_widget_0']//div[@class='ob-widget-items-container']/div//section/span[1]")
	private List<WebElement> promotedContentArticleEntertainmentPage;

	/*RHS Promoted Content Articles List is present inside Cricket Page*/
	@FindBy(xpath ="//div[@class='ob-widget-section ob-first']//ul/li//span[2]")
	private List<WebElement> rhsPromotedcontentArticles;

	/*All Astro Sign is present inside the HomePage Horoscope Section*/
	@FindBy(xpath ="//span[text()='Horoscope' or text()='HOROSCOPE']/../../following-sibling::div//div/div/a")
	private List<WebElement> astroSigns;

	/*Horoscope Tabs Links(Weekly,Daily,Monthly,Yearly )is present Below Horoscope*/
	@FindBy(xpath ="//div[@class='rashifal-horoscope-tabs-left']//a")
	private List<WebElement> tabsLnk;

	/*Social Link is present in Footer Section */                                                   
	@FindBy(xpath ="//div[@class='social_icon']//div[@class='social_net']//a")
	private List<WebElement> socialLnk;

	/*App Links is present in Footer Section after Social Link */
	@FindBy(xpath ="//div[@class='social_icon']//div[@class='social_net']//a")
	private List<WebElement> appLnk;

	/*News-18 Links is present in Footer Section Before Social Link*/
	@FindBy(xpath ="//section[@class='bottom_footer']//div[contains(@class,'link_table')]/a")
	private List<WebElement> nw18Lnk;

	/*Network 18 Group Sites All Links are present in Footer Section*/
	@FindBy(xpath ="//span[contains(.,'Network18 Group Sites')]/following-sibling::div//a")
	private List<WebElement> network18GroupSitesLnk;

	/*Language Sites All Links are present in Footer Section*/
	@FindBy(xpath ="//span[contains(.,'LANGUAGE SITES')]/following-sibling::div//a")
	private List<WebElement> languageSitesLnk;

	/*Language Sites All Links are present in Footer Section*/
	@FindBy(xpath ="//span[contains(.,'POPULAR CATEGORIES')]/following-sibling::div//a")
	private List<WebElement> popularCategoriesLnk;

	/*Hot On Social All Links are present in Footer Section*/
	@FindBy(xpath ="//span[contains(.,'HOT ON SOCIAL')]/following-sibling::div//a")
	private List<WebElement>  hotOnSocialLnk;

	/*Trending Topics All Links are present in Footer Section*/
	@FindBy(xpath ="//span[contains(.,'TRENDING')]/following-sibling::div//a")
	private List<WebElement> trendingTopicsLnk;

	/*Article Links present in video wall Section*/
	@FindBy(xpath ="//div[@class='from-show']//ul/li")
	private List<WebElement> articlesLnk;

	/*Article Links present in From Our Shows(Video Wall)*/
	@FindBy(xpath ="//div[@class='from-show']//div[@class='show-name']/a")
	private List<WebElement> showsLnk ;

	/*Article Links present in Podcast Section */
	@FindBy(xpath ="//span[text()='Podcast']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]/a")
	private List<WebElement> podcastTitleLnk ;

	/*Total count of Podcast Articles present in the Podcast Section*/ 
	@FindBy(xpath ="//span[text()='Podcast']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]")
	private List<WebElement> podcastArticlesCount;

	/*Podcast Articles Link are placed inside the Podcast Section after Click Right Arrow Btn*/
	@FindBy(xpath ="//span[text()='Podcast']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[not(@class='slick-slide slick-cloned')]")
	private List<WebElement> totalPodcastArticlesLnk;

	/*Videos Articles Link are present in Videos Section*/
	@FindBy(xpath ="//span[text()='Videos']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]/a")
	private List<WebElement> videosArticlesLnk;

	/*Videos Article List present in the Videos Section*/ 
	@FindBy(xpath ="//span[text()='Videos']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]")
	private List<WebElement> videosArticlesList;

	/*Hot And Trending Links is present inside Hot And Trending Section*/
	@FindBy(xpath ="//ul[@class='hot-trending']/li")
	private List<WebElement> hotAndTrendingLnk;

	/*Photogalleries Articles Link  Without using Left and Right Arrow Button is present inside Photogalleries Section*/
	@FindBy(xpath ="//a[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]//h4/a")
	private List<WebElement> photogalleriesTitleTxt;

	/*Photogalleries Articles Count Without using Left Right Arrow Button is present inside Photogalleries Section*/
	@FindBy(xpath ="//a[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]")
	private List<WebElement> photogalleriesAllArticlesCount;

	/*Total Photogalleries Articles Link  With using Left and Right Arrow Button is present inside Photogalleries Section*/
	@FindBy(xpath ="//a[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[not(@class='slick-slide slick-cloned')]")
	private List<WebElement> totalPhotoGalleriesArticlesLnk;

	/*Total Video Link is present inside Videos Section*/
	@FindBy(xpath ="//span[text()='Videos']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[not(@class='slick-slide slick-cloned')]")
	private List<WebElement> totalVideosLnk;

	/*Total Home Top Story List image is present below the L2 Tag Menu*/
	@FindBy(xpath ="//div[@class='lead-story']//img")
	private List<WebElement> homeTopStoryLstImg;

	/*Home Top Story link is present below the L2 Menu in LHS*/
	@FindBy(xpath ="//div[@class='lead-story']//li")
	private List<WebElement> homePageTopNewsLnk ;

	/*Top News List Link  is present below the L2 Tag  Menu in RHS*/
	@FindBy(xpath ="//ul[@class='lead-mstory']/li/a")
	private List<WebElement> topNewsLstLnk;

	/*L2 Section Link  is present below the Top Main Menu*/
	@FindBy(xpath ="//ul[@class='fleft clearfix']/li/a")
	private List<WebElement> l2SectionLnk;

	/*Promoted Content image is present inside Promoted Content*/
	@FindBy(xpath ="//div[@class='ob-widget-items-container']//span[@class='ob-unit ob-rec-image-container']/img")
	private List<WebElement> promotedContentImg;

	/*Odia Language Top news List Link is present below the l2 Tag  Menu*/
	@FindBy(xpath ="//div[contains(@class,'topnews')]//li")
	private List<WebElement> odiaLangTopNewsListLnk;

	/*Hindi Language Top News List Link is present below the l2 Tag  Menu*/
	@FindBy(xpath ="//*[contains(@class,'topnews')]//li/a[ not (contains(@href,'livetv'))]")
	private List<WebElement> hindiTopArticlenewsLnk;

	/*Hindi Blog  News List Link is present below the l2 Tag  Menu*/
	@FindBy(xpath ="//*[contains(@class,'topnews')]//li/a[contains(@href,'live-update') and not(contains(@href,'livetv'))]")
	private List<WebElement> hindiBlogLnk;

	/*Fb Icon above the Top Menu Bar*/
	@FindBy(xpath ="//div[@class='nhsocial']//a[contains(@href,'https://www.facebook.com')]")
	private WebElement fbIconTop;

	/*Twitter Icon above the Top Menu Bar*/
	@FindBy(xpath ="//div[@class='nhsocial']//a[contains(@href,'//twitter.com')]")
	private WebElement twitterIconTop;

	/*Instagram Icon above the Top Menu Bar*/
	@FindBy(xpath="//div[@class='nhsocial']//a[contains(@href,'//www.instagram.com')]")
	private WebElement instaIconTop;

	/*You Tube Icon above the Top Menu Bar*/
	@FindBy(xpath ="//div[@class='nhsocial']//a[contains(@href,'//www.youtube.com')]")
	private WebElement youTubeIconTop;

	/*Telegram Icon above the Top Menu Bar*/
	@FindBy(xpath ="//div[@class='nhsocial']//a[contains(@href,'t.me')]")
	private WebElement telegramTop;

	/*Follow us on above the Top Menu Bar*/
	@FindBy(xpath ="//div[@class='nhsocial']/strong[text()='Follow Us On']")
	private WebElement followUsTop;

	/*Language Text Box above the Top Menu Bar*/
	@FindBy(xpath ="//div[@class='linner']/a")
	private WebElement languageTxtBx;

	/*English Language Link present RHS of Change Language*/
	@FindBy(xpath ="//div[contains(@class,'language')]//a[text()='English ']")
	private WebElement englishLanguageLnk;

	/*Download News-18 App Link is present on the Top before the Follow us on link*/
	@FindBy(xpath ="//div[@class='lnlapp']/a")
	private WebElement downloadNews18AppLnk;

	/*Apple IOS Image Icon is present in the Footer Section*/
	@FindBy(xpath ="//i[@class='apple']/..")
	private WebElement appleIosImgIcon;

	/*Home Link is present in the Top Main Menu Bar*/
	@FindBy(xpath ="//ul[@class='fleft nav-box' or contains(@class,'topnav')]//a[text()='Home']")
	private WebElement homeLnk;

	/*Hamburger Menu Link is present in the Top Main Menu*/
	@FindBy(xpath ="//ul[@class='subnav fright menu_tab']//a")
	private WebElement hamburgerMenuLnk;

	/*Third Top Story Article Link present below the l2 Main Menu at RHS*/
	@FindBy(xpath ="//ul[@class='lead-mstory']/li[4]/a")
	private WebElement thirdTopStoryTitleLnkRhs;

	/*Left Arrow News Minis Btn present inside News Minis*/
	@FindBy(xpath ="//button[contains(@class,'slick-prev')][1]")
	private WebElement leftArrowNewsMiniBtn;

	/*Right Arrow News Minis Btn present inside News Minis*/
	@FindBy(xpath ="//button[contains(@class,'slick-next')][1]")
	private WebElement rightArrowNewsMiniBtn;

	/*Live Tv on Footer*/
	@FindBy(xpath ="//footer//span[text()='LIVE TV']//..//a")
	private WebElement liveTVFooter;

	/*Live Tv on Top after Change Language*/
	@FindBy(xpath ="//a[@href='/livetv/']")
	private WebElement liveTvTop;

	/*Auto suggestion in search box*/
	@FindBy(xpath ="//table[contains(@class,'gsc-completion-container')]/tbody/tr//span")
	private WebElement autosuggestionSearchBx;

	/*Clear search box present in Top Main Menu Bar*/
	@FindBy(xpath ="//a[@title='Clear search box']")
	private WebElement clearSearchBx;

	/*Search Btn present in Top Main Menu Bar*/
	@FindBy(xpath ="//button[contains(@class,'gsc-search-button')]")
	private WebElement searchBtn;

	/*Search Txt present in Top Main Menu Bar*/
	@FindBy(xpath ="//input[@title='search']")
	private WebElement searchTxt;

	/*Search Icon present in Top Main Menu Bar */
	@FindBy(xpath ="//div[@class='outerone clearfix']//a[contains(@class,'search-icon')]")
	private WebElement searchIcon;

	/*Hamburger Close Menu Btn present in Top Main Menu Bar*/
	@FindBy(xpath ="//ul[@class='subnav fright menu_tab']//em")
	private WebElement closeMenuBtn;

	/*Home Btn present in Hamburger Menu*/
	@FindBy(xpath ="//div[@class='sub-nav clearfix']//li/a[text()='Home']")
	private WebElement hamburgerMenuHome;

	/*Playing Video Btn is present in livetv,video*/
	@FindBy(xpath ="//button[contains(@class,'vjs-play-control') and @title='Play']")
	private WebElement playingVideoBtn; 

	/*Pause video btn is present in livetv,video*/
	@FindBy(xpath ="//button[contains(@class,'vjs-play-control') and @title='Pause']")
	private WebElement pauseVideoBtn;

	/*Trending Topic Txt present in above L1 Menu Bar*/
	@FindBy(xpath ="//div[@class='nhtranding']/a")
	private WebElement trendingTopicsTxt;

	/*Twitter Login btn present in Twitter page in Footer Section*/
	@FindBy(xpath ="//a[@data-testid='login']")
	private WebElement twitterLoginBtn;

	/*Follow Btn present in News-18 Story*/
	@FindBy(xpath ="//span[text()='Follow']")
	private WebElement followBtn;

	/*Promoted Content is present above the Footer Section */
	@FindBy(xpath ="//span[text()='PROMOTED CONTENT']")
	private WebElement promotedContentTxt;

	//Rhs Promoted Content  is present below the Photogallery Section*/
	@FindBy(xpath ="//div[text()='PROMOTED CONTENT']")
	private WebElement promotedContentTxtRhs; 

	/*Today Panchang is present above the Rhs Promoted Content */
	@FindBy(xpath ="//div[@class='today_panchang']")
	private WebElement todayPanchangTxt;

	/*Panchang Info is present inside Today Panchang */
	@FindBy(xpath ="//div[@class='panchan_info']")
	private WebElement panchangInfoTxt;

	/*Horoscope Txt is present below the Video Wall */
	@FindBy(xpath ="//span[text()='Horoscope' or text()='HOROSCOPE']")
	private WebElement horoscopeTxt;

	/*Right Arrow Btn is present inside Horoscope */
	@FindBy(xpath ="//div[contains(@class,'rashifal-horoscope vspacer')]//button[contains(@class,'slick-next slick-arrow')]")
	private WebElement rightArrowBtn;

	/*Astro Read More Lnk is present in the Horoscope */
	@FindBy(xpath ="//div[@class='rashifal-horoscope-tabs-right']//a[@id='astromoreWithSign']")
	private WebElement astroReadMoreLnk;

	/*Popular Categories Footer Section present in Footer after Hot On Social*/
	@FindBy(xpath ="//div[@id='footer_ajax_div']//*[@class='link_table']")
	private WebElement popularCategoriesFooterSection;

	/*Cnn Live Tv is present in Footer Section */
	@FindBy(xpath ="//a[text()='CNN News18']")
	private WebElement cnnLiveTv;

	/*Thumbnail Top Article Img is present in the below the L2 Menu Bar*/
	@FindBy(xpath ="//div[@class='lead-story']/figure//img")
	private WebElement thumbnailTopArticleImg;

	/*From Our Shows Txt is present in Video Wall*/
	@FindBy(xpath ="//div[@class='from-show']//h2")
	private WebElement fromOurShowsTxt;

	/*Active Video Wall Txt Is present inside video Wall in LHS */
	@FindBy(xpath ="//span[text()='Video Wall']/../following-sibling::div//li[@class='slick-slide slick-current slick-active']//h2")
	private WebElement activeVideoWallTxt;

	/*Active Video Wall Img Is present inside Video Wall in LHS */
	@FindBy(xpath ="//span[text()='Video Wall']/../following-sibling::div//li[@class='slick-slide slick-current slick-active']//img")
	private WebElement activeVideoWallImg;

	/*Podcast Article Section Text is present in Home Page*/
	@FindBy(xpath ="//div[@id='podcast_div']//h2//span[text()='Podcast']")
	private WebElement podcastTxt;

	/*Podcast Left Arrow Btn Is Placed inside Podcast Section*/
	@FindBy(xpath ="//a[@class='left-arrow podcastLeft act slick-arrow']")
	private WebElement podcastLeftArrowBtn;

	/*Podcast Right Arrow Btn Is Placed Inside Podcast Section*/
	@FindBy(xpath ="//a[@class='right-arrow podcastRight act slick-arrow']")
	private WebElement podcastRightArrowBtn;

	/*Video Article Section Text is Present in Home Page*/
	@FindBy(xpath ="//h2//span[text()='Videos']")
	private WebElement videoTxt;

	/*Right Arrow Btn is present inside Videos */
	@FindBy(xpath ="//a[@class='right-arrow ividright act slick-arrow']")
	private WebElement videosRightArrow;

	/*Left Arrow Btn is present inside videos */
	@FindBy(xpath ="//a[@class='left-arrow ividleft act slick-arrow']")
	private WebElement videosLeftArrow;

	/*Hot And Trending Txt is Present in the Home Page*/
	@FindBy(xpath ="//h2/span[text()='Hot & Trending']")
	private WebElement hotAndTrendingTxt;;

	/*Photogalleries Txt is Present in the Header of Photogalleries Section*/
	@FindBy(xpath ="//h2//a[text()='Photogalleries']")
	private WebElement photogalleriesTxt;

	/*RightArrow Btn is Present in the Heading of PhotoGalleries Section*/
	@FindBy(xpath ="//a[@class='right-arrow galright act slick-arrow']")
	private WebElement photoGalleriesRightArrowBtn;

	/*Left Arrow Btn is Present in the Header of PhotoGalleries Section*/
	@FindBy(xpath ="//a[@class='left-arrow galleft act slick-arrow']")
	private WebElement photoGalleriesLeftArrowBtn;

	/*Hot And Trending First Article Link is present in the Hot & Trending Section*/
	@FindBy(xpath ="//ul[@class='hot-trending']/li[1]//div")
	private WebElement hotAndTrendingFirstArticleLnk;

	/*Home Link is present in the Top Main Menu Bar*/
	@FindBy(xpath ="//ul[@class='fleft nav-box']/li/a[text()='Home']")
	private WebElement homLnk;

	/*Tracker Link is present in the Top Main Menu Bar*/
	@FindBy(xpath ="//ul[@class='fleft nav-box']/li[@class='entrypoint-covid']/a")
	private WebElement trackerLnk;

	/*Updated Date Link  is present in the Covid-19 Tracker box*/
	@FindBy(xpath ="//div[@class='corona-m-ftr']/div[@class='corona-m-box']/span[@id='UpdatedStateTimeStamp']")
	private WebElement updatedDateLnk;

	/*Outbrain Text  is present in the above the Footer and Rhs of Promoted Content*/
	@FindBy(xpath ="//div[contains(@class,'ob_what ob_what_resp')]//span[@class='ob_logo']")
	private WebElement outbrainTxt;

	/*First Rhs Top Article Link present in the Lifestyle,Movies,Business,Education-Career,Explainers page in L2 Menu Bar*/
	@FindBy(xpath ="//div[contains(@class,'top_story_right')]/ul/li[1]/a")
	private WebElement firstArticleLnk;

	/*First Rhs Top Article Link present in the Cricket Next Page*/
	@FindBy(xpath ="(//ul[contains(@class,'cn-liststory')]/li//a)[1]")
	private WebElement cricketFirstArticlelnk;

	/*Fb UserName Text Bx is present inside Fb Page*/
	@FindBy(xpath =("//input[@id='email']"))
	private WebElement fbUserNameTxtBx;

	/*Fb Password Text Bx is present inside Fb Page*/
	@FindBy(xpath ="//input[@id='pass']")
	private WebElement fbPwdTxtBx;

	/*Fb Login Btn is present inside Fb Page*/
	@FindBy(xpath ="//label[@id='loginbutton']")
	private WebElement fbLoginBtn;

	/*Twitter Follow Btn is present inside Twitter Page*/
	@FindBy(xpath ="//label[@id='loginbutton']")
	private WebElement twitterFollowBtn;

	/*Twitter Username Text is present inside Twitter Page*/
	@FindBy(xpath ="//span[text()='Phone, email, or username']']")
	private WebElement twitterUsernameTxt;

	/*Twitter Pwd Text is present inside Twitter Page*/
	@FindBy(name="password")
	private WebElement twitterPwdTxt;

	/*Twitter SignIN Btn is present inside Twitter Page*/
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement twitterSignInBtn;

	/*YouTube Subscibe Btn present inside Youtube Page*/
	@FindBy(xpath="(//div[@id='subscribe-button'])[1]")
	private WebElement youTubeSubsBtn;

	/*photo section Present in L1 navigation bar */
	@FindBy(xpath="//ul[@class='fleft nav-box']//a[text()='Photos']")
	private WebElement photoSectionL1;

	/*HomePage PhotoGallery Click on First Article   */
	@FindBy(xpath ="//a[text()='Photogalleries']//ancestor::h2/following-sibling::div[@class='pnv-gallery']//li[contains(@class,'slick-active')]//h4/a")
	private WebElement photoGalleryArticleLnk;

	/*Photogallery First Article Link is present Latest News On PhotoGallery in photo section*/
	@FindBy(xpath="//ul[contains(@class,'photoGalleryList')]//a[1]")
	private WebElement photogalleryArticleLnk;

	/*Trending Topics First Link is present in Footer of home page*/
	@FindBy(xpath="//span[contains(.,'TRENDING')]/following-sibling::div//a[1]")
	private WebElement trendingTopicsfirstLnk;

	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;

	/*VideoPlayer frame Mousehover */
	@FindBy(xpath="//video[@class='vjs-tech']")
	private WebElement videoPlayer;

	/*LiveTV VideoPlayer Playbutton */
	@FindBy(xpath="//button[contains(@class,'vjs-play-control')]")
	private WebElement plyBtn;

	/*Outbrain Block present at the Footer Portion*/
	@FindBy(xpath ="//div[@class='OUTBRAIN']")
	private WebElement outbrainBlock;

	/*Latest Section in line one navigation bar*/
	@FindBy(xpath="//div//ul//li//a[contains(text(),'Latest')]")
	private WebElement latestSectionLnk;

	/*YouTube Subscibe Btn present inside Youtube Page*/
	@FindBy(xpath="(//div[@class='corona-m-box'])[3]/child::span")
	private WebElement covidUpdatedTime;

	/*CricketNext link present after clicking on Hamburger menu*/
	@FindBy(xpath ="//li//a[text()='CricketNext']")
	private WebElement cricketNextLnk;

	/*See More link present in news18 minis section in home page*/
	@FindBy(xpath = "//div[contains(@class,'minis_top')]/a")
	private WebElement seeMoreLnk;


	/**
	 * This method used to launch the browser
	 * @param browser
	 */
	public void launchDesktopBrowser() {
		webDriverActions.launchWebBrowser(fileUtility.readDataFromPropertyFile("browser"),fileUtility.readDataFromPropertyFile("platformdesktop"));
	}

	/**
	 * This method used to launch the browser
	 * @param browser
	 */
	public void launchMobileBrowser() {
		webDriverActions.launchWebBrowser(fileUtility.readDataFromPropertyFile("browser"),fileUtility.readDataFromPropertyFile("platformmobile"));
	}

	/**
	 * This method used to launch the browser
	 * @param browser
	 */
	public void launchAMPBrowser() {
		webDriverActions.launchWebBrowser(fileUtility.readDataFromPropertyFile("browser"),fileUtility.readDataFromPropertyFile("platformmobile"));
	}


	/**
	 * This method used to navigate to NW18 Page
	 * @param url
	 */
	public void navigateToNews18HomePage(String url) {
		webDriverActions.navigateToUrl(url);
	}


	/**
	 * This method used to click on First PhotoGallery Article
	 */
	public void clickOnFirstArticleOfPhotoGallery() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollToLast();
			webDriverActions.click(photoGalleryArticleLnk);
			Logs.info(getClass(),"Clicked on photogallery article link");
		}catch (Exception e) {
			Logs.error(getClass(),"Photogallery first article link is not able to click");
		}
	}

	/**
	 * This method used to click on PhotoGallery Articles List
	 */
	public void clickOnPhotoGalleryArticle() {
		try {
			webDriverActions.click(photoGalleryArticleLnk);
			Logs.info(getClass(),"navigated to photogallery article");
		}catch (Exception e) {
			Logs.error(getClass(),"Photogallery article section link is not able to click");
		}
	}

	/**
	 * This method used to navigate to Latest Section Page
	 */
	public void latestSection() {
		try{
			webDriverActions.waitForPageToLoad();
			webDriverActions.click(latestSectionLnk);
			Logs.info(getClass(),"Clicked on latest section link");
		}catch (Exception e) {
			Logs.error(getClass(),"Latest section link is not found");
		}
	}

	/**
	 * This method is used validate Covid tracker Date
	 * @throws Exception
	 */
	public void clickOnTracker() {
		webDriverActions.click(trackerLnk);
		webDriverActions.waitForElementVisibility(covidUpdatedTime,GlobalVariables.sec60);
		String covidDate=webDriverActions.getTextFromElement(covidUpdatedTime);
		//below actual variable is to get string position from the article text
		String actual = genericUtility.getSubstring(9, 19,covidDate);
		String expected = genericUtility.getSystemDateTime();
		assrt.assertTrue(genericUtility.compareTwoStrings(actual,expected),"Failed to navigate "+actual);
	}	

	/**
	 * This method used to verify Live News Header
	 */
	public void verifyLiveNews() {
		webDriverActions.waitForElementVisibility(liveTvTop,GlobalVariables.sec60);
		webDriverActions.click(liveTvTop);
		webDriverActions.scrollDown();
		webDriverActions.switchToFrame("vidgyor_iframe");
		webDriverActions.click(videoPlayer);
		webDriverActions.waitForElementVisibility(plyBtn,GlobalVariables.sec60);
		assrt.assertTrue(webDriverActions.isElementDisplayed(plyBtn),"Failed to navigate "+playingVideoBtn);
	}

	/**
	 * This method used to validate Advertisement in home page
	 */
	public void verifyAds() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollDown();
		webDriverActions.waitForSecond(2000);
		webDriverActions.scrollToLast();
		webDriverActions.waitForAllElementsVisible(ads, GlobalVariables.sec60);
		for(int i=0;i<ads.size();i++) {
			webDriverActions.waitForElementVisibility(ads.get(i),GlobalVariables.sec60);
			webDriverActions.mouseHover(ads.get(i));    //Mousehover to advertisement
			webDriverActions.highlightElement(ads.get(i));  //Highlighting the advertisement
			assrt.assertTrue(webDriverActions.isElementDisplayed(ads.get(i)),"Failed to display"+ads.get(i));
		}
		Logs.info(getClass(), "advertisement present in page"+ads.size());
		assrt.assertAll();
	}


	/**
	 * This method used to get page responses for given url
	 */
	public void verifyPagesResponse() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.waitForElementVisibility(homLnk,GlobalVariables.sec60);
		webDriverActions.click(homeLnk);
		webDriverActions.waitForAllElementsVisible(topNewsLstLnk,GlobalVariables.sec60);
		for(int i=0;i<=topNewsLstLnk.size()-1;i++) {
			webDriverActions.waitForElementVisibility(topNewsLstLnk.get(i),GlobalVariables.sec60);
			webDriverActions.click(topNewsLstLnk.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(firstTopStoryArticleTxt),"Failed to display "+firstTopStoryArticleTxt);
			webDriverActions.navigateBack();
		}
	}

	/**
	 * This method used to verify Outbrain header
	 */
	public void outbrainHeader() 
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.mouseHover(outbrainTxt);
		assrt.assertTrue(webDriverActions.isElementDisplayed(outbrainTxt),"Failed to display "+outbrainTxt);
	}


	/**
	 * This method is used to Click on Trending Topics Section
	 */
	public void clickOnTrendingTopics() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.clickJS(trendingTopicsfirstLnk);
		String parentTitle = trendingTopicsfirstLnk.getAttribute("title");
		webDriverActions.waitForPageToLoad();
		webDriverActions.switchToWindow(parentTitle);
	}


	/**
	 * This method is used to click on first Article of PhotoGallery Section
	 */
	public void clickOnPhotoGalleriesFirstArticle() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.waitForAllElementsVisible(photogalleriesTitleTxt,GlobalVariables.sec60);
		webDriverActions.click(photogalleriesTitleTxt.get(3));
	}

	/**
	 * This method is used to click on CricketNext link present on Hamburger Menu
	 */
	public void clickOnCricketNextLnk()
	{
		webDriverActions.waitForPageToLoad();
		webDriverActions.clickJS(hamburgerMenuLnk);
		webDriverActions.click(cricketNextLnk);	
	}

	/**
	 * This method is used to click on seemore link in News18Minis section
	 */
	public void clickOnSeeMoreLinkInNews18Minis() {
		try {
			webDriverActions.waitForPageToLoad();
			webDriverActions.scrollDown();
			webDriverActions.click(seeMoreLnk);
			Logs.info(getClass(),"Navigated to nw18 Minis page");
		}catch (Exception e) {
			Logs.error(getClass(),"Not able to click on Seemore link");
		}
	}

	/**
	 * This method is used to click on First Article of English Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		webDriverActions.click(homePageArticleLnks.get(0));
	}


	/**
	 * This method is used to click on Videos Section present at Hamburger Menu of news 18 English Home Page 
	 */
	public void navigateToFirstVideosArticle() {
		webDriverActions.click(hamburgerMenuLnk);
		webDriverActions.click(videosSectionLnk);
		webDriverActions.click(VideosArticleLnks.get(0));
	}


	/**
	 * This method is used to click on LiveBlog Article of English Home Page 
	 */
	public void clickOnFirstLiveBlogArticleHomePage() {
		webDriverActions.click(homePageLiveBlogArticleLnks.get(0));
	}

	/**
	 * This method is used to Click on First topic link of Trending Topics Section present At the Footer Of HomePage
	 */
	public void clickOnFirstTopicLnkTrendingTopics() {
		webDriverActions.waitForPageToLoad();
		webDriverActions.scrollToLast();
		webDriverActions.click(trendingTopicsfirstLnk);
		webDriverActions.switchToNewWindow();
	}

	/**
	 * This method used to click on photos section
	 */
	public void clickOnPhotosSection()
	{
		webDriverActions.clickJS(photoSectionLineOneLnk);

	}

}






