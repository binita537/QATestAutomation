package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;

import com.orangehrm.browsers.WebDriverInstance;
import com.orangehrm.commonutils.CommonUtils;

public class BasePage {

	protected WebDriverInstance webDriverInstance;
	protected WebDriver driver;
	protected CommonUtils commonUtils;

	public BasePage(WebDriverInstance webDriverInstance, CommonUtils commonUtils) {
		this.webDriverInstance = webDriverInstance;
		this.driver = webDriverInstance.getDriver();
		this.commonUtils = commonUtils;

	}

}
