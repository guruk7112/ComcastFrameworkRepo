package com.finance;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import java.io.FileNotFoundException;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class spotify {
public static void main(String [] args) throws InterruptedException, IOException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.flipkart.com/");
	String parent=driver.getWindowHandle();
	driver.findElement(By.className("Pke_EE")).sendKeys("gloves",Keys.ENTER);
	//driver.findElement(By.className("_2iLD__")).click();
	
	driver.findElement(By.linkText("Printed Protective Women Gloves")).click();
	
	Actions action=new Actions(driver);
	Thread.sleep(2000);
	
	
	
	Set<String> child=driver.getWindowHandles();
	
	for(String low:child) {
		driver.switchTo().window(low);	
	}
	
	action.scrollByAmount(0,1000).perform();
	WebElement cart=driver.findElement(By.xpath("//button[text()='Add to cart']"));
	cart.click();
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	TakesScreenshot glove=(TakesScreenshot)driver;
	File source= glove.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\eclipse\\com.finance\\src\\test\\java\\sequence\\new\\home.png");
	FileHandler.copy(source, destination);
	driver.close();
	
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).clear();
	driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoe",Keys.ENTER);

	driver.findElement(By.linkText("PVC Industrial Purpose Super Safety Lightweight Gum Boo...")).click();
	Set<String> child1=driver.getWindowHandles();
	
	for(String low:child1) {
		driver.switchTo().window(low);	
	}
	
	action.scrollByAmount(0,1000).perform();
	WebElement cart1=driver.findElement(By.xpath("//button[text()='Add to cart']"));
	cart1.click();
	Thread.sleep(2000);
	
	Thread.sleep(2000);
	TakesScreenshot shoe=(TakesScreenshot)driver;
	File src= glove.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\eclipse\\com.finance\\src\\test\\java\\sequence\\new\\shoe.png");
	FileHandler.copy(src, dest);
	
	
	
}
}
