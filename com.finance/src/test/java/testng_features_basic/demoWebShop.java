package testng_features_basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoWebShop {
public static void main(String [] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demowebshop.tricentis.com/");
	
	String all = null;
	List<WebElement>links=driver.findElements(By.tagName("a"));
for(int i=1;i<=links.size()-1;i++) {
	all=links.get(i).getText();
	System.out.println(all);
	System.out.println(i);	
	}

List<WebElement> li=driver.findElements(By.tagName("img"));
System.out.println(li.size());



	

}
}


