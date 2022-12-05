package com.news18.commonpages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.news18.init.FileUtility;
import com.news18.init.GenericUtility;
import com.news18.init.Logs;
import com.news18.init.WebDriverActions;

public class DesktopMetaTagValidation {
	
	public WebDriver driver;
	SoftAssert assrt = new SoftAssert();
	WebDriverActions webDriverActions = new WebDriverActions();
	GenericUtility genericUtility= new GenericUtility();
	FileUtility fileUtility = new FileUtility();

	public DesktopMetaTagValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*Robot text present in View Page Source*/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='robots']")
	private WebElement  robotTxtLnk;
	
	/*Max text link present in View Page Source**/
	@FindBy(xpath = "//td[contains(@class,'line-content')]//span[text()='max-image-preview:large']")
	private WebElement  maxTxtLnk;
	

	/**
	 * This Method is used to verify robot text and Max preview text is present or not in view page source
	 * @param url
	 */
	public void verifyMetaTag() {
		String actualRobotText="";
		String actualMaxImageText="";
		webDriverActions.waitForPageToLoad();
		try {
			webDriverActions.viewPageSource();
			String  robotHtmlLnk = webDriverActions.getTextFromElement(robotTxtLnk);
			actualRobotText=robotHtmlLnk;
			Logs.info(getClass(),robotHtmlLnk);
			String maxmHtmlLnk = webDriverActions.getTextFromElement(maxTxtLnk);
			actualMaxImageText=maxmHtmlLnk;
			Logs.info(getClass(),maxmHtmlLnk);
			if(robotHtmlLnk.contains("robots")  && maxmHtmlLnk.contains("max-image-preview:large"))	
			{
				Logs.info(getClass(), robotHtmlLnk  + "  Robot Text  is  present  " );
				Logs.info(getClass(), maxmHtmlLnk + "  max-image-preview:large Text  is  present  " );
			}
		}
		catch(NoSuchElementException e) {
			Logs.info(getClass(), actualRobotText  + "  Robot Text  is not   present  " );
			Logs.info(getClass(), actualMaxImageText + "  max-image-preview:large Text  is not  present  ");
			assrt.assertTrue(false);
		}
		assrt.assertAll();
}

}
