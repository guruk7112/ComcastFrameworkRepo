package practice.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class sample_test_with_POM_StaleElementReferenceException {

	
	@FindBy(name="user_name")
	WebElement ele1;
	
	@FindBy(name="user_password")
	WebElement ele2;
	
	@FindAll({@FindBy(id="wrongValue"),@FindBy (xpath="//input[@type='submit']")})
	WebElement ele3;                                                                 //if both condition fails NoSuchElementException
//	
//	@FindBys({@FindBy(id="wrongValue"),@FindBy (xpath="//input[@type='submit']")})
//	WebElement ele4;                                                                     Exception 
	
	@Test
	public void Simple() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		
		sample_test_with_POM_StaleElementReferenceException s=	PageFactory.initElements(driver,sample_test_with_POM_StaleElementReferenceException.class);
		
		s.ele1.sendKeys("admin");
		s.ele2.sendKeys("admin");
		
		driver.navigate().refresh();
		                              
		//StaleElementReference exception
		
		s.ele1.sendKeys("admin");
		s.ele2.sendKeys("admin");
		
		s.ele3.click();
	}
	}
	
	


