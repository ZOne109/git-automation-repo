package com.news18.init;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

/**
 * @author Abhishek Raj
 * This class describes to fetch current date,time format and random numbers
 *
 */

public class GenericUtility {

	/**
	 * This method is used to fetch current date and Time format
	 * @return
	 */
	public static String getDateTime() 
	{
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String dateOfExecution = dateFormat.format(date);
		Logs.info(GenericUtility.class,"Current DateTime: "+ dateOfExecution);
		return dateOfExecution;
	}

	/**
	 * this method is fetch only current time
	 * @return
	 */

	public String getCurrentTime()
	{
		Date date = new Date();
		String value = date.toString();
		String[] split = value.split(" ");
		String str=split[3];
		Logs.info(getClass(),"Current Time: "+ str);
		return str;
	}

	/**
	 * This method is fetch only current date
	 * @return
	 */

	public String getCurrentDate()
	{
		Date date = new Date();
		String value = date.toString();
		String[] split = value.split(" ");
		String day= split[2];
		String month=split[1];
		String year=split[5];
		String tdate=day+month+year;
		Logs.info(getClass(),"Current Date: "+ tdate);
		return tdate;
	}

	/**
	 * this method generate random value upto 1000
	 * @return
	 */

	public int generateRandomNumber()
	{
		Random r= new Random();
		Logs.info(getClass(),"Random Number Upto 1000: "+r.nextInt(1000)); 
		return r.nextInt(1000);
	}

	/**
	 * this method calculate the difference between system time and article time
	 * @param articleDate
	 * @return String
	 * @throws ParseException 
	 * @throws Exception
	 */
	public long dateTimeDifference(String articleDate) throws ParseException {
		//Fetching system current date and time
		SimpleDateFormat sdfDate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		Date d1 = sdfDate.parse(strDate);
		//Converting article time and date format to system format
		articleDate = articleDate.replace("IST", "").replace(" ", "");
		SimpleDateFormat sdf1 = new SimpleDateFormat("MMMMdd,yyyy,HH:mm");
		Date date1 = sdf1.parse(articleDate);
		DateFormat outputformat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String output = outputformat.format(date1);
		Date d2 = sdfDate.parse(output);
		//Difference between article time and current time
		long diff=d1.getTime()-d2.getTime();
		long minutes=(diff/(1000*60));
		Logs.info(getClass(),"Date Time Difference "+minutes); 
		return minutes;
	}


	/**
	 * this method will compare two Strings
	 * @param actual
	 * @param expected
	 */

	public boolean compareTwoStrings(String actual,String expected)
	{	
		Logs.info(getClass(),"Compare Two String "+ actual.contains(expected)); 
		return actual.contains(expected);		
	}


	/**
	 * this method will compare Strings with Ignore Case
	 * @param actual
	 * @param expected
	 * @return
	 */
	public boolean compareStringsWithIgnoreCase(String actual,String expected)
	{	
		Logs.info(getClass(),"Compare Two String "+ actual.equalsIgnoreCase(expected));
		return actual.equalsIgnoreCase(expected);		
	}


	/**
	 ** This Method is used to convert Substring into String
	 * @param i
	 * @param j
	 * @param text
	 * @return
	 */
	public String getSubstring(int i,int j,String text) {
		String s= new String(text);
		String sub= s.substring(i, j);
		Logs.info(getClass(),"change Substring to String "+sub); 
		return sub;
	}


	/**
	 * This Method is used to fetch System Month and Date
	 * @return
	 */
	public String getSystemDateTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM DD");
		Logs.info(getClass(),"Fetches system DateTime");
		return LocalDateTime.now().format(formatter);
	}


	/**
	 * this method will compare Strings with using Equal
	 * @param actual
	 * @param expected
	 */
	public boolean compareStringsWithEquals(String actual,String expected)
	{	
		Logs.info(getClass(),"Compare Two String "); 
		return actual.equals(expected);		
	}

	/**
	 * This method used to split the string
	 * @param text
	 * @return
	 */
	public String split(String text, int i, String text2 ) {
		String s= new String(text);
		String [] str=s.split(text2);
		Logs.info(getClass(), str[i]); 
		return str[i];
	}
	
	public static void validateSchema(String url) throws IOException, InterruptedException {
		int warning = 0;
		int failed = 0;
		int topNews = 0;
		Process proc = Runtime.getRuntime().exec("cmd /c sdtt --url " + url);
		proc.waitFor();
		BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		String line = reader.readLine();

		while (line != null) {
			if (line.contains("Warnings:")) {
				System.out.println(" warning line  "+line);
				warning = Integer.parseInt(line.replace("Warnings:", "").replace(" ", "").split("	")[0]);
			}
			if (line.contains("Failed:")) {
				System.out.println(" failed line  "+line);
				failed = Integer.parseInt(line.replace("Failed:", "").replace(" ", "").split("	")[0]);
			}
			line = reader.readLine();
		}
		if (warning != 0) {
//			Reporter.addStepLog(" <font color='red'> <font color='magenta'> " + url
//					+ " </font> link got <font color='magenta'>" + warning + "</font> warnings </font> ");
//			Assert.fail(url + "  link got " + warning + " warnings ");
			System.out.println("Error in Warning");
		} else
//			Reporter.addStepLog(" <font color='green'> link got <font color='magenta'>"
//					+ warning + "</font> warnings </font> </font> ");
			System.out.println("Warning is 0");
			

		if (failed != 0) {
//			Reporter.addStepLog(" <font color='red'> <font color='magenta'> " + url
//					+ " </font> link got <font color='magenta'>" + failed + "</font> failed </font> ");
//			Assert.fail(url + " link got " + failed + " failed ");
			System.out.println("Error in failed");
		} else
//			Reporter.addStepLog(" <font color='green'> link got <font color='magenta'>"
//					+ failed + "</font> failed </font> </font>  ");
			System.out.println("failed is 0");
	}
}
