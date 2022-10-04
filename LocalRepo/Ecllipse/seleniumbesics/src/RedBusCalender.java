import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RedBusCalender {

	public static void main(String[] args) {
		String chromeExepath=System.getProperty("user.dir")+"";
		System.setProperty("webdriver.chrome.driver", chromeExepath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
