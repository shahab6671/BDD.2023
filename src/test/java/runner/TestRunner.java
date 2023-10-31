package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(     tags = "@smoke",
                                 features ="src/test/java/features",
                                 glue ={"base", "stepdefs"},
                                 dryRun =true,
                                 monochrome =true,
                                 plugin ={"pretty", "html:target/report.html", "json:target/report.json"})



public class TestRunner {

}
