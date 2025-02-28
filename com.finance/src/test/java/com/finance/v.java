package com.finance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class v {
public static void  main(String [] args) throws InterruptedException  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	WebElement searchgmail=driver.findElement(By.id("email"));
	
	searchgmail.sendKeys("admin123@gmail.com");
Thread.sleep(1000);

WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("123456");
Thread.sleep(1000);

WebElement login=driver.findElement(By.name("login"));
login.click();

driver.findElement(By.name("login")).click();
Thread.sleep(1000);
driver.navigate().back();

//linkText
driver.findElement(By.linkText("Meta AI")).click();
Thread.sleep(1000);
List<WebElement> ele=driver.findElements(By.linkText("a"));

}
}
