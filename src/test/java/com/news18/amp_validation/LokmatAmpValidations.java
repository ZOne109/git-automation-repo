package com.news18.amp_validation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.news18.init.DesktopCommonConfig;

/**
 * @author SanjeebKumarPati
 *This Class contains scripts for lokmat Amp Validation
 */
public class LokmatAmpValidations extends  DesktopCommonConfig {


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
	public void navigateToLokmatHomePageURL() {
		navigateToUrl(fileUtility.readDataFromPropertyFile("lokmatUrl"));
	}


	/**
	 * This method is used to validate AMP urls on News18 lokmat Home Page 
	 */
	@Test
	public void lokmatHomePage() {
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}

	/**
	 * This method is used to validate First Article AMP urls on News18 Lokmat Home Page 
	 */
	@Test
	public void firstArticleHomePageAMPValidation() {
		pages.lokmatDesktopLandingPage.clickOnFirstArticleHomePage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Article AMP url on News18 English cricketNext Page 
	 */
	@Test
	public void firstArticleSportsAMPValidation() {
		pages.lokmatDesktopLandingPage.clickOnSportsLnk();
		pages.lokmatAMPSportsPage.clickOnFirstArticleSportsPage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Article AMP url on News18 lokmat Entertainment Page 
	 */
	@Test
	public void firstArticleEntertainmentAMPValidation() {
		pages.lokmatDesktopLandingPage.clickOnEntertainmentLnk();
		pages.lokmatAMPEntertainmentPage.clickOnFirstArticleEntertainmentPage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate AMP url on News18 Lokmat Photos Page 
	 */
	@Test
	public void firstArticlePhotoGalleryAMPValidation() {
		pages.lokmatDesktopLandingPage.clickOnPhotosSection();
		pages.lokmatDesktopPhotogalleryConsumptionPage.clickPhotogalleryFirstArticle();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}

	/**
	 * This method is used to validate First ArticleAMP url on News18 Hindi Videos Page 
	 */
	@Test
	public void firstVideosArticleAMPValidation() {
		pages.lokmatDesktopLandingPage.navigateToVideosSection();
		pages.lokmatAMPVideosPage.clickOnFirstVideoArticle();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate First Live Blog AMP url on News18 HIndi Homepage 
	 */
	@Test
	public void firstLiveBlogAMPValidationHomePage() {
		pages.lokmatDesktopLandingPage.clickOnLiveBlogArticleHomePage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}


	/**
	 * This method is used to validate Live Blog AMP url on News18 English CricketNext Page 
	 */
	@Test
	public void firstLiveBlogAMPValidationCricketNextPage() {
		pages.lokmatDesktopLandingPage.clickOnSportsLnk();
		pages.lokmatAMPSportsPage.clickOnFirstLiveBlogArticleSportsPage();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}

	/**
	 * This method is used to validate First Article AMP url on News18 Hindi Home Page 
	 */
	@Test
	public void firstArticleAMPValidationTrendingTopics() {
		pages.lokmatDesktopLandingPage.clickOnFirstTopicLnkTrendingTopics();
		pages.ampValidatorPage.verifyAMPvalidationsstatus(getCurrentPageUrl());
	}
}
