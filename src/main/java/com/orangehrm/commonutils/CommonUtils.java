package com.orangehrm.commonutils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommonUtils.class);

	public WebElement waitUntilAppearAndGetElement(WebDriver driver, By by) {

		WebDriverWait wait = new WebDriverWait(driver, 1000);
		WebElement webElement = null;

		try {
			webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			LOGGER.debug("selector <{}> did not appear {} second. Exception :", by, e);
		}
		return webElement;

	}

	public boolean waitAndClickElement(WebDriver driver, By by) {
		boolean clicked = false;
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		try {
			driver = (WebDriver) wait.until(ExpectedConditions.elementToBeClickable(by));
			clicked = true;
		} catch (Exception e) {
			LOGGER.debug("selector <{}> did not appear {} second. Exception :", by, e);
		}
		return clicked;

	}

}
