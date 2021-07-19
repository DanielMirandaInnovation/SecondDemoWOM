package com.wom.poc.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/userRegisters.feature",
    glue = "com.wom.poc.stepdefinitions",
    tags = "@regression or @smokeTest",
    snippets = SnippetType.CAMELCASE)
public class AvantelRunner {
}

