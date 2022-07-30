package com.orangehrm.browsers;

import org.apache.commons.collections4.functors.SwitchClosure;

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
     else {
    	 
    	 throw new Exception("PLease provide correct name of the driver:"+browserType+"this driver is not valid");
     }
	
     return webDriverInstance;

}
}