package switchStatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class HandlingFrames {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
	WebDriver driver=s1.setUp("chrome","https://jqueryi.com/dropable/");
	//Switch ur control to frame using webElement
	//WebElement frame=driver.findElement(By.cssSelector(""));
	//driver.switchTo().frame(frame);
	//or
	//driver.switchTo().frame(driver.findElement(By.("cssSelector"));
	//OR switch ur control to frame using index----> now u r allowed to identify any element inside the frame 
	driver.switchTo().frame(0);
	Actions act=new Actions(driver);
	WebElement src=driver.findElement(By.cssSelector(""));
	WebElement target=driver.findElement(By.cssSelector(""));
	act.dragAndDrop(src, target).build().perform();
	//get your control back to main page ----> now u an identify  any element from the main page again
	driver.switchTo().defaultContent();
	driver.findElement(By.cssSelector("")).click();
	
	
	}
	

}
