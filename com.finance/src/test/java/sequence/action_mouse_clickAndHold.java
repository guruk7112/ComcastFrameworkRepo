package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_mouse_clickAndHold {
public static void main(String [] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	
	//action object 
	Actions action = new Actions(driver);
	
	WebElement washington=driver.findElement(By.id("box3"));
	action.clickAndHold(washington).build().perform();
	
	WebElement soul=driver.findElement(By.id("box2"));
	
	WebElement country=driver.findElement(By.id("box102"));
	action.clickAndHold(soul).moveToElement(country).build().perform();

}
}
