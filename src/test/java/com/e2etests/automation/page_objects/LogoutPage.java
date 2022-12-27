package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class LogoutPage {

	/* @FindBy */
	@FindBy(how = How.LINK_TEXT, using ="Logout")
	private static WebElement btnLogout;
	
	@FindBy(how = How.XPATH, using ="//strong[normalize-space()=\"Welcome, please sign in!\"]")
	private static WebElement textMessage;
	
	
	//strong[normalize-space()="Welcome, please sign in!"]

	public LogoutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public static WebElement getLogout() {
		return btnLogout;
	}
	
	public static WebElement getTextMessage() {
		return textMessage;
	}

}
