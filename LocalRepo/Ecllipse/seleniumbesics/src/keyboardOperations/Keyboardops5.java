package keyboardOperations;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome .ChromeDriver;
import org.openqa.selenium.WebElement;


public class Keyboardops5 {

	public static void main(String[] args) throws InterruptedException{
		String chromeExepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		/*
		 *  possible ways to refresh the browser
		 *  1.driver.navigate().refresh()
		 *  2.sendKeys(keys.F5)
		 *  3.by hitting the URl
		 *  Ctrl+R
		 */
		
	}

}
