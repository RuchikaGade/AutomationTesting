package firsttestngpackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
 @BeforeTest
public void setUp() {
System.out.println("open browser and login into application");
 }
 @Test(priority=1)
 public void taskCreation() {
	 System.out.println("create new task");
	 
 }
 @Test(priority=2)
 public void deleteTask() {
	 System.out.println("Delete new task");
	 }
@Test(priority=3)
public void cleanUp() {
System.out.println("logout and close browser");
}
}