package Locators;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumValidation {

	public static void main(String[] args) {
		String chromeExePath=System.getProperty("user.dir")+"E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", "E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\demo.actitime.com");
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
WebElement userNameInputField=driver.findElement(By.id("username"));
System.out.println("username displayed or not:"+userNameInputField.isDisplayed());
System.out.println("username is functional or not:"+userNameInputField.isEnabled());
String defaultValueInuserNameInputField=userNameInputField.getAttribute("placeholder");
System.out.println("default value of user name input field:"+ defaultValueInuserNameInputField);
System.out.println("default valur validation for user input field status:"+defaultValueInuserNameInputField.equals("username"));
WebElement newpassword=driver.findElement(By.name("pwd"));
System.out.println("password is displayed or not:"+newpassword.isDisplayed());
System.out.println("password is function or not:"+newpassword.isEnabled());
String str=newpassword.getAttribute("placeholder");
System.out.println("Default value of pssword:"+str);

	}

	private static void getAttribute(String string) {
		// TODO Auto-generated method stub
		
	}

}
