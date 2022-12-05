package com.news18.amp_validation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

/**
 * @author SanjeebKumarPati
 *This Class Contains Script to verify Amp for English Language
 */
public class EnglishAMPValidation extends  DesktopCommonConfig{
	
	/**
	 * This Method is used for Navigate To Url
	 */
	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("englishUrl"));
	}
	
	
	/**
	 * This method is used to validate AMP urls on News18 English Home Page 
	 */
	@Test
	public void englishHomePage() {
		String url = getCurrentPageUrl();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(url);//It will verify amp urls of home Page
	}
	
	/**
	 * This method is used to validate First Article AMP urls on News18 English Home Page 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.desktopLandingPage.clickOnFirstArticleHomePage();//It will click on First Article Of English Home Page
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
	
	
	/**
	 * This method is used to validate First Article AMP url on News18 English cricketNext Page 
	 */
	@Test
	public void firstArticleCricketNextAMPValidation() {
		pages.desktopLandingPage.clickOnCricketNextLnk();//It will click on Cricketnext link present on the hamburger Menu.
		pages.ampCricketNextPage.clickOnFirstArticleCricketNextPage();//It will click on First Article Of English CricketNext Page
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
	
	
	/**
	 * This method is used to validate First Article AMP url on News18 English India Page 
	 */
	@Test
	public void firstArticleIndiaAMPValidation() {
		pages.ampIndiaPage.clickOnFirstArticleIndiaPage();//It will click on First Article Of English india Page
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
	
	
	/**
	 * This method is used to validate First Article AMP url on News18 English Photos Page 
	 */
	@Test
	public void firstArticlePhotoGalleryAMPValidation() {
		pages.desktopLandingPage.clickOnPhotosSection();
		pages.desktopphotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();//It will click on First photo Article Of English photo gallery consumption Page
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
	
	
	/**
	 * This method is used to validate new First Article AMP url on News18 English Photos Page 
	 */
	@Test
	public void firstArticleNewPhotoGalleryAMPValidation() {
		pages.desktopLandingPage.clickOnPhotosSection();
		pages.desktopphotoGalleryConsumptionPage.navigateToPhotogalleryFirstArticle();//It will navigate to new photo gallery first article
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
	
	/**
	 * This method is used to validate First Video Article AMP url on News18 English Videos Page 
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.desktopLandingPage.navigateToFirstVideosArticle();//It will navigate to  first video article
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}

	
	/**
	 * This method is used to validate Live Blog AMP url on News18 English Homepage 
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.desktopLandingPage.clickOnFirstLiveBlogArticleHomePage();//It will navigate to  first live blog article
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
	
	
	/**
	 * This method is used to validate Live Blog AMP url on News18 English CricketNext Page 
	 */
	@Test
	public void liveBlogAMPValidationCricketNextPage() {
		pages.desktopLandingPage.clickOnCricketNextLnk();
		pages.ampCricketNextPage.clickOnLiveBlogArticleCricketNextPage();//It will navigate to  first live blog  article of cricket next page
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
	
	/**
	 * This method is used to validate First Article AMP url on News18 English Home Page 
	 */
	@Test
	public void firstArticleAMPValidationTrendingTopics() {
		pages.desktopLandingPage.clickOnFirstTopicLnkTrendingTopics();//It will navigate to  first trending topics article
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
}
