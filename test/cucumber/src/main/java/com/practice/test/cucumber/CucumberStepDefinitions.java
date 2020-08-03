package com.practice.test.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class CucumberStepDefinitions {

    private List<String> testList;

    @Given("I setup my test configuration")
    public void setupTestConfiguration() {
        testList = new ArrayList<>();
    }

    @When("I setup my test case")
    public void setupTestCase() {
        testList.add("Test");
    }

    @Then("My test case is Green")
    public void greenTestCase() {
        Assert.assertEquals(1, testList.size());
    }

    @Then("My test case is Red")
    public void redTestCase() {
        Assert.fail("Example failure");
    }
}
