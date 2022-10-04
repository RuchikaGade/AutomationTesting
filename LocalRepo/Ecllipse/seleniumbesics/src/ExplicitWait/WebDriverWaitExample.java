package ExplicitWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample {

	public static void main(String[] args) {
		String chromeExepath= System.getProperty("user.dir")+"";
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		WebDriver driver= new ChromeDriver();
		driver.get("https://:demo.actitime.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Explicit wait dynamic Wait
		WebDriverWait wait=new WebDriverWait(driver,20);
		//identify and perform required operation
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		//Wait for logout link to be loaded in the page
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println("Home page title:"+driver.getTitle());
		//add condition to wait using webDriverWait instance
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutLink"))));
		//click on logout link
		WebElement logoutLink=driver.findElement(By.id("logoutlink"));
		logoutLink.click();
		//close the browser
		driver.close();
		
		
		

	}

}
