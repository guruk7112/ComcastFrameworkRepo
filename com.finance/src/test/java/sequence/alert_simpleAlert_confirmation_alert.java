package sequence;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_simpleAlert_confirmation_alert {
public static void main(String [] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(1000);
	
	//click on search button without enetring search fieled
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	Thread.sleep(2000);
	//handle the alert 
	Alert al=driver.switchTo().alert();    //automatically switch to alert
	al.accept();
	System.out.println("alert handled");
	
	driver.findElement(By.id("small-searchterms")).sendKeys("helkjfod"); 
	//automatically control come backs to the main page 
	
}
}
