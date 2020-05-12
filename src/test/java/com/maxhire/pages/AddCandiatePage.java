package com.maxhire.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
	public class AddCandiatePage {
		
		WebDriver driver;

		@FindBy(xpath="//input[@id='file']")
		WebElement can_chooseFile;
		
		@FindBy(xpath="//div[contains(text(),'First Name')]//following-sibling::select")
		WebElement can_title;
		
		@FindBy(xpath="//input[@placeholder='First Name']")
		WebElement can_firstName;
		
		@FindBy(xpath="//input[@placeholder='Middle Name']")
		WebElement can_middleName;
		
		@FindBy(xpath="//input[@placeholder='Last Name']")
		WebElement can_lastName;
		
		@FindBy(xpath="//input[@placeholder='URL: http://www.something.com']")
		WebElement can_profile;
		
		@FindBy(xpath="//div[contains(text(),'Owner')]//following-sibling::select")
		WebElement can_owner;
		
		@FindBy(xpath="//input[@placeholder='Select Birth Date']")
		WebElement can_dateOfBirth;
		
		@FindBy(xpath="//input[@placeholder='Primary Email']")
		WebElement can_primaryEmail;
		
		@FindBy(xpath="//input[@placeholder='Confirm Primary Email']")
		WebElement can_confirmPrimaryEmail;
		
		@FindBy(xpath="//div[contains(text(),'Primary Phone')]//following-sibling::select")
		WebElement can_phoneType;
		
		@FindBy(xpath="//input[@placeholder='Primary Phone']")
		WebElement can_primaryPhoneNo;
		
		@FindBy(xpath="//input[@placeholder='Confirm Primary Phone']")
		WebElement can_confirmPrimaryNo;
		
		@FindBy(xpath="//input[@placeholder='Alternate Email']")
		WebElement can_alternateEmail;
		
		@FindBy(xpath="//div[contains(text(),'Alternate Phone')]//following-sibling::select")
		WebElement can_alternatePhone;
		
		@FindBy(xpath="//input[@placeholder='Alternate Phone']")
		WebElement can_alternatePhoneNo;
		
		@FindBy(xpath="//textarea[@placeholder='Full Address']")
		WebElement can_address;
		
		@FindBy(xpath="//input[@placeholder='City']")
		WebElement can_city;
		
		@FindBy(xpath="//input[@placeholder='State']")
		WebElement can_state;
		
		@FindBy(xpath="//input[@placeholder='Type Country']")
		WebElement can_country;
		
		@FindBy(xpath="//input[@placeholder='Zip Code']")
		WebElement can_zipCode;
		
		@FindBy(xpath="//label[@class='custom-control-label']")
		WebElement can_relocate;
		
		@FindBy(xpath="//input[@placeholder='Select Available Date']")
		WebElement can_bestTimeToCall;
		
		@FindBy(xpath="//input[@placeholder='Time: Eg, 9am to 5pm']")
		WebElement can_time;
		
		@FindBy(xpath="//input[@placeholder='Time Zone']")
		WebElement can_timeZone;
		
		@FindBy(xpath="//input[@placeholder='Current Employer']")
		WebElement can_currentEmployer;
		
		@FindBy(xpath="//input[@placeholder='Select Joining Date']")
		WebElement can_joiningDate;
		
		@FindBy(xpath="//input[@placeholder='Type Currency']")
		WebElement can_currency;
		
		@FindBy(xpath="//input[@placeholder='Current Package']")
		WebElement can_currentPackage;
		
		@FindBy(xpath="//input[@placeholder='Expected Package']")
		WebElement can_expectedPackage;
		
		@FindBy(xpath="//input[@placeholder='Notice Period']")
		WebElement can_noticePeriod;
		
		@FindBy(xpath="//div[contains(text(),'Ratings')]//following-sibling::select")
		WebElement can_ratings;
		
		@FindBy(xpath="//div[contains(text(),'Source')]//following-sibling::select")
		WebElement can_source;
		
		@FindBy(xpath="//div[contains(text(),'Sourced by')]//following-sibling::select")
		WebElement can_sourcedBy;
		
		@FindBy(xpath="//div[@class='multiselect__tags']")
		WebElement can_jobType;
		
		@FindBy(xpath="//a[contains(text(),'Attach Multiple Documents')]")
		WebElement can_attachDocuments;
		
		@FindBy(xpath="//a[contains(text(),'Comments')]")
		WebElement can_comments;
		
		@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
		WebElement can_submit;
		
		public AddCandiatePage() {
			PageFactory.initElements(driver, AddCandiatePage.class);
		
		
		}

	}


