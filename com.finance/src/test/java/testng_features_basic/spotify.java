package testng_features_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spotify {
public static void main(String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://open.spotify.com/");
	driver.navigate().to("https://open.spotify.com/track/1WKIAxPvekk1IflYjUSIk3");
	driver.findElement(By.xpath("//span[@class='IconWrapper__Wrapper-sc-1hf1hjl-0 ivomLs']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	
	driver.findElement(By.id("login-username")).sendKeys("dielan@4756",Keys.ENTER);
	driver.findElement(By.id("login-password")).sendKeys("849yrh");
	driver.findElement(By.xpath("//span[text()='Log In']")).click();
	String excel_saga=driver.findElement(By.xpath("//span[@class='Message-sc-15vkh7g-0 kGDZJw']")).getText();
	System.out.println(excel_saga);
}
}