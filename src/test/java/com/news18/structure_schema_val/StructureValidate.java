package com.news18.structure_schema_val;

import java.io.IOException;

import org.testng.annotations.Test;

import com.news18.init.GenericUtility;

public class StructureValidate {
	
	
	//The URL was not found. Make sure the domain name is correct and the server is responding with a 200 status code.
	
	@Test
	public void englishHomePage() throws IOException, InterruptedException {
		GenericUtility.validateSchema("https://www.news18.com/assembly-elections-2022/punjab/rajpura-election-result-s19a111/");
	}

}
