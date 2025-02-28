package sequence;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class syncronization_wait_implictWait {
public static void main(String [] args) {
	 
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	
	//implicitWait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.findElement(By.id("small-searchterms")).sendKeys("cat");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
}
}
