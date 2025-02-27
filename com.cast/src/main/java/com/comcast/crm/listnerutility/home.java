package com.comcast.crm.listnerutility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;

public class home {
WebDriver driver=null;
	public home(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		//navigate to contact module 
		//driver.findElement(By.linkText("Contacts")).click();
		

		@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
		private WebElement image;
		
        @FindBy(linkText="Sign Out")
        private WebElement out;
       

		public WebElement getImage() {
			return image;
		}

		public WebElement getOut() {
			return out;
		}
	
        Actions action;
		public void logout() {
		action =new Actions(driver);
			action.moveToElement(image).perform();
			out.click();		}
		
		
	}


