
package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class CustAddRolePage {

	//CUSTOMER ROLES
	@FindBy(how = How.XPATH, using = "//p[normalize-space()=\"Customer roles\"]")
	private static WebElement btnCustRole;
	
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()=\"Customer roles\"]")
	private static WebElement txtMessagPagCustRole;
	
	@FindBy(how = How.CSS, using = ".float-left")
	private static WebElement txtMessagAddCustRole;
	
	@FindBy(how = How.CSS, using = "#Name")
	private static WebElement champName;
	
	@FindBy(how = How.ID, using = "FreeShipping")
	private static WebElement caseFreeShipping;
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()=\"Choose a product\"]")
	private static WebElement btnChooseProduct;
	
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()=\"Choose a product\"]")
	private static WebElement messagChooseProduct;
		
	@FindBy(how = How.XPATH, using = "(//button[contains(@type,'button')][normalize-space()='Select'])[1]")
	private static WebElement btnSelectProduct;
	
	@FindBy(how = How.ID, using = "purchased-with-product-name")
	private static WebElement MessagProduitchoisi;
	
		
	
	public CustAddRolePage() {
		PageFactory.initElements(Setup.getDriver(), this);
		}

		/* Methods */
		public static WebElement clickBtnCustRole() {
			return btnCustRole;
		}
		
		public static WebElement visibleTxtPagCustRole() {
			return txtMessagPagCustRole;
		}
		public static WebElement visibleTxtAddCustRole () {
			return txtMessagAddCustRole;
		}
		public static WebElement getName() {
			return champName;
		}
		
		public static WebElement getFreeShipping() {
			return caseFreeShipping;
		}
		
		public static WebElement clickChooseProduct() {
			return btnChooseProduct;
		}
		public static WebElement clickSelectProduct() {
			return btnSelectProduct;
		}
		
		public static WebElement visibleMessProduct() {
			return MessagProduitchoisi;
		}
		
		
	}