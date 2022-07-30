package com.orangehrm.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverInstance extends WebDriverInstance {
	
	
	
	
	

	@Override
	public void tearDown() {
		
		
	}
	
	
	public WebDriver getChromeDriver()
	{
		WebDriverManager.chromedriver().setup();
	return 	driver=new ChromeDriver();
		
	}

}
