package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/com.feature/Naukri.feature",
glue = "com.stepdefination", 
dryRun = false ,
monochrome = true ,
publish = true  ,
plugin = {"html:Reports/naukri.html",
		"json:Reports/naukri.json",
		"pretty" } )
public class NaukriRunner {
	
}
