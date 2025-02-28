package com.finance;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class rr_rs {
 public static void main(String [] args) throws InterruptedException{
	 ChromeDriver driver=new ChromeDriver();
	 Thread.sleep(2000);
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 Dimension d=new Dimension(400,200);
	 driver.manage().window().setSize(new Dimension(300,100));
	 Thread.sleep(2000);
	 driver.manage().window().setPosition(new Point(600,800));
 }
}
