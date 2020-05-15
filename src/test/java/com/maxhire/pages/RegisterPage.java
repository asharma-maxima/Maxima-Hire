package com.maxhire.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
		
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
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
		
	
	
	
	
}


