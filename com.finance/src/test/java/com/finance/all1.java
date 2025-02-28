package com.finance;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class all1 {
public static void main(String [] args) throws InterruptedException {
	String expectedTitle="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!";
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().setSize(new Dimension(400,200));
	Thread.sleep(2000);
	driver.manage().window().setPosition(new Point(400,300));
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	String title=driver.getTitle();
	if(title.contains(expectedTitle)) {
		System.out.println("validated");
	}
	else {
		System.out.println("validate failed");
	}
	
}
}
