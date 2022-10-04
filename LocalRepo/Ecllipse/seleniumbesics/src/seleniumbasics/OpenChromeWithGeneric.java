package seleniumbasics;
import org. openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChromeWithGeneric {
	public static void main(String[] args) {
		//Absolute path
		String driverpath1="E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
		//or relative path-------> '.'
		String driverpath2=".\\executables\\chromedriver.exe";
		//OR using system class
		String driverpath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//Set the driver Executables path usig system.set property(String key,String value)
		System.setProperty("webdriver.chrome.driver", driverpath3);
		WebDriver driver=new ChromeDriver();
		

	}

}
