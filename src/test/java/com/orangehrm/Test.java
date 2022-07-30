package com.orangehrm;

import org.openqa.selenium.WebDriver;

import com.orangehrm.browsers.BrowserType;
import com.orangehrm.browsers.DriverFactory;
import com.orangehrm.browsers.WebDriverInstance;

public class Test {
	
	    public static void main(String[] args) throws Exception {
			
	    	
	    WebDriverInstance driverInstance=DriverFactory.getDriverInstance(BrowserType.IE);
	    	System.out.println(driverInstance);
	    	
	    	WebDriver driver=driverInstance.getDriver();
	    	
	    	driver.get("https://opensource-demo.orangehrmlive.com/");
	    	
		}

}
