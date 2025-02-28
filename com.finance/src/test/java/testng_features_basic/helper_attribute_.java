package testng_features_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
	
public class helper_attribute_ {

	@Test (invocationCount=0 , threadPoolSize=1)
	public void tc1() {
		System.out.println("invocation");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://demowebshop.tricentis.com/login");
	    
	    driver.findElement(By.name("q")).sendKeys("new");
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}
	
}
