package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.CustAddRolePage;
import com.e2etests.automation.page_objects.CustomersPage;
import com.e2etests.automation.page_objects.CustomersSearchPage;
import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomersSearchStepDefinition {

	
	private SeleniumUtils seleniumUtils;
	private CustomersPage customersPage;
	private CustomersSearchPage customersSearchPage;

	public CustomersSearchStepDefinition() {
		//loginPage = new LoginPage();
		this.seleniumUtils = new SeleniumUtils();
		customersSearchPage = new CustomersSearchPage();
		customersPage = new CustomersPage();

	}


	@When("Une liste deroulante s affiche {string}")
	public void uneListeDeroulanteSAffiche(String txt) {
		String text = CustomersPage.visibleBtnCustomer2().getText();
		//System.out.println(txt);
		Assert.assertTrue(text.contains(txt));
	}
	@When("Je clique sur l onglet customer")
	public void jeCliqueSurLOngletCustomer() {
		seleniumUtils.click(CustomersPage.clickBtnCustomer2());
	 
	}
	@When("La page customers s affiche {string}")
	public void laPageCustomersSAffiche(String txt) {
		String text = CustomersSearchPage.visibleTxtPageSearch().getText();
		System.out.println(txt);
		Assert.assertTrue(text.contains(txt));
	   
	}
	@When("Je saisis l email {string}")
	public void jeSaisisLEmail(String mail) {
		seleniumUtils.writeText(CustomersSearchPage.getMail(), mail); 
	}
	@When("Je clique sur le bouton search")
	public void jeCliqueSurLeBoutonSearch() {
		seleniumUtils.click(CustomersSearchPage.clickBtnSearch());
	   
	}
	@Then("Les informations recherchee s affiche {string}")
	public void lesInformationsRechercheeSAffiche(String txt) {
		String text = CustomersSearchPage.getResult().getText();
		Assert.assertTrue(text.contains(txt));
	   
	}







}
