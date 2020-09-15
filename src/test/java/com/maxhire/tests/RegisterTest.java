package com.maxhire.tests;

import org.testng.annotations.Test;

import com.maxhire.pages.RegisterPage;

public class RegisterTest extends BaseTest{

	@Test
	public void register() throws InterruptedException {
		RegisterPage obj = new RegisterPage(driver);
		obj.register("S", "A", "clientname","asd@gmail.com","asd@gmail.com","Qwer@1234","Qwer@1234");
		
		
	}
}