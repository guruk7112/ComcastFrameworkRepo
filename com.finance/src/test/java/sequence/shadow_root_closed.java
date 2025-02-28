package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shadow_root_closed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//h1[text()='Login']")).click();
		
		Actions action=new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		action.sendKeys("dielan").perform();
		
		action.sendKeys(Keys.TAB).perform();
		Thread.sleep(1000);
		action.sendKeys("1346").perform();
}
}