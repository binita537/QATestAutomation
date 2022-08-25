package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;

import com.orangehrm.browsers.WebDriverInstance;
import com.orangehrm.commonutils.CommonUIActions;
import com.orangehrm.commonutils.CommonUtils;

public abstract class BasePage {

	protected WebDriverInstance webDriverInstance;
	protected WebDriver driver;
	protected CommonUIActions commonUIActions;

	public BasePage(WebDriverInstance webDriverInstance, CommonUIActions commonUIActions) {
		this.webDriverInstance = webDriverInstance;
		this.driver = webDriverInstance.getDriver();
		this.commonUIActions = commonUIActions;

	}

	public abstract boolean isPageLoaded();

}
