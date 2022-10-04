package seleniumbasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
String driverpath3=System.getProperty("user.dir")+"E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", ".\\executables\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
String pageTitle=driver.getTitle();
String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
System.out.println("Title validation:"+pageTitle.equals(expectedTitle));
 String pageURL=driver.getCurrentUrl();
String expectedURL="https://www.amazon.in/";
System.out.println("page URL validation:"+pageURL.equals(expectedURL));
int contentLength=driver.getPageSource().length();
System.out.println("Content length:"+contentLength);

		
	}

}
