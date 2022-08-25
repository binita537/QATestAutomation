package com.orangehrm.stepdefinitions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.orangehrm.browsers.BrowserType;
import com.orangehrm.browsers.DriverFactory;
import com.orangehrm.browsers.WebDriverInstance;
import com.orangehrm.commonutils.PropertiesFileUtils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseStepDefinitions {


	WebDriverInstance driver;

	private static final Logger LOGGER = LoggerFactory.getLogger(Hooks.class);

	private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	@Before
	public void startSenario(Scenario scenario) throws Exception {

		String testcaseName = String.format("%s:%s", scenario.getName().replace(" ", "_"), scenario.getLine());

		LOGGER.info("Strting the tets case : '{}'", scenario.getName());
		System.out.println(
				String.format("[%s] string tets case :%s ", dateFormat.format(new Date()), scenario.getName()));

//		driver = DriverFactory.getDriverInstance(BrowserType.CHROME);
//		driver.getDriver().get(PropertiesFileUtils.getValueFromPropertiesFile("url"));

	}

	/*
	 * @before
	 * @after
	 * @beforeStep
	 * @afterStep
	 * 
	 * @before
	 * 
	 * // If not oreder then execute alpha order or need to mention order (will
	 * execute start from lower order 0,1,2,3)(minus oreder is also)
	 * 
	 * @Before(value = "@smoke",order=1)
	 * 
	 * @Before(value = "@tags") //its called conditional hooks with tag expression 
	public void startSenarioForSpecificTags(Scenario scenario) throws Exception {

		System.out.println("This step will execute for specific tags");
		
	}
	 * 
	 */

	

	@After
	public void endScenario(Scenario scenario) {

		LOGGER.info("%s:%s", scenario.getName(), scenario.getLine());

		driver.getDriver().close();

	}
}
