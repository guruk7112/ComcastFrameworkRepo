package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowroot_elements_hidden {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[contains(text(),'Shadow')]")).click();
            Thread.sleep(2000);
            
		driver.findElement(By.xpath("(//section[contains(text(),'Shadow')])[2]")).click();
		Thread.sleep(2000);
		
		//shadow host->identify shadow host
		SearchContext shadow=driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
	  shadow.findElement(By.cssSelector("input[type=text]")).sendKeys("sequn");
	  
	  //shadowroot for password
	  SearchContext pass=driver.findElement(By.xpath("//form/div[2]")).getShadowRoot();
	  pass.findElement(By.cssSelector("input[type='text']")).sendKeys("123456");
	}

}
