package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains elements and business logic for AMP PhotoGallery Consumption Page 
 *  @author Sanjeeb
 */

public class AMPPhotoGalleryConsumptionPage {

	public WebDriver driver;
	public AMPPhotoGalleryConsumptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	/*amp Ads present on the mobile Amp PhotoGallery home page*/
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ampAds;

	/*amp facebook Icon present on the photo article consumption page of the mobile Amp PhotoGallery home page*/
	@FindBy(xpath="//div[contains(@class,'pht-artcl-shr fright')]/a[contains(@href,'facebook')]")
	private WebElement ampFbIcon;

	/*amp twitter Icon present on the photo article consumption page of the mobile Amp PhotoGallery home page*/
	@FindBy(xpath="//div[contains(@class,'pht-artcl-shr fright')]/a[contains(@href,'twitter')]")
	private WebElement ampTwitterIcon;

	/*amp getPocket Icon present on the photo article consumption page of the mobile Amp PhotoGallery home page*/
	@FindBy(xpath="//div[contains(@class,'pht-artcl-shr fright')]/a[contains(@href,'getpocket')]")
	private WebElement ampGetPocketIcon;

	/*amp whatsapp Icon present on the photo article consumption page of the mobile Amp PhotoGallery home page*/
	@FindBy(xpath="//div[contains(@class,'pht-artcl-shr2 frmbl')]/ul/li/a[contains(@href,'whatsapp')]")
	private WebElement ampWhatsappIcon;

	/*footer section present at the footer portion of the mobile Amp PhotoGallery home page*/
	@FindBy(xpath="//footer/a")
	private WebElement ampFooterSection;

	/*photos sub section present at the top in l1 section of the mobile Amp home page*/
	@FindBy(xpath="//*[contains(@class,'mobheader')]//a[contains(text(),'Photos')]")
	private WebElement photosLink;

	/*photogallery section present under latest news section of the mobile Amp home page*/
	@FindBy(xpath="//span[text()='Photogalleries']")
	private WebElement photogallerySection;

}
