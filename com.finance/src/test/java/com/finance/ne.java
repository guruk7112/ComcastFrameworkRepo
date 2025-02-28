package com.finance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ne {
public static void main(String [] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver .get("https://images.google.com/");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 WebElement searchbar=driver.findElement(By.className("gLFyf"));
	 searchbar.sendKeys("dog");
	 Thread.sleep(2000);
	 WebElement searchIcon=driver.findElement(By.className("iblpc"));
	 searchIcon.click();
	 
}
}
