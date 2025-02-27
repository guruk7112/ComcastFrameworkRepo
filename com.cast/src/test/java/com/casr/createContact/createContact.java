package com.casr.createContact;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createContact {

	WebDriver driver;

	public createContact(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='txtBox']")
	private WebElement txtfield;

	@FindBy(id = "bas_searchfield")
	private WebElement selectField;

	@FindBy(name = "submit")
	private WebElement searchBtn;
	
	@FindBy(linkText="searchtxtex")
	WebElement drop;
	
	@FindBy(xpath="//a[text()='del']")
	WebElement del;
	
	public WebElement gettxtfield() {
		return txtfield;
	}

	public WebElement getSelectField() {
		return selectField;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getdrop() {
		return drop;
	}
	public WebElement getdel() {
		return del;
	}
	public void select() {
		Select sel=new Select (drop);
		sel.selectByIndex(2);
	}
	
}
