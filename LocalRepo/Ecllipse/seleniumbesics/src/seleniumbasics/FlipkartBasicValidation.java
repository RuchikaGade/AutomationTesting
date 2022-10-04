package seleniumbasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBasicValidation {

	public static void main(String[] args) {
		//OR using System class 
		String driverpath3=System.getProperty("user.dir")+"E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver","E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String pageTitle=driver.getTitle();
		String expectedTitle="<meta name=\"twitter:title\" content=\"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!";
		System.out.println("Title validation:"+pageTitle.equals(expectedTitle));
		 String pageURL=driver.getCurrentUrl();
String expectedURL="https://www.flipkart.com/";
System.out.println("page URL validation:"+pageURL.equals(expectedURL));
int contentLength=driver.getPageSource().length();
System.out.println("Content length:"+contentLength);
//driver.close();
	}

}
//1. https:opensource-demo.orangehrmlive.com/
	//2. https://demo.automationtesting.in/Register.html
	//3. http://sampleapp.tricentis.com/101/
	//4. https://www.amazon.in/

//perform following operations:
	//Print page title and validate it
	//print page url and validate it
	//get page source and print its length
