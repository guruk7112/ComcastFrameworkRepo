package test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class search_element {

	@Test
	public void searchtestcase() {
		
		WebDriver driver=new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		Reporter.log("application launched succefully");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("type45");
		driver.findElement(By.xpath("(//input[@type='submit'])")).click();
		Reporter.log("searchtest case completed");
		
		}
	}
