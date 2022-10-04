package testngsamples;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class DataProviderExample extends SeleniumUtility {
	/**
	 * This test method declares that its data should be supplied by the Data
	 * provider "get data" is the function name which is passing the data number of
	 * column should match the number of input parameters 
	 */
	@Test(dataProvider= "getData")
	public void setData(String username,String password) {
		System.out.println("you have provided username as::"+username);
		System.out.println("you have provided password as::"+password);
	}
	@Test(dataProvider="testData")
	public void testLoginOfVtiger(String browser,String username,String password ) {
	 setUp(browser,"https://demo.vtiger.com/vtigercrm/index.php");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(password,Keys.ENTER);
		//driver.close();
	}
	@DataProvider(name="testData")
	public Object[][] getUserDetails(){
		/**
		 * Rows-Number of times your test has to be repeated .
		 * column - number of parameters in test data
		 */
		Object[][]data=new Object[3][3];
		//1st row
		data[0][0]="chrome";
		data[0][1]="admin";
		data[0][2]="Test@123";
		//2nd  Row
		data[1][0]="chrome";
		data[1][1]="pass123";
		data[1][2]="admin";
		//Row 3rd
		data[2][0]="chrome";
		data[2][1]="";
		data[2][2]="";
		return data;
	}
	@DataProvider
	public Object[][]getData(){
		/**Rows-Number of times your test has to be repeated .
		 * column - number of parameters in test data
		 * 
		 */
		//1st row
		Object[][]data=new Object[3][2];
		data[0][0]="admin";
		data[0][1]="admin";
		//2nd  Row
		data[1][0]="";
		data[1][1]="";
		//Row 3rd
				data[2][0]="guestuser3";
				data[2][1]="pass123";
				return data;
	}
}
