package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocator {
public static void main(String [] args) {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://demowebshop.tricentis.com/register");
	 
	 //css locator when there are no direct locators
	 driver.findElement(By.cssSelector("input[id=small-searchterms]")).sendKeys("cars");
	 
	 //# represents id  and . represents  class
	 driver.findElement(By.cssSelector("#Password")).sendKeys("pen");
	 
	 //closing space with . (class)
	 driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("mobile");
}

}
