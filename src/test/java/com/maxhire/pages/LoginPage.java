package com.maxhire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;

	@FindBy(xpath="//input[@placeholder='Email address']")
	 private WebElement mail_add;

	@FindBy(xpath="//input[@placeholder='Password']")
	 private WebElement password;

	@FindBy(xpath="//button[@class='signin btn btn-primary']")
	 private WebElement login_btn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMail_add() {
		return mail_add;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_btn() {
		return login_btn;
	}

	public LoginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	


//	public static void main(String[] args) {


}
