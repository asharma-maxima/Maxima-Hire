package com.maxhire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditJobPage {

	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='No. of openings']")
	WebElement edJob_noOfOpenings_Input;
	
	@FindBy(xpath="//div[@id='employment_type']//div//select")
	WebElement job_employmentType_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Currency']")
	WebElement job_currency_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Offered Salary']")
	WebElement job_offeredSalary_Input;
	
	@FindBy(xpath="//input[@placeholder='Offered Salary']//following-sibling::select")
	WebElement job_salaryType_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Enter Client Manager']")
	WebElement job_clientManager_dropDown;
	
	@FindBy(xpath="//input[@placeholder='City name']")
	WebElement job_cityName_Input;
	
	@FindBy(xpath="//input[@placeholder='State name']")
	WebElement job_stateName_Input;
	
	@FindBy(xpath="//input[@placeholder='Zip code']")
	WebElement job_zipCode_Input;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	WebElement job_Country_Input;
	
	@FindBy(xpath="//input[@placeholder='Select Recruiter']")
	WebElement job_Recruiters_dropDown;
	
	@FindBy(xpath="//div[@id='status']")
	WebElement job_status_dropDown;
	
	@FindBy(xpath="//div[@id='owner']//select")
	WebElement job_Owner_dropDown;
	
	@FindBy(xpath="//div[@id='department']//select")
	WebElement job_Department_dropDown;
	
	@FindBy(xpath="//label[contains(text(),'High Priority')]")
	WebElement job_highPriority_checkBox;
	
	@FindBy(xpath="//label[contains(text(),'Resume Required')]")
	WebElement job_resumeRequired_checkBox;
	
	@FindBy(xpath="//textarea[@placeholder='Job Description']")
	WebElement job_jobDesciption_Input;
	
	
	
	public EditJobPage() {
		PageFactory.initElements(driver,EditJobPage.class);
		
	}
	
	
	
	}


