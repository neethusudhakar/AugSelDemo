package com.leafBot.testcases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public  class  TC002_CreateLead extends ProjectSpecificMethods{
	
@BeforeTest
public void SetData(){
	
	excelFileName ="TC002";
	testcaseName= "TC002";
	testcaseDec="TC002";
	author= "Neethu";
	category="smoke";
	
}
	

	@Test(dataProvider ="fetchData")
	public void runTC002(String username,String password,String fName, String cName, String lName) {
		
		new LoginPage()
		.enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeadLink()
		.enterFirstName(fName)
		.enterCompanyName(cName)
		.enterLastName(lName)
		.clickCreateLead()
		.checkCreatedLeadFirstName(fName);
				
		
	}
		
				


}
