package com.orangehrm.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.orangehrm.browsers.BrowserType;
import com.orangehrm.browsers.WebDriverInstance;
import com.orangehrm.commonutils.CommonUIActions;
import com.orangehrm.commonutils.CommonUtils;
import com.orangehrm.pom.LoginPage;

public class BaseStepDefinitions {
	
  
	
	protected WebDriverInstance driverInstance=CommonUtils.getWenDriverInstance(BrowserType.CHROME);
	protected WebDriver driver=driverInstance.getDriver(); 
	protected CommonUIActions commonUIActions;
	
	 protected LoginPage loginPage=new LoginPage(driverInstance,commonUIActions );
	
	
	
	

}
