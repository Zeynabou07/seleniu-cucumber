
package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class CustActivityLogPage {

	//CUSTOMER ROLES
	@FindBy(how = How.XPATH, using = "//p[normalize-space()=\"Activity log\"]")
	private static WebElement btnActivityLog;
	
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()=\"Activity log\"]")
	private static WebElement txtMessagActivityLog;
	
	@FindBy(how = How.ID, using = "CreatedOnTo")
	private static WebElement chmpCreatedOn;
	
	@FindBy(how = How.ID, using = "search-log")
	private static WebElement btnSearch;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"card card-default\"]//div[@class=\"card-body\"]")
	private static WebElement resultActivityLog;
	

	public CustActivityLogPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		}

		/* Methods */
		public static WebElement clickBtnActivityLog() {
			return btnActivityLog;
		}
		
		public static WebElement visibleTxtPagActivityLog() {
			return txtMessagActivityLog;
		}
		public static WebElement getChmpCreatedOn () {
			return chmpCreatedOn;
		}
		public static WebElement clickBtnSearch() {
			return btnSearch;
		}
		
		public static WebElement visibleResultActivityLog() {
			return resultActivityLog;
		}	
		
	}