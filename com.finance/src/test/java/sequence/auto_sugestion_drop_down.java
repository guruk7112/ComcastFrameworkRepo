package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_sugestion_drop_down {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");

		driver.findElement(By.id("small-searchterms")).sendKeys("comp");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Build your own computer')])[1]")).click();

		driver.navigate().to("https://www.flipkart.com/");
		
		//flipkart search field
		
	driver.findElement(By.name("q")).sendKeys("puma s");
	Thread.sleep(3000);
      driver.findElement(By.xpath("//div[text()='in Men’s Slippers & Flip Flops'] ")).click();
	}
}
