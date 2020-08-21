package com.maxhire.tests;

import org.testng.annotations.Test;

import com.maxhire.pages.RegisterPage;

public class RegisterTest extends BaseTest{

	@Test
	public void register() throws InterruptedException {
		RegisterPage obj = new RegisterPage(driver);
		obj.register("Supriya", "A", "clientname","a.supriya64@gmail.com","a.supriya64@gmail.com","Qwer@1234","Qwer@1234");
		
		
	}
}