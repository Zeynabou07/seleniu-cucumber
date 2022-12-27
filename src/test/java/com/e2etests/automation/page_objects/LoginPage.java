package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class LoginPage {

	/* @FindBy */
	@FindBy(how = How.ID, using = "Email")
	private static WebElement admin_email;

	@FindBy(how = How.ID, using = "Password")
	private static WebElement admin_password;
	

	@FindBy(how = How.CSS, using = ".buttons")
	private static WebElement LoginBtn;
	
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()=\"Dashboard\"]")
	private static WebElement TextMessage;
	
	
	
	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	/* Methods */
	public static WebElement getEmail() {
		return admin_email;
	}

	public static WebElement getPassword() {
		return admin_password;
	}
	
	public static WebElement clickOnLogin() {
		return LoginBtn;
	}
	
	public static WebElement getTextMessage() {
		return TextMessage;
	}
	
	

}
