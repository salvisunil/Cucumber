package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/OrangeHRM.feature",
        glue= "stepDefination",
        dryRun = true,
        monochrome = true,
        plugin = {"pretty","html:target/Cucumber-Report/report1.html"}
)
public class TestRunner {
}
