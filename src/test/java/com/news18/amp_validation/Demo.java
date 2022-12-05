package com.news18.amp_validation;

import org.testng.annotations.Test;

import com.news18.init.DesktopCommonConfig;

public class Demo extends DesktopCommonConfig {
	
	@Test
	public void test1() {
		navigateToUrl("https://www.news18.com/");
		System.out.println("Launched successfully");
	}
	
	@Test
	public void test2() {
		navigateToUrl("https://www.news18.com/news");
		System.out.println("Launched successfully");
	}

}
