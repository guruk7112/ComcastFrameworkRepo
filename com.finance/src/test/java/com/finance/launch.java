package com.finance;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch {
public static void main(String [] args) throws InterruptedException {
	ChromeDriver Driver=new ChromeDriver();
	Thread.sleep(2000);
	Driver.get("https://www.facebook.com/");
	Thread.sleep(6000);
	Driver.manage().window().maximize();
	Thread.sleep(30000);
	Driver.manage().window().minimize();
}
}
