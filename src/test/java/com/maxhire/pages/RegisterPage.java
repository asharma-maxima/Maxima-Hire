package com.maxhire.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='First name']")
	WebElement reg_firstName_Input;
	
	@FindBy(xpath="//input[@placeholder='Last name']")
	WebElement reg_lastName_Input;
	
	@FindBy(xpath="//input[@placeholder='Client name']")
	WebElement reg_clientName_Input;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement reg_emailAddress_Input;
	
	@FindBy(xpath="//input[@placeholder='Confirm email address ']")
	WebElement reg_confirmEmailAddress_Input;
	
	@FindBy(xpath="//input[@placeholder='Create password']")
	WebElement reg_createPassword_Input;
	
	@FindBy(xpath="//input[@placeholder='Confirm password']")
	WebElement reg_confirmPassword_Input;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement reg_register_Button;
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement reg_login_Link;
	
	
	
	public RegisterPage() {
		
		PageFactory.initElements(driver,RegisterPage.class);
	}
	
		
	
	
	
	
}


