package seleniumbasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		String driverpath3=System.getProperty("user.dir")+"E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver","E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String pageTitle=driver.getTitle();
		String expectedTitle="<title>OrangeHRM</title>";
		System.out.println("Title validation:"+pageTitle.equals(expectedTitle));
		 String pageURL=driver.getCurrentUrl();
		 String expectedURL="https://opensource-demo.orangehrmlive.com/";
		 System.out.println("page URL validation:"+pageURL.equals(expectedURL));
		 int contentLength=driver.getPageSource().length();
		 System.out.println("Content length:"+contentLength);
		 //driver.close();

	}

}
