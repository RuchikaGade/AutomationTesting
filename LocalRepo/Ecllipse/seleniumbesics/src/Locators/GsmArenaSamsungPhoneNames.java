package Locators;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaSamsungPhoneNames {
	public static void main(String[] args) {
		String chromeExepath=System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/samsungphones-9.php");
		List<WebElement>deviceNames=driver.findElements(By.cssSelector("ul>li>a>strong>span"));
		System.out.println("Device count:"+deviceNames.size());
		for(int i=0;i<deviceNames.size();i++) {
		System.out.println(deviceNames.get(i).getText());
		
	}
}
}
