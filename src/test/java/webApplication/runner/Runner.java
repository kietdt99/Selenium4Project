package webApplication.runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports",
                "json:target/cucumber-reports.json"
        },
        glue = "stepDefinitions",
        monochrome = true,
        features = {
                "./src/test/java/webApplication/executeTests/sample/feature/v1/webApplication.cucumber.stepDefinitions.Sample.feature"
        }
)
public class Runner extends Hook {
        //set up env, start driver,...
}
