package com.maxhire.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.maxhire.pages.AddCandiatePage;
import com.maxhire.pages.LoginPage;



public class test extends BaseTest{
	
	@BeforeTest
	public void login() throws InterruptedException {
		Thread.sleep(4000);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username, password);
		Thread.sleep(3000);
		loginPage.verifyLoginPageTitle("maxhire");
	}
	
	@Test
	public void addCandidate() throws InterruptedException {
		Thread.sleep(3000);
		AddCandiatePage candidate=new AddCandiatePage(driver);
		candidate.addCand();
		Thread.sleep(3000);
		//candidate.uploadResume("C:\\Users\\Kishore\\register.txt");
		Thread.sleep(3000);
		//candidate.enterName("Miss", "Latha","I", "Irala","abcd.com");
		//candidate.selectOwner("70");
		Thread.sleep(3000);
		candidate.selectDob("1993", "March", "10");
		Thread.sleep(8000);
		/*candidate.enterEmail("asdf123@gmail.com", "asdf123@gmail.com");
		Thread.sleep(3000);
		candidate.primaryPhone("Mobile", "7485961425", "7485961425");
		Thread.sleep(3000);
		candidate.altEmailPhnNo("zxcv35@gmail.com", "Work", "7589632548");
		Thread.sleep(3000);
		candidate.addressDetails("14a", "chittoor", "AP", "India", "789654");
		Thread.sleep(3000);
		//candidate.selectDateToCallTime("april", "05", "8PM");
		candidate.relocate();
		Thread.sleep(2000);
		candidate.selectTimeZone("IST");
		Thread.sleep(3000);
		candidate.employeeDetails("123asd","INR", "10L", "13L", "2");
		Thread.sleep(3000);
		candidate.selectRating("Excellent");
		Thread.sleep(3000);
		candidate.selectSource("Internal");
		Thread.sleep(3000);
		candidate.selectSourceBy("Transfer");
		candidate.keySkills("Rest API");
		candidate.selectJobType("123");
		Thread.sleep(2000);
		candidate.comments("completed");
		Thread.sleep(5000);
		//candidate.uploadAttachments("C:\\Users\\Kishore\\Desktop\\path");
		candidate.submit();*/
				
	}
	

}
