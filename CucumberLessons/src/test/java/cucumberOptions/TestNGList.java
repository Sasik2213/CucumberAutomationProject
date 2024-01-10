package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/java/features",dryRun = false,glue = "stepDefinitions",monochrome = true)
public class TestNGList extends AbstractTestNGCucumberTests {

}
