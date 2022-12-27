package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LoginPage;
import com.e2etests.automation.utils.SeleniumUtils;

import io.cucumber.java.en.When;

public class LoginMultipleUsersStepDefinition {


		private LoginPage loginPage;
		private SeleniumUtils seleniumUtils;

		public LoginMultipleUsersStepDefinition() {
			this.seleniumUtils = new SeleniumUtils();
			loginPage = new LoginPage();
		}
	

		@When("Je redige un admin_email  {string}")
		public void jeRedigeUnAdminEmail(String username) {
			seleniumUtils.writeText(LoginPage.getEmail(), username);
		}
		@When("Je redige le  password {string}")
		public void jeRedigeLePassword(String password) {
			seleniumUtils.writeText(LoginPage.getPassword(), password);

		    
		}




	}