package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Service {
	WebDriver driver;
	public Customer_Service (WebDriver driver) {
		this.driver  = driver;
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[2]")
	 WebElement click_customerservice;
	public WebElement customerservice () {
		return click_customerservice;
	}
	
	@FindBy (xpath="/html/body/div[2]/div[4]/div[1]/div/div[1]/div[3]/a/div/div/div/div[2]/h3")
	WebElement click_Digitalservice;
	public WebElement Digitalservice() {
		return click_Digitalservice;
		
	}
	@FindBy (xpath="//*[@id=\"heading\"]/h1")
	WebElement  Digital_servicepage;
	public WebElement servicepage() {
		return Digital_servicepage;
		
	}
}

