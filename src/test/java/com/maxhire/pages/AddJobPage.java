package com.maxhire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddJobPage {

	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Enter Job Title']")
	WebElement job_title;
	
	@FindBy(xpath="//input[@placeholder='No. of openings']")
	WebElement job_openings;
	
	@FindBy(xpath="//input[@placeholder='Enter Required ID']")
	WebElement job_requiredID;
	
	@FindBy(xpath="//div[text()='Job Type']//following-sibling::select")
	WebElement job_jobType;
	
	@FindBy(xpath="//div[text()='Employment Type']//following-sibling::select")
	WebElement job_employmentType;
	
	@FindBy(xpath="//div[text()='Owner']//following-sibling::select")
	WebElement job_owner;
	
	@FindBy(xpath="//input[@placeholder='Currency']")
	WebElement job_currency;
	
	@FindBy(xpath="//input[@placeholder='Offered Salary']")
	WebElement job_offeredSalary;
	
	@FindBy(xpath="//div[@for='salary_type']//following-sibling::select")
	WebElement job_salaryType;
	
	@FindBy(xpath="//div[text()='Department']//following-sibling::select")
	WebElement job_department;
	
	@FindBy(xpath="//label[contains(text(),'High Priority')]")
	WebElement job_highPriority;
	
	@FindBy(xpath="//input[@placeholder='Enter Client Manager']")
	WebElement job_clientManager;
	
	@FindBy(xpath="//label[contains(text(),'Resume Required')]")
	WebElement job_resumeRequired;
	
	@FindBy(xpath="//input[@placeholder='City name']")
	WebElement job_city;
	
	@FindBy(xpath="//input[@placeholder='State name']")
	WebElement job_state;
	
	@FindBy(xpath="//input[@placeholder='Zip code']")
	WebElement job_zipcode;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	WebElement job_country;
	
	@FindBy(xpath="//div[@class='multiselect__tags']//input[@placeholder='Select Hiring Manager']")
	WebElement job_hiringManager;
	
	@FindBy(xpath="//div[@class='multiselect__tags']//input[@placeholder='Select Recruiter']")
	WebElement job_recruiter;
	
	@FindBy(xpath="//textarea[@placeholder='Description of job']")
	WebElement job_description;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
	WebElement job_submit;
	
	public AddJobPage() {
		PageFactory.initElements(driver,AddJobPage.class);
	}
	
		
	
	
	
	
	
	}


