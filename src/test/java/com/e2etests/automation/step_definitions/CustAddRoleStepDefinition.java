package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.CustAddRolePage;
import com.e2etests.automation.page_objects.CustomersPage;
import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustAddRoleStepDefinition {

	
	private LoginPage loginPage;
	private SeleniumUtils seleniumUtils;
	private CustAddRolePage custAddRolePage;

	public CustAddRoleStepDefinition() {
		//loginPage = new LoginPage();
		this.seleniumUtils = new SeleniumUtils();
		custAddRolePage = new CustAddRolePage();

	}

	@When("Je clique sur le bouton customer_roles")
	public void jeCliqueSurLeBoutonCustomerRoles() {
		seleniumUtils.click(CustAddRolePage.clickBtnCustRole());
	   
	}

	/*@When("La page custumer role s affiche {string}")
	public void laPageCustumerRoleSAffiche(String txt) {
		//Thread.sleep(2000);
		String text = CustAddRolePage.visibleTxtPagCustRole().getText();
		System.out.println(txt);
		//Assert ne marche pas et le texte n est pas affiche dans la console
		//Assert.assertTrue(text.contains(txt));
		}*/

	@When("La page d ajout s affiche {string}")
	public void laPageDAjoutSAffiche(String txt) {
		String text = CustAddRolePage.visibleTxtAddCustRole().getText();
		//System.out.println(txt);
		Assert.assertTrue(text.contains(txt));
	}
	
	@When("Je saisis le nom {string}")
	public void jeSaisisLeNom(String name) {
		seleniumUtils.writeText(CustAddRolePage.getName(), name);
	    
	}
	@When("Je coche la case free shipping")
	public void jeCocheLaCaseFreeShipping() {
		seleniumUtils.click(CustAddRolePage.getFreeShipping());
	    
	}
	@When("Je clique sur le bouton choose a product")
	public void jeCliqueSurLeBoutonChooseAProduct() {
		seleniumUtils.click(CustAddRolePage.clickChooseProduct());
	}
	@When("La page du choix du produit s affiche {string}")
	public void laPageDuChoixDuProduitSAffiche(String txt) {
		 String text = CustAddRolePage.visibleTxtPagCustRole().getText();
			Assert.assertTrue(text.contains(txt));
	}
	@When("Je clique sur le bouton select du champ Build your own computer")
	public void jeCliqueSurLeBoutonSelectDuChampBuildYourOwnComputer() {
		seleniumUtils.click(CustAddRolePage.clickSelectProduct());

	}
	@When("Le produit est ajoute {string}")
	public void leProduitEstAjoute(String txt) {
		String text = CustAddRolePage.visibleTxtPagCustRole().getText();
		Assert.assertTrue(text.contains(txt));
	}
	@Then("Le message d ajout role s affiche {string}")
	public void leMessageDAjoutRoleSAffiche(String txt) {
		String text = CustAddRolePage.visibleTxtPagCustRole().getText();
		Assert.assertTrue(text.contains(txt));
	   
	}



}
