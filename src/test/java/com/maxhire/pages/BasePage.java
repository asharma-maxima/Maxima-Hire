package com.maxhire.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-secondary btn-sm']")
	WebElement bas_addButton;
	
	@FindBy(xpath="//a[contains(text(),'Job')]")
	WebElement bas_addJob;
	
	@FindBy(xpath="//a[contains(text(),'Candidate')]")
	WebElement bas_addCandidate;
	
	
	

}
