package com.maxhire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditJob {

	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='No. of openings']")
	WebElement job_noOfOpenings;
	
	@FindBy(xpath="")
	WebElement job_employmentType;
	
	@FindBy(xpath="//input[@placeholder='Currency']")
	WebElement job_currency;
	
	@FindBy(xpath="//input[@placeholder='Offered Salary']")
	WebElement job_offeredSalary;
	
	@FindBy(xpath="")
	WebElement job_salaryType;
	
	@FindBy(xpath="//input[@placeholder='Enter Client Manager']")
	WebElement job_clientManager;
	
	@FindBy(xpath="//input[@placeholder='City name']")
	WebElement job_cityName;
	
	@FindBy(xpath="//input[@placeholder='State name']")
	WebElement job_stateName;
	
	@FindBy(xpath="//input[@placeholder='Zip code']")
	WebElement job_zipCode;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	WebElement job_country;
	
	@FindBy(xpath="//input[@placeholder='Select Recruiter']")
	WebElement job_recruiters;
	
	@FindBy(xpath="//div[@id='status']")
	WebElement job_status;
	
	@FindBy(xpath="")
	WebElement job_owner;
	@FindBy(xpath="")
	WebElement job_Department;
	@FindBy(xpath="//label[contains(text(),'High Priority')]")
	WebElement job_highPriority;
	
	@FindBy(xpath="//label[contains(text(),'Resume Required')]")
	WebElement job_resumeRequired;
	
	
	
	
	}


