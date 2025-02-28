package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
public static void main(String [] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	
	driver.manage().window().maximize();
	//relative xpath
	//xpath anywhere in the dom
	//    //represent anywhere in the dom
	
	driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
	
	//by using other attribute names=
	
	driver.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("dry");
	
	//when there are more than 1 attribute name
	
	driver.findElement(By.xpath("(//input[@type='text']) [1]")).sendKeys("hugins");
	Thread.sleep(2000);
	
	//syntax for contains when text method is used
	driver.findElement(By.xpath("(//a[contains(text(),'Books')]) [1]")).click();
	
	//with partial attribute value
	driver.findElement(By.xpath("//input[contains(@id,'searchterms')]")).sendKeys("key");
	
	//start-with text using only starting of the link
	driver.findElement(By.xpath("(//a[starts-with(text(),'Electro')])[1]")).click();
	
	driver.navigate().back();
	driver.navigate().back();
	
	driver.findElement(By.xpath("//input[starts-with(@name,'News')]")).sendKeys("join");
	
	
	//used to check vote is button or not using= and 
	driver.findElement(By.xpath("//input[@type='button' and @id='vote-poll-1']")).click();
	                        Thread.sleep(2000);
	//used to check any 1 is true =using or
	driver.findElement(By.xpath("//span[@class='cartolabel' or text()='Shopping cart']")).click();
	
	
}
}
 