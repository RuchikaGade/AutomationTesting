package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import utilities.SeleniumUtility;

public class GoogleApplicationBeforeAfter extends SeleniumUtility {
	SeleniumUtility s1=new SeleniumUtility();
  @Test
  public void f() {
	  System.out.println("");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.findElement(By.cssSelector(".buttonBlue")).click();
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("");
  }
  @Test
	public void testVtigerHomePage() {
		String expectedTitle = "Tablero";
		String actualTitle = getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Vtiger home page not opened or its title got changed");
  }
  @BeforeTest
  public void startUp() {
	  driver = setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
  }

  @AfterTest
  public void cleanUp() {
	  System.out.println("Cleanup");
		
	}

}
