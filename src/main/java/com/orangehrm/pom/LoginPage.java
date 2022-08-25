package com.orangehrm.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.orangehrm.browsers.WebDriverInstance;
import com.orangehrm.commonutils.CommonUIActions;

public class LoginPage extends BasePage {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoginPage.class);

	// Constructore ehich initilise the driver and commmonutils Object

	public LoginPage(WebDriverInstance webDriverInstance, CommonUIActions commonUIActions) {
		super(webDriverInstance, commonUIActions);

	}

	@Override
	public boolean isPageLoaded() {

		String LoginPageUrl = driver.getCurrentUrl();
		LOGGER.debug("Checking if the user is on Login page.  Current URL:{}", LoginPageUrl);
		return LoginPageUrl.contains("orangehrmlive");

	}

	// Loactors and selectors for element

	private static final String USERNAME_LOCATOR = "//input[@id='txtUsername']";
	private static final String PASSWORD_LOCATOR = "//input[@id='txtPassword']";
	private static final String LOGIN_LOCATOR = "//input[@id='btnLogin']";

	private static final By USERNAME_SELECTOR = By.xpath(USERNAME_LOCATOR);
	private static final By PASSWORD_SELECTOR = By.xpath(PASSWORD_LOCATOR);
	private static final By LOGIN_SELECTOR = By.xpath(LOGIN_LOCATOR);

	// Methods to get the elements

	public WebElement getUsernameById() {
		return commonUIActions.waitUntilAppearAndGetElement(webDriverInstance, LOGIN_SELECTOR);
	}

	public WebElement getpasswordById() {
		return commonUIActions.waitUntilAppearAndGetElement(webDriverInstance, PASSWORD_SELECTOR);
	}

	public WebElement getLoginButtonById() {
		return commonUIActions.waitUntilAppearAndGetElement(webDriverInstance, LOGIN_SELECTOR);
	}

	// Actions methods

	public LoginPage enterUsername(String username) {
		getUsernameById().clear();
		getUsernameById().sendKeys(username);
		return this;
	}

	public void enterPassword(String password) {
		getpasswordById().clear();
		getpasswordById().sendKeys(password);
		return;
	}

	public HomePage clickLoginButton() {
		 commonUIActions.waitAndClickedElement(webDriverInstance, LOGIN_SELECTOR);
		 return new HomePage();

	}

	public void doLogin(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();

	}

}
