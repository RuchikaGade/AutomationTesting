package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectIdentification {

	public static void main(String[] args) {
		String currentWorkingDir=System.getProperty("E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe");
		String chromeExePath=currentWorkingDir+"E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement username=driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("admin");
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("Test@123");
		WebElement submitBtn=driver.findElement(By.className("buttonblue"));
		submitBtn.click();
	}

}
