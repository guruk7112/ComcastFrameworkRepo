package testng_features_basic;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class flixfox {
public static void main(String [] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flixfoxapp.com/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	String move=null;
	List<WebElement> movie=driver.findElements(By.tagName("a"));
	
	for(int i=0;i<=movie.size()-1;i++) {
		 move=movie.get(i).getText();
		System.out.println(move);
	}
	String all=null;
List<WebElement> otp=driver.findElements(By.tagName("img"));
      for(WebElement off:otp) {
      	 all=off.getCssValue("color");

    	System.out.println(all);
      }
    System.out.println(otp.size());	
	
	driver.findElement(By.name("keyword")).sendKeys("next gen",Keys.ENTER);
	File vivo=ts.getScreenshotAs(OutputType.FILE);
	File gb=new File("C:\\eclipse\\com.finance\\src\\test\\java\\iamages\\new.png");
	;
}
}
