package com.maxhire.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maxhire.pages.LoginPage;
import com.maxhire.pages.UserPage;

public class UserTest extends BaseTest {
	@BeforeTest
	public void login() throws InterruptedException {
		Thread.sleep(4000);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		Thread.sleep(3000);
		loginPage.verifyLoginPageTitle("maxhire");
		
	}
	
	@Test
	public void User() throws InterruptedException
	{
		UserPage users=new UserPage(driver);
		users.addUser();
		users.enterName("Miss", "ikya", "sol", "L");
		users.enterEmail("Ert123@gmail.com", "Ert123@gmail.com");
		users.phoneNumber("Work", "9547123659");
		Thread.sleep(3000);
		users.address("6-7", "bangalore", "587426", "karnataka", "India");
		users.accessLevel("Recruiter");
		Thread.sleep(3000);
		users.branchDept("aa", "abc");
		Thread.sleep(3000);
		users.welcomeEmail();
		Thread.sleep(3000);
		users.submitUser();
		Thread.sleep(3000);
		
		
	}
		

}
