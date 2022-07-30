package com.orangehrm.browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverInstance extends WebDriverInstance {
	
	@Override
	public void tearDown() {
		
		
	}
	
	
	public void getChromeDriver()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
	}

}
