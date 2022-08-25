 package com.orangehrm.frameworkconstant;

public class FrameworkConstants {
	
	private static final String APPLICATION_PROPERTITES_PATH=System.getProperty("user.dir") + "/src/main/resources/Application.properties";
    private static final long WAIT_TIME=20000;
	
	public static String getApplicationPropertitesPath() {
		return APPLICATION_PROPERTITES_PATH;
	}

	public static long getWaitTime() {
		return WAIT_TIME;
	}

	


	
}
