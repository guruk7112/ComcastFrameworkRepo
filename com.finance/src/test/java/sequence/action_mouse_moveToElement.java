package sequence;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_mouse_moveToElement {
public static void main(String [] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	
	
	//create an object for actions class
	Actions action=new Actions(driver);
	
	//*move to element------------
	WebElement computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
	action.moveToElement(computers).build().perform();
	
	WebElement desktop=driver.findElement(By.xpath("//a[contains(text(),'Desktops')][1]"));
	action.moveToElement(desktop).build().perform();
	
	WebElement Notebooks=driver.findElement(By.xpath("//a[contains(text(),'Notebooks')][1]"));
	action.moveToElement(Notebooks).click().build().perform();
	
	
	
}
}
