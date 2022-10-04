package firsttestngpackage;

import org.testng.annotations.Test;

public class ActiTimeInvoation {
	@Test(enabled=true,invocationCount=5)
	public void openBrowserAndAppUrl() {
		System.out.println("OPen browser and enter app Url");
	}

}
