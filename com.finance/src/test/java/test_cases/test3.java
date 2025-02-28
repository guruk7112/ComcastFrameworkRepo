package test_cases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class test3 {

	@Test
	public void nesw() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Reporter.log("application succefully launched");
		
		driver.findElement(By.id("pollanswers-3")).click();
		driver.findElement(By.id("vote-poll-1")).click();
		
		Reporter.log("vote test case completed");
		
	}
}
