package com.maxhire.tests;

import org.testng.annotations.Test;

import com.maxhire.pages.LoginPage;

public class LoginTest extends BaseTest{

	@Test	
	public void login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		loginPage.verifyLoginPageTitle("maxhire");
	}
}
