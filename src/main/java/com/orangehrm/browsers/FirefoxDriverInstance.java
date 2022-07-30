package com.orangehrm.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverInstance extends WebDriverInstance {
	
	@Override
	public void tearDown() {
		
		
	}
	
	
	public WebDriver getChromeDriver()
	{
		WebDriverManager.firefoxdriver().setup();
		return driver=new FirefoxDriver();
		
	}

}
