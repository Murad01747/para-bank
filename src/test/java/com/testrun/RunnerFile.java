package com.testrun;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"json:target/cucumber.json"},
		features = {"./src/main/resources/LoginFunctionTest.feature"},
		glue = {"com.generic"},
		tags = {"@Smoke"},
		dryRun = false,
		strict = true,
		monochrome = true
		)
public class RunnerFile extends AbstractTestNGCucumberTests {

}
