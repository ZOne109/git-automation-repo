package com.news18.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * This class contains all the elements for Nw18 Competitors
 * @author VipinKumarGawande
 */
public class CompetitionPage {

	public WebDriver driver;

	public CompetitionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ---------------------------  Articles Links ------------------------------------------------

	/*Tamil First Article First Link (https://tamil.news18.com/) */
	@FindBy(xpath = "(//div[contains(@class,'topnews-right')]//li/a)[1]")
	private WebElement News18TamilFirstArticleLnk;

	/*Tamil First Article First Link(https://tamil.samayam.com/) */
	@FindBy(xpath ="(//div[contains(@class,'top_headlines')]/ul[@class='col6']//a)[1]")
	private WebElement samayamTamilFirstArticleLnk;

	/*Tamil First Article Link(https://www.vikatan.com/) */
	@FindBy(xpath ="(//div[contains(@class,'collection-stories-bundle')]/div/a)[3]")
	private WebElement vikatanTamilFirstArticleLnk;

	/*Tamil First Article Link (https://tamil.asianetnews.com/) */
	@FindBy(xpath ="//div[contains(@class,'post-content')]/h2")
	private WebElement asianetTamilFirstArticleLnk;

	/*Tamil First Article Link (https://www.dailythanthi.com/) */
	@FindBy(xpath ="//div[contains(@class,'NewsWithLargeHeadline')]/a")
	private WebElement dailythanthiTamilFirstArticleLnk;

	/* First  Article Link in Odia News18 (https://odia.news18.com/)*/
	@FindBy(xpath ="((//div[contains(@class,'topnews-left')]//a)[2]")
	private WebElement news18OdiaFirstArticleLnk;

	/* First  Article Link in  OTv (https://khabar.odishatv.in/) */
	@FindBy(xpath ="(//div[contains(@class,'category-news-item ')]//a)[1]")
	private WebElement oTvOdiaFirstArticleLnk;

	/* First  Article Link in  News7 (http://www.prameyanews7.com/) */
	@FindBy(xpath ="(//div[contains(@class,'sidebar-widget')]//ul//a)[1]")
	private WebElement news7OdiaFirstArticleLnk;

	/* First  Article Link in  News7 (https://kanaknews.com/) */
	@FindBy(xpath ="(//div[contains(@class,'item-inner')]//a)[1]")
	private WebElement kanakNewsOdiaFirstArticleLnk;

	/* First  Article Link in  Sambad News (https://sambad.in/) */
	@FindBy(xpath ="(//div[contains(@class,'wrapper')]//h2/a)[1]")
	private WebElement sambadOdiaFirstArticleLnk;

	/* First  Article Link in  Sambad News (https://argusnews.in/) */
	@FindBy(xpath ="(//div[contains(@id,'feed')]//a)[1]")
	private WebElement argusOdiaFirstArticleLnk;

	/* First  Article Link in  News7 (http://www.prameyanews7.com/category/odisha/)*/
	@FindBy(xpath ="(//div[contains(@class,'container')]//h2//a)[1]")
	private WebElement news7OdiaHomeFirstArticleLnk;

	/* First  Article Link in entertainment of News7 (http://www.prameyanews7.com/category/entertainment/)*/
	@FindBy(xpath ="(//div[contains(@class,'container')]//h2//a)[1]")
	private WebElement news7OdiaEntertainmentArticleLnk;

	/* First  Article Link in entertainment of News7 (https://kanaknews.com/category/entertainment/) */
	@FindBy(xpath ="(//div[contains(@class,'next_prev')]//h2//a)[1]")
	private WebElement kanakOdiaEntertainmentArticleLnk;

	/* Sandesh Gujarati HomePage First Article Link(https://sandesh.com/) */
	@FindBy(xpath = "(//div[contains(@class,'top-news')]//ul[contains(@class,'NSG-regular')]//li/a)[1]")
	private WebElement sandeshGujratiLnk ;

	/*news18 bengali first article Link (https://bengali.news18.com/) */
	@FindBy(xpath = "(//div[contains(@class,'topnews')]//ul[contains(@class,'top-kharein')]/li/a)[1]")
	private WebElement news18BengaliFirstArticleLink;

	/*anandabazar bengali first article Link (https://www.anandabazar.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'container mt-3')]//a)[1]")
	private WebElement anandabazarBengaliFirstArticleLink;

	/*abplive bengali first article Link (https://bengali.abplive.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'position-static')]/a)[1]")
	private WebElement abpliveBengaliFirstArticleLink;

	/*indianexpress bengali first article Link (https://bengali.indianexpress.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'ie-stories ts-2 is-style-default')]//a)[1]")
	private WebElement indianexpressBengaliFirstArticleLink;

	/*tv9bangla bengali  first article Link (https://tv9bangla.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'smallStorycol')]//h3/a)[1]")
	private WebElement tv9banglaBengaliFirstArticleLink;

	/*zeenews bengali first article Link (https://zeenews.india.com/bengali)*/
	@FindBy(xpath = "(//div[contains(@class,'lead-block')]//div/a)[1]")
	private WebElement zeenewsBengaliFirstArticleLink;

	/*bbcnews urdu  first article Link (https://www.bbc.com/urdu/)*/
	@FindBy(xpath = "(//div[contains(@class,'bbc-1dblbh1')]//h3/a)[1]")
	private WebElement bbcnewsUrduFirstArticleLink;

	/*siasatnews urdu  first article Link (https://urdu.siasat.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'top_posts')]//div/a)[1]")
	private WebElement siasatUrduFirstArticleLink;

	/*news18 urdu first article Link (https://urdu.news18.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'topnews')]//ul[contains(@class,'top-kharein')]/li/a)[1]")
	private WebElement news18UrduFirstArticleLink;

	/*siasatnews english first article Link (https://www.siasat.com/) */
	@FindBy(xpath = "(//div[contains(@class,'post-details')]//h2/a)[1]")
	private WebElement siasatEngFirstArticleLink;

	/*Tv9 Telegu First Article Link(https://tv9telugu.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'imgCont')]/a)[1] ")
	private WebElement tv9ArticleLnk;

	/*Eenadu Telgu First Article Link(https://www.eenadu.net/)*/
	@FindBy(xpath = "(//div[contains(@class,'col-left')]//li[contains(@class,'offset-rt1')]//aside/a)[1]")
	private WebElement eenaduArticleLnk;

	/*Andhrajyoti First Article Link(https://www.andhrajyothy.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'list arrow')]/a)[1]")
	private WebElement andhrajyotiarticleLnk;

	/*Sakshi First Article Link(https://www.sakshi.com/)*/
	@FindBy(xpath = "((//div[contains(@class,'dottedborder')])[1]//span//a)[1]")
	private WebElement sakshiArticleLnk;

	/*Samayam First Article News present in Home Page(https://telugu.samayam.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'top_headlines')]//li[contains(@class,'news-card horizontal')]//a)[1]")
	private WebElement telguSamayanArticleLnk;

	/*News18 Telegu First Article News Link Present in Home Page(https://telugu.news18.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'topnews-right')]//ul/li/a)[1]")
	private WebElement telguArticleLnk;

	/*NENOW First Article News Link(https://assam.nenow.in/)*/
	@FindBy(xpath = "(//div[contains(@class,'jeg_postblock_content')]/h3/a)[2]")
	private  WebElement  nenowArticleLnk;

	/*Niyomi First Article News Link(https://niyomiyabarta.com/home/)*/
	@FindBy(xpath = "(//div[contains(@class,'bs-pagination-wrapper') and @role='option']//h2/a)[1]")
	private  WebElement  niyomiArtcleLnk;

	/*Asomiyan Pratidin First Article News Link(https://www.asomiyapratidin.in/)*/
	@FindBy(xpath = "(//div[contains(@class,'has-post-thumbnail')]//a)[1]")
	private WebElement asomiyanPratidinArticleLnk;

	/* News18 Lokmat HomePage first Article Link(https://lokmat.news18.com/)  */
	@FindBy(xpath = "//div[contains(@class,'news-right')]//ul//li//a")
	private WebElement news18LokmatHomeArticleLnk;

	/* Loksatta Lokmat HomePage first Article Link(https://www.loksatta.com/)  */
	@FindBy(xpath = "(//div[contains(@class,'block-column')]//article[contains(@class,'tag-loksatta')]//h3//a)[1]")
	private WebElement loksattaLokmatHomeArticleLnk;

	/* MaharashtraTimes Lokmat HomePage first Article Link(https://maharashtratimes.com/)   */
	@FindBy(xpath = "(//div[contains(@class,'_headlines')]//ul//following::ul//li//span//following::span//a)[1]")
	private WebElement maharashtraTimesLokmatHomeArticleLnk;

	/*  Lokmat HomePage first Article Link(https://www.lokmat.com/)  */
	@FindBy(xpath = "(//section[contains(@class,'featured-caro')]//ul//li[contains(@rel,'2')]//a)[1]")
	private WebElement lokmatHomeArticleLnk;

	/* Abp News Lokmat HomePage first Article Link(https://marathi.abplive.com/)   */
	@FindBy(xpath = "(//div[contains(@class,'-column')]//a//p)[1]")
	private WebElement abpLokmatHomeArticleLnk;

	/* Tv9 Lokmat HomePage first Article Link(https://www.tv9marathi.com/)  */
	@FindBy(xpath = "(//div[contains(@class,'News')]//ul//li//h3//a)[1]")
	private WebElement tv9LokmatHomeArticleLnk;

	/* News18 Malayalam HomePage first Article Link(https://malayalam.news18.com/)  */
	@FindBy(xpath = "(//div[contains(@class,'news-right')]//ul[contains(@class,'kharein')]//li//a)[1]")
	private WebElement news18MalayalamHomeArticleLnk;

	/* Manorama Malayalam Online Home Page first Article Link(https://www.manoramaonline.com/)  */
	@FindBy(xpath = "(//div[contains(@class,'content')]//a//div//span)[1]")
	private WebElement malayalamManoramaOnlineHomeArticleLnk;

	/* AsianNetNews Malayalam HomePage first Article Link(https://www.asianetnews.com/)  */
	@FindBy(xpath = "(//div[contains(@class,'posts marg')]//ul//li//a//h3)[1]")
	private WebElement malayalamAsianNetHomeArticleLnk;

	/* ManoramaNews Malayalam HomePage first Article Link(https://www.manoramanews.com/) */
	@FindBy(xpath = "(//div[contains(@class,'stories')]//ul//li//figcaption[contains(@class,'bottomn')]//a//h3)[1]")
	private WebElement malayalamManoramaHomeArticleLnk;

	/* Indian Express Malayalam HomePage first Article Link(https://malayalam.indianexpress.com/)  */
	@FindBy(xpath = "(//div[contains(@class,'stories sh')]//div//h3//a)[1]")
	private WebElement malayalamIndianExpressHomeArticleLnk;

	/*News18 English first Article Link (https://www.news18.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'content')]/ul/li/a)[1]")
	private WebElement nw18EngArticleLnk;

	/*Indian Express English first Article Link (https://indianexpress.com/) */
	@FindBy(xpath = "(//div[contains(@class,'top-news')]//ul//a)[1]")
	private WebElement indianExpressEngArticleLnk;

	/* NDTV English first Article Link (https://www.ndtv.com/) */
	@FindBy(xpath = "(//div[contains(@class,'featured_cont')]/ul/li/div/a)[1]")
	private WebElement ndtvEngArticleLnk;

	/*Hindustan Times first Article Links (https://www.hindustantimes.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'listView')]/h3/a)[1]")
	private WebElement hindustanTimesEngArticleLnk;

	/*Times Of India First Article Link (https://timesofindia.indiatimes.com/) */
	@FindBy(xpath = "(//div[contains(@class,'grid_wrapper')]/div/figure/a)[1]")
	private WebElement timesOfIndiaEngArticleLnk;

	/* News18 Punjabi First Article Link (https://punjab.news18.com/) */
	@FindBy(xpath = "(//div[contains(@class,'topnews')]/ul[contains(@class,'top-kharein')]//a)[1]")
	private WebElement nw18PunjabiArticleLnk;

	/* Punjab Kesari Jagbani First Article Link (https://jagbani.punjabkesari.in/)*/
	@FindBy(xpath = "(//div[contains(@class,'tab-content')]//h3/a)[1]")
	private WebElement jagbaniPunjabiArticleLnk;

	/*ABP Live First Article Link (https://punjabi.abplive.com/) */
	@FindBy(xpath = "//div[contains(@class,'small margThree ')]/div/a")
	private WebElement abpPunjabiArticleLnk;

	/* liveHindustan First Article Link (https://www.livehindustan.com/) */
	@FindBy (xpath = "//div[contains(@class,'wdgt')]//h1//a")
	private WebElement liveHindustanTopArticleLnk;

	/* news18Hindi First Article Link  (https://hindi.news18.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'topnews-left')]//ul//li)[1]")
	private WebElement news18HindiTopArticleLnk;

	/* navbharatTimes First Article Link (https://hindi.news18.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'top_headlines')]//ul//li)[1]")
	private WebElement navbharatTimesTopArticleLnk;

	/* jagran First Article Link  (https://www.jagran.com/*)*/
	@FindBy (xpath = "(//div[contains(@class,'textMain')]//ul//li//a)[1]")
	private WebElement jagranTopArticleLnk;

	/* aajtak First Article Link (https://www.aajtak.in/)*/
	@FindBy (xpath = "//div[contains(@class,'left-body')]//a")
	private WebElement aajtakTopArticleLnk;

	/* tv9hindi First Article Link  (https://www.tv9hindi.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'topNews')]//h3/a)[1]")
	private WebElement tv9hindiTopArticleLnk;

	/* news18Kannada First Article Link  (https://kannada.news18.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'topnews-left')]//ul//li//a)[1]")
	private WebElement news18KannadaTopArticleLnk;

	/* asianetKannada First Article Link  (https://kannada.asianetnews.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'widget')]//h2)[1]")
	private WebElement asianetKannadaTopArticleLnk;

	/* vijayKarnataka First Article Link  (https://vijaykarnataka.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'top_headlines')]//span//a)[1]")
	private WebElement vijayKarnatakaTopArticleLnk;

	/* prajavani First Article Link  (https://www.prajavani.net/)*/
	@FindBy (xpath = "//div[contains(@class,'pj-top-story')]//h1//a")
	private WebElement prajavaniTopArticleLnk;

	/* kannadaPrabha First Article Link  (https://www.kannadaprabha.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'Home')]//h4//a)[1]")
	private WebElement kannadaPrabhaTopArticleLnk;

	/* tv9Kannada First Article Link  (https://tv9kannada.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'topNews')]//h3//a)[1]")
	private WebElement tv9KannadaTopArticleLnk;

	/* news18Gujarati First Article Link  (https://gujarati.news18.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'top')]//h2)[1]")
	private WebElement news18GujaratiTopArticleLnk;

	/* divyabhaskar First Article Link  (https://www.divyabhaskar.co.in/)*/
	@FindBy (xpath = "(//h3)[2]")
	private WebElement divyabhaskarTopArticleLnk;

	/* abpliveGujarati First Article Link  (https://gujarati.abplive.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'news_content')]//h2)[1]")
	private WebElement abpliveGujaratiTopArticleLnk;

	/* iamgujarat First Article Link  (https://www.iamgujarat.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'top_headlines')]//span[contains(@class,'con_wrap')]//a)[1]")
	private WebElement iamgujaratTopArticleLnk;

	/* tv9Gujarati First Article Link  (https://tv9gujarati.com/)*/
	@FindBy (xpath = "(//div[contains(@class,'topNews')]//h3//a)[1]")
	private WebElement tv9GujaratiTopArticleLnk;



	// ---------------------------  Photo Galleries Links ------------------------------------------ 

	/*Telugu PhotoArticle First Link (https://tv9telugu.com/photo-gallery) */
	@FindBy(xpath = "(//div[contains(@class,'ComListing')]//li/h3)[1]")
	private WebElement tv9TeluguPhotoArticleLnk;

	/* First Photo Article Link in news18 Tamil (https://tamil.news18.com/photogallery)*/
	@FindBy(xpath ="(//div[contains(@class,'swiper-entertainment')]//h5/a)[1]")
	private WebElement news18TamilFirstPhotoArticleLnk;

	/* First Photo Article Link in samayam Tamil (https://tamil.samayam.com/photogallery/photolist/47344662.cms)*/
	@FindBy(xpath ="(//div[contains(@class,'highlight_section')]//a)[1]")
	private WebElement samayamTamilFirstPhotoArticleLnk;

	/* First Photo Article Link in Tamil vikatan (https://www.vikatan.com/news/album) */
	@FindBy(xpath ="(//div[contains(@class,'styles-m__story-card')]/a//h3)[1]")
	private WebElement vikatanTamilFirstPhotoArticleLnk;

	/* First Photo Article Link in Tamil Asianet (https://tamil.asianetnews.com/gallery) */
	@FindBy(xpath ="(//div[contains(@class,'article-card')]//h4)[1]")
	private WebElement asianetTamilFirstPhotoArticleLnk;

	/* First Photo Article Link in Tamil Dailythanthi (https://www.dailythanthi.com/Cinema) */
	@FindBy(xpath ="(//div[contains(@class,'ListingNewsWithMEDImage')]/a)[1]")
	private WebElement dailythanthiTamilFirstPhotoArticleLnk;

	/* First photo Article Link in news18 (https://odia.news18.com/photogallery/) */
	@FindBy(xpath ="(//div[contains(@class,'leftwrap fleft')]//li//h5/a)[1]")
	private WebElement news18OdiaFirstPhotoArticleLnk;

	/* First photo Article Link in Otv (https://khabar.odishatv.in/photo-gallery)*/
	@FindBy(xpath ="((//div[contains(@class,'listing')]//div/a)[1]")
	private WebElement otvOdiaFirstPhotoArticleLnk;

	/* First photo Article Link in Sambad Odia  (https://sambad.in/)*/
	@FindBy(xpath ="(//div[contains(@class,'columns-5')]//h4/a)[1]")
	private WebElement sambadOdiaFirstPhotoArticleLnk;	

	/* First photo Article Link in Argue News Odia (https://argusnews.in/or/topics/entertainment) */
	@FindBy(xpath ="(//div[contains(@class,'sticky-content')]/a)[1]")
	private WebElement argueOdiaFirstPhotoArticleLnk;

	/*anandabazar bengali photos first article Link (https://www.anandabazar.com/photogallery)*/
	@FindBy(xpath = "(//div[contains(@class,'col-9')]/div/a)[1]")
	private WebElement anandabazarBengaliPhotoArticleLink;

	/*abplive bengali photos first article Link (https://bengali.abplive.com/photos)*/
	@FindBy(xpath = "(//div[contains(@class,'uk-width-1-3 uk-first-column')]//a)[1]")
	private WebElement abpliveBengaliPhotoArticleLink;

	/*indianexpress bengali Photos first article Link (https://bengali.indianexpress.com/photos/)*/
	@FindBy(xpath = "(//div[contains(@class,'is-style-card has-more-button')]//figure/a)[1]")
	private WebElement indianexpressBengaliPhotoArticleLink;

	/*tv9bangla bengali photos first article Link (https://tv9bangla.com/photo-gallery)*/
	@FindBy(xpath = "(//div[contains(@class,'col2 ComListing 1')]//h3/a)[1]")
	private WebElement tv9banglaBengaliPhotoArticleLink;

	/*zeenews bengali photos first article Link (https://zeenews.india.com/bengali/photos)*/
	@FindBy(xpath = "(//div[contains(@class,'pos-relative margin')]//a)[1]")
	private WebElement zeenewsBengaliPhotoArticleLink;

	/*news18 bengali photogallery first article Link (https://bengali.news18.com/photogallery/) */
	@FindBy(xpath = "(//div[contains(@class,'pht-tp')]//ul[@class='pht-tprgt fright']//h2/a)[1]")
	private WebElement news18BengaliPhotoArticleLink;

	/*Eenadu Telgu First photogallery Article Link(https://www.eenadu.net/photos)*/
	@FindBy(xpath = "(//div[contains(@class,'col-left')]//ul[contains(@class,'gallery-thumbs')]/li//a)[1]")
	private WebElement eenaduPhotogalleryLnk;

	/*Andhrajyoti First Photogallery Article Link present in Photogallery Page(https://www.andhrajyothy.com/pages/photogallery)*/
	@FindBy(xpath = "(//div[contains(@class,'bgb')]//aside[contains(@class,'photogal')]/a)[1]")
	private WebElement andhrajyotiPhotogalleryLnk;

	/*Sakshi First Photogallery Article Link present in Photos Section(https://www.sakshi.com/photos)*/
	@FindBy(xpath = "(//div[contains(@class,'field-content')]/a)[1]")
	private WebElement sakshiPhotoGalleryLnk;

	/*First PhotoGallery Article Link Present in Photogallery Page of News18 Telegu Language(https://telugu.news18.com/photogallery/)*/
	@FindBy(xpath = "(//div[contains(@class,'pht-tplft fleft')]//ul/li/a)[1]")
	private WebElement telguPhotoGalleryLnk;

	/*Samayan First Photogallery Article News present in Photogallery Page(https://telugu.samayam.com/photogallery/photolist/47735939.cms)*/
	@FindBy(xpath = "(//div[contains(@class,'hidden_layer')]//ul//span//a)[1]")
	private WebElement photogalleryArtcleLnk;

	/*First Photogallery link present in Photos Page of News18 Assamese Language(https://assam.news18.com/photogallery)*/
	@FindBy(xpath = "(//div[contains(@class,'pht-tp')]//li/a)[1]")
	private WebElement assamPhotogalleryLnk;

	/*News18 Assam First Article News Link(https://assam.news18.com/)*/
	@FindBy(xpath = "(//div[contains(@class,'topnews-right')]//ul/li/a)[1]")
	private WebElement assamArticleLnk;

	/*Time8 First Article News Link(https://www.time8.in/)*/
	@FindBy(xpath = "(//div[contains(@id,'SmallPostLoopHeading')])[1]//a")
	private WebElement times8ArticleLnk;	

	/* News18 Lokmat PhotoGallery first Article Link(https://lokmat.news18.com/photogallery/)   */
	@FindBy(xpath = "(//div[contains(@class,'pht')]//ul[contains(@class,'pht')]//li//h2//a)[1]")
	private WebElement news18LokmatPhotoArticleLnk;

	/* Loksatta Lokmat PhotoGallery first Article Link(https://www.loksatta.com/photo-gallery/)  */
	@FindBy(xpath = "(//div[contains(@class,'card ie-stories')]//span//following::a)[1]")
	private WebElement loksattaLokmatPhotoArticleLnk;

	/* MaharashtraTimes Lokmat PhotoGallery first Article Link(https://maharashtratimes.com/photogallery/photolist/49655657.cms)   */
	@FindBy(xpath = "(//div[contains(@class,'_img')]//ul//li//a)[1]")
	private WebElement maharashtraTimesPhotoArticleLnk;

	/* Lokmat PhotoGallery first Article Link(https://www.lokmat.com/photos/)  */
	@FindBy(xpath = "(//section[contains(@class,'photos')]//aside//figcaption//a)[1]")
	private WebElement LokmatPhotoArticleLnk;

	/* Abp Lokmat PhotoGallery first Article Link(https://marathi.abplive.com/photos)  */
	@FindBy(xpath = "(//div[contains(@class,'-column')]//a//p)[1]")
	private WebElement abpLokmatPhotoArticleLnk;

	/* Tv9 Lokmat PhotoGallery first Article Link(https://www.tv9marathi.com/photo-gallery)  */
	@FindBy(xpath = "(//div[contains(@class,'ComListing')]//ul//li//h3//a)[1]")
	private WebElement tv9LokmatPhotoArticleLnk;

	/* News18 Malayalam PhotoGalleryPage first article links(https://malayalam.news18.com/photogallery/)  */
	@FindBy(xpath = "(//div[contains(@class,'pht')]//ul[contains(@class,'pht-tprgt')]//li//h2//a)[1]")
	private WebElement news18MalayalamPhotoArticleLnk;

	/* AsianNetNews Malayalam PhotoGalleryPage first  Article Link(https://www.asianetnews.com/gallery)  */
	@FindBy(xpath = "(//div[contains(@class,'main-box')]//section//div//a//h4)[1]")
	private WebElement malayalamAsianNetPhotoArticleLnk;

	/* manoramaOnline Malayalam PhotoGalleryPage first Article Link(https://www.manoramaonline.com/photogallery.html) */
	@FindBy(xpath = "(//div[contains(@class,'gallery-thum')]//ul[contains(@class,'isola')]//li//img)[1]")
	private WebElement manoramaOnlinePhotoArticleLnk;

	/*News18 Photogallery First Article Link (https://www.news18.com/photogallery/) */
	@FindBy(xpath = "(//div//ul[contains(@class,'photoGalleryList')]//li//h3//a[contains(@href,'photonews')])[1]")
	private WebElement nw18EngPhotoArticleLnk;

	/*Indian Express Photogallery First Article Link (https://indianexpress.com/photos/) */
	@FindBy(xpath = "(//div[contains(@class,'more-section')]//li/a/img)[1]")
	private WebElement indianExpressEngPhotoArticleLnk;

	/*NDTV PhotoGallery First Article Link (https://www.ndtv.com/photos?pfrom) */
	@FindBy(xpath = "(//div[contains(@class,'swiper')]/div/h2/a)[1]")
	private WebElement ndtvEngPhotoArticleLnk; 

	/*India times PhotoGallery First Article Link (https://photogallery.indiatimes.com/) */ 
	@FindBy(xpath = "(//div[contains(@id,'topimageblk')]//p/a)[1]")
	private WebElement indiaTimesEngPhotoArticleLnk;

	/* Hindustan Times Photogallery First Article Link (https://www.hindustantimes.com/photos) */
	@FindBy(xpath = "(//section[contains(@id,'dataHolder')]//div[contains(@class,'listView')]/h3/a)[1]")
	private WebElement hindustanTimesPhotoArticleLnk;

	/*News18 Punjabi PhotoGallery First Article Link (https://punjab.news18.com/photogallery/) */
	@FindBy(xpath = "(//div[contains(@class,'entertainment')]//div/h5/a)[1]")
	private WebElement nw18PunjabiPhotoArticleLnk;

	/* Punjab Kesari Jagbani First Article Link (https://jagbani.punjabkesari.in/gallery) */
	@FindBy(xpath = "(//div[contains(@class,'gallry')]//li/a)[1]")
	private WebElement jagbaniPunjabiPhotoArticleLnk;

	/*ABP Live Punjabi PhotoGallery First Article Link (https://punjabi.abplive.com/photos) */
	@FindBy(xpath = "(//div[contains(@class,'stack')]//div[contains(@class,'first-column')]/a)[1]")
	private WebElement abpPunjabiPhototArticleLnk;

	/* news18Hindi First Photo Article Link  (https://hindi.news18.com/photogallery/)*/
	@FindBy (xpath = "(//div[contains(@class,'glide')]//h1//a)[1]")
	private WebElement news18HindiTopPhotoArticleLnk;

	/* liveHindustan First Photo Article Link  (https://www.livehindustan.com/photos/)*/
	@FindBy (xpath = "(//div//h3[contains(@class,'big-news-title')])[1]")
	private WebElement liveHindustanTopPhotoArticleLnk;

	/* navBharatTimes First Photo Article Link (https://navbharattimes.indiatimes.com/photomazza/photolist/2339144.cms)*/
	@FindBy (xpath = "(//div//span[contains(@class,'con_wrap')]//a[contains(@class,'table_row')])[1]")
	private WebElement navBharatTimesTopPhotoArticleLnk;

	/* jagran First Photo Article Link  (https://www.jagran.com/photogallery-hindi.html?itm_medium)*/
	@FindBy (xpath = "(//div[@class='h3']//a)[1]")
	private WebElement jagranHindiTopPhotoArticleLnk;

	/* aajtak First Photo Article Link  (https://www.aajtak.in/photos)*/
	@FindBy (xpath = "//div[contains(@class,'first-bg-video')]//a")
	private WebElement aajtakTopPhotoArticleLnk;

	/* tv9Hindi First Photo Article Link  (https://www.tv9hindi.com/photo-gallery)*/
	@FindBy (xpath = "(//div[contains(@class,'topNews')]//h3//a)[1]")
	private WebElement tv9HindiTopPhotoArticleLnk;

	/* news18Kannada First Photo Article Link  (https://kannada.news18.com/photogallery/)*/
	@FindBy (xpath = "(//div[@class='content']//ul//li/a)[1]")
	private WebElement news18KannadaTopPhotoArticleLnk;

	/* asianetKannada First Photo Article Link  (https://kannada.asianetnews.com/gallery)*/
	@FindBy (xpath = "//div[contains(@class,'category-txt-content')]//a")
	private WebElement asianetKannadaTopPhotoArticleLnk;

	/* vijayKarnataka First Photo Article Link  (https://vijaykarnataka.com/tech/photolist/70479074.cms)*/
	@FindBy (xpath = "(//div[contains(@class,'row')]//span//a)[1]")
	private WebElement vijayKarnatakaTopPhotoArticleLnk;

	/* prajavani First Entertainment Article Link  (https://www.prajavani.net/entertainment)*/
	@FindBy (xpath = "(//div[contains(@class,'pj-top-thump')]//a)[1]")
	private WebElement prajavaniTopEntertainmentArticleLnk;

	/* kannadaPrabha First Photo Article Link  (https://www.kannadaprabha.com/photogallery)*/
	@FindBy (xpath = "(//div[contains(@class,'allvideo')]//ul//li//a)[1]")
	private WebElement kannadaPrabhaTopPhotoArticleLnk;

	/* tv9Kannada First Photo Article Link  (https://tv9kannada.com/photo-gallery)*/
	@FindBy (xpath = "(//div[contains(@class,'topNews')]//h3//a)[1]")
	private WebElement tv9KannadaTopPhotoArticleLnk;


	// ---------------------------  Cricket Next Links ------------------------------------------

	/* News18 CricketNext First Article Link (https://www.news18.com/cricketnext/) */
	@FindBy(xpath = "(//div[contains(@class,'story-wrap')]/ul/li//a)[1]")
	private WebElement nw18CricketArticleLnk;

	/* Crickbuzz first Article Link (https://www.cricbuzz.com/cricket-news) */
	@FindBy(xpath = "(//div[contains(@class,'white')]//div/h2/a)[1]")
	private WebElement crickbuzzArticleLnk;

	/* ESPN Cricket first Article Link (https://www.espncricinfo.com/latest-cricket-news) */
	@FindBy(xpath = "(//div[contains(@class,'news-index')]//div[contains(@class,'news-info')]/a)[1]")
	private WebElement espnCricketArticleLnk;

	/*NDTV Cricket First Article Link (https://sports.ndtv.com/cricket) */
	@FindBy(xpath = "(//div[contains(@class,'row')]/div/ul/li//div/h3/a)[1]")
	private WebElement ndtvCricketArticleLnk;

}
