package com.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wob {
 public static void main(String [] args) throws InterruptedException {
	 String expectedTitle="Iphone 16";
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(" https://demoapps.qspiders.com/ui?scenario=1" );
	 Thread.sleep(4000);
	 WebElement nameTextfield=driver.findElement(By.name("name"));
	 nameTextfield.sendKeys("robin");
	 Thread.sleep(2000);
	 WebElement emailTextfield=driver.findElement(By.id("email"));
	 emailTextfield.sendKeys("robin@gmail.com");
	 Thread.sleep(2000);
	 WebElement passwordTextfield=driver.findElement(By.name("password"));
	 passwordTextfield.sendKeys("robin@123");
	 Thread.sleep(2000);
	 passwordTextfield.submit();
	 
 }
}
