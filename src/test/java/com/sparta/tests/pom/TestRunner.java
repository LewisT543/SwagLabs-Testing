package com.sparta.tests.pom;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty", "html:target/fullTestReport.html", "json:target/fullJsonReport.json"},
        tags = ""
)
public class TestRunner {
}
