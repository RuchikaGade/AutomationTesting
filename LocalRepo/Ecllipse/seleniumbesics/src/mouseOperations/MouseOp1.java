package mouseOperations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp1 {
public static void main(String[] args) {
	String chromeExepath=System.getProperty("user.dir")+"";
	System.setProperty("webdriver.chrome.driver",chromeExepath);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http:demo.automationtesting.in/Register.html");
	//identify first name input field
	WebElement userName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
	userName.sendKeys("admin");
	//create an instance of action class by passing required browser istance t its constrctor
	Actions act=new Actions(driver);
	//with the help of action class reference perform appropriate action
	act.moveToElement(userName).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	//paste it in name field
	WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
