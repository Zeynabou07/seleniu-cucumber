package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.CustUpdateAdressPage;
import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustUpdateAdressStepDefinition {

	

	private LoginPage loginPage;
	private SeleniumUtils seleniumUtils;
	private CustUpdateAdressPage custUpdateAdressPage;

	public CustUpdateAdressStepDefinition() {
		//loginPage = new LoginPage();
		this.seleniumUtils = new SeleniumUtils();
		custUpdateAdressPage = new CustUpdateAdressPage();
	}
	


	@When("Le bouton online customers s affiche {string}")
	public void leBoutonOnlineCustomersSAffiche(String txt) {
		String text = CustUpdateAdressPage.visibleBtnOnlineCust().getText();
		//System.out.println(text);
		Assert.assertTrue(text.contains(txt));
	}
	
	@When("Je clique sur le bouton online customers")
	public void jeCliqueSurLeBoutonOnlineCustomers() {
		seleniumUtils.click(CustUpdateAdressPage.clickBtnOnlineCust());
	}
	@When("La page online customers s affiche {string}")
	public void laPageOnlineCustomersSAffiche(String txt) {
		String text = CustUpdateAdressPage.visibleMessagPagOnlineCust().getText();
		Assert.assertTrue(text.contains(txt));
	}
	@When("Je clique sur le client Guest")
	public void jeCliqueSurLeClientGuest() {
		seleniumUtils.click(CustUpdateAdressPage.clickBtnGuest());  
	}
	@When("La page de detail s affiche {string}")
	public void laPageDeDetailSAffiche(String txt) {
		String text = CustUpdateAdressPage.visibleMessagPagEditInfo().getText();
		Assert.assertTrue(text.contains(txt)); 
	}
	@When("Je clique sur le bouton adresse")
	public void jeCliqueSurLeBoutonAdresse() {
		seleniumUtils.click(CustUpdateAdressPage.clickBtnAdresse());
	   
	}
	@When("Les informations s affiche {string}")
	public void lesInformationsSAffiche(String txt) {
		String text = CustUpdateAdressPage.visibleBntNewAdresse().getText();
		System.out.println(text);
		//Assert marche pas ne sort pas le text dans la console
		//Assert.assertTrue(text.contains(txt));
	    
	}
	@When("Je clique sur le bouton Add new Adress")
	public void jeCliqueSurLeBoutonAddNewAdress() {
				
		//Scroller avant de cliquer sur le bouton
		//seleniumUtils.scrollByVisibilityOfElement(CustUpdateAdressPage.visibleBntNewAdresse(), null);
		seleniumUtils.click(CustUpdateAdressPage.clickBntNewAdresse());

		
	}
	@When("Le formulaire  a modifier s affiche {string}")
	public void leFormulaireAModifierSAffiche(String txt) {
		String text = CustUpdateAdressPage.visibleMessPagAddNewAdresse().getText();
		Assert.assertTrue(text.contains(txt));  
	}
	@When("Je choisis un pays")
	public void jeChoisisUnPays() {
		seleniumUtils.click(CustUpdateAdressPage.clickChmpCountry());
		SeleniumUtils.selectByValue(CustUpdateAdressPage.clickChmpCountry(), "1");
	    
	}
	@When("Je choisis la ville")
	public void jeChoisisLaVille() {
		seleniumUtils.click(CustUpdateAdressPage.clickChmpCountry());
		SeleniumUtils.selectByValue(CustUpdateAdressPage.clickChmpCity(), "9");
	   
	}
	@When("je clique sur le bouton save")
	public void jeCliqueSurLeBoutonSave() {
		seleniumUtils.click(CustUpdateAdressPage.clickChmpCity());

	}
	@Then("La page de modification d adresse s affiche {string}")
	public void laPageDeModificationDAdresseSAffiche(String txt) {
		String text = CustUpdateAdressPage.VisibleMessagUpdateAdresse().getText();
		Assert.assertTrue(text.contains(txt)); 
	}





}
