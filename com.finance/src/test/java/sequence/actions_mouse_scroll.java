package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_mouse_scroll {
public static void main(String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	
	//action object
	Actions action =new Actions(driver);
	action.scrollByAmount(0,500).perform();
	
    Thread.sleep(2000);
    
    WebElement tillac=driver.findElement(By.xpath("//h3[contains(text(),'My account')]"));
    action.scrollToElement(tillac).perform();
}
}
