package com.news18.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *  @author Sanjeeb
 *  This class contains pom pages for MoviesPage Templates.
 */

public class DesktopMoviesPage {

	public WebDriver driver;
	public DesktopMoviesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	/* latest movie article presenting in under L1 Section.*/
	@FindBy(xpath="//div[contains(@class,'top_story_right')]//li[1]//a[contains(@href,'movies')]")
	private WebElement latestMovieArticleBtn;
	
}


