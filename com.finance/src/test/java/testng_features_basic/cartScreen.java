package testng_features_basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class cartScreen {
public static void main(String [] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.urbanmonkey.com/");
	
	driver.navigate().to("https://www.urbanmonkey.com/collections/new-arrivals/products/bucket-hat-military-monkey");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='M/L']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	Thread.sleep(2000);
	TakesScreenshot ts=(TakesScreenshot)driver;
	File gh=ts.getScreenshotAs(OutputType.FILE);
	File as=new File("C:\\eclipse\\com.finance\\src\\test\\java\\iamages\\hat.png");
	FileHandler.copy(gh, as);
}
}
