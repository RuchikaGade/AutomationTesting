package Locators;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {
	public static void main(String[]args) {
		String chromeExepath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", chromeExepath);
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				//We dont have any minimize method in selenium,so we will use setsize()
				driver.manage().window().setSize(new Dimension(450,600));
				driver.manage().window().maximize();
				driver.get("https://opensourse-demo.orangehrm.com/");
				driver.findElement(By.linkText("Forgot your password?")).click();
				System.out.println("forgot your password,page url:"+driver.getCurrentUrl());
				driver.navigate().back();
				System.out.println("Login page Url:"+driver.getCurrentUrl());
				driver.navigate().forward();
				System.out.println("Forgot your password url page:"+driver.getCurrentUrl());
				driver.navigate().refresh();
				driver.navigate().to("https://www.google.com");
	}
	}


