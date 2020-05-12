package com.maxhire.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.maxhire.pages.LoginPage;

public class BaseTest {
	
	@Test	
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://maximahire.com:8000/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		LoginPage loginPage = new LoginPage(driver);
		boolean isPresent = loginPage.getMail_add().isDisplayed();
		System.out.println("email address field is present "+isPresent);
		loginPage.getMail_add().sendKeys("kmore@maximaconsulting.net");
		loginPage.getPassword().sendKeys("maxima@123");
		loginPage.getLogin_btn().click();
	}

}
