package seleniumbasics;
import org. openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		String driverpath1="E:\\Ecllipse\\seleniumbesics\\executables\\geckodriver.exe";
		String driverpath2=".\\executables\\geckodriver.exe";
		String driverpath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", "E://Ecllipse//seleniumbesics//executables//geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();
		//fdriver.close();

	}

}
