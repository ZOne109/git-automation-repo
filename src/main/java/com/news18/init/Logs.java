package com.news18.init;

import org.apache.log4j.Logger;

public  class Logs{


	public static Logger log;

	public static void info(Class className,String message) {
		log=Logger.getLogger(className);
		log.info(message);
	}


	public static  void error(Class className,String message) {

		log=Logger.getLogger(className);
		log.error(message);

	}
	public static void error(Class className,String message,Throwable t) {

		log=Logger.getLogger(className);
		log.error(message,t);

	}

	public static void debug(Class className,String message) {

		log=Logger.getLogger(className);
		log.debug(message);

	}
}
