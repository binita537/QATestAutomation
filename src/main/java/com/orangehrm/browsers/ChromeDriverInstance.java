package com.orangehrm.browsers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangehrm.frameworkconstant.FrameworkConstants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverInstance extends WebDriverInstance {

	public ChromeDriverInstance() {
		super();
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.webDriverWait = new WebDriverWait(driver, FrameworkConstants.getWaitTime());
		this.javascriptExecutor = ((JavascriptExecutor) this.driver);

		System.out.println("I am chromedriver instance :creating chromedriver object ");
	}

	@Override
	public void tearDown() {

	}

}
