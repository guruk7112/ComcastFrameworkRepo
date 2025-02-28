package testng_features_basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class myntra_ecomerce_screenshot {
public static void main(String [] args) throws InterruptedException, Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.myntra.com/");
	
	driver.findElement(By.className("desktop-searchBar")).sendKeys("ADKD",Keys.ENTER);
	Thread.sleep(2000);
	
	
	Thread.sleep(2000);
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-Notification");
	Actions action =new Actions(driver);
	action.scrollByAmount(0,1000);
	String parent=driver.getWindowHandle();
	driver.findElement(By.xpath("//h4[@class='product-product']")).click();
	Set<String> all=driver.getWindowHandles();
	for(String num:all) {
		driver.switchTo().window(num); }
	driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
	
	driver.findElement(By.xpath("//span[contains(@class,'myntraweb-sprite desktop-iconBag sprites-headerBag')]")).click();
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File fi=ts.getScreenshotAs(OutputType.FILE);
	File des=new File("C:\\eclipse\\com.finance\\src\\test\\java\\iamages\\uti.png");
	FileHandler.copy(fi, des);
	
	driver.close();
	driver.switchTo().window(parent);
	
	driver.findElement(By.xpath("//h4[text()='Kids Car Toy Vehicles']")).click();
	Set<String> second=driver.getWindowHandles();
	for(String two:second) {
		driver.switchTo().window(two);

	driver.switchTo().window(two);
	driver.findElement(By.xpath("//div[contains(@class,'pdp-add-to-bag pdp-button pdp-flex pdp-center')]       ")).click();
	}
	
}
}
