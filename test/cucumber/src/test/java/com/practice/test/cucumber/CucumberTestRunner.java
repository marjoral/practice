package com.practice.test.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        glue = {"com.practice.test.cucumber"},
        features = {"src/main/resources/features"},
        monochrome = true,
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class CucumberTestRunner {

}
