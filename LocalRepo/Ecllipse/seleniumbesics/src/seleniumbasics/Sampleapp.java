package seleniumbasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampleapp {

	public static void main(String[] args) {
		String driverpath3=System.getProperty("user.dir")+"E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver","E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		String pageTitle=driver.getTitle();
		String expectedTitle="<title>Enter Vehicle Data</title>";
		System.out.println("Title validation:"+pageTitle.equals(expectedTitle));
		 String pageURL=driver.getCurrentUrl();
String expectedURL="http://sampleapp.tricentis.com/101/app.php";
System.out.println("page URL validation:"+pageURL.equals(expectedURL));
int contentLength=driver.getPageSource().length();
System.out.println("Content length:"+contentLength);
	
				
	}

}
