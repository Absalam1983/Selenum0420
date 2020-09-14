package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Content {
	
	WebDriver driver;
	
	public Content (WebDriver driver) {
		this.driver  = driver;
		PageFactory.initElements(driver,this);	
	}

	@FindBy (xpath="//*[@id=\"headermenudesktop\"]/ul/li/a")
	WebElement move_content;
	public WebElement content() {
		return move_content;}
	
	@FindBy (xpath="//*[@id=\"headermenudesktop\"]/ul/li/ul/li[2]/a")
	WebElement click_courses;
	public WebElement courses() {
		return click_courses;}
	@FindBy (xpath="//*[@id=\"curso-nav\"]")
	WebElement courses_page;
	public WebElement coursespage() {
		return courses_page;
		
	} 
	
}
