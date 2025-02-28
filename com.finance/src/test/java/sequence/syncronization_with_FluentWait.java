package sequence;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class syncronization_with_FluentWait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		
		//starting web element 
		WebElement search=driver.findElement(By.id("small-searchterms"));
		
		//fluent wait 
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(search));
		
		
		driver.findElement(By.id("small-searchterms")).sendKeys("dielan");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		WebElement text=driver.findElement(By.xpath("//h1[text()='Search']"));
		
		
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.withTimeout(Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(text));
		//till the text is dispalyed

		
	}

}
