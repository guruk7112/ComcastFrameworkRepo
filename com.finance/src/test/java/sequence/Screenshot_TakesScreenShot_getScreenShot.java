package sequence;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.FileNotFoundException;

public class Screenshot_TakesScreenShot_getScreenShot {
public static void main(String [] args) throws IOException {
	 
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	//type cast to get the capabilities of takescreenshot interface to the driver instance
	
	//typecasting
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	//temperory location
	File screen=ts.getScreenshotAs(OutputType.FILE);
	
	//destination file 
	File destination =new File("./homepage.png");
	
	//we need to connect source and destination 
	//we use fileHandler .copy 
	FileHandler.copy(screen, destination);
	
           System.out.println("home page succes");
	
	//driver.findElement((By.id("small-searchterms")).sendkeys("mobile");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
	
	//screen shot after clicking on search 
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("");
	
	FileHandler.copy(screen, dest); 
	
	driver.close();
	
}
}
