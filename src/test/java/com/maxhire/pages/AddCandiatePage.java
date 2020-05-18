package com.maxhire.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
	
	public class AddCandiatePage extends BasePage {
		
		@FindBy(xpath="//input[@id='file']")
		 private WebElement can_chooseFile_button;
		
		@FindBy(xpath="//div[contains(text(),'First Name')]//following-sibling::select")
		private WebElement can_title_dropDown;
		
		@FindBy(xpath="//input[@placeholder='First Name']")
		private WebElement can_firstName_input;
		
		@FindBy(xpath="//input[@placeholder='Middle Name']")
		private WebElement can_middleName_input;
		
		@FindBy(xpath="//input[@placeholder='Last Name']")
		private WebElement can_lastName_input;
		
		@FindBy(xpath="//input[@placeholder='URL: http://www.something.com']")
		private WebElement can_profile_input;
		
		@FindBy(xpath="//div[contains(text(),'Owner')]//following-sibling::select")
		private WebElement can_owner_dropDown;
		
		@FindBy(xpath="//input[@placeholder='Select Birth Date']")
		private WebElement can_dateOfBirth_calanderSelect;
		
		@FindBy(xpath="//input[@placeholder='Primary Email']")
		private WebElement can_primaryEmail_input;
		
		@FindBy(xpath="//input[@placeholder='Confirm Primary Email']")
		private WebElement can_confirmPrimaryEmail_input;
		
		@FindBy(xpath="//div[contains(text(),'Primary Phone')]//following-sibling::select")
		private WebElement can_phoneType_dropDown;
		
		@FindBy(xpath="//input[@placeholder='Primary Phone']")
		private WebElement can_primaryPhoneNo_input;
		
		@FindBy(xpath="//input[@placeholder='Confirm Primary Phone']")
		private WebElement can_confirmPrimaryNo_input;
		
		@FindBy(xpath="//input[@placeholder='Alternate Email']")
		private WebElement can_alternateEmail_input;
		
		@FindBy(xpath="//div[contains(text(),'Alternate Phone')]//following-sibling::select")
		private WebElement can_alternatePhoneType_dropDown;
		
		@FindBy(xpath="//input[@placeholder='Alternate Phone']")
		private WebElement can_alternatePhoneNo_input;
		
		@FindBy(xpath="//textarea[@placeholder='Full Address']")
		private WebElement can_address_input;
		
		@FindBy(xpath="//input[@placeholder='City']")
		private WebElement can_city_input;
		
		@FindBy(xpath="//input[@placeholder='State']")
		private WebElement can_state_input;
		
		@FindBy(xpath="//input[@placeholder='Type Country']")
		private WebElement can_country_input;
		
		@FindBy(xpath="//input[@placeholder='Zip Code']")
		private WebElement can_zipCode_input;
		
		@FindBy(xpath="//label[@class='custom-control-label']")
		private WebElement can_relocate_toggleButton;
		
		@FindBy(xpath="//input[@placeholder='Select Available Date']")
		private WebElement can_bestTimeToCall_calanderSelect;
		
		@FindBy(xpath="//input[@placeholder='Time: Eg, 9am to 5pm']")
		private WebElement can_Time_input;
		
		@FindBy(xpath="//input[@placeholder='Time Zone']")
		private WebElement can_timeZone_autoDropDown;
		
		@FindBy(xpath="//input[@placeholder='Current Employer']")
		private WebElement can_currentEmployer_input;
		
		@FindBy(xpath="//input[@placeholder='Select Joining Date']")
		private WebElement can_joiningDate_calanderSelect;
		
		@FindBy(xpath="//input[@placeholder='Type Currency']")
		private WebElement can_currency_autoDropDown;
		
		@FindBy(xpath="//input[@placeholder='Current Package']")
		private WebElement can_currentPackage_input;
		
		@FindBy(xpath="//input[@placeholder='Expected Package']")
		private WebElement can_expectedPackage_input;
		
		@FindBy(xpath="//input[@placeholder='Notice Period']")
		private WebElement can_noticePeriod_input;
		
		@FindBy(xpath="//div[contains(text(),'Ratings')]//following-sibling::select")
		private WebElement can_ratings_dropDown;
		
		@FindBy(xpath="//div[contains(text(),'Source')]//following-sibling::select")
		private WebElement can_source_dropDown;
		
		@FindBy(xpath="//div[contains(text(),'Sourced by')]//following-sibling::select")
		private WebElement can_sourcedBy_dropDown;
		
		@FindBy(xpath="//div[@class='multiselect__tags']")
		private WebElement can_jobType_dropDown;
		
		@FindBy(xpath="//a[contains(text(),'Attach Multiple Documents')]")
		private WebElement can_attachDocuments_button;
		
		@FindBy(xpath="//a[contains(text(),'Comments')]")
		private WebElement can_comments_input;
		
		@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
		private WebElement can_submit_input;
		
		public AddCandiatePage(WebDriver driver) {
			super(driver);		
		
		}

	}


