
package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class CustomersPage {

	/* @FindBy */
	/*@FindBy(how = How.XPATH, using = "//h1[normalize-space()=\"Dashboard\"]")
	private static WebElement txt_Mess_Dashboard;*/
	
//CUSTOMER ADD
	@FindBy(how = How.XPATH, using = "//a[@href=\"#\"]//p[contains(text(),\"Customers\")]")
	private static WebElement btn_Customers_1;
	

	@FindBy(how = How.XPATH, using = "//a[@href=\"/Admin/Customer/List\"]//p[contains(text(),\"Customers\")]")
	private static WebElement btn_Customers_2;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()=\"Add new\"]")
	private static WebElement btn_AddNew;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id=\"Email\"]")
	private static WebElement chmpEmail;
	
	@FindBy(how = How.ID, using = "Gender_Female")
	private static WebElement chmpGenre;
	
	@FindBy(how = How.ID, using = "DateOfBirth")
	private static WebElement chmpDateNaiss;
	
	@FindBy(how = How.NAME, using = "save")
	private static WebElement btnSave;
	
	@FindBy(how = How.CSS, using = ".alert.alert-success.alert-dismissable")
	private static WebElement txtMessagEditCustomer;
	
	
	
	
	public CustomersPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		}

		/* Methods */
		public static WebElement visibleBtnCustomer1() {
			return btn_Customers_1;
		}
		
		public static WebElement clickBtnCustomer1() {
			return btn_Customers_1;
		}
		public static WebElement clickBtnCustomer2() {
			return btn_Customers_2;
		}
		
		public static WebElement visibleBtnCustomer2() {
			return btn_Customers_2;
		}
		public static WebElement clickBtnAddNew() {
			return btn_AddNew;
		}
		
		public static WebElement getEmail() {
			return chmpEmail;
		}
		
		public static WebElement getGenre() {
			return chmpGenre;
		}
		public static WebElement getDateNaiss() {
			return chmpDateNaiss;
		}
		
		public static WebElement clickBtnSave() {
			return btnSave;
		}
		
		public static WebElement getMessageAddCustomers() {
			return txtMessagEditCustomer;
		}
	}