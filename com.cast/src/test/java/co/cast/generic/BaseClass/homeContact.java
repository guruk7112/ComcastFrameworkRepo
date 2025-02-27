package co.cast.generic.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeContact {

	WebDriver driver=null;
	 public homeContact(WebDriver driver){
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(linkText="Contacts") private WebElement text;
	 @FindBy(xpath="//img[@title='Create Contact...']") private WebElement createcontac;
	 
	public WebElement getText() {
		return text;
	}
	public WebElement getCreatecontac() {
		return createcontac;
	}
	 
	 public void contact() {
		 text.click();
		 createcontac.click();
	 }
	 
}
