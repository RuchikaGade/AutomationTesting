package keyboardOperations;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome .ChromeDriver;
import org.openqa.selenium.WebElement;

public class KeyboardOps3 {

	public static void main(String[] args) throws InterruptedException {
		String chromeExepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		//identify first name input field
		WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
	//type first name admin and use ctrl+a
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		//in first namae input field use Ctrl+c
		firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"c"));
		//in last name field use ctrl+v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));//paste the first name in the last name field
		
	}

}
