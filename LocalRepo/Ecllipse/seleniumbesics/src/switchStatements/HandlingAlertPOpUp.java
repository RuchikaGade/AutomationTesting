package switchStatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingAlertPOpUp {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//as the required element is present inside the frame,soneed to switch our control inside frame first
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("")).click();
		System.out.println("Alert text msg:"+driver.switchTo().alert().getText());
		// to perform another action on alert we need to again sswitch our control to the alert
		driver.switchTo().alert().accept();
		}

}
/**
 * in order to handle any java Script pop up we need to use driver.SwitchTo().alert()  bcz java Script popUp doesn't contain HTML code
 * We use predefined functions of Alert to perfoem any operation on it after every action conrol comes back to the main page
 */
