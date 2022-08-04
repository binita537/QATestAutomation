package com.orangehrm.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.orangehrm.browsers.WebDriverInstance;
import com.orangehrm.commonutils.CommonUtils;

public class LoginPage extends BasePage {

	public LoginPage(WebDriverInstance webDriverInstance, CommonUtils commonUtils) {
		super(webDriverInstance, commonUtils);

	}

	private static final String USERNAME_LOCATOR = "//input[@id='txtUsername']";
	private static final String PASSWORD_LOCATOR = "//input[@id='txtPassword']";
	private static final String LOGIN_LOCATOR = "//input[@id='btnLogin']";

	private static final By USERNAME_SELECTOR = By.xpath(USERNAME_LOCATOR);
	private static final By PASSWORD_SELECTOR = By.xpath(PASSWORD_LOCATOR);
	private static final By LOGIN_SELECTOR = By.xpath(LOGIN_LOCATOR);

	public WebElement getUsernameById() {
		return commonUtils.waitUntilAppearAndGetElement(driver, USERNAME_SELECTOR);
	}

	public WebElement getpasswordById() {
		return commonUtils.waitUntilAppearAndGetElement(driver, PASSWORD_SELECTOR);
	}

	public WebElement getLoginButtonById() {
		return commonUtils.waitUntilAppearAndGetElement(driver, LOGIN_SELECTOR);
	}

	public void enterUsername(String username) {
		getUsernameById().clear();
		getUsernameById().sendKeys(username);
	}

	public void enterPassword(String password) {
		getpasswordById().clear();
		getpasswordById().sendKeys(password);
	}

	public boolean clickLoginButton() {
		return commonUtils.waitAndClickElement(driver, LOGIN_SELECTOR);
	}

	public void doLogin(String username, String password) {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();

	}

}
