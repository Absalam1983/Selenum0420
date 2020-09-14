package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	
	WebDriver driver;
	 
	 public SignIn (WebDriver driver) {
	  
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	  
	 }
	 /*Constructor  is not a method but special type of method
	  1.constructor name and class name will be same
	  2.there is no return type
	  */
	 
	 @FindBy(xpath="//*[@id=\"tdb3\"]/span[2]")
	 WebElement click_MyAccount;
	 
	 public  WebElement MyAccount() {
	  return click_MyAccount;
	   
	 }
	 
	 @FindBy(name="email_address")
	 WebElement Type_EmailAddress;
	 
	 public WebElement EmailAddress(){
	  return Type_EmailAddress;
	  }
	 
	 @FindBy(name="password")
	 WebElement type_password;
	 public WebElement Password() {
	  return type_password;
	  
	 }
	 
	 @FindBy(xpath="//*[@id=\"tdb1\"]/span[2]")
	 WebElement click_Signin;
	 public WebElement Signin() {
	  return click_Signin;
	  
	 }
	 
	@FindBy(xpath="//*[@id=\"bodyContent\"]/h1")
	WebElement Txt_myaccountinfo;
	public WebElement myaccountinfo() {
		return Txt_myaccountinfo;
		
	}

	@FindBy(xpath="//*[@id=\"tdb4\"]/span")
	WebElement click_signoff;
	public WebElement signoff() {
		return click_signoff;
		
	}
}


