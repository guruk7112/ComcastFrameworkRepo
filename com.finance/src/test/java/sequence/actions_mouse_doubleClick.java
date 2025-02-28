package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_mouse_doubleClick {
public static void main(String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	Thread.sleep(1000);
	
	//1st create an object for actions class
	Actions action=new Actions(driver);
	 
	WebElement button=driver.findElement(By.xpath("//button"));
	action.doubleClick(button).build().perform();
}
}
