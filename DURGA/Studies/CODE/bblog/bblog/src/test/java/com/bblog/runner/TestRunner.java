package com.bblog.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "Features",
			glue = {"com.bblog.pagedefinitions" },
			dryRun=true,
	     tags= {"@bblogsignup"}  )
	
public class TestRunner {
	}
	
	
