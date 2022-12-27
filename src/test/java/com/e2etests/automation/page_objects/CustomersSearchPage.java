
package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class CustomersSearchPage {

	//CUSTOMER ROLES
	@FindBy(how = How.XPATH, using = "//div[@class=\"search-text\"]")
	private static WebElement MessagPagSearchCust;
	
	@FindBy(how = How.ID, using = "SearchEmail")
	private static WebElement btnMail;
	
	
	@FindBy(how = How.ID, using = "search-customers")
	private static WebElement btnSearch;
	
	@FindBy(how = How.XPATH, using = "//div[@class=\"card card-default\"]//div[@class=\"card-body\"]")
	private static WebElement tableauSearch;
	
		

	public CustomersSearchPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		}

		/* Methods */
		public static WebElement visibleTxtPageSearch() {
			return MessagPagSearchCust;
		}
		
		public static WebElement getMail() {
			return btnMail;
		}
		public static WebElement clickBtnSearch () {
			return btnSearch;
		}
		public static WebElement getResult() {
			return tableauSearch;
		}
		
		
		
		
	}