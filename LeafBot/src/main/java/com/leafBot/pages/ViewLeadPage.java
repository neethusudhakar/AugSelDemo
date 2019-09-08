package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	public ViewLeadPage(){
		//This is Constructor: starting point for java
		PageFactory.initElements(driver, this);	
	}

	@CacheLookup
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleFirstNameinViewLead;
	
	@CacheLookup
	@FindBy(xpath="//span[text()='Company Name']")
	WebElement eleCompanyNameinViewLead;
	
	@CacheLookup
	@FindBy(id="//span[text()='Last name']")
	WebElement eleLastNameinViewLead;
	
	
	public CreateLeadPage checkCreatedLeadFirstName(String fName) {
		verifyExactText(eleFirstNameinViewLead,fName);
		/*verifyExactText(eleCompanyNameinViewLead,cName);
		verifyExactText(eleLastNameinViewLead,lName);*/
		return new CreateLeadPage();
	}



}
