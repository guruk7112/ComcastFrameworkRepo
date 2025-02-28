package test_cases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tps {
public static void main(String [] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
driver.get("https://demoapps.qspiders.com/ui/progress?sublist=0");

driver.findElement(By.xpath("//button[text()='Start']")).click();
Thread.sleep(6000);
driver.findElement(By.xpath("//button[text()='Pause']")).click();

driver.navigate().to("https://demoapps.qspiders.com/ui/modal?sublist=0");

driver.findElement(By.id("modal1")).click();
}
}
