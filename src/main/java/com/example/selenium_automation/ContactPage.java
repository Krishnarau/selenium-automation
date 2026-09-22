package com.example.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage{


	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement nameField;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailAddress;
	
	@FindBy(xpath="//textarea[@name='message']")
	WebElement commentField;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitForm;
	
	
	//Constructor 
	
	public ContactPage (WebDriver driver){
		
		super(driver);
	}
	
	//Actions 
	
	public void enterName(String name){
		
		nameField.sendKeys(name);
	}
	
	public void enterLastName(String lastname) {
		
		lastName.sendKeys(lastname);
		
		
	}
	
	public void enterMessage(String email) {
		
		emailAddress.sendKeys(email);
	}
	
	public void clickSubmit(){
		
		submitForm.click();
	}
	
	
	
	
}
