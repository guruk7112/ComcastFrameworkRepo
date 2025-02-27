package co.cast.generic.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createOrganization {
WebDriver driver=null;
	public createOrganization(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Organizations") private WebElement text;
@FindBy(xpath="//img[@title='Create Organization...']") private WebElement createbtn;
	
	
	public WebElement gettext() {
		return text;
	}
	public WebElement getcreatebtn() {
		return createbtn;
	}	
	
	
	public void createorg() {
		text.click();
		createbtn.click();
		
	}
}
