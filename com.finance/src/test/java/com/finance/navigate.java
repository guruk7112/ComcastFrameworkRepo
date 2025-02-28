package com.finance;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
public static void main(String [] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.navigate().to("https://www.myntra.com/");
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
}
}
