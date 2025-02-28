package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_contextclic_rightClick {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		//create objct for actions class
		Actions action=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(button).build().perform();
		
	action.moveToElement(driver.findElement(By.xpath("//span[text()='Copy']"))).click().perform();
	}

}
