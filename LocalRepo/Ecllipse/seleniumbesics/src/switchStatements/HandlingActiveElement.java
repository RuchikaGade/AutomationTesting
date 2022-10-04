package switchStatements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.SeleniumUtility;

public class HandlingActiveElement {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://demo.actitime.com/");
		//login into the application without identifying username and password Field
		//verify mouse  pointer is in usernamevinput field
		WebElement username=driver.switchTo().activeElement();
		String str=username.getAttribute("placeholder");
		System.out.println("is mouse pointer present in input field?"+str.equals("username"));
username.sendKeys("admin",Keys.TAB);
driver.switchTo().activeElement().sendKeys("manager",Keys.ENTER);
	}

}
