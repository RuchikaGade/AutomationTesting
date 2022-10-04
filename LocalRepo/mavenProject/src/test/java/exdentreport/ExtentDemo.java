package exdentreport;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentDemo {
	static ExtentTest test;
	static ExtentReports report;

	@BeforeClass
	public static void startTest() {
		report = new ExtentReports(".\\ExtentReport\\ExtentReportResults.html");
		test = report.startTest("GooglePageReport");
	}

	@Test
	public void extentReportsDemo() throws IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Ecllipse\\seleniumbesics\\executables\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		if(driver.getTitle().equals("Google")) {
			test.log(LogStatus.PASS, "Navigated to the Specified URL successfully and page title is validated");
		}else {
			test.log(LogStatus.FAIL,test.addScreenCapture(screenShot(driver)),"Google page validation got failed");
			//System.out.println("Google page Validation got failed");
		}
	}
	@AfterClass
	public static void endTest() {
		report.endTest(test);
		report.flush();
	}
	public static String screenShot(WebDriver driver)throws IOException{
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File  Dest=new File("src//BStackImages/"+System.currentTimeMillis()+".png");
		String errflpath=Dest.getAbsolutePath();
		FileUtils.copyFile(srcFile, Dest);
		return errflpath;
	}
	
}
