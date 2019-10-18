package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/feature/CreateLead.feature", 
glue = "steps",
monochrome = true)

public class Runtest extends AbstractTestNGCucumberTests {

}
