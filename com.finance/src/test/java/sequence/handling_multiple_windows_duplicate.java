package sequence;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_multiple_windows_duplicate {
public static void main(String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	
	//create parent window
	String parent=driver.getWindowHandle();
	System.out.println(parent);
                            Thread.sleep(1000);

	// axcess child window
	driver.findElement(By.linkText("Facebook")).click();
	                  Thread.sleep(1000);
	                  
	                 
	Set<String> child=driver.getWindowHandles();
	
	for(String window:child) {
		driver.switchTo().window(window);
		if(driver.getTitle().contains("Facebook"));
		driver.findElement(By.id(":r10:")).sendKeys("sdkj");
		driver.close();
	}
     driver.switchTo().window(parent);
	Thread.sleep(1000);
	driver.findElement(By.id("small-searchterms")).sendKeys("cycles");
	driver.findElement(By.xpath("//input[@type='submit")).click();
	
	
}
}
