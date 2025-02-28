package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_inline_frame_index_to_mainpage {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/class%20and%20object/C%20OVERLOADING/button.html");
	Thread.sleep(2000);
	
	//driver.findElement(By.className("footer")).click(); //no such element exception unable to locate with id
	
	//switch to frame by index
	driver.switchTo().frame(0);
	driver.findElement(By.id("searchInput")).sendKeys("mobiles");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(1000);

//switch back to mainpage
//driver.switchTo().defaultContent();
//driver.findElement(By.linkText("chrome")).click();


}

}
