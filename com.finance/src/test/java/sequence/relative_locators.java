package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class  relative_locators{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com");
	
	//search field text box
	driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@type='submit']"))).sendKeys("mobile");
	
	//click to search button
	driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.id("small-searchterms"))).click();
	driver.navigate().back();
	
	//click on above button
	driver.findElement(RelativeLocator.with(By.id("pollanswers-1")).above(By.id("pollanswers-2"))).click();
	
	//click on below button 
	driver.findElement(RelativeLocator.with(By.id("pollanswers-4")).below(By.id("pollanswers-3"))).click();
	
	//click on registerlink using near() locator
	driver.findElement(RelativeLocator.with(By.tagName("a")).near(By.linkText("Log in"))).click();
}
}
