package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class action_methods {
public static void main(String[] args) throws InterruptedException {
	
	//actions
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/login");
	Thread.sleep(2000);
	
	driver.findElement(By.id("small-searchterms")).sendKeys("car");
	Thread.sleep(1000);
	
	driver.findElement(By.id("small-searchterms")).clear();
	
	driver.findElement(By.id("small-searchterms")).sendKeys("mobile");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).submit();
	
	                          //getter
	String text=driver.findElement(By.linkText("Register")).getText();
	System.out.println(text); 
	//returns string                 o/p register
	
	driver.findElement(By.id("small-searchterms")).sendKeys("books");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	String searchtext=driver.findElement(By.xpath("//h1[text()='Search']")).getText();
	System.out.println(searchtext);
	
	//get css attribute
	String search=driver.findElement(By.id("small-searchterms")).getAttribute("value");
	System.out.println(search);
	
	//getcssvalue
	String register=driver.findElement(By.linkText("Register")).getCssValue("color");
	System.out.println(register);
	
	String fontfamily=driver.findElement(By.linkText("Register")).getCssValue("font-size");
	System.out.println(fontfamily);
	
	
	//verification method
	if(driver.findElement(By.id("small-searchterms")).isDisplayed()) {
		driver.findElement(By.id("small-searchterms")).sendKeys("cycle");
	}
	
	//check if search button is enabled
	if(driver.findElement(By.xpath("(//input[@type='submit'])[1]")).isEnabled()) {
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	}
	
	
driver.findElement(By.id("As")).click();

//verify the radio button is selected
    if(driver.findElement(By.id("As")).isSelected()) {
    	System.out.println("is selected succefully");
    }
	}
}
