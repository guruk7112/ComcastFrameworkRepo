package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_by_names {
public static void main(String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/class%20and%20object/C%20OVERLOADING/button.html");
	Thread.sleep(1000);
	
	//switch to frame by name
	driver.switchTo().frame("frame2");
	
	driver.findElement(By.linkText("Wikivoyage")).click();
	Thread.sleep(1000);
	
	driver.switchTo().parentFrame();
	driver.findElement(By.linkText("google")).click();
	
}
}
