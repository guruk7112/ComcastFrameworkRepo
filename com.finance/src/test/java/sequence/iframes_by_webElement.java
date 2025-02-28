package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes_by_webElement {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/class%20and%20object/C%20OVERLOADING/button.html");
		Thread.sleep(1000);
		
		//switch to frame by web element
	
		driver.switchTo().frame(driver.findElement(By.name("frame1")));
		driver.findElement(By.id("small-searchterms")).sendKeys("pc");
		
		driver.findElement(By.xpath("//input[@text='submit']")).click();
		
		
		
}
}