package screenshot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
	//String chromeExePath=System.getProperty("user.dir")+"";
	//System.setProperty("webdriver.chrome.driver", chromeExePath);
	//WebDriver driver = new ChromeDriver();
	//driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.get("http://demo.actitime.com");
	
	WebDriver driver = setUp("chrome", "https://www.google.com");

	TakesScreenshot ts = (TakesScreenshot) driver;

	File screenShot = ts.getScreenshotAs(OutputType.FILE);

	FileUtils.copyFile(screenShot, new File(".\\Screenshots\\GoogleSearchPage.png"));
}
	
	public static WebDriver setUp(String browserType,String appUrl) {
		WebDriver driver=null;
		if(browserType.equalsIgnoreCase("chrome")) {
			String exePath=System.getProperty("user.dir")+"";
			System.setProperty("webdriver.chrome.driver", exePath);
			driver =new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")) {
			String exePath=System.getProperty("user.dir")+"";
			System.setProperty("webdriver.gecko.driver", exePath);
			driver=new FirefoxDriver();
		//}else if(browserType.equalsIgnoreCase("ie")) {
		//	String exePath=System.getProperty("user.dir")+"";
		//	System.setProperty("webdriver.chrome.driver", exePath);
		//	driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		return driver;
		}
	}


