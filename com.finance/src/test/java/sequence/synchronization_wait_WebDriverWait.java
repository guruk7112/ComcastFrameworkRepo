package sequence;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.internal.shaded.jctools.queues.MessagePassingQueue.ExitCondition;

public class synchronization_wait_WebDriverWait {
public static void main(String [] args) throws Throwable {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	
	//Thread.sleep(2000);
	
	//web element for until()
	WebElement search=driver.findElement(By.id("small-searchterms"));
	
	 
	//WebDriverWait is nothing but the explicit wait 
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.elementToBeClickable(search));//pass the ref
	
	
	driver.findElement(By.id("small-searchterms")).sendKeys("dielan");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
  //  Thread.sleep(2000);
	
	//till this element
	WebElement sear1=driver.findElement(By.xpath("//h1[text()='Search']"));
	
	//syncronization point for search text
	wait.until(ExpectedConditions.visibilityOf(sear1));
	
	
    
}
}
