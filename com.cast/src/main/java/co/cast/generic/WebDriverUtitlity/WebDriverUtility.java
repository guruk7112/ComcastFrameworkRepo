package co.cast.generic.WebDriverUtitlity;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void WaitForPageToLoad(WebDriver driver) {                           //implicitWait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	public void WaitForElementPresent(WebDriver driver,WebElement element ) {   //ExplicitWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public void SwitchToTabOnURL(WebDriver driver,String partialURL) {          //getWindowHandles by url
		Set<String> set1=driver.getWindowHandles();
		Iterator<String> it1=set1.iterator();
		
		while(it1.hasNext()) {
			String windowid1=it1.next();
			
			driver.switchTo().window(windowid1);
			
		String actualUrl=	driver.getCurrentUrl();
		if(actualUrl.contains(partialURL)) {
			break;
		} }
			
	}
	public void SwitchToTabOnTitle(WebDriver driver,String partialTitle) {     //getWindowHandles by Title
		Set<String> set1=driver.getWindowHandles();
		Iterator<String> it1=set1.iterator();
		
		while(it1.hasNext()) {
			String windowid1=it1.next();
			
			driver.switchTo().window(windowid1);
			
		String actualUrl=	driver.getTitle();
		if(actualUrl.contains(partialTitle)) {
			break;
		} }
	} 
	public void SwitchTOFrame(WebDriver driver, int index ) {                     //switch to frame by index
	driver.switchTo().frame(index);
	}
	public void SwitchToFrame(WebDriver driver, String nameID) {                 //switch to frame by name 
		driver.switchTo().frame(nameID);
	}
	public void switchToFrame(WebDriver driver, WebElement element){            //switch to frame by webelement 
		driver.switchTo().frame(element);
	}
	
	public void SwitchToAlertAndAccept(WebDriver driver) {                      //alert accept
		driver.switchTo().alert().accept();
	}
	public void SwitchToAlertAndDismiss(WebDriver driver) {                     //alert dismiss
		driver.switchTo().alert().dismiss();
	}
	
	public void Select(WebElement   element  , String text) {                      //select by visible text 
		Select sel=new Select(element );
		sel.selectByVisibleText(text);
	}
	public void Select(WebElement element , int index) {                        //select by index
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public void mousemoveOnElement(WebDriver driver ,WebElement element) {     // actions move to element 
	 Actions act =new Actions(driver);
	 act.moveToElement(element).perform();	
	}
	public void DoubleClick(WebDriver driver , WebElement element) {            //actions double click
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();		
	}
	public void ContextClick(WebDriver driver ,WebElement element) {             //actions right click
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	public void ScrollByAmount(WebDriver driver ) {     //actions scrollbyamout
		Actions act=new Actions(driver);
		act.scrollByAmount(1000,1000).perform();
	}
	public void ScrollToElement(WebDriver driver , WebElement element ) {        //actions scrolltoelement 
		Actions act=new Actions(driver) ;
		act.scrollToElement(element).perform();
		}
	public void DragAndDrop(WebDriver driver, WebElement source, WebElement target) { //actions Drag andDrop
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}
	public void ClickandHold(WebDriver driver, WebElement element) {                //actions ClickandHold
		Actions act=new Actions(driver);
		act.clickAndHold(element).perform();
	}
	public void TakesScreenShotFile(String path , WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;                                   //TakesScreenShot page 
	File Screen=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File(path);
	FileHandler.copy(Screen, dest);
	}
	public void TakesScreenShotElement(String path , WebDriver driver , WebElement element) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Screen=element.getScreenshotAs(OutputType.FILE);                         //TakesScreenShot element
		File dest=new File(path);
		FileHandler.copy(Screen,dest);
	}
	} 