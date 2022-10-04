package switchStatement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;


import utilities.SeleniumUtility;

public class HandlingWindow {

	public static void main(String[] args)throws InterruptedException{
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://etrain.info/in");
		//get current window unique id
		String homePageId=driver.getWindowHandle();
		System.out.println("Home pagewindow ID:"+homePageId);
		//performing click operation to open linkedin page in new tab
		driver.findElement(By.xpath("")).click();
		//get all windows unique IDs which are opened by selenium current instance
		Set<String>allWinIds=driver.getWindowHandles();
		System.out.println("All windows Id:"+allWinIds);
		//get child window id using iterator
		Iterator<String>itr=allWinIds.iterator();
		String childWinId=itr.next();
		driver.switchTo().window(childWinId);
		//OR
		// switch control t child window
		//driver.switchTo().window(allWinIds.iterator().next());
		//Now u Are allowed to identify any element from child window
		System.out.println("LinkedIn page Title:"+driver.getTitle());
		System.out.println("LinkedIn page Url:"+driver.getCurrentUrl());
		driver.close();
		// Switch back to home window
		driver.switchTo().window(homePageId);
		System.out.println("etrain page Title:"+driver.getTitle());
		System.out.println("etrain current page Url:"+driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
