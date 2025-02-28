package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class senario1 {
public static void main(String[]args) throws InterruptedException {
	
	//launch chrome browser
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/register");
	//naivigate to register 
	driver.manage().window().maximize();
	//click on register
	driver.findElement(By.linkText("Register")).click();
	//enter the details in register page
	driver.findElement(By.id("gender-male")).click();
	
	driver.findElement(By.name("FirstName")).sendKeys("abck");
	
	driver.findElement(By.id("LastName")).sendKeys("dyc");
	
	driver.findElement(By.id("Email")).sendKeys("dyc@gmial.com");
	
	driver.findElement(By.name("Password")).sendKeys("secret");
	
	driver.findElement(By.name("ConfirmPassword")).sendKeys("secret");
	//click on register button 
	driver.findElement(By.id("register-button")).click();
	//close the browser
	
	driver.quit();
	
}
}
