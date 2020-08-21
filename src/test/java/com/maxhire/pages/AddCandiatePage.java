package com.maxhire.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
	
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
		
		@FindBy(xpath="//a[contains(text(),'Attach Multiple Documents')]")
		private WebElement can_attachDocuments_button;
		
		@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
		private WebElement can_submit_button;
		
		@FindBy(xpath="//input[@id='files']")
		private WebElement can_chooseFile1_button;
		
		@FindBy(xpath="//div[@class='vdatetime-calendar__current--month']")
		WebElement can_calmonth_select;
		
		@FindBy(xpath="//div[@class='vdatetime-calendar__navigation--next']//*[local-name()='svg']")
		WebElement can_cal_nextIcon;
		
		@FindBy(xpath="//div[@class='vdatetime-calendar__month__day']")
		WebElement can_calDay_select;
		
		@FindBy(xpath="//div[@class='vdatetime-popup__year']")
		WebElement can_calYear_select;
		
		@FindBy(xpath="//div[contains(text(),'Cancel')]")
		WebElement can_calCancel_button;
		
		@FindBy(xpath="//div[contains(text(),'Ok')]")
		WebElement can_calOk_button;
		
		@FindBy(xpath="//div[@class='multiselect__tags']")
		WebElement can_assignJob_dropdown;
		
		@FindBy(xpath="//a[contains(text(),'Comments')]")
		WebElement can_comments_button;
		
		@FindBy(xpath="//textarea[@placeholder='Comments, if any!']")
		WebElement can_enterComments_input;
		
		@FindBy(xpath="//i[@class='multiselect__tag-icon']")
		WebElement can_jobTypeTag_icon;
		
		@FindBy(xpath="//input[@placeholder='Assign Job']")
		WebElement can_assignjob_input;
		
		@FindBy(xpath="//input[@placeholder='Please enter key skill with comma seperator.']")
		WebElement can_keySkills_input;
		
		
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

		public WebElement getCan_attachDocuments_button() {
			return can_attachDocuments_button;
		}

		public WebElement getCan_submit_button() {
			return can_submit_button;
		}
		
		public WebElement getCan_chooseFile1_button() {
			return can_chooseFile1_button;
		}
		
		public WebElement getCan_calmonth_select() {
			return can_calmonth_select;
		}

		public WebElement getCan_cal_nextIcon() {
			return can_cal_nextIcon;
		}

		public WebElement getCan_calDay_select() {
			return can_calDay_select;
		}
		
		public WebElement getCan_calYear_select() {
			return can_calYear_select;
		}

		public WebElement getCan_calCancel_button() {
			return can_calCancel_button;
		}
		
		public WebElement getCan_calOk_button() {
			return can_calOk_button;
		}
		public WebElement getCan_assignJob_dropdown() {
			return can_assignJob_dropdown;
		}

		public WebElement getCan_comments_button() {
			return can_comments_button;
		}

		public WebElement getCan_enterComments_input() {
			return can_enterComments_input;
		}
		
		public WebElement getCan_jobTypeTag_icon() {
			return can_jobTypeTag_icon;
		}
		public WebElement getCan_assignjob_input() {
			return can_assignjob_input;
		}
		
		public WebElement getCan_keySkills_input() {
			return can_keySkills_input;
		}
			
		public void addCand()
			{
			bas_add_button.click();
			bas_addCandidate_icon.click();
			}
			
			public void uploadResume(String path) throws InterruptedException
			{
				//driver.findElement(By.xpath("//label[contains(text(),'Import Resume')]")).click();
				WebElement resume=getCan_chooseFile_button();
				Thread.sleep(2000);
				resume.click();
				resume.sendKeys(path);
				resume.sendKeys(Keys.ENTER);
			}
			
			public void enterName(String nametype,String firstname,String middlename,String lastname,String profile)
			{
				getCan_title_dropDown().click();
				Select title=new Select(getCan_title_dropDown());
				title.selectByVisibleText(nametype);
				getCan_firstName_input().sendKeys(firstname);
				getCan_middleName_input().sendKeys(middlename);
				getCan_lastName_input().sendKeys(lastname);
				getCan_profile_input().sendKeys(profile);
			}
			
			public void selectOwner(String ownervalue)
			{
				getCan_owner_dropDown().click();
				Select own =new Select(getCan_owner_dropDown());
				own.selectByValue(ownervalue);
			}
			
			
			public void selectDob(String year,String month,String day) throws InterruptedException
			{
				getCan_dateOfBirth_calanderSelect().click();
				getCan_calYear_select().click();
				driver.findElement(By.xpath("//div[@class='vdatetime-year-picker__list vdatetime-year-picker__list']//div[contains(text(),"+year+")]")).click();
				Thread.sleep(4000);
				//getCan_calCancel_button()
				getCan_calOk_button().click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//div[@class='vdatetime-popup__date']")).click();
				Thread.sleep(4000);
				//driver.findElement(By.xpath("//div[@class='vdatetime-month-picker__list vdatetime-month-picker__list']/div[contains(text(),"+month+")]")).click();
				clickUsingJavascript(driver.findElement(By.xpath("//div[@class='vdatetime-month-picker__list vdatetime-month-picker__list']/div[contains(text(),"+month+")]")));
				//System.out.println("\"//div[@class='vdatetime-month-picker__list vdatetime-month-picker__list']/div[contains(text(),"+month+")]"));
				//getCan_calCancel_button()
				//getCan_calOk_button().click(); 
	
				//driver.findElement(By.xpath("//div[@class='vdatetime-calendar__month__day']//span[contains(text(),"+day+")]")).click();
				getCan_calCancel_button();
				getCan_calOk_button().click(); 	
				Thread.sleep(4000);
				}	

			public void enterEmail(String email,String confirmemail )
			{
				getCan_primaryEmail_input().sendKeys(email);
				getCan_confirmPrimaryEmail_input().sendKeys(confirmemail);	
			}
			
			public void primaryPhone(String phntype,String phoneno,String cphoneno)
			{
			getCan_phoneType_dropDown().click();
			Select ptype=new Select(getCan_phoneType_dropDown());
			ptype.selectByVisibleText(phntype);
			getCan_primaryPhoneNo_input().sendKeys(phoneno);
			getCan_confirmPrimaryNo_input().sendKeys(cphoneno);
			
			}
			public void altEmailPhnNo(String altemail, String altphonetype,String altphoneno)
			{
				getCan_alternateEmail_input().sendKeys(altemail);
				getCan_alternatePhoneType_dropDown().click();
				Select altptype=new Select(getCan_alternatePhoneType_dropDown());
				altptype.selectByVisibleText(altphonetype);
				getCan_alternatePhoneNo_input().sendKeys(altphoneno);	
			}
			
			public void addressDetails(String address,String city,String state,String country,String zipcode)
			{
				getCan_address_input().sendKeys(address);
				getCan_city_input().sendKeys(city);
				getCan_state_input().sendKeys(state);
				getCan_country_input().sendKeys(country);
				getCan_zipCode_input().sendKeys(zipcode);	
			}
			
			public void relocate()
			{
				getCan_relocate_toggleButton().click();
			}
			
			public void selectDateToCallTime(int month,String day,String year)
			{
				getCan_bestTimeToCall_calanderSelect().click();
				getCan_dateOfBirth_calanderSelect().click();
				getCan_calYear_select().click();
				driver.findElement(By.xpath("//div[@class='vdatetime-year-picker__list vdatetime-year-picker__list']//div[contains(text(),"+year+")]")).click();
				//Thread.sleep(4000);
				//getCan_calCancel_button()
				getCan_calOk_button().click();
				//Thread.sleep(4000);
				Select months=new Select(driver.findElement(By.xpath("//div[@class='vdatetime-month-picker__list vdatetime-month-picker__list']")));
				months.selectByIndex(month);
				
			}
				//getCan_Time_input().sendKeys(time);
			
			
			public void selectTimeZone(String timezone)
			{
				WebElement zone= getCan_timeZone_autoDropDown();
				zone.click();
				zone.sendKeys(timezone);
				zone.sendKeys(Keys.ENTER);	 
			}
			
			public void employeeDetails (String curntemployer,String currency,String curntpackage,String exppackage,String noticeperiod)
			{
				getCan_currentEmployer_input().sendKeys(curntemployer);
				/*WebElement calMonth=getCan_joiningDate_calanderSelect();
				while(!calMonth.getText().contains(month))
				{
					getCan_cal_nextIcon().click();
				}
				
				@SuppressWarnings("unchecked")
				List<WebElement> days=(List<WebElement>) getCan_calDay_select();
				int count=days.size();
				for(int i=0;i<count;i++)
				{
					String text=days.get(i).getText();
					if(text.equalsIgnoreCase(day))
					{
						days.get(i).click();
					}
				}
				WebElement cur=getCan_currency_autoDropDown();
				cur.click();
				cur.sendKeys(currency);
				cur.sendKeys(Keys.ENTER);*/
				getCan_currentPackage_input().sendKeys(curntpackage);
				getCan_expectedPackage_input().sendKeys(exppackage);
				getCan_noticePeriod_input().sendKeys(noticeperiod);
				
				}
			
			public void selectRating(String rating)
			{
				getCan_ratings_dropDown().click();
				Select rat=new Select(getCan_ratings_dropDown());
				rat.selectByVisibleText(rating);
			}	
			
			public void selectSource(String source)
			{
			getCan_source_dropDown().click();
			Select src=new Select(getCan_source_dropDown());
			src.selectByVisibleText(source);
			}
			
			public void selectSourceBy(String sourcedby)
			{
			getCan_sourcedBy_dropDown().click();
			Select srcby=new Select(getCan_sourcedBy_dropDown());
			srcby.selectByVisibleText(sourcedby);
			}
			public void keySkills(String skills)
			{
				getCan_keySkills_input().click();
				getCan_keySkills_input().sendKeys(skills);
			}
			public void selectJobType(String assignjob) 
			{
				 getCan_assignJob_dropdown().click();
				 WebElement job=getCan_assignjob_input();
				 job.click();
				 job.sendKeys(assignjob);
				 job.sendKeys(Keys.ENTER);
				 getCan_jobTypeTag_icon().click();
				
			}
			public void uploadAttachments(String filepath)
			{
				getCan_attachDocuments_button().click();
				WebElement attach=getCan_chooseFile1_button();
				attach.click();
				attach.sendKeys(filepath);
				attach.sendKeys(Keys.ENTER);
			}
			public void comments(String cmnts)
			{
				getCan_comments_button().click();
				getCan_enterComments_input().click();
				getCan_enterComments_input().sendKeys(cmnts);
				
			}
			
			public void submit()
			{
				getCan_submit_button().click();
			
			}
	}
				
	


