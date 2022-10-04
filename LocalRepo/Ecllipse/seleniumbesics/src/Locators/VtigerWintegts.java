package Locators;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VtigerWintegts {

	public static void main(String[] args) {
		String chromeExepath=System.getProperty("user.dir")+".\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.cssSelector(".buttonBlue")).click();//click on sign in button
		driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();//click on widget button
		 driver.findElement(By.cssSelector("a[data-name='History']")).click();//select History
		 driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();//click on widget button
		 driver.findElement(By.cssSelector("a[data-name=TotalRevenuePerSalesPerson]")).click();//select Total  Revenue
		 driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();//click on widget button
		 driver.findElement(By.cssSelector("a[data-name=TopPotentials]")).click();//select Top Opportunities
		 driver.findElement(By.cssSelector(".userName")).click();//click on user profile
		 driver.findElement(By.cssSelector("#menubar_item_right_LBL_SIGN_OUT")).click();//sign out
		
	}

}