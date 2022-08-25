package com.orangehrm.tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/main/resources/features",
		glue = { "src/main/java/com.orangehrm.stepdefinitions" },
		plugin = {
				"pretty", "html.target/report/CucucmberReport.html",
				          "json.target/report/JsonReport.json",
				          "html.target/report/junitReport.xml" },
	   tags="@test"	

)
public class ITSuiteRunner {

}
