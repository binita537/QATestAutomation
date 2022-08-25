package com.orangehrm.browsers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstarctWebDriverInstance {
	protected WebDriverWait webDriverWait;

	protected JavascriptExecutor javascriptExecutor;

	public WebDriverWait getWebDriverWait() {
		return webDriverWait;
	}

	public JavascriptExecutor getJavascriptExecutor() {
		return javascriptExecutor;
	}

}
