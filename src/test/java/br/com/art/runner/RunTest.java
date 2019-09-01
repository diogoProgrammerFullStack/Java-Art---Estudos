package br.com.art.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/art/teste.feature",
				glue="", 
				tags="@teste")
public class RunTest {

}
