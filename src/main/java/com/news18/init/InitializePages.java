package com.news18.init;

import org.openqa.selenium.WebDriver;

import com.news18.bengalipages.BengaliAMPCricketNextPage;
import com.news18.bengalipages.BengaliAMPEntertainmentPage;
import com.news18.bengalipages.BengaliAMPVideosPage;
import com.news18.bengalipages.BengaliDesktopLandingPage;
import com.news18.bengalipages.BengaliDesktopPhotoGalleryConsumptionPage;
import com.news18.hindipages.HindiAMPCricketNextPage;
import com.news18.hindipages.HindiAMPSectionPage;
import com.news18.hindipages.HindiAMPVideosPage;
import com.news18.hindipages.HindiDesktopLandingPage;
import com.news18.hindipages.HindiDesktopPhotoGalleryConsumptionPage;
import com.news18.lokmatpages.LokmatAMPEntertainmentPage;
import com.news18.lokmatpages.LokmatAMPSportsPage;
import com.news18.lokmatpages.LokmatAMPVideosPage;
import com.news18.lokmatpages.LokmatDesktopLandingPage;
import com.news18.lokmatpages.LokmatDesktopPhotogalleryConsumptionPage;
import com.news18.pages.AMPCricketNextPage;
import com.news18.pages.AMPIndiaPage;
import com.news18.pages.AMPValidatorPage;
import com.news18.pages.DesktopLandingPage;
import com.news18.pages.DesktopPhotoGalleryConsumptionPage;




/**
 * @author Danish R
 * This class contains InitializePages for POM Pages
 */
public  class InitializePages {

	public AMPValidatorPage ampValidatorPage;
	public DesktopLandingPage desktopLandingPage;
	public AMPCricketNextPage ampCricketNextPage;
	public DesktopPhotoGalleryConsumptionPage desktopphotoGalleryConsumptionPage;
	public AMPIndiaPage ampIndiaPage;
	public HindiDesktopLandingPage hindiDesktopLandingPage;
	public HindiAMPCricketNextPage hindiAMPCricketNextPage;
	public HindiAMPSectionPage hindiAMPSectionPage;
	public HindiDesktopPhotoGalleryConsumptionPage hindiDesktopPhotoGalleryConsumptionPage;
	public HindiAMPVideosPage hindiAMPVideosPage;
	public BengaliDesktopLandingPage bengaliDesktopLandingPage;
	public BengaliAMPCricketNextPage bengaliAMPCricketNextPage;
	public BengaliAMPEntertainmentPage bengaliAMPEntertainmentPage;
	public BengaliDesktopPhotoGalleryConsumptionPage bengaliDesktopPhotoGalleryConsumptionPage;
	public BengaliAMPVideosPage bengaliAMPVideosPage;
	public LokmatDesktopLandingPage lokmatDesktopLandingPage;
	public LokmatAMPSportsPage lokmatAMPSportsPage;
	public LokmatAMPEntertainmentPage lokmatAMPEntertainmentPage;
	public LokmatDesktopPhotogalleryConsumptionPage lokmatDesktopPhotogalleryConsumptionPage;
	public LokmatAMPVideosPage lokmatAMPVideosPage;
	
	InitializePages(WebDriver driver) {
		ampValidatorPage = new AMPValidatorPage(driver);
		desktopLandingPage = new DesktopLandingPage(driver);
		ampCricketNextPage = new AMPCricketNextPage(driver);
		desktopphotoGalleryConsumptionPage = new DesktopPhotoGalleryConsumptionPage(driver);
		ampIndiaPage = new AMPIndiaPage(driver);
		hindiDesktopLandingPage = new HindiDesktopLandingPage(driver);
		hindiAMPCricketNextPage = new HindiAMPCricketNextPage(driver);
		hindiAMPSectionPage = new HindiAMPSectionPage(driver);
		hindiDesktopPhotoGalleryConsumptionPage = new HindiDesktopPhotoGalleryConsumptionPage(driver);
		hindiAMPVideosPage = new HindiAMPVideosPage(driver);
		bengaliDesktopLandingPage= new BengaliDesktopLandingPage(driver);
		bengaliAMPCricketNextPage= new BengaliAMPCricketNextPage(driver);
		bengaliAMPEntertainmentPage= new BengaliAMPEntertainmentPage(driver);
		bengaliDesktopPhotoGalleryConsumptionPage= new BengaliDesktopPhotoGalleryConsumptionPage(driver);
		bengaliAMPVideosPage=new BengaliAMPVideosPage(driver);
		lokmatDesktopLandingPage= new LokmatDesktopLandingPage(driver);
		lokmatAMPSportsPage=new LokmatAMPSportsPage(driver);
		lokmatAMPEntertainmentPage=new LokmatAMPEntertainmentPage(driver);
		lokmatDesktopPhotogalleryConsumptionPage= new LokmatDesktopPhotogalleryConsumptionPage(driver);
		lokmatAMPVideosPage=new LokmatAMPVideosPage(driver);
	}
}