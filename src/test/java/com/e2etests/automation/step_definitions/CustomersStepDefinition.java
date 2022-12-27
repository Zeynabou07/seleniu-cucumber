
package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.CustomersPage;
import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomersStepDefinition {

	private LoginPage loginPage;
	private SeleniumUtils seleniumUtils;
	private CustomersPage customersPage;

	public CustomersStepDefinition() {
		//loginPage = new LoginPage();
		this.seleniumUtils = new SeleniumUtils();
		customersPage = new CustomersPage();

	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {

	}
	@Given("Le bouton customers est visible")

	public void leBoutonCustomersEstVisible() {

		String text = CustomersPage.visibleBtnCustomer1().getText();
		System.out.println(text);
		// Assert.assertTrue(text.contains(txt));
	}

	@When("Je clique sur le bouton customers1")
	public void jeCliqueSurLeBoutonCustomers1() {
		seleniumUtils.click(CustomersPage.clickBtnCustomer1());
	}

	@When("Je clique sur le bouton customers2")
	public void jeCliqueSurLeBoutonCustomers2() {
		seleniumUtils.click(CustomersPage.clickBtnCustomer2());
	}

	@When("Je clique sur le bouton Add new")
	
	public void jeCliqueSurLeBoutonAddNew() {
		seleniumUtils.click(CustomersPage.clickBtnAddNew());
	}

	@When("Je saisis le adresse email {string}")
	public void jeSaisisLeAdresseEmail(String mail) throws InterruptedException {
		Thread.sleep(2000);
		seleniumUtils.writeText(CustomersPage.getEmail(), mail);
	}

	@When("je coche la case femelle")
	public void jeCocheLaCaseFemelle() {
		seleniumUtils.click(CustomersPage.getGenre());
	    
	}
	@When("Je choisis la date de naissance {string}")
	public void jeChoisisLaDateDeNaissance(String dateDeNaissance) {
		seleniumUtils.writeText(CustomersPage.getDateNaiss(), dateDeNaissance);
	   
	}

	@When("Je clique sur le bouton save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(CustomersPage.clickBtnSave());
		 
	}
	@Then("Le message d ajout d utilisateur s'affiche {string}")
	public void leMessageDAjoutDUtilisateurSAffiche(String txt) {
		String text = CustomersPage.getMessageAddCustomers().getText();
		Assert.assertTrue(text.contains(txt));
	   
	}







}
