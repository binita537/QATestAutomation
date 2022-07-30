package com.orangehrm.browsers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	
	
	public static WebDriverInstance getDriverInstance(BrowserType browserType) throws Exception
	{
		WebDriverInstance webDriverInstance;
		
			

     if(browserType==BrowserType.CHROME)
     {
    	WebDriverManager.chromedriver().setup();
    	webDriverInstance=new ChromeDriverInstance();
    	    	 
     }
     else if (browserType==BrowserType.FIREFOX)
     {
    	 WebDriverManager.firefoxdriver().setup();
     	webDriverInstance=new FirefoxDriverInstance();  	 
    	 
     }
     else if (browserType==BrowserType.IE)
     {
    	 WebDriverManager.iedriver().setup();
     	webDriverInstance=new IEDriverInstance();	 
    	 
     }
     else {
    	 
    	 throw new Exception("PLease provide correct name of the driver:"+browserType+"this driver is not valid");
     }
	
     return webDriverInstance;

}
}