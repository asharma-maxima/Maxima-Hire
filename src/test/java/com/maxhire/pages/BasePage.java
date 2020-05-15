package com.maxhire.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-secondary btn-sm']")
	WebElement bas_add_Button;
	
	@FindBy(xpath="//a[contains(text(),'Job')]")
	WebElement bas_addJob_Icon;
	
	@FindBy(xpath="//a[contains(text(),'Candidate')]")
	WebElement bas_addCandidate_Icon;
	
	@FindBy(xpath="//div[@class='save activate']//a[@aria-label='Save']")
	WebElement bas_saveChanges_Icon;
	
	@FindBy(xpath="//div[@class='save activate']//a[@aria-label='Cancel']")
	WebElement bas_cancelChanges_Icon;
	
	
	

	
	
	

}
