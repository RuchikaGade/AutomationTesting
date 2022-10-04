package keyboardOperations;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome .ChromeDriver;


public class KeyboardOps {

	public static void main(String[] args) {
	String chromeExepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
	//setting the path for  driver executable
	System.setProperty("webdriver.chrome.driver", chromeExepath);
	//creating an instance of chrome browser and upcasting it to webDriver interface
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	//to enter required application url use get() of webDriver interface
	driver.get("https://www.flipkart.com/");
	//using escape  of keyboard to avoid login popup
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);

	}

}
