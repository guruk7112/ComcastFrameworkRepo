package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_keyboard_sendKeys_keyUp_keyDown {
public static void main(String [] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	//create an action object
	Actions action=new Actions(driver);
//	WebElement search=driver.findElement(By.name("q"));
//	action.moveToElement(search).click().sendKeys("mobile").build().perform();
	
	//key up and key down
	WebElement searchtf=driver.findElement(By.name("q"));
	action.moveToElement(searchtf).click().keyDown(Keys.SHIFT).sendKeys("cycles").keyUp(Keys.SHIFT).perform();
}
}
