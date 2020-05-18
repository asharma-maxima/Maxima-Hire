package com.maxhire.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditJobPage extends BasePage {
	
	@FindBy(xpath="//input[@placeholder='No. of openings']")
	private WebElement edJob_noOfOpenings_input;
	
	@FindBy(xpath="//div[@id='employment_type']//div//select")
	private WebElement job_employmentType_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Currency']")
	private WebElement job_currency_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Offered Salary']")
	private WebElement job_offeredSalary_input;
	
	@FindBy(xpath="//input[@placeholder='Offered Salary']//following-sibling::select")
	private WebElement job_salaryType_dropDown;
	
	@FindBy(xpath="//input[@placeholder='Enter Client Manager']")
	private WebElement job_clientManager_dropDown;
	
	@FindBy(xpath="//input[@placeholder='City name']")
	private WebElement job_cityName_input;
	
	@FindBy(xpath="//input[@placeholder='State name']")
	private WebElement job_stateName_input;
	
	@FindBy(xpath="//input[@placeholder='Zip code']")
	private WebElement job_zipCode_input;
	
	@FindBy(xpath="//input[@placeholder='Type Country']")
	private WebElement job_country_input;
	
	@FindBy(xpath="//input[@placeholder='Select Recruiter']")
	private WebElement job_recruiters_dropDown;
	
	@FindBy(xpath="//div[@id='status']")
	private WebElement job_status_dropDown;
	
	@FindBy(xpath="//div[@id='owner']//select")
	private WebElement job_owner_dropDown;
	
	@FindBy(xpath="//div[@id='department']//select")
	private WebElement job_department_dropDown;
	
	@FindBy(xpath="//label[contains(text(),'High Priority')]")
	private WebElement job_highPriority_checkBox;
	
	@FindBy(xpath="//label[contains(text(),'Resume Required')]")
	private WebElement job_resumeRequired_checkBox;
	
	@FindBy(xpath="//textarea[@placeholder='Job Description']")
	private WebElement job_jobDesciption_input;
	
	
	public EditJobPage(WebDriver driver) {
		super(driver);
	}
	
	
	
	}


