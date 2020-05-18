package com.maxhire.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class RegisterPage extends BasePage {
	
		
	@FindBy(xpath="//input[@placeholder='First name']")
	WebElement reg_firstName_input;
	
	@FindBy(xpath="//input[@placeholder='Last name']")
	WebElement reg_lastName_input;
	
	@FindBy(xpath="//input[@placeholder='Client name']")
	WebElement reg_clientName_input;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement reg_emailAddress_input;
	
	@FindBy(xpath="//input[@placeholder='Confirm email address ']")
	WebElement reg_confirmEmailAddress_input;
	
	@FindBy(xpath="//input[@placeholder='Create password']")
	WebElement reg_createPassword_input;
	
	@FindBy(xpath="//input[@placeholder='Confirm password']")
	WebElement reg_confirmPassword_input;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement reg_register_button;
	
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement reg_login_link;
	
	@FindBy(xpath="//a[@class='register btn btn-primary']" )
	WebElement reg_mainRegister_button;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getRegister() {
		return reg_register_button;
	}
	
	public WebElement getFirstname() {
		return reg_firstName_input;
	}
	
	public WebElement getLastname() {
		return reg_lastName_input;
	
	public WebElement getClientname() {
		return reg_clientName_input;
	}
	
	public WebElement getEmail() {
		return reg_emailAddress_input;
	}
	
	public WebElement getConfirmemail() {
		return reg_confirmEmailAddress_input;
	}
	
	public WebElement getPassword() {
		return reg_createPassword_input;
	}
	
	public WebElement getConfirmpassword() {
		return reg_confirmPassword_input;	
	}
	
	public WebElement getMainregister() {
		return reg_mainRegister_button;
	}
	
	public WebElement getLogin() {
	
		return reg_login_link;
	}


	
	@Test
	public void Register() {
		 reg_register_button.click();
		 reg_firstName_input.sendKeys("Supriya");
		 reg_lastName_input.sendKeys("A");
		 reg_clientName_input.sendKeys("Statestreet");
		 reg_emailAddress_input.sendKeys("a.supriya64@gmail.com");
		 reg_confirmEmailAddress_input.sendKeys("a.supriya64@gmail.com");
		 reg_createPassword_input.sendKeys("hello");
		 reg_confirmPassword_input.sendKeys("hello");;
		 reg_mainRegister_button.click();
		 reg_login_link.click();
		 
		 
	}

	
	
	
	
}


