package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class cricInfoMouseHover {

	public static void main(String[] args) throws InterruptedException{
		String chromeExepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExepath);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com");
		
		List<WebElement> element=driver.findElements(By.cssSelector(".ds-popper-wrapper"));
		for(int i=0;i<element.size();i++) {
			System.out.println("GEtting all the element:"+element.get(i).getText());
		}
		Actions act=new Actions(driver);
		//to do mouse  hover over the home menu
			act.moveToElement(element.get(0)).perform();
			for (int i=0;i<element.size();i++){
			WebElement option =element.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1000);
			}
	}

}
