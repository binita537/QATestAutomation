package com.orangehrm.browsers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.frameworkconstant.FrameworkConstants;

public class FirefoxDriverInstance extends WebDriverInstance {

	public FirefoxDriverInstance() {
		this.driver = new FirefoxDriver();
		this.webDriverWait = new WebDriverWait(driver, FrameworkConstants.getWaitTime());
		this.javascriptExecutor=(JavascriptExecutor) this.driver;

	}

	@Override
	public void tearDown() {

	}

}
