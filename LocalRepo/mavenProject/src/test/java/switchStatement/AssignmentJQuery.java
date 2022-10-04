package switchStatement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class AssignmentJQuery {

	public static void main(String[] args) throws InterruptedException{
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome"," https://jqueryui.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Sortable']")).click();
			//("//div//div[2]//aside//ul/li[5]/a")).click();
	WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(frame);
	//Actions act=new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	List<WebElement>allElement=driver.findElements(By.cssSelector("#sortable>li"));

	for (int i = 0; i < allElement.size(); i++) {
	//System.out.println("All element:"+allElement.get(i).getText());
		
		s1.performDranAndDrop(allElement.get(6 - i), allElement.get(0));
		
	}
	
	}
}
