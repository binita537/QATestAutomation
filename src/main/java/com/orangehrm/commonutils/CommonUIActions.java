package com.orangehrm.commonutils;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.orangehrm.browsers.AbstarctWebDriverInstance;

//Why we created this class ? if in fucture some mobile application and if we want to write a MobileUiAction then we can extends this class

public abstract class CommonUIActions extends AbstarctCommonActions<WebElement> {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommonUIActions.class);

	public CommonUIActions() {

	}
	
	public boolean waitAndClickedElement(AbstarctWebDriverInstance abstarctWebDriverInstance, WebElement webElement)
	{
		return super.waitAndClickedElement(abstarctWebDriverInstance, webElement);
	}
	
	public boolean waitAndClickedElement(AbstarctWebDriverInstance abstarctWebDriverInstance, By by)
	{
		return super.waitAndClickedElement(abstarctWebDriverInstance, by);
	}

	public WebElement waitUntilElementToBeClickable(AbstarctWebDriverInstance abstarctWebDriverInstance, WebElement webElement) {
		return super.waitUntilElementToBeClickable(abstarctWebDriverInstance, webElement);

	}

	public WebElement waitUntilElementToBeClickable(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		return super.waitUntilElementToBeClickable(abstarctWebDriverInstance, by);

	}

	public WebElement waitUntilAppearAndGetElement(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		return super.waitUntilAppearAndGetElement(abstarctWebDriverInstance, by);
	}

	public List<WebElement> waitUntilAppearAndAllGetElemets(AbstarctWebDriverInstance abstarctWebDriverInstance,
			By by) {
		return super.waitUntilAppearAndGetElements(abstarctWebDriverInstance, by);

	}

	public WebElement waitUntilPreseneceAndGetElemet(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		return super.waitUntilPreseneceAndGetElement(abstarctWebDriverInstance, by);

	}

	public List<WebElement> waitUntilPresenceAndAllGetElemets(AbstarctWebDriverInstance abstarctWebDriverInstance,
			By by) {
		return super.waitUntilPresenceAndAllGetElements(abstarctWebDriverInstance, by);
	}
}
