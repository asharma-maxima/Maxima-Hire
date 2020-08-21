package com.maxhire.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maxhire.pages.AddCandiatePage;
import com.maxhire.pages.EditCandidatePage;
import com.maxhire.pages.LoginPage;

public class EditCandidateTest extends BaseTest {
	@BeforeTest
	public void login() throws InterruptedException {
		Thread.sleep(4000);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		Thread.sleep(3000);
		loginPage.verifyLoginPageTitle("maxhire");
		
	}
	
	@Test
	public void EdCandidate() throws InterruptedException
	{
		EditCandidatePage EdCandid=new EditCandidatePage(driver);
		EdCandid.candidateDetails();
		Thread.sleep(3000);
		EdCandid.editCandidate();
		Thread.sleep(3000);
		//EdCandid.candidateName("hi", "hello", "name", "Miss");
		Thread.sleep(5000);
		//EdCandid.emailDetails("Asdf@12344", "Asdf@12344");
		Thread.sleep(5000);
		//EdCandid.phoneDetails("Mobile", "7458961236", "7458961236");
		//EdCandid.altEmail("Zxcv@gmail.com");
		//EdCandid.altPhone("Work", "8529637412");
		//EdCandid.addressDetails("14A", "hyderabad", "748569", "AP", "India");
		//EdCandid.status("Inactive");
		//EdCandid.relocate();
		//EdCandid.selectOwner("Supriya Annam");
		//EdCandid.profileURL("asdf.com");
		//EdCandid.keySkills("Automation");
		//EdCandid.ratings("Good");
		//EdCandid.source("External","Glassdoor.com");
		//EdCandid.noticePeriod("2");
		//EdCandid.currentPackage("INR", "4");
		//EdCandid.expPackage("12");
		//EdCandid.enterComments("completed");
		//EdCandid.addEditJobs("");
		//EdCandid.candidateJobAssignment("updating", "Placed");
		EdCandid.candidateHistory("123");
	
	
		
		

	}
	
}
