package com.orangehrm.browsers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.frameworkconstant.FrameworkConstants;

public class IEDriverInstance extends WebDriverInstance {

	public IEDriverInstance() {
		this.driver = new ChromeDriver();
		this.webDriverWait = new WebDriverWait(driver, FrameworkConstants.getWaitTime());
		this.javascriptExecutor = (JavascriptExecutor) this.driver;

	}

	@Override
	public void tearDown() {
		// TODO Auto-generated method stub

	}

}
