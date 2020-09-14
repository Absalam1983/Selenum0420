package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.SignIn;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	WebDriver driver;
	
	@Given("^user visiting homepage$")
	public void user_visiting_homepage() throws Throwable {
		
		try {
		
	     System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32 (1)\\chromedriver.exe");
		//driver name, path of driver
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.get("https://demo.oscommerce.com");
		}
		catch (Exception e) {
			System.out.println("Browser or url is not opening");
		}
	   
	}

	@Given("^click My Account button$")
	public void click_My_Account_button() throws Throwable {
		try {
		SignIn obj1=new SignIn(driver);
		obj1.MyAccount().click();
		WebDriverWait wait =new WebDriverWait(driver, 30);

		}
		catch(Exception e) {
			System.out.println("Account button is not working");
		}
	   
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		try {
		SignIn obj1=new SignIn(driver);
		obj1.EmailAddress().sendKeys(arg1);
		WebDriverWait wait =new WebDriverWait(driver, 30);

		obj1.Password().sendKeys(arg2);
		WebDriverWait wait1 =new WebDriverWait(driver, 30);

		}
		catch (Exception e) {
			System.out.println("Email & PW is not working");
		}
	   
	}

	@When("^user click on sign in button$")
	public void user_click_on_sign_in_button() throws Throwable {
		try {
		SignIn obj1 = new SignIn(driver);
		obj1.Signin ().click();
		WebDriverWait wait =new WebDriverWait(driver, 30);

		}
		catch(Exception e) {
			System.out.println("Sign button is not working");
		}
				   
	}

	@Then("^user successfully login to the system$")
	public void user_successfully_login_to_the_system() throws Throwable {
		try {
		SignIn obj1 = new SignIn(driver);
		obj1.myaccountinfo().click();
		WebDriverWait wait =new WebDriverWait(driver, 30);

		}
		catch (Exception e) {
			System.out.println("Accountinfo is not clicking");
		}
		  
	}

	@Then("^user click on Log off Button for logout$")
	public void user_click_on_Log_off_Button_for_logout() throws Throwable {
		try {
		 SignIn obj1 = new SignIn(driver);
		 obj1.signoff().click();
		 WebDriverWait wait =new WebDriverWait(driver, 30);

		}
		catch (Exception e) {
			System.out.println("Singoff button is not clicking");
		}
		
	   
	}

	@When("^user enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_invalid_and(String arg1, String arg2) throws Throwable {
		 SignIn obj1 = new SignIn(driver);
		 obj1.EmailAddress().sendKeys(arg1);
		 //Thread.sleep(4000);//hard wait
		 WebDriverWait wait =new WebDriverWait(driver, 10);

			obj1.Password().sendKeys(arg2);
			WebDriverWait wait2 =new WebDriverWait(driver, 10);

		 
	}
}
