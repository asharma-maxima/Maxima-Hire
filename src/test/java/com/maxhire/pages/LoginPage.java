package com.maxhire.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;

	@FindBy(xpath="//input[@placeholder='Email address']")
	private WebElement mail_add;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='signin btn btn-primary']")
	private WebElement login_btn;
	
	public LoginPage() {
	
		PageFactory.initElements(driver,LoginPage.class);
	}

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   
		 new LoginPage();
		 
	    driver= new ChromeDriver();
		 
		driver.get("http://maximahire.com:8000/login");
		 
		driver.manage().timeouts().implicitlyWait(250, TimeUnit.SECONDS);
		 
		Thread.sleep(5000);
	 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		mail_add.sendKeys("kmore@maximaconsulting.net");	
		 
		password.sendKeys("max@123");
		 
		login_btn.click();
	}
	
}

