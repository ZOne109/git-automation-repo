package com.news18.commonpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopOgImageValidation {

	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopOgImageValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath ="(//span[text()='og:image:width']//following-sibling::span[contains(@class,'html-attribute-value')])[1]")
	private WebElement widthOfArticleImage;

	@FindBy(xpath ="(//span[text()='og:image:height']//following-sibling::span[contains(@class,'html-attribute-value')])[1]")
	private WebElement heightOfArticleImage;

	public void verifyOgImageDimension(){
		{
			webDriverActions.waitForPageToLoad();
			webDriverActions.viewPageSource();
			String textFromwidth = webDriverActions.getTextFromElement(widthOfArticleImage);
			String textFromheight = webDriverActions.getTextFromElement(heightOfArticleImage);
			if(textFromwidth.equals("1600") && textFromheight.equals("900") ) {
				Logs.info(getClass()," widhth of an article image is present "+textFromwidth);
				Logs.info(getClass()," height of an article image is present "+textFromheight);	
				assrt.assertTrue(true);
			}
			else {
				Logs.info(getClass(), "The image dimension is invalid ");
				assrt.assertTrue(false);
			}
			assrt.assertAll();
		}
	}
}


