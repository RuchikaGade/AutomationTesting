package Locators;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		String chromeExePath=System.getProperty("user.dir")+"E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver","E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String pageTitle=driver.getTitle();
		System.out.println("page title is:"+pageTitle);
		System.out.println("page length:"+pageTitle.length());
		String expectedTitle="actiTIME-Login";
		System.out.println("Title validation:"+pageTitle.equals(expectedTitle));
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("Manager");
		driver.findElement(By.id("loginbutton")).click();
		//explicit wait(Static wait)
		Thread.sleep(2000);
		String homepageTitle=driver.getTitle();
		System.out.println("homepageTitle:"+homepageTitle);
		System.out.println("Home Page validation:"+homepageTitle.equals("actiTIME-Enter Time-Track"));
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("Title validation status:"+pageTitle.equals(expectedTitle));
		driver.close();
		

	}

}
