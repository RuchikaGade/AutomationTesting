import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class PositionValidation {
	//open a browser and enter actitime application url
			//click on login button
			//validate in error msg "username" or password ins invalid plz try again is displayed in red colour
			//aboove the username field
		public static void main(String[] args) {
			String chromeExepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromeExepath);
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("loginButton")).click();
			
			//driver.findElement(By.cssSelector(".errormsg")).click();
			WebElement errorMsg=driver.findElement(By.cssSelector(".errormsg"));
			System.out.println("Error msg Text colour:"+errorMsg.getCssValue("color"));
			Point locationOfErrorMsg=errorMsg.getLocation();
			int errorMsgX=locationOfErrorMsg.getX();
			int errorMsgY=locationOfErrorMsg.getX();
			System.out.println("Error msg:"+errorMsgX);
			System.out.println("Error Msg:"+errorMsgY);
			WebElement userName=driver.findElement(By.id("username"));
			Point locationUsername=userName.getLocation();
			int usernameX=locationUsername.getX();
			int usernameY=locationUsername.getY();
			System.out.println("username  X cord:"+usernameX);
			System.out.println("username Y cord:"+usernameY);
			int pwdY=driver.findElement(By.name("pwd")).getLocation().getY();
			System.out.println("pwd y:"+pwdY);
			int pwdX=driver.findElement(By.name("pwd")).getLocation().getX();
			System.out.println("pwd x:"+pwdX);
			System.out.println("Is error msg getting displayed above the username field?"+(errorMsgY<usernameY));
		}		
			
			
			
					

}
