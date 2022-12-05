package com.news18.amp_validation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class HindiAMPValidations extends  DesktopCommonConfig {
	
	
	/**
	 * This Method is used for Navigate To Url
	 */
	@BeforeMethod
	public void navigateToHindiHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("hindiUrl"));
	}
	
	
	/**
	 * This method is used to validate AMP urls on News18 Hindi Home Page 
	 */
	@Test
	public void hindiHomePage() {
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}

	/**
	 * This method is used to validate First Article AMP urls on News18 Hindi Home Page 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.hindiDesktopLandingPage.clickOnFirstArticleHomePage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Article AMP url on News18 English cricketNext Page 
	 */
	@Test
	public void firstArticleCricketNextAMPValidation() {
		pages.hindiDesktopLandingPage.clickOnCricketNextLnk();
		pages.hindiAMPCricketNextPage.clickOnFirstArticleCricketNextPage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Article AMP url on News18 Hindi Section Page 
	 */
	@Test
	public void firstArticleSectionAMPValidation() {
		pages.hindiAMPSectionPage.clickOnFirstArticleEntertainmentPage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Article AMP url on News18 HIndi Photos Page 
	 */
	@Test
	public void firstArticlePhotosAMPValidation() {
		pages.hindiDesktopLandingPage.clickOnPhotoSection();
		pages.hindiDesktopPhotoGalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}

	/**
	 * This method is used to validate First ArticleAMP url on News18 Hindi Videos Page 
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.hindiDesktopLandingPage.navigateToVideosSection();
		pages.hindiAMPVideosPage.clickOnFirstVideoArticle();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Live Blog AMP url on News18 HIndi Homepage 
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.hindiDesktopLandingPage.clickOnLiveBlogArticleHomePage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate Live Blog AMP url on News18 English CricketNext Page 
	 */
	@Test
	public void firstLiveBlogAMPValidationCricketNextPage() {
		pages.hindiDesktopLandingPage.clickOnCricketNextLnk();
		pages.hindiAMPCricketNextPage.clickOnFirstLiveBlogArticleCricketNextPage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}

	/**
	 * This method is used to validate First Article AMP url on News18 Hindi Home Page 
	 */
	@Test
	public void firstArticleAMPValidationTrendingTopics() {
		pages.hindiDesktopLandingPage.clickOnFirstTopicLnkTrendingTopics();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
}
