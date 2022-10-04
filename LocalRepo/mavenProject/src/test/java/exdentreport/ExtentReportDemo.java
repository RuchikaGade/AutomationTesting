package exdentreport;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class ExtentReportDemo {
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	public void startReport() {
		report=new ExtentReports("./ExtentReport/ExtentReport.html",true);
		//extent.addSystemInfo("Environment Name")
		report.addSystemInfo("Host Name", "Ruchi").addSystemInfo("Environment", "Dev").addSystemInfo("User Name", "Ruchika Gade");
		//loadig the external xml file below.Create xml file in your projet and copy past the code mentioned below
		//report.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		}
	@Test
	public void testCase1() {
		//extent.startTest("TestCaseName","Description")
		//TestCaseName=Name of the test
		//Description=Description of the  test 
		//Starting test 
		test= report.startTest("passTest");
		Assert.assertTrue(true);
		//To generate the log when the test case is passed
		test.log(LogStatus.PASS, "Testcase1 is passed");
	}
	@Test
	public void testCase2() {
		test=report.startTest("failedTest");
		Assert.assertTrue(false);
		test.log(LogStatus.PASS,"Testcase2 is passed");
	}
	@Test
	public void skipTest() {
		test=report.startTest("skipTest");
		throw new SkipException("Skipping-This is not ready for testing");
	}
	@AfterMethod
	public void getResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test case Failed is"+result.getName());
			test.log(LogStatus.FAIL, "Test case Failed is "+result.getThrowable());
		}else if(result.getStatus()==ITestResult.SKIP) {
			test.log(LogStatus.SKIP, "Test case Skipped is"+result.getName());
		}
		//ending test
		//endTest(logger):It ends the current test and prepares to create HTML
		report.endTest(test);
	}
		@AfterTest
		public void endReport() {
			report.flush();
			report.close();
	}
	

}
