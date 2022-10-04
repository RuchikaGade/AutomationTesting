package firsttestngpackage;

import org.testng.annotations.Test;

public class ActiTimeEnabled {
	@Test(enabled=true)
	public void openBrowserAndAppUrl() {
		System.out.println("open browser and enter app Url");
	}
	@Test
	public void login() {
		System.out.println("Enter username,password and click on the login button");
	}
	@Test
	public void logOut() {
		System.out.println("Log out from the application and close the browser");
	}

}
