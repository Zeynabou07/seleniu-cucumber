
package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class CustUpdateAdressPage {

	// CUSTOMER ROLES
	@FindBy(how = How.XPATH, using = "//p[normalize-space()=\"Online customers\"]")
	private static WebElement btnOnlineCust;

	@FindBy(how = How.XPATH, using = "//h1[normalize-space()=\"Online customers\"]")
	private static WebElement messagPagOnlineCust;

	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Guest')])[1]")
	private static WebElement btnGuest;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),\"Customer info\")]")
	private static WebElement messagPagEditInfo;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),\"Addresses\")]")
	private static WebElement btnAdresse;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()=\"Add new address\"]")
	private static WebElement bntNewAdresse;

	@FindBy(how = How.XPATH, using = "//h1[@class=\"float-left\"]")
	private static WebElement messagPagAddNewAdress;

	@FindBy(how = How.ID, using = "Address_CountryId")
	private static WebElement chmpCountry;

	@FindBy(how = How.XPATH, using = "Address_StateProvinceId")
	private static WebElement chmpCity;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()=\"Save\"]")
	private static WebElement btnSave;

	@FindBy(how = How.ID, using = "purchased-with-product-name")
	private static WebElement MessagUpdateAdresse;

	public CustUpdateAdressPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */

	public static WebElement visibleBtnOnlineCust() {
		return btnOnlineCust;
	}

	public static WebElement clickBtnOnlineCust() {
		return btnOnlineCust;
	}

	public static WebElement visibleMessagPagOnlineCust() {
		return messagPagOnlineCust;
	}

	public static WebElement clickBtnGuest() {
		return btnGuest;
	}

	public static WebElement visibleMessagPagEditInfo() {
		return messagPagEditInfo;
	}

	public static WebElement clickBtnAdresse() {
		return btnAdresse;
	}

	public static WebElement clickBntNewAdresse() {
		return bntNewAdresse;
	}

	public static WebElement visibleBntNewAdresse() {
		return bntNewAdresse;
	}

	public static WebElement visibleMessPagAddNewAdresse() {
		return messagPagAddNewAdress;
	}

	public static WebElement clickChmpCountry() {
		return chmpCountry;
	}

	public static WebElement clickChmpCity() {
		return chmpCity;
	}

	public static WebElement clickBtnSave() {
		return btnSave;
	}

	public static WebElement VisibleMessagUpdateAdresse() {
		return MessagUpdateAdresse;
	}

}