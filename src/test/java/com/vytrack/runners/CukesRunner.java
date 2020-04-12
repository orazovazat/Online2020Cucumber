package com.vytrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "json:target/cucumber.json",
                "html:target/default-cucumber-reports"},
        tags = {"@create_a_car_with_list_of_maps"},                                     // ~ or not before tag ignore scenario
        features = {"src/test/resources/features"},
        glue = {"com/vytrack/step_definitions"},
        dryRun = false
)
public class CukesRunner {
}
