package switchStatements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class HandlingConfirmationPopUp {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https:/www.w3school.com/js/tryit.asp?filename=tryjs_confirm");
		//As the required element is present inside the frame ,so need to switch pur control inside frame first
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("")).click();
		System.out.println("Alert msg is :"+driver.switchTo().alert().getText());
		//to perform another action on the alerts ,we need to   again switch our control to the alert
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
	}

}
// in order to handle any java Script pop  up (application specific) we need to use driver.switchTo().alert()
 // because java script pop up doesn't contain HTML code ,we use predefined function of alert to perform any operation on it 
//