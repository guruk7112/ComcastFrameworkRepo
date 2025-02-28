package com.finance;
import org.openqa.selenium.chrome.ChromeDriver;
public class validtion {
public static void main(String [] args) throws InterruptedException {
	String expectedTitle="Instagram ";
	 ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.navigate().to("https://codingbat.com/java/Array-1");
	 Thread.sleep(2000);
	 String actualTitle=driver.getTitle();
	 String actualUrl=driver.getCurrentUrl();
	 String SourceCode=driver.getPageSource();
	 
	 System.out.println(SourceCode);
	 System.out.println(actualUrl);
	 System.out.println(actualTitle);
	if(actualTitle.contains(expectedTitle))
	{
		System.out.println("succes");
	}
	else {
		System.out.println("not sucess");
	}
}
}
