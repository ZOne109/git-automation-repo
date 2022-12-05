package com.news18.commonpages;

import org.openqa.selenium.NoSuchElementException;
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
 * @author Sanjeeb
 * This class contains WebElements and business logic of AMP Validator page
 * URL:https://validator.ampproject.org/
 */

public class AMPValidatorPage {
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();


	public WebDriver driver;
	public AMPValidatorPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*AMP URL textbox*/
	@FindBy(xpath = "//label[text()='URL']/following-sibling::input")
	private WebElement ampTxtBox;

	/*AMP Validate button present right side of URL textbox*/
	@FindBy(xpath = "//paper-button[@id='validateButton']")
	private WebElement ampValidateBtn;

	/*Drop down of selecting specified HTML format*/
	@FindBy(xpath = "(//input[@id='input'])[2]")
	private WebElement htmlformatDrpdwn;

	/*Status of Validation*/
	@FindBy(xpath = "//div[contains(text(),'Validation Status:')]/span")
	private WebElement validationStatus;

	/*Amp Text Lnk*/
	@FindBy(xpath = "(//div[@class='style-scope iron-dropdown'])//paper-item[1]")
	private WebElement ampTxtLnk;

	/*Amp Link */
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='amphtml']/following-sibling::a")
	private WebElement  ampLnk;


	public WebElement getAmpLnk() {
		return ampLnk;
	}


	/**
	 * This method is used to Verify AMP validations status
	 */
	public void verifyAMPvalidationsstatus(String newsUrl) 
	{
		String ampHtml = getAmpHtml(newsUrl);
		webDriverActions.navigateToUrl(fileUtility.readDataFromPropertyFile("aMPValidatorUrl"));
		webDriverActions.inputText(ampTxtBox,ampHtml);
		webDriverActions.highlightElement(htmlformatDrpdwn);
		webDriverActions.clickJS(htmlformatDrpdwn);
		webDriverActions.highlightElement(ampValidateBtn);
		webDriverActions.clickJS(ampValidateBtn);
		webDriverActions.waitForElementClickable(ampValidateBtn,GlobalVariables.sec60);
		Logs.info(getClass(), "Start Validating");
		webDriverActions.waitForSecond(5000);
		webDriverActions.highlightElement(validationStatus);
		String actual = webDriverActions.getTextFromElement(validationStatus);
		assrt.assertTrue(genericUtility.compareStringsWithEquals(actual,"PASS"),"AMP VerificationFailed");
		assrt.assertAll();
	}


	/**
	 * This Method is used to get AmpHtml urls present in respective pages
	 * @param url
	 * @return
	 */
	public String getAmpHtml(String url) {
		String aMPUrl="";
		try {
			webDriverActions.navigateToUrl(url);
			webDriverActions.waitForPageToLoad();
			webDriverActions.viewPageSource();
			String amphHtmlLnk = webDriverActions.getAttribute("href", getAmpLnk());
			Logs.info(getClass(), amphHtmlLnk);
			aMPUrl=amphHtmlLnk;
			int count=0;
			if(amphHtmlLnk.contains("amp"))
			{
				count++;
				if(count==1)
				{
					Logs.info(getClass(), amphHtmlLnk  +"Amp  is  present  " + count);
				}
				else
				{
					Logs.info(getClass(), amphHtmlLnk  + "null" );
				}
				return amphHtmlLnk;
			}
		}
		catch(NoSuchElementException e)
		{
			if(! aMPUrl.contains("amp")) {
				Logs.info(getClass(), "Amp url is not present");	
				assrt.assertTrue(false);	
			}
		}
		assrt.assertAll();
		return aMPUrl;
	}



}
