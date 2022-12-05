package com.news18.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author sivaguru.s
 * This class contains WebElements and business logic of Mobile latest section page
 **/

public class MobileLatestSectionPage {

	public WebDriver driver;
	public 	MobileLatestSectionPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	/*breadcrumb in latest section*/
	@FindBy(xpath = "//div[contains(@class,'brade_crum')]//a")
	private List<WebElement> breadcrumbLnk;

	/*Latest section link in mobile web home page*/
	@FindBy(xpath = "//ul[contains(@class,'L1_menu')]//li[1]/a")
	private List<WebElement> latestlnk;

	/*Featured image in main article*/
	@FindBy(xpath = "//div[contains(@class,'top_img')]//img")
	private WebElement featrdImg;

	/*Images list of all article*/
	@FindBy(xpath = "//div[contains(@class,'blog_list')]//div[contains(@class,'blog_list_row')]//img")
	private List<WebElement> imgList;

	/*Latest section articles in mobile web latest section page*/
	@FindBy(xpath = "//*[contains(@class,'top_story')]//a[not(contains(@href,'cricket'))]")
	private List<WebElement> latestArticles;
	
}
