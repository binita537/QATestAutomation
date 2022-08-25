package com.orangehrm.commonutils;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.orangehrm.browsers.BrowserType;
import com.orangehrm.browsers.DriverFactory;
import com.orangehrm.browsers.WebDriverInstance;

public class CommonUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommonUtils.class);

	private static DriverFactory driverFactory;
	private static WebDriverInstance driverInstance;

	public static WebDriverInstance getWenDriverInstance(BrowserType browserType) {
		try {
			driverInstance = driverFactory.getDriverInstance(browserType);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return driverInstance;
	}

	public void saveWebDriverInstance() {
		// here code to save webdriver instance in to one space
	}

	public void cleanWebDriverInstance() {
		// here code to clean webdriver instance
	}

	public File takeScreenshotInFile(WebDriver driver, String filepath) {

		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		return screenshot.getScreenshotAs(OutputType.FILE);

//		String FilePath=System.getProperty("user.dir")+"Screenshot"+scenario.getName()
//
//		File destinationFile = new File(filepath);
//		try {
//			FileUtils.copyFile(originalFile, destinationFile);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}

//
//public WebElement waitUntilAppearAndGetElement(WebDriver driver, By by) {
//
//	WebDriverWait wait = new WebDriverWait(driver, 1000);
//	WebElement webElement = null;
//
//	try {
//		webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
//	} catch (Exception e) {
//		LOGGER.debug("selector <{}> did not appear {} second. Exception :", by, e);
//	}
//	return webElement;
//
//}
//
//public boolean waitAndClickElement(WebDriver driver, By by) {
//	boolean clicked = false;
//	WebDriverWait wait = new WebDriverWait(driver, 1000);
//	try {
//		driver = (WebDriver) wait.until(ExpectedConditions.elementToBeClickable(by));
//		clicked = true;
//	} catch (Exception e) {
//		LOGGER.debug("selector <{}> did not appear {} second. Exception :", by, e);
//	}
//	return clicked;
//
//}
