
package switchStatement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class StutiCode {

	public static void main(String[] args) {
		SeleniumUtility s1 = new SeleniumUtility();

		WebDriver driver = s1.setUp("chrome", "https://jqueryui.com");
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// click on Sortable
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		// locate frame
		WebElement frame = driver.findElement(By.className("demo-frame"));

		driver.switchTo().frame(frame);
		// Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//List<WebElement> drag = driver.findElements(By.xpath("//ul[@id='sortable']"));
		List<WebElement> drag= driver.findElements(By.cssSelector("#sortable>li"));

		for (int i = 0; i < drag.size(); i++) {
			s1.performDranAndDrop(drag.get(6 - i), drag.get(0));
			
		}
	}

}
