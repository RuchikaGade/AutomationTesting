package switchStatements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class AssignmentOrangeHrm {

	public static void main(String[] args) {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//login into the application without identifying username and password Field
				//verify mouse  pointer is in username input field
				WebElement username=driver.switchTo().activeElement();
				String str=username.getAttribute("placeholder");
				System.out.println("is mouse pointer present in input field?"+str.equals("username"));
		username.sendKeys("admin",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("admin123",Keys.ENTER);
			}
	}


