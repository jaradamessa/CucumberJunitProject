package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/java/features/",
				glue = "stepDefs",
		monochrome = true, 
		plugin = {
				"pretty",
                "html:target/cucmber",
                "json:target/cucumber.json" },
		tags = ("@Login and not @WIP "))

public class Runner {

}
