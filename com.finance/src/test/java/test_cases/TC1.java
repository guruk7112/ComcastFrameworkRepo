package test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {
	
	public WebDriver driver=new ChromeDriver();
	
	@BeforeTest
	public void launchapplication() {
		//launch application code
		         
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterTest
	public void closeapplication() {
		//code to close the application
        driver.quit();
	}

	@Test
	public void searchtestcase() {
		//search test  code
		driver.findElement(By.id("small-searchterms")).sendKeys("bild");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}
}
