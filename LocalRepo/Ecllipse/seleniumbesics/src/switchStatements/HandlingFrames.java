package switchStatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SeleniumUtility s1=new SeleniumUtility();
WebDriver driver=s1.setUp("chrome", "https:/jqueryui.com/dropable/");
//switch your control to frame using webElement
//WebElement frame=driver.findElement(By.cssSelector("")
//driver.switchTo().frame(frame);
//OR
//driver.switchTo().frame(driver.findElement(By.cssSelector("");
//Or
//Switch your control to frame using index-----> now u r allowed to identify any element inside the frame 
driver.switchTo().frame(0);
Actions act=new Actions(driver);
WebElement src=driver.findElement(By.id(""));
WebElement dest=driver.findElement(By.id(""));
act.dragAndDrop(src, dest).build().perform();
	//get your control back to the main page -----> now u can identify any element from the main page again
driver.switchTo().defaultContent();
driver.findElement(By.cssSelector("")).click();
	
	
	
	}
	

}
