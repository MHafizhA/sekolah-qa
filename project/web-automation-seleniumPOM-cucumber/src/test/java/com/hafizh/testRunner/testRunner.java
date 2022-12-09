package com.hafizh.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/BlastReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/FeatureBoard",
        glue = {"com/hafizh/stepsDefs"},
        monochrome = true,
        dryRun = false,
        tags = "@Board-Positive"
)

public class testRunner extends AbstractTestNGCucumberTests {
}
