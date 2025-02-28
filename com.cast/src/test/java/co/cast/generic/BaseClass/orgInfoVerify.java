package co.cast.generic.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orgInfoVerify {
	
WebDriver driver=null;
	public  orgInfoVerify(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="dtlview_Organization Name") private WebElement verify;
	@FindBy(name="Industry") private WebElement dd;
//	@FindBy()
	
	public WebElement getverify() {
		return verify;
	}
	public WebElement getdd() {
		return dd;
	}
		
}
