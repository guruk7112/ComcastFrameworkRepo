package testng_features_basic;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String [] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.className("Pke_EE")).sendKeys("belt",Keys.ENTER);
	String parent=driver.getWindowHandle();
	driver.findElement(By.className("wjcEIp")).click();
	Set<String> child=driver.getWindowHandles();
	
	for(String all:child) {
		driver.switchTo().window(all);
	
	List<WebElement> beltinfo=driver.findElements(By.className("C7fEHH"));
	for (int i = 0; i < beltinfo.size(); i++) {
	    String al = beltinfo.get(i).getText(); 
	    System.out.println(al);
	}
	}
	
}
}
