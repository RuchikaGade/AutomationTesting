package mouseOperations;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp2 {

	public static void main(String[] args) {
		String chromeExepath=System.getProperty("user.dir")+"executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",chromeExepath);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://globalsqa.com/demosite");
		//identify all the elements in menu
		List<WebElement>mainMenu=driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
		System.out.println("Main menu 'option count:"+mainMenu.size());
		//create an instance of action class by passing required browser instance t its constructor//
		Actions act=new Actions(driver);
		//to do mouse  hover over the home menu
	//act.moveToElement(mainMenu.get(0)).perform();
	//for (int i=0;i<main Menu.size();i++){
	//WebElement option =mainMenu.get(i);
	//act.moveToElement(option).perform();
	//Thread.sleep(1000);
	//}
	//mouseOverTheElement(act,mainMenu.get(2));
	//mouseOver(act,mainMenu);
	//act.moveToElement(mainMenu.get(1),100,0).perform();
	rightClick(act,mainMenu.get(1));
	}
	static void  mouseOverTheElement(Actions act,WebElement element) {
		act.moveToElement(element).perform();
	}
	static void rightClick(Actions act,WebElement option) {
		System.out.println("option Name is:"+option.getText());
		act.moveToElement(option).contextClick().build().perform();
	}
	static void mouseOverWithCords(Actions act,WebElement option,int x,int y)throws InterruptedException{
		System.out.println("option name is:"+option.getText());
		act.moveToElement(option,x,y).perform();
	}
	static void MouseHover(Actions act,List<WebElement> mainMenu)throws InterruptedException{
		for (int i=0;i<mainMenu.size();i++) {
			WebElement option=mainMenu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(1000);
		}
	}}
