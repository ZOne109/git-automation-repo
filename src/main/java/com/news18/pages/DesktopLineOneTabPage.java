package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains Webelements and business logic for Desktop L1 Tab Page
 * @author Vipin Kumar
 *
 */

public class DesktopLineOneTabPage {

	public WebDriver driver;	
	public DesktopLineOneTabPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	/* List of section in hamburger Menu */
	@FindBy(xpath = "//div[contains(@class,'sub-nav')]/child::ul//a")
	private List<WebElement> hamburgerMenuListLnk;

	/* India section link in L1 tab */
	@FindBy(xpath = "//ul[@class='fleft nav-box']//a[text()='India']")
	private WebElement indiaSectionLnk;

	/* Entertainment section link in L1 tab */
	@FindBy(xpath = "//ul[@class='fleft nav-box']//a[text()='Entertainment']")
	private WebElement entertainSectionLnk;

	/* World section link in L1 tab */
	@FindBy(xpath = "//ul[@class='fleft nav-box']//a[text()='World']")
	private WebElement worldSectionLnk;

}
