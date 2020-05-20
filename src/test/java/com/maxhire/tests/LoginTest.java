package com.maxhire.tests;

import org.testng.annotations.Test;

import com.maxhire.pages.LoginPage;

public class LoginTest extends BaseTest {

	@Test
	public void login() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		boolean isPresent = loginPage.getMail_add().isDisplayed();
		System.out.println("email address field is present " + isPresent);
		loginPage.getMail_add().sendKeys(username);
		loginPage.getPassword().sendKeys(password);
		loginPage.getLogin_btn().click();

	}
}
