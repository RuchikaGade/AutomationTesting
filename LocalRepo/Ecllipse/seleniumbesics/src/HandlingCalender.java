import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingCalender {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://makemytrip.com/");
		//close login pop up
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		//Identify departure date and click on it
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		//select  any date from next month
		driver.findElement(By.cssSelector("div.DayPicker=Months>*:last-child>.DayPicker-Body>div:nth-of-type(2)>*:nth=child(2)>div>p")).click();
		//select any date from next month
		driver.findElement(By.cssSelector(cssSelector)).click();
		

	}

}
