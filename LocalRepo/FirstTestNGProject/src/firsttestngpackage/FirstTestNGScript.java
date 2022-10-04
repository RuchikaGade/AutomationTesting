package firsttestngpackage;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class FirstTestNGScript {
	@Test
	public void TestCase1() {
		SeleniumUtility s1 = new SeleniumUtility();
		WebDriver driver = s1.setUp("chrome", "https://www.ecatering.irctc.co.in/");
		String expectedTitle="Home | ecatering IRCCTC: Order Food on Train Online,Food and Meal on Train,Tasty Food for Train Journey";
	String actualTitle=s1.getPageTitle();
	//below given code will not fail ur test case even if validation is failed
	//if(actualTitle.equals(expectedTitle)){
	//system.out.println("TC passed");
	//}else{
	//System.out.println("Tc failled");
	//}
	//If validation is failled then test case will be marked as failled
	Assert.assertEquals(actualTitle, expectedTitle,"ecatering page validation got failled");
	WebElement searchTrain=driver.findElement(By.xpath("//inout[@placeholder='Search Train or Station t explore']"));
	Assert.assertTrue(searchTrain.isDisplayed(), "Train search input field is not visible");
	//s1.tearDown();
	}
}
