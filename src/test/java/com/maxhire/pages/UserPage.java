package com.maxhire.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage {
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement User_tab;
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']//em")
	private WebElement User_profileName;
	
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu dropdown')]//li//a")
	private WebElement User_profileName_DropDown_list;
	
	@FindBy(xpath="//a[text()='Add User']")
	private WebElement User_addUser_button;
	
	@FindBy(xpath="//input[@placeholder='First Name']//preceding::option")
	private WebElement User_firstNameSalutation_list;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement User_firstName_textBox;
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement User_email_textBox;
	
	@FindBy(xpath="//input[@placeholder='Confirm email']")
	private WebElement User_confirmEmail_textBox;
	
	@FindBy(xpath="//div[@class='access_level']//option")
	private WebElement User_accessLevelDropdown_list;
	
	@FindBy(xpath="//button[text()=' Add User ']")
	private WebElement User_NewAddUser_button;
	
	@FindBy(xpath="//span[contains(text(),'First name is')]")
	private WebElement User_firstName_errMsg;
	
	@FindBy(xpath="//span[contains(text(),'Last name is')]")
	private WebElement User_lastName_errMsg;
	
	@FindBy(xpath="//span[contains(text(),'Email is required.')]")
	private WebElement User_email_errMsg;
	
	@FindBy(xpath="//span[contains(text(),'Confirm email')]")
	private WebElement User_confirmEmail_errMsg;
	
	@FindBy(xpath="//p[contains(text(),' Please fill')]")
	private WebElement User_fillForm_errMsg;
	
 
	public UserPage() {
		
	}

}
