package com.casr.createContact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.cast.generic.WebDriverUtitlity.WebDriverUtility;

public class creatNewOrganization {
	WebDriverUtility wd=new WebDriverUtility();

	WebDriver driver=null;
	public creatNewOrganization(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(name="accountname") private WebElement orgname;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement save;
	@FindBy(xpath="//select[@name='industry']") private WebElement drop;
	@FindBy(xpath="//input[@class='crmbutton small save']") private WebElement save1;
	@FindBy(name="phone")private WebElement phone;
	
	public WebElement getorgname() {
		return orgname;
	}
	public WebElement getsave() {
		return save;
	}
	public WebElement getdrop() {
		return drop;
	}
	public WebElement getsave1() {
		return save1;
	}
	public WebElement getphone() {
		return phone;
	}
	public void dropdown(String text) {
		wd.Select(drop, text);
	}

	}

