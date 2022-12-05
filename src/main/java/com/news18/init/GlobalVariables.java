package com.news18.init;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class GlobalVariables {
	
	protected FileUtility fileUtility = new FileUtility();
	
	// Driver Variables
	public static WebDriver driver;
	
	// Logger Variables
	public static Logger logger = null;
	
	//Properties Variables
	public  final String desktop = fileUtility.readDataFromPropertyFile("platformdesktop");
	public   final String mobile = fileUtility.readDataFromPropertyFile("platformmobile");
	public  final String amp = fileUtility.readDataFromPropertyFile("platformamp");
	public  final String chrome = fileUtility.readDataFromPropertyFile("browser");
	public static FileInputStream inputStream;
	public static Properties properties;
	public static String propertiesFileName = "src\\main\\resources\\EnvironmentVariables\\Config.properties";
	
	//wait Variables
	public static final int ITO=10;
	public static final int sec3=3;
	public static final int sec60=60;
	public static final int sec30=30;
	public static String pageLoadStatus = "";
}