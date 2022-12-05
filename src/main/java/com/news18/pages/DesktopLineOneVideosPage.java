package com.news18.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  @author Sanjeeb
 *  This class contains Elements and business logics for VideosPage Templates.
 */

public class DesktopLineOneVideosPage {

	public WebDriver driver;
	
	public DesktopLineOneVideosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	/* first video in videos article presenting in under L1 Section of videos page */
	@FindBy(xpath="//ul[@class='videoTopList']/descendant::a[1]")
	private WebElement firstVideoInVideosArticleBtn;
	
}
