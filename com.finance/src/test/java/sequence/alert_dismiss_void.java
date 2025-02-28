package sequence;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_dismiss_void {
public static void main(String [] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/delete_customer.php");
	 Thread.sleep(1000);
	 
	 driver.findElement(By.name("cusid")).sendKeys("shino");
	 driver.findElement(By.name("submit")).click();
	 
	 Alert al=driver.switchTo().alert();
	 Thread.sleep(1000);
	 al.dismiss();
	 
	 //driver.switchTo().alert().dismiss();
	 
	 System.out.println("alert canceld");
	 Thread.sleep(2000);
	 driver.findElement(By.name("cusid")).sendKeys("rcl");
	 Thread.sleep(2000);
	 driver.close();
	 
	 
}
}
