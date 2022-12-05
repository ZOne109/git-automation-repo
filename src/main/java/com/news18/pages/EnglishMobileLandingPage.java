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
 * @author Anupam
 *
 */
public class EnglishMobileLandingPage {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public EnglishMobileLandingPage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	}
	
	/*List of advertisement present in page */
	@FindBy(xpath="//iframe[@aria-label='Advertisement']")
	private List<WebElement> ads;
	
	/*photos section present in Line one in home page*/
	@FindBy(xpath ="//div[contains(@class,'L1_neuWrapper')]//a[.='Photos ']")
	private WebElement photoSectionLnk;
	
	/*Footer section present in  home page*/
	@FindBy(xpath ="//footer")
	private WebElement footerLnk;
	
	/*Homepage List of article Link for news18 home Page*/
	@FindBy(xpath ="//ul[contains(@class,'story_listing')]/li/a[not(contains(@href,'live'))]")
	private List<WebElement> homePageArticleLnk;
	
	/*Homepage List of Live article Link for news18 home Page*/
	@FindBy(xpath ="//ul[contains(@class,'story_listing')]/li/a[contains(@href,'live-update')]")
	private List<WebElement> homePageLiveArticleLnk;
	
	/*cricketNext section present in Line one in home page*/
	@FindBy(xpath ="//div[contains(@class,'L1_neuWrapper')]//a[.='CricketNext']")
	private WebElement cricketNextSectionLnk;
	
	
	/**
	 * This method used to click on photos section
	 */
	public void clickOnPhotoSection()
	{
		webDriverActions.click(photoSectionLnk);
		Logs.info(getClass(), "Clicked on photoSection");
	}
	
	
	/**
	 * This method used to click on cricketNext section
	 */
	public void clickOnCricketNextSection()
	{
		webDriverActions.click(cricketNextSectionLnk);
		Logs.info(getClass(), "Clicked on cricket next section");
	}
	
	/**
	 * This method is used to click on First Article of Home Page 
	 */
	public void clickOnFirstArticleHomePage() {
		webDriverActions.click(homePageArticleLnk.get(0));
	}
	
	/**
	 * This method is used to click on First Live Article of  Home Page 
	 */
	public void clickOnFirstLiveArticleHomePage() {
		webDriverActions.click(homePageLiveArticleLnk.get(0));
	}
	
	/**
	 * This method used to validate Advertisements present in mobile web home page
	 */
	public void verifyAds(){
		webDriverActions.waitForPageToLoad();
		webDriverActions.mobileScroll(10);
		webDriverActions.mouseHover(footerLnk);
		webDriverActions.waitForAllElementsVisible(ads, GlobalVariables.sec60);
		for(int i=0;i<ads.size();i++) {
			webDriverActions.waitForElementVisibility(ads.get(i),GlobalVariables.sec60);
			webDriverActions.mouseHover(ads.get(i));        //Mousehover to advertisement
			webDriverActions.highlightElement(ads.get(i)); //Highlighting the advertisement
			Logs.info(getClass(), "advertisement is present" +ads.get(i));
			assrt.assertTrue(webDriverActions.isElementDisplayed(ads.get(i)),"Failed to display"+ads.get(i));
		}
		Logs.info(getClass(),"Ads found on page " +ads.size());
		assrt.assertAll();
	}
}
