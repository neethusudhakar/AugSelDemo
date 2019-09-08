package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	public CreateLeadPage(){
		//This is Constructor: starting point for java
		PageFactory.initElements(driver, this);	
	}
	
	@CacheLookup
	@FindBy(id="createLeadForm_firstName")
	WebElement eleCreateLeadFirstName;
	
	@CacheLookup
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCreateLeadCompanyName;
	
	@CacheLookup
	@FindBy(id="createLeadForm_lastName")
	WebElement eleCreateLeadLastName;
	
	@FindBy(className="smallSubmit")
	WebElement eleSmallSubmit;
	
	public CreateLeadPage enterFirstName(String fName) {
		clearAndType(eleCreateLeadFirstName,fName);
		return this;
	}
	
	public CreateLeadPage enterCompanyName(String cName) {
		clearAndType(eleCreateLeadCompanyName,cName);
		return this;
	}
	
	public CreateLeadPage enterLastName(String lName) {
		clearAndType(eleCreateLeadLastName,lName);
		return this;
	}
	
	public ViewLeadPage clickCreateLead() {
		click(eleSmallSubmit);
		return new ViewLeadPage();
	}

}
