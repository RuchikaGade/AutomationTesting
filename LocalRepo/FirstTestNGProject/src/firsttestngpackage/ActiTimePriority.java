package firsttestngpackage;

import org.testng.annotations.Test;

public class ActiTimePriority {
	@Test(priority=1,description="OPen browser and enter app Url")
	public void OPenBrowserAndAppUrl() {
		System.out.println("OPen browser and enter app Url");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("enter username,password and click on login button");
	}
	@Test(priority=3)
	public void createTask() {
		System.out.println("Create new Task");
	}
	@Test(priority=4)
	public void logOutClose() {
		System.out.println("LogOut from the application and close the browser");
	}
	

}
