package com.orangehrm.browsers;

import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IEDriverInstance extends WebDriverInstance {
	
	
	
	
	
	public  IEDriverInstance()
	{
		super();
		WebDriverManager.iedriver().setup();
		this.driver=new InternetExplorerDriver();
		
	}

	@Override
	public void tearDown() {
		// TODO Auto-generated method stub
		
	}

}
