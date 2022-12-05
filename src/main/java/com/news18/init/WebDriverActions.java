package com.news18.init;

import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * This Class contains Webdriver functions.
 * @author Anupam
 */

public class WebDriverActions extends DriverUtility{

	JavascriptExecutor js = (JavascriptExecutor)driver;

	/**
	 * This method is used to click on element
	 */
	public void click(WebElement element) {
		try {
			element.click();
			Logs.info(getClass(), "Clicked on "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to click on "+element, e);
		}
	}

	/**
	 * This method will wait for some time. 
	 * @param element
	 */
	public void waitForSecond(int time)
	{
		try {
			Thread.sleep(time);
			Logs.info(getClass(), "Waiting till "+time);
		} catch (Exception e) {
			Logs.error(getClass(), "Time execeded element not found", e);
		}
	}

	/**
	 * This method is used to navigate to url
	 * @param url
	 */
	public void navigateToUrl(String url) {
		try{
			driver.navigate().to(url);
			Logs.info(getClass(), "Navigated to "+ url);
		}catch(Exception e) {
			Logs.error(getClass(), "Not able to navigate to "+ url, e);
		}
	}


	/**
	 * This method is used to get current page url
	 * @return 
	 */
	public String getCurrentPageUrl() {
		Logs.info(getClass(), "Fetching current page URL");
		return driver.getCurrentUrl();
	}


	/**
	 * This method is use to navigate back 
	 */
	public void navigateBack() {
		try {
			driver.navigate().back();
			Logs.info(getClass(), "Navigated back");
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to navigate back ", e);
		}
	}


	/**
	 * This method will wait until element is visible 
	 * @param element
	 */
	public void waitForElementVisibility(WebElement element, int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));   
		Logs.info(getClass(), "Wait for "+element +" till "+time);
	}


	/**
	 * This method is used to wait till all Element is visible
	 * @param element
	 */
	public void waitForAllElementsVisible(List<WebElement> element, int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
		Logs.info(getClass(), "Wait for list of "+element +" till "+time);
	}


	/**
	 * This method is use to move to the element
	 * @param element
	 */
	public void mouseHover(WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			Logs.info(getClass(), "MouseHover to "+element);
		}
		catch(Exception e)
		{
			Logs.error(getClass(), "MouseHover unsuccessful to "+element , e);
		}
	}


	/**
	 * This method is used to double click on the element
	 * @param element
	 */
	public void doubleClick(WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.doubleClick(element).perform();
			Logs.info(getClass(), "Doubled click on "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to double click on "+element, e);
		}
	}


	/**
	 * This method is used to give input to element
	 * @param element
	 * @param data
	 */
	public void inputText(WebElement element, String data) {
		try {
			element.clear();
			element.sendKeys(data);
			Logs.info(getClass(), "Sent "+data+" to "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Unable to send "+ data + " to " +element, e);
		}
	}


	/**
	 * This method is used to clear the text from element
	 * @param element
	 */
	public void toClearText(WebElement element) {
		try {
			element.clear();
			Logs.info(getClass(), "Cleared from "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to clear on "+element, e);
		}
	}


	/**
	 * This method is used to get text from Element
	 * @param element
	 * @return
	 */
	public String getTextFromElement(WebElement element) {
		Logs.info(getClass(), "Getting text from "+element);
		return element.getText();
	}


	/**
	 * This method is used for switching the frame
	 * @param frame
	 */
	public void switchToFrame(String frame) {
		try {
			driver.switchTo().frame(frame);
			Logs.info(getClass(), "Switched to frame "+frame);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to switch to "+frame, e);
		}
	}


	/**
	 * This method is used to switch to window by comparing title
	 * @param partialwinTitle
	 */
	public void switchToWindow(String partialTitle) {
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		while(it.hasNext()) {
			String winId = it.next();
			String title = driver.switchTo().window(winId).getTitle();
			if(title.contains(partialTitle)) {
				break;
			}
		}
		Logs.info(getClass(), "Switched to window "+partialTitle);
	}


	/**
	 * This method is used to switch to parent window
	 */
	public void switchToParentWindow(){	
		String parent=driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String window:windowHandles)
		{
			if(!window.equals(parent))
			{
				driver.switchTo().window(window);	
				Logs.info(getClass(), "Switched to child window ");
				waitForPageToLoad();
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Logs.info(getClass(), "Switched to parent window");
	}


	/**
	 * This method is used to switch to New window
	 */
	public void switchToNewWindow() {
		String window = "";
		java.util.Set<String> handles = driver.getWindowHandles();
		Iterator<String> ite = handles.iterator();
		while (ite.hasNext()) {
			window = (String) ite.next();
		}
		driver.switchTo().window(window);
		Logs.info(getClass(), "Switched to New window ");
	}


	/**
	 * This method is used to scroll to particular point
	 * @param x
	 * @param y
	 */
	public void scrollToPoint(int x, int y) {
		js.executeScript("window.scrollTo(" + x + "," + y + ")");
		Logs.info(getClass(), "scrolled to (" + x + "," + y + ")");
	}


	/**
	 * This method is used to scroll to the element
	 * @param element
	 */
	public void scrollToElement(WebElement element) {
		try {
			int y = element.getLocation().getY();
			js.executeScript("window.scrollTo(0," + y + ")");
			Logs.info(getClass(), "scrolled to "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "not able to scroll to "+element, e);
		}
	}

	/**
	 * This method is used to refresh the Page.
	 */
	public void refreshPage(){	
		driver.navigate().refresh();
		Logs.info(getClass(), "Page is refreshed");
	}

	/**
	 * This method is used to scroll to last of the page
	 */
	public void scrollToLast() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Logs.info(getClass(), "scrolled to last");
	}


	/**
	 * This method is used to scroll down
	 */
	public void scrollDown() {
		js.executeScript("window.scrollBy(0,350)");
		Logs.info(getClass(), "scrolled down");
	}


	/**
	 * This method is used to scroll up
	 */
	public void scrollUp() {
		try {
			js.executeScript("window.scrollBy(0,-350)");
			Logs.info(getClass(), "scrolled up");
		} catch (Exception e) {
			Logs.error(getClass(), "not able to scroll up", e);
		}

	}


	/**
	 * This method is used to take screenshot
	 * @param screenshotFilePath
	 * @return
	 */
	public byte[] takeScreenshot(String screenshotFilePath) {
		try {
			byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			FileOutputStream fileOuputStream = new FileOutputStream(screenshotFilePath);
			fileOuputStream.write(screenshot);
			fileOuputStream.close();
			return screenshot;
		} catch (Exception e) {
			Logs.error(getClass(), "screenshot not taken ", e);
		}
		return null;
	}


	/**
	 * This method is used to highlight the element
	 * @param element
	 */
	public void highlightElement(WebElement element) {
		try {
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
			Logs.info(getClass(), "highlighted the "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Not able to highlight "+element, e);
		}
	}


	/**
	 * This method is used to get attribute from element
	 * @param attributeType
	 * @param element
	 * @return
	 */
	public String getAttribute(String attributeType, WebElement element) {
		String text = "";
		if(attributeType.equalsIgnoreCase("value")) {
			text=element.getAttribute("value");
		}else if(attributeType.equalsIgnoreCase("innerText")) {
			text=element.getAttribute("innerText");
		}else if(attributeType.equalsIgnoreCase("textContent")) {
			text=element.getAttribute("textContent");
		}else if(attributeType.equalsIgnoreCase("title")) {
			text=element.getAttribute("title");
		}else if(attributeType.equalsIgnoreCase("galtitle")) {
			text=element.getAttribute("galtitle");
		}else if(attributeType.equalsIgnoreCase("id")) {
			text=element.getAttribute("id");
		}else if(attributeType.equalsIgnoreCase("src")) {
			text=element.getAttribute("src");
		}else if(attributeType.equalsIgnoreCase("srcset")) {
			text=element.getAttribute("srcset");
		}else if(attributeType.equalsIgnoreCase("href")) {
			text=element.getAttribute("href");
		}else if(attributeType.equalsIgnoreCase("alt")) {
			text=element.getAttribute("alt");
		}else if(attributeType.equalsIgnoreCase("data-slot")) {
			text=element.getAttribute("data-slot");
		}else if(attributeType.equalsIgnoreCase("class")) {
			text=element.getAttribute("class");
		}		
		Logs.info(getClass(), "Elements attributeType");
		return text;
	}


	/**
	 * This method is used to click on element using javaScript
	 * @param element
	 */
	public void clickJS(WebElement element) {
		try {
			js.executeScript("arguments[0].click();", element);
			Logs.info(getClass(), "clicked on "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Unable to click on "+element, e);
		}
	}


	/**
	 * This method is used to select visible text
	 * @param element
	 * @param option
	 */
	public void selectOption(WebElement element,String option) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(option);
			Logs.info(getClass(), "selected "+element);
		} catch (Exception e) {
			Logs.error(getClass(), "Unable to find"+option, e);
		}
	}


	/**
	 * This method is used to load the page
	 */
	public void waitForPageToLoad() {
		do {
			pageLoadStatus = (String) js.executeScript("return document.readyState");
		} while (!pageLoadStatus.equals("complete"));
		Logs.info(getClass(), "Waiting for Page Load");
	}


	/**
	 * This method is use to display element
	 * @param element
	 * @return
	 */
	public boolean isElementDisplayed(WebElement element) {
		Logs.info(getClass(), "Element displayed");
		return element.isDisplayed();
	}


	/**
	 * This method is used to continuous scroll until element is visible
	 * @param element
	 */
	public void continuousScrollTillElement(WebElement element, int time) {
		for(int count=0;count<=time;count++){
			try {
				WebDriverWait  wait=new WebDriverWait(driver,sec3);
				wait.until(ExpectedConditions.visibilityOf(element));
				break;
			}
			catch(Throwable e) {
				scrollDown();
			}
		}
		Logs.info(getClass(), "Scrolls till element");
	}


	/**
	 * This method is used to navigate to source code page
	 */
	public void viewPageSource() {
		String mainUrl = driver.getCurrentUrl();
		String sourceCodeURL = "view-source:" + mainUrl;
		driver.get(sourceCodeURL);  	
		Logs.info(getClass(), "Reads the page source");
	}


	/**
	 * This method is used to close the driver 
	 */
	public void closeDriver() 
	{
		driver.close();		
		Logs.info(getClass(), "Closed Current window");
	}


	/**
	 * This method is used to get The Title of Page
	 */
	public String getPageTitle() 
	{
		Logs.info(getClass(), "Gets the title from the page");
		return driver.getTitle();		
	}


	/**
	 * This method will change the element Text To Lower Case. 
	 * @param element
	 */
	public String getTextToLowerCase(WebElement element){
		Logs.info(getClass(), "Change the text to lowercase");
		return element.getText().toLowerCase();
	}
	
	/**
	 * This method is used to verify click On element
	 * @param element
	 * @return
	 */
	public void waitForElementClickable(WebElement element, int time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));   
		Logs.info(getClass(), "Wait for "+element +" till "+time);
	}
	
	/**
	 * This method will used to scroll the mobile page 
	 * @param count
	 */
	public void mobileScroll(int count){
		for(int i=0;i<=count;i++) {
			try {
				js.executeScript("window.scrollBy(0,450)");
				Thread.sleep(1000);
			}
			catch (Exception e) {
			}	
		}
		Logs.info(getClass(), "scrolled down for "+count );
	}


}
