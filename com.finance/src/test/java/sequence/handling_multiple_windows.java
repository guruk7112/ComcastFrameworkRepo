package sequence;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handling_multiple_windows {
	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		//identify the parent window
	String parent=driver.getWindowHandle();   //string
	System.out.println(parent);
	Thread.sleep(1000);
	//execute the functionality to which will open child window
	driver.findElement(By.xpath("//a[text()='Myntra']")).click();
	Thread.sleep(2000);
	//get all the windows including child windows
	 Set<String> allwindow=driver.getWindowHandles();     // set<String>
	 
	 Thread.sleep(1000);
	 System.out.println(allwindow);
	 for(String window:allwindow) {
		 
		 //Swithcing to cjhild window using switch to method
		 driver.switchTo().window(window);
		 String title=driver.getTitle();
		 System.out.println(title);
		 driver.close();
	 }
		 //Switch back to parent Window
		 driver.switchTo().window(parent);
		 
		
	 }
	
	}