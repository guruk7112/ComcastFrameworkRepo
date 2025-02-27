package com.casr.createContact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createNewContact {

	WebDriver driver=null;
	createNewContact(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="lastname") private WebElement lastname;
	@FindBy(xpath="//input[@title='Save [Alt+S]']") private WebElement savebtn;
	@FindBy(name="support_start_date") private WebElement startdate;
	
	public WebElement getlastname() {
		return lastname;
	}
	public WebElement getsavebtn() {
		return savebtn;
	}
	public WebElement getStrdate() {
		return startdate;
		
	}
	
	
	
}
