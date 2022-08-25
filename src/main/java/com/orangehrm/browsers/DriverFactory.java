package com.orangehrm.browsers;

public class DriverFactory {

	public static WebDriverInstance getDriverInstance(BrowserType browserType) throws Exception {
		WebDriverInstance webDriverInstance;

		if (browserType == BrowserType.CHROME) {
			webDriverInstance = new ChromeDriverInstance();
			System.out.println("I am driverfactory class to deside which driver object you want ");

		} else if (browserType == BrowserType.FIREFOX) {
			webDriverInstance = new FirefoxDriverInstance();

		} else if (browserType == BrowserType.IE) {
			webDriverInstance = new IEDriverInstance();

		} else {

			throw new IllegalArgumentException(
					String.format("WebDriver type <%s> is not correct,please provide correct one", browserType));
		}

		return webDriverInstance;

	}
}