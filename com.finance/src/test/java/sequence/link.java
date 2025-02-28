package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {
public static void main(String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/register");
	Thread.sleep(2000);
	
	//linkText to axcess the link in between anchor tags <a
	driver.findElement(By.linkText("Register")).click();
	
	driver.findElement(By.linkText("Log in")).click();
	
	//partial link text by using partial visible text
	
	//driver.findElement(By.partialLinkText("Shopping")).click();
	//driver.findElement(By.partialLinkText("cart")).click();
	driver.findElement(By.partialLinkText("hopping")).click();
	
	driver.navigate().back();
	
	//tagname preference is given to 1 st tag name.
	driver.findElement(By.tagName("input")).sendKeys("mobiles");
	Thread.sleep(2000);
	
	//classname locator
	//invalid selector exception //multiple compound classes
	//driver.findElement(By.className("search-box-text ui-autocomplete-input valid")).sendKeys("mobiles");
	
	//driver.findElement(By.className("text-box")).sendKeys("mobiles"); //no such element exception
	driver.findElement(By.className("search-box-text")).sendKeys("mobile");
	
	
	
	
	
}
}
