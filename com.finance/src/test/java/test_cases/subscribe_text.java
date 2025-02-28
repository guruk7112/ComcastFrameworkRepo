package test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class subscribe_text {

	@Test
	public void subscribe() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		
		Reporter.log("application launched succesfully");
		
		driver.findElement(By.id("newsletter-email")).sendKeys("bolian");
		driver.findElement(By.id("newsletter-email")).click();
		driver.close();
		
		Reporter.log("dielan");
		
	}
}
