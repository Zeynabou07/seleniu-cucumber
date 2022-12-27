package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LogoutPage;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogoutSepDefinition {

	private LogoutPage logoutPage;
	private SeleniumUtils seleniumUtils;

	public LogoutSepDefinition() {
		logoutPage = new LogoutPage();
		this.seleniumUtils = new SeleniumUtils();

	}

	@Given("Je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() {
		seleniumUtils.click(LogoutPage.getLogout());

	}

	@Then("Je suis deconnecte de la page {string}")
	public void jeSuisDeconnecteDeLaPage(String txt) {
		String text = LogoutPage.getTextMessage().getText();
		Assert.assertTrue(text.contains(txt));

	}

}
