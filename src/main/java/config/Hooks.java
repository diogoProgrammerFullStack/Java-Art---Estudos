package config;

import commons.BaseTest;
import commons.SeleniumRobot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import factory.Web;

public class Hooks extends BaseTest{

	@Before(value = "@chrome")
	public void beforeScenarioChrome() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME_WINDOWS);
	}

	@After(value = "@chrome")
	public void afterScenarioWeb(Scenario scenario) {
		SeleniumRobot.generateEvidence(scenario);
		closeDriver();
	}
	
}
