package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features/OrangeHrmFile.feature" }, // feature file or folder name
glue = { "stepdefination" }, 
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
monochrome = true, publish = true
)

public class TestRunnerOrg extends AbstractTestNGCucumberTests {

}
