package testng_features_basic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class ecomerce {
public static void main(String [] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		

Actions action=new Actions(driver);
	action.scrollByAmount(800, 800).perform();
	
	driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
	String parent=driver.getWindowHandle();
	WebElement move=driver.findElement(By.className("KzDlHZ"));
	action.moveToElement(move).click().perform();
	Set<String> child=driver.getWindowHandles();
	for(String ch:child) {
		driver.switchTo().window(ch);
	}
	String d=driver.findElement(By.xpath("//div[text()='₹6,999']")).getText();
	System.out.println(d);
}
}
