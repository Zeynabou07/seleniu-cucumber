package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	private LoginPage loginPage;
	private SeleniumUtils seleniumUtils;
	private ConfigFileReader configFileReader;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
		this.seleniumUtils = new SeleniumUtils();
		configFileReader = new ConfigFileReader();

	}

	@Given("Je me connecte sur l application NopCommerce")
	public void jeMeConnecteSurLApplicationNopCommerce() {

		seleniumUtils.get(configFileReader.getProperties("home.url"));
	}

	@When("Je saisis le admin_email {string}")
	public void jeSaisisLeAdminEmail(String email) {
		seleniumUtils.writeText(LoginPage.getEmail(), email);

	}

	@When("Je saisis le admin_password {string}")
	public void jeSaisisLeAdminPassword(String mdpasse) {
		seleniumUtils.writeText(LoginPage.getPassword(), mdpasse);

	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		seleniumUtils.click(LoginPage.clickOnLogin());
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String txt) {
		String text = LoginPage.getTextMessage().getText();
		Assert.assertTrue(text.contains(txt));
	}

}
