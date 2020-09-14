package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pecologin {
	WebDriver driver;
	
	public Pecologin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath ="//*[@id=\"s4-titlerow\"]/header/div/button")
	 WebElement click_MyAccount; 
	public WebElement MyAccount() {
		return click_MyAccount;	 
	}
	@FindBy (xpath ="//*[@id=\"Username\"]")
	WebElement type_EmailAddress;
	public WebElement EmailAddress() {
		return type_EmailAddress;
		
	}
    @FindBy (xpath ="//*[@id=\"Password\"]")
    WebElement type_Password;
    public WebElement password() {
		return type_Password;
    	
    }
	
	@FindBy (xpath = "//*[@id=\"HomeSignInController\"]/ng-form/div/exelon-decorator-simple/div/div/div/div/button")
	WebElement click_signin;
	public WebElement signin() {
		return click_signin;
		
	}
}

