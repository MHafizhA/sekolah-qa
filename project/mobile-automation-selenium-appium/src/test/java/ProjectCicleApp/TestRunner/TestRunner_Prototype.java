package ProjectCicleApp.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = { "pretty",
                "json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumberreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/FeatureBoard",
        glue = {"ProjectCicleApp/StepsDefinition"},
        monochrome = true,
        dryRun = false,
        tags = "@PASCA01-Positive"
)

public class TestRunner_Prototype extends AbstractTestNGCucumberTests {

}
