package switchStatement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class OrangeHrmAssignment {

	public static void main(String[] args) {
	SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//System.setProperty("webdriver.gecko.driver", "C:\\Ecllipse\\seleniumbesics\\executables\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String str1=driver.findElement(By.xpath("//div//p[1]")).getText().substring(11);
		String str2=driver.findElement(By.xpath("//div//p[2]")).getText().substring(11);
		
		WebElement username=driver.switchTo().activeElement();
		username.sendKeys(str1,Keys.TAB);
		WebDriverWait wait =new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/input[@placeholder=\"Username\"]")));
		//String str=username.getAttribute("placeholder");
		//System.out.println("Is mouse pointer present in username input field?:"+str.equals("username"));
		
		driver.switchTo().activeElement().sendKeys(str2,Keys.ENTER);
		
	}

}
