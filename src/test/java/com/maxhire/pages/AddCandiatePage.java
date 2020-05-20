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

		public WebElement getCan_chooseFile_button() {
			return can_chooseFile_button;
		}

		public WebElement getCan_title_dropDown() {
			return can_title_dropDown;
		}

		public WebElement getCan_firstName_input() {
			return can_firstName_input;
		}

		public WebElement getCan_middleName_input() {
			return can_middleName_input;
		}

		public WebElement getCan_lastName_input() {
			return can_lastName_input;
		}

		public WebElement getCan_profile_input() {
			return can_profile_input;
		}

		public WebElement getCan_owner_dropDown() {
			return can_owner_dropDown;
		}

		public WebElement getCan_dateOfBirth_calanderSelect() {
			return can_dateOfBirth_calanderSelect;
		}

		public WebElement getCan_primaryEmail_input() {
			return can_primaryEmail_input;
		}

		public WebElement getCan_confirmPrimaryEmail_input() {
			return can_confirmPrimaryEmail_input;
		}

		public WebElement getCan_phoneType_dropDown() {
			return can_phoneType_dropDown;
		}

		public WebElement getCan_primaryPhoneNo_input() {
			return can_primaryPhoneNo_input;
		}

		public WebElement getCan_confirmPrimaryNo_input() {
			return can_confirmPrimaryNo_input;
		}

		public WebElement getCan_alternateEmail_input() {
			return can_alternateEmail_input;
		}

		public WebElement getCan_alternatePhoneType_dropDown() {
			return can_alternatePhoneType_dropDown;
		}

		public WebElement getCan_alternatePhoneNo_input() {
			return can_alternatePhoneNo_input;
		}

		public WebElement getCan_address_input() {
			return can_address_input;
		}

		public WebElement getCan_city_input() {
			return can_city_input;
		}

		public WebElement getCan_state_input() {
			return can_state_input;
		}

		public WebElement getCan_country_input() {
			return can_country_input;
		}

		public WebElement getCan_zipCode_input() {
			return can_zipCode_input;
		}

		public WebElement getCan_relocate_toggleButton() {
			return can_relocate_toggleButton;
		}

		public WebElement getCan_bestTimeToCall_calanderSelect() {
			return can_bestTimeToCall_calanderSelect;
		}

		public WebElement getCan_Time_input() {
			return can_Time_input;
		}

		public WebElement getCan_timeZone_autoDropDown() {
			return can_timeZone_autoDropDown;
		}

		public WebElement getCan_currentEmployer_input() {
			return can_currentEmployer_input;
		}

		public WebElement getCan_joiningDate_calanderSelect() {
			return can_joiningDate_calanderSelect;
		}

		public WebElement getCan_currency_autoDropDown() {
			return can_currency_autoDropDown;
		}

		public WebElement getCan_currentPackage_input() {
			return can_currentPackage_input;
		}

		public WebElement getCan_expectedPackage_input() {
			return can_expectedPackage_input;
		}

		public WebElement getCan_noticePeriod_input() {
			return can_noticePeriod_input;
		}

		public WebElement getCan_ratings_dropDown() {
			return can_ratings_dropDown;
		}

		public WebElement getCan_source_dropDown() {
			return can_source_dropDown;
		}

		public WebElement getCan_sourcedBy_dropDown() {
			return can_sourcedBy_dropDown;
		}

		public WebElement getCan_jobType_dropDown() {
			return can_jobType_dropDown;
		}

		public WebElement getCan_attachDocuments_button() {
			return can_attachDocuments_button;
		}

		public WebElement getCan_comments_input() {
			return can_comments_input;
		}

		public WebElement getCan_submit_input() {
			return can_submit_input;
		}
		public void candidate() {
			
			can_chooseFile_button.click();
			can_firstName_input.Sendkeys(firstname);
			can_middleName_input.sendKeys(middlename);
			can_lastName_input.sendKeys(lastname);
			can_profile_input.sendKeys(profile);
			can_owner_dropDown.isSelected();
			can_dateOfBirth_calanderSelect.isSelected();
			can_primaryEmail_input.sendKeys(email);
			can_confirmPrimaryEmail_input.sendKeys(confirmemail);
			can_phoneType_dropDown.isSelected();
			can_primaryPhoneNo_input.sendKeys(phoneno);
			can_confirmPrimaryNo_input.sendKeys(confirmphoneno);
			can_alternateEmail_input.sendKeys(alternateemail);
			can_alternatePhoneType_dropDown.isSelected();
			
			
		}
	
	}
	


