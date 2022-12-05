package com.news18.init;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This Class Contains fetch Data From Property File
 * @author Abhishek Raj
 *
 */

public class FileUtility {

	/**
	 * This method is used to read the data from the property file
	 * @param key
	 * @return
	 */
	public String readDataFromPropertyFile(String key)
	{
		Properties prop=new Properties();
		try
		{
			prop.load(new FileInputStream(IPath.propertyPath));
		}
		catch (FileNotFoundException e) 
		{
			Logs.error(getClass(), "File is not found", e);
		}
		catch (IOException e)
		{
			Logs.error(getClass(),"Failed to fetch the file from current directory", e);
		}
		String value=prop.getProperty(key);
		Logs.info(getClass(), "Read Data From Property File "+value);
		return value;
	}
}
