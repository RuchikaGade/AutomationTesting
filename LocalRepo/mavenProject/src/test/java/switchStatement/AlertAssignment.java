package switchStatement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class AlertAssignment {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome"," https://demoqa.com/alerts");
		WebDriverWait wait=new WebDriverWait(driver,20);
		//driver.findElement(By.id("alertButton")).click();
		
		//System.out.println("Alert msg:"+driver.switchTo().alert().getText());
		
		//driver.switchTo().alert().accept();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton"))).click();
		//System.out.println("Alert msg:"+driver.switchTo().alert().getText());
		
		//driver.switchTo().alert().accept();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("confirmButton"))).click();
		
		
		//System.out.println("Alert msg:"+driver.switchTo().alert().getText());
		
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		//Thread.sleep(500);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("promtButton"))).click();
				
		System.out.println("Alert msg:"+driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Ruchi");
		Thread.sleep(500);
		driver.switchTo().alert().accept();
	}

}
