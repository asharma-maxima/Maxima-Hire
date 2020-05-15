package com.maxhire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

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
		super(driver);
		
	}
	


//	public static void main(String[] args) {


}
