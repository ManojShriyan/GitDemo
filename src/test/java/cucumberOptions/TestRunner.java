package cucumberOptions;

import org.junit.runner.RunWith;

@RunWith(io.cucumber.junit.Cucumber.class)
//@RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(features="src/test/java/Feature" , glue={"stepDefinations"})
//io.cucumber.junit.CucumberOptions(features="src/test/java/Feature" , glue={"stepDefinations"})

public class TestRunner {

}
