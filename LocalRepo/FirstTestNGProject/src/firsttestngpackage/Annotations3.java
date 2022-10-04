package firsttestngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 {
@Test(priority=1)
public void taskCreation() {
	System.out.println("create task");
}
@Test(priority=2)
public void deleteTask() {
	System.out.println("delete task");
}
@AfterMethod
public void logOut() {
	System.out.println("logout from browser");
}
@BeforeMethod
public void  login() {
	System.out.println("open browserand login");
}
}
