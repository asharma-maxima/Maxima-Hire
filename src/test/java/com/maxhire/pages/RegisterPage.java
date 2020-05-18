package com.maxhire.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class RegisterPage {
	
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}	
	
	@FindBy(xpath="//a[@class='register btn btn-primary']" )
	WebElement reg_Register_Button;
	
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
	
	
	public WebElement register() {
		return reg_Register_Button;
	}
	
	public WebElement firstname() {
		return reg_firstName_Input;
	}
	
	public WebElement lastname() {
		return reg_lastName_Input;
	}
	
	public WebElement clientname() {
		return reg_clientName_Input;
	}
	
	public WebElement Email() {
		return reg_emailAddress_Input;
	}
	
	public WebElement ConformEmail() {
		return reg_confirmEmailAddress_Input;
	}
	
	public WebElement Password() {
		return reg_createPassword_Input;
	}
	
	public WebElement ConfirmPassword() {
		return reg_confirmPassword_Input;	
	}
	
	public WebElement Registers() {
		return reg_register_Button;
	}
	
	public WebElement Login() {
	
		return reg_login_Link;
	}

			
	
	@Test
	public void Register() {
		System.setProperty("WebDriver.Chrome.driver", "C:\\Suppi\\chromedriver.exe");
		 driver = new ChromeDriver();
		 RegisterPage obj= new RegisterPage(driver);
		 driver.get("http://maximahire.com:8000/login");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 obj.reg_Register_Button.click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 obj.reg_firstName_Input.sendKeys("Supriya");
		 obj.reg_lastName_Input.sendKeys("A");
		 obj.reg_clientName_Input.sendKeys("Statestreet");
		 obj.reg_emailAddress_Input.sendKeys("a.supriya64@gmail.com");
		 obj.reg_confirmEmailAddress_Input.sendKeys("a.supriya64@gmail.com");
		 obj.reg_createPassword_Input.sendKeys("hello");
		 obj.reg_confirmPassword_Input.sendKeys("hello");;
		 obj.reg_register_Button.click();
		 obj.reg_login_Link.click();
		 
		 
	}

}

