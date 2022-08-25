package com.orangehrm.commonutils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.orangehrm.browsers.AbstarctWebDriverInstance;

//Why we created this class ? if in fucture some mobile application and if we want to write a MobileUiAction then we can extends this class

public abstract class AbstarctCommonActions<T extends WebElement> {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbstarctCommonActions.class);
	
	
	public AbstarctCommonActions()
	{
		
	}

	public T findElement(T WebElement, By by) {
		return (T) WebElement.findElement(by);
	}

	public List<T> findElements(T WebElement, By by) {
		return (List<T>) WebElement.findElements(by);
	}
	
	public boolean waitAndClickedElement(AbstarctWebDriverInstance abstarctWebDriverInstance, T WebElement) {
		boolean clicked=false;
		try {
			abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.elementToBeClickable(WebElement)).click();
			clicked=true;

		} catch (Exception e) {
			LOGGER.debug("Unable to click element : <{}> . exception ", WebElement, e);
		}

		return clicked;

	}
	
	public boolean waitAndClickedElement(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		boolean clicked=false;
		try {
			abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.elementToBeClickable(by)).click();
			clicked=true;

		} catch (Exception e) {
			LOGGER.debug("Unable to click element : <{}> . exception ", by, e);
		}

		return clicked;

	}

	public T waitUntilElementToBeClickable(AbstarctWebDriverInstance abstarctWebDriverInstance, T WebElement) {
		T webElemet = null;
		try {
			webElemet = (T) abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.elementToBeClickable(WebElement));

		} catch (Exception e) {
			LOGGER.debug("Unable to click element : <{}> . exception ", WebElement, e);
		}

		return webElemet;

	}

	public T waitUntilElementToBeClickable(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		T webElemet = null;
		try {
			webElemet = (T) abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.elementToBeClickable(by));

		} catch (Exception e) {
			LOGGER.debug("Unable to click element : <{}> . exception ", by, e);
		}

		return webElemet;

	}

	public T waitUntilAppearAndGetElement(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		T webElemet = null;
		try {
			webElemet = (T) abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.visibilityOfElementLocated(by));

		} catch (Exception e) {
			LOGGER.debug(" Element is not appear: <{}> . exception ", by, e);
		}

		return webElemet;

	}

	public List<T> waitUntilAppearAndGetElements(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		List<T> webElemets = Collections.emptyList();
		try {
			webElemets = (List<T>) abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));

		} catch (Exception e) {
			LOGGER.debug(" Elements is not appear: <{}> . exception ", by, e);
		}

		return webElemets;

	}

	public T waitUntilPreseneceAndGetElement(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		T webElemet = null;
		try {
			webElemet = (T) abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.presenceOfElementLocated(by));

		} catch (Exception e) {
			LOGGER.debug(" Elements is not appear: <{}> . exception ", by, e);
		}

		return webElemet;

	}

	public List<T> waitUntilPresenceAndAllGetElements(AbstarctWebDriverInstance abstarctWebDriverInstance, By by) {
		List<T> webElemets = Collections.emptyList();
		try {
			webElemets = (List<T>) abstarctWebDriverInstance.getWebDriverWait()
					.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));

		} catch (Exception e) {
			LOGGER.debug(" Elements is not appear: <{}> . exception ", by, e);
		}

		return webElemets;

	}

}
