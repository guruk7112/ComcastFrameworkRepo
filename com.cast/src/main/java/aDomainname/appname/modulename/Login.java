package aDomainname.appname.modulename;

import java.time.Duration;
/**
 * @author Gurup
 * 
 * contains login page elements & business library like login()
 */   // java doc

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login extends co.cast.generic.WebDriverUtitlity.WebDriverUtility {
	
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);    // this keyword referse to current object
	
	}
	
	// rule 1 : create a separate java class
	@FindBy(name ="user_name") // rule 2 : object creation use @FIndBy anotation
	private WebElement unE;

	@FindBy(name ="user_password")     //othere automation engineers may modify the webElement if its public 
	private WebElement pwdE;             //if any ui gets changed we should modify at hear so we add axcess modifies as private
	
	@FindBy(id ="submitButton")
	private WebElement loginbtnE;
//rule 3 : object initialization 

	

	//rule 4 : object encapsulation
	public WebElement getUn() {
		return unE;
	}

	public WebElement getPwd() {
		return pwdE;
	}

	public WebElement getloginbtn() {
		return loginbtnE;
	}
	
	/**
	 * login to application based username , password , url arguments 
	 * @param username
	 * @param password
	 */
	public void loginToApp(String username,String password) { 
		unE.sendKeys(username);
		getPwd().sendKeys(password);
		loginbtnE.click();
	}	
}
