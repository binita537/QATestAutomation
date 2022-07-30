package com.orangehrm.browsers;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxDriverInstance extends WebDriverInstance {

	public FirefoxDriverInstance() {
		super();
		WebDriverManager.firefoxdriver().setup();
		this.driver = new FirefoxDriver();

	}

	@Override
	public void tearDown() {

	}

}
