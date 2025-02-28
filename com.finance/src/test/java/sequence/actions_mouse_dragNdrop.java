package sequence;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_mouse_dragNdrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//create actions object
		Actions action=new Actions(driver);
		
		//source webelement
		WebElement source=driver.findElement(By.id("box5"));
		
		//target webelement
		WebElement target=driver.findElement(By.id("box105"));
		action.dragAndDrop(source, target).build().perform();

          WebElement source1=driver.findElement(By.id("box6"));
		
		//target webelement
		WebElement target1=driver.findElement(By.id("box106"));
		action.dragAndDrop(source1, target1).build().perform();             
	}

}
