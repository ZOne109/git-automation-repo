package com.news18.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains WebElements and BusinessLogic of Mobile WebPhotoGallery Page
 * @author Harshith S
 */

public class MobilePhotoGalleryPage {
	
	public WebDriver driver;
	public MobilePhotoGalleryPage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	
	/* Mobile_PhotoGallery_Page List of outbrain*/
	@FindBy(xpath = "//div[@class='OUTBRAIN']")
	private List<WebElement> outbrainLnk;

}
