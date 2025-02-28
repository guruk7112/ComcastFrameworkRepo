package com.finance;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
public static void main(String [] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links);
	for(WebElement link:links) {
		System.out.println(link.getText());
	}
}
}
