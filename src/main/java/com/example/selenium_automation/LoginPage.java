package com.example.selenium_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Hello world!
 *
 */
public class LoginPage extends BasePage
{
    
	
	@FindBy(xpath="//input[@id='text']")
	
	WebElement userName;
	
@FindBy(xpath="//input[@id='password']")
	
	WebElement passWord;

@FindBy(xpath="//button[@id='login-button']")

WebElement loginButton;


//constructor 

public LoginPage(WebDriver driver){
	
	super(driver);
}

//Actions 

public void enterUsername(String username) {
	
	userName.sendKeys(username);
}

public void enterPassword(String pass) {
	passWord.sendKeys(pass);
}

public void clickLogin() {
	loginButton.click();
}

	
	
}
