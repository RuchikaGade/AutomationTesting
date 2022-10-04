
package ExplicitWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebDriverWaitExample2 {

	public static void main(String[] args) {
		String chromeExepath=System.getProperty("user.dir")+"";
		System.setProperty("webdriver.chrome.driver",chromeExepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(xpathExpression)).sendkeys("Ruchi123");
		driver.findElement(By.xpath(xpathExpression)).click();
		//explicitwait(Dynamic wait)
		WebDriverWait wait=new WebDriverWait(driver,20);
		//add conditions to wait using webdriver wait instance
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("passwd")));
		driver.findElement(By.name("passwd")).sendKeys("ruchi123");
		driver.findElement(By.xpath(xpathExpression)).click();
		//driver.close();
		

	}

}
