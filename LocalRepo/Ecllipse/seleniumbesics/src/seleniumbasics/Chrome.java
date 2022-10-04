package seleniumbasics;
import org.openqa.selenium.chrome.ChromeDriver;


public class Chrome {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe");
	//ChromeDriver driver=new ChromeDriver();
ChromeDriver cd=new ChromeDriver();
cd.get("https://www.google.com");
//cd.close();
	}

}

