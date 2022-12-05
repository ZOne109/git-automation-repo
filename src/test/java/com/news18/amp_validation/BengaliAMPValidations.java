package com.news18.amp_validation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;


/**
 * @author SanjeebKumarPati
 *This Class contains scripts for Hindi Amp Validation
 */
public class BengaliAMPValidations extends  DesktopCommonConfig{


	/**
	 * This Method is used for Browser Setup
	 */
	@BeforeTest
	public void browserSetup() {
		launchWebBrowser(chrome, desktop);
	}


	/**
	 * This Method is used for Navigate To Url
	 */
	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("bengaliUrl"));
	}
	
	
	/**
	 * This method is used to validate AMP urls on News18 Bengali Home Page 
	 */
	@Test
	public void bengaliHomePage() {
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Article AMP urls on News18 Hindi Home Page 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.bengaliDesktopLandingPage.clickOnFirstArticleHomePage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Article AMP url on News18 English cricketNext Page 
	 */
	@Test
	public void firstArticleCricketNextAMPValidation() {
		pages.bengaliDesktopLandingPage.clickOnCricketNextLnk();
		pages.bengaliAMPCricketNextPage.clickOnFirstArticleCricketNextPage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Article AMP url on News18 Hindi Section Page 
	 */
	@Test
	public void firstArticleEntertainmentAMPValidation() {
		pages.bengaliAMPEntertainmentPage.clickOnFirstArticleEntertainmentPage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Article AMP url on News18 HIndi Photos Page 
	 */
	@Test
	public void firstArticlePhotosAMPValidation() {
		pages.bengaliDesktopLandingPage.clickOnPhotoSection();
		pages.bengaliDesktopPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}

	/**
	 * This method is used to validate First ArticleAMP url on News18 Hindi Videos Page 
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.bengaliDesktopLandingPage.navigateToVideosSection();
		pages.bengaliAMPVideosPage.clickOnFirstVideoArticle();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Live Blog AMP url on News18 HIndi Homepage 
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.bengaliDesktopLandingPage.clickOnLiveBlogArticleHomePage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate Live Blog AMP url on News18 English CricketNext Page 
	 */
	@Test
	public void firstLiveBlogAMPValidationCricketNextPage() {
		pages.bengaliDesktopLandingPage.clickOnCricketNextLnk();
		pages.bengaliAMPCricketNextPage.clickOnFirstLiveBlogArticleCricketNextPage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}

	/**
	 * This method is used to validate First Article AMP url on News18 Hindi Home Page 
	 */
	@Test
	public void firstArticleAMPValidationTrendingTopics() {
		pages.bengaliDesktopLandingPage.clickOnFirstTopicLnkTrendingTopics();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
}