package com.orangehrm.browsers;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverInstance extends AbstarctWebDriverInstance {

	protected WebDriver driver;
	

	public WebDriverInstance() {
		System.out.println("I am webdriver Instance interface");

	}

	public abstract void tearDown();

	public void quit() {
		if (driver != null) {
			driver.close();
			driver.quit();

			tearDown();

			driver = null;

		}
	}

	public WebDriver getDriver() {
		return this.driver;
	}

}
