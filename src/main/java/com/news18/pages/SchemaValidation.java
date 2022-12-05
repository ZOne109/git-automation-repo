package com.news18.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author sivaguru.s
 * This class contains WebElements of Schema Validation page
 * URL:https://validator.schema.org//
 **/

public class SchemaValidation {
	
	public WebDriver driver;
	public SchemaValidation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	/*Enter a URL text field*/
	@FindBy(xpath = "//input[@id='new-test-url-input']")
	private WebElement urlTxtBx;

	/*Run test button*/
	@FindBy(xpath = "//button[@id='new-test-submit-button']")
	private WebElement runTestBtn;

	/*Detected text mentioned in RHS*/
	@FindBy(xpath = "//span[text()='Detected']")
	private WebElement detectedTxt;

	/*Items text mentioned in detected section*/
	@FindBy(xpath = "//span[text()='Detected']/../following-sibling::div/span[contains(text(),'ITEMS')]")
	private WebElement itemsTxt;

	/*Errors text mentioned in detected section*/
	@FindBy(xpath = "//span[text()='Detected']/../following-sibling::div/span[contains(text(),'ERRORS')]")
	private WebElement errorsTxt;

	/*Warnings text mentioned in detected section*/
	@FindBy(xpath = "//span[text()='Detected']/../following-sibling::div/span[contains(text(),'WARNINGS')]")
	private WebElement warningsTxt;

	/*Run test code mentioned in HTML code*/
	@FindBy(xpath = "//a[@id='new-test-code']")
	private WebElement runTestCode;

	/*Enter code in schema validator*/
	@FindBy(xpath = "//div[@id='new-test-code-tab']//div[contains(@class,'CodeMirror cm-s-default cm-s-sdtt CodeMirror')]//div[@class='CodeMirror-scroll']")
	private WebElement enterCode;

}
