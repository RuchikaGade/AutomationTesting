package seleniumbasics;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		//absolute path String
	String driverPath1="E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
	//OR relative Path
	String driverpath2="E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
	//OR using System class 
	String driverpath3=System.getProperty("user.dir")+"E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe";
	//Set the Driver Executables path using system.setproperty(String key,String value)
	System.setProperty("webdriver.chrome.driver","E:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe");
	//create an instance of required browser class
	ChromeDriver cdriver=new ChromeDriver();
	
	
	

	}

}
