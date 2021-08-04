package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(                         //matches futures and step definitions and runs with glue

        plugin = {"json:target/cucumber.json"},     //to ask cucumber to create json fail for report
        features = "src/test/resources/features",   //1-settings/put where my futures folder is located
         glue = "com/vytrack/step_definitions",     //2-settings where step definitions are
         dryRun = false,                            //true checks just to get the undefined steps, false runs each one
         tags = "@navigate"                         //runs certain scenario(s)

)
public class CukesRunner {

}
