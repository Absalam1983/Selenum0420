package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.Customer_Service;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class customerservice {
	
	WebDriver driver;
	
	@Given("^user visit homepage$")
	public void user_visit_homepage() throws Throwable {
	try {
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		//driver name, path of driver
		  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.amazon.com");
		}
		catch(Exception e) {
			System.out.println("Browser or url is not opening");
		}
	
	}
		
	@When("^user click on customer service$")
	public void user_click_on_customer_service() throws Throwable {
		try {
		Customer_Service obj = new Customer_Service (driver);
		obj.customerservice().click();
		WebDriverWait wait =new WebDriverWait(driver, 30);
		}
		catch(Exception e) {
			System.out.println("Somthing wrong on customer service button");
		}
	}

	@When("^user click on Digital service & device support$")
	public void user_click_on_Digital_service_device_support() throws Throwable {
		try {
		Customer_Service obj = new Customer_Service (driver);
		obj.Digitalservice().click();
		WebDriverWait wait =new WebDriverWait(driver, 30);
		}
		catch(Exception e) {
			System.out.println("Somthing wrong on digital customer service button");
		}
	    
	}

	@Then("^user should redirect to Digital service & device support page$")
	public void user_should_redirect_to_Digital_service_device_support_page() throws Throwable {
		try {
		Customer_Service obj = new Customer_Service (driver);
		obj.servicepage().click();
		WebDriverWait wait =new WebDriverWait(driver, 30);
		}
		catch(Exception e) {
			System.out.println("Somthing wrong on support page");
		}
	    
	}



}
