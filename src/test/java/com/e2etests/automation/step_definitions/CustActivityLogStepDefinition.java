package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.CustActivityLogPage;
import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustActivityLogStepDefinition {

	private SeleniumUtils seleniumUtils;
	private CustActivityLogPage custActivityLogPage;

	public CustActivityLogStepDefinition() {
		// loginPage = new LoginPage();
		this.seleniumUtils = new SeleniumUtils();
		custActivityLogPage = new CustActivityLogPage();

	}

	@When("Je clique sur Activity log")
	public void jeCliqueSurActivityLog() {
		seleniumUtils.click(CustActivityLogPage.clickBtnActivityLog());
	}

	@When("La page du detail des logs s affiche {string}")
	public void laPageDuDetailDesLogsSAffiche(String txt) {
		String text = CustActivityLogPage.visibleTxtPagActivityLog().getText();
		Assert.assertTrue(text.contains(txt));

	}

	@When("Je saisis dans le champ created from {string}")
	public void jeSaisisDansLeChampCreatedFrom(String date) {
		seleniumUtils.writeText(CustActivityLogPage.getChmpCreatedOn(), date);
	}

	@When("Je clique sur search")
	public void jeCliqueSurSearch() {
		seleniumUtils.click(CustActivityLogPage.clickBtnSearch());

	}

	@Then("La liste des logs s affiche {string}")
	public void laListeDesLogsSAffiche(String dateResult) {
		String text = CustActivityLogPage.visibleResultActivityLog().getText();
		Assert.assertTrue(text.contains(dateResult));

	}

}
