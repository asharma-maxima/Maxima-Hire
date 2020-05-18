package com.maxhire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddJobPage extends BasePage{
	
	@FindBy(xpath="//input[@placeholder='Enter Job Title']")
	WebElement job_Title_Input;
	
	@FindBy(xpath="//input[@placeholder='No. of openings']")
	WebElement job_Openings_Input;
	
	@FindBy(xpath="//input[@placeholder='Enter Required ID']")
	WebElement job_requiredID_Input;
	
	@FindBy(xpath="//div[text()='Job Type']//following-sibling::select")
	WebElement job_jobType_dropDown;
	
	@FindBy(xpath="//div[text()='Employment Type']//following-sibling::select")
	WebElement job_employmentType_dropDown;
	
	@FindBy(xpath="//div[text()='Owner']//following-sibling::select")
	WebElement job_Owner_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Currency']")
	WebElement job_Currency_Input;
	
	@FindBy(xpath="//input[@placeholder='Offered Salary']")
	WebElement job_offeredSalary_Input;
	
	@FindBy(xpath="//div[@for='salary_type']//following-sibling::select")
	WebElement job_salaryType_dropDown;
	
	@FindBy(xpath="//div[text()='Department']//following-sibling::select")
	WebElement job_Department_dropDown;
	
	@FindBy(xpath="//label[contains(text(),'High Priority')]")
	WebElement job_highPriority_checkBox;
	
	@FindBy(xpath="//input[@placeholder='Enter Client Manager']")
	WebElement job_clientManager_Input;
	
	@FindBy(xpath="//label[contains(text(),'Resume Required')]")
	WebElement job_resumeRequired_checkBox;
	
	@FindBy(xpath="//input[@placeholder='City name']")
	WebElement job_City_Input;
	
	@FindBy(xpath="//input[@placeholder='State name']")
	WebElement job_State_Input;
	
	@FindBy(xpath="//input[@placeholder='Zip code']")
	WebElement job_zipcode_Input;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	WebElement job_country_Input;
	
	@FindBy(xpath="//div[@class='multiselect__tags']//input[@placeholder='Select Hiring Manager']")
	WebElement job_hiringManager_dropDown;
	
	@FindBy(xpath="//div[@class='multiselect__tags']//input[@placeholder='Select Recruiter']")
	WebElement job_Recruiter_dropDown;
	
	@FindBy(xpath="//textarea[@placeholder='Description of job']")
	WebElement job_Description_input;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
	WebElement job_Submit_Button;
	
	public AddJobPage(WebDriver driver) {
		super(driver);
		
	}
	
		
	
	
	
	
	
	}


