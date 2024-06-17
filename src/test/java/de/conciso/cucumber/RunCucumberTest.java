package de.conciso.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "de.conciso.cucumber",
    plugin = {"pretty", "html:target/cucumber-reports.html"})
public class RunCucumberTest {
}
