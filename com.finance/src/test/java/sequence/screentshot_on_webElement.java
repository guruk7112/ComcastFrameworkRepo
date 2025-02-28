package sequence;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screentshot_on_webElement {
public static <TakesScreenshot> void main(String [] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	//search text field screen shot 
	WebElement d=driver.findElement(By.id("small-searchterms"));
	d.sendKeys("mobiles");
	
	//type casting
	TakesScreenshot ts=(TakesScreenshot)driver;
    File source=d.getScreenshotAs(OutputType.FILE);
	File dest=new File("./folder/new folder");
	FileHandler.copy(source, dest);
	

}
}