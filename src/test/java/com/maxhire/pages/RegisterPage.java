package com.maxhire.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='First name']")
	WebElement reg_firstName_input;
	
	@FindBy(xpath="//input[@placeholder='Last name']")
	WebElement reg_lastName;
	
	@FindBy(xpath="//input[@placeholder='Client name']")
	WebElement reg_clientName;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement reg_emailAddress;
	
	@FindBy(xpath="//input[@placeholder='Confirm email address ']")
	WebElement reg_confirmEmailAddress;
	
	@FindBy(xpath="//input[@placeholder='Create password']")
	WebElement reg_createPassword;
	
	@FindBy(xpath="//input[@placeholder='Confirm password']")
	WebElement reg_confirmPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement reg_register;
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement reg_login_link;
	
	
	
	public RegisterPage() {
		
		PageFactory.initElements(driver,RegisterPage.class);
	}
	
		
	
	
	
	
}


