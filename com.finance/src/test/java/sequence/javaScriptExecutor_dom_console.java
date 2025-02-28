package sequence;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptExecutor_dom_console {
public static void main(String [] args) {
	
	WebDriver driver=new ChromeDriver();
	
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demowebshop.tricentis.com/");
	
	//type casting of javascriptExecutor with driver instance
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//javascript
	js.executeScript("document.getElementById('small-searchterms').value='mobiles'	");
	
	WebElement button=driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
	js.executeScript("arguments[0].click();",button);
}
}
