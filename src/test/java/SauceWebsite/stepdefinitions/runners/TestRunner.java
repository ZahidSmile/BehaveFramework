package SauceWebsite.stepdefinitions.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "SauceWebsite.stepdefinitions",
        plugin = {"pretty", "html:D:/Reports/report.html"}, // Define the HTML report location
        monochrome = true
)
public class TestRunner {
}