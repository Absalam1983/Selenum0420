package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.Content;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class drop_dowen {
	WebDriver driver;
	
	
	@Given("^user should visit homepage$")
	public void user_should_visit_homepage() throws Throwable {	
		//Browserfactory1 bf = new Browserfactory1 (driver);
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		//driver name, path of driver
		  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://mrbool.com/");  
	}
	@When("^user direct move to the content button$")
	public void user_direct_move_to_the_content_button() throws Throwable {
	   Content obj = new Content (driver);
	   Actions act=new Actions(driver);
	   WebDriverWait wait =new WebDriverWait(driver, 20);
	   act.moveToElement(obj.content()).build().perform();
	}

	@When("^user should click on the courses button$")
	public void user_should_click_on_the_courses_button() throws Throwable {
		 Content obj = new Content (driver);
		 obj.courses().click();
		 WebDriverWait wait =new WebDriverWait(driver, 15);  
	}
	@Then("^user should see the courses page$")
	public void user_should_see_the_courses_page() throws Throwable {
		 Content obj = new Content (driver); 
		 obj.coursespage();
		 WebDriverWait wait =new WebDriverWait(driver,10);
	}



}
