package com.example.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class DropdownPage extends BasePage{

	
	@FindBy(xpath="//select[@id='dropdowm-menu-1']")
	
	WebElement JavaDroopdown;
	
    @FindBy(xpath="//select[@id='dropdowm-menu-2']")
  	
	WebElement EclipseDroopdown;

    @FindBy(xpath="//select[@id='dropdowm-menu-3']")

    WebElement HTMLDroopdown;
    

	public DropdownPage (WebDriver driver){
		
		super(driver);
	}
	

	//Actions
	
	public void selectJava(String value) {
		
		selectDropdown(JavaDroopdown,value);
		
	}
	
public void selectEclipse(String value) {
		
		selectDropdown(EclipseDroopdown,value);
		
	}

public void selectHTML(String value) {
	
	selectDropdown(HTMLDroopdown,value);
	
}



	
	
	
	
	
	
	//dropdowm-menu-2
	
	
	
	
	
}
