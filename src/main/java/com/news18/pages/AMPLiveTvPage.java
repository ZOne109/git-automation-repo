package com.news18.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This Class contains Webelements and business logics for AMP Live TV Page
 * @author Vipin Kumar
 */

public class AMPLiveTvPage{
	
	public WebDriver driver;
	public AMPLiveTvPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	/* Live TV Link In top RHS of homepage */
	@FindBy(xpath = "//div[@class='right-div']/a")
	private WebElement ampLiveTvLnk;
		
}
