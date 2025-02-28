package testng_features_basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bookmyshow {
public static void main(String [] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[text()='Pune']")).click();
	driver.findElement(By.xpath("//div[text()='Beetlejuice Beetlejuice']")).click();
	String info=driver.findElement(By.xpath("//h4/..")).getText();
	System.out.println(info);
	String about=driver.findElement(By.xpath("(//div[@class='sc-2k6tnd-1 kfhxuo'])")).getText();
	System.out.println(about);
}
}
