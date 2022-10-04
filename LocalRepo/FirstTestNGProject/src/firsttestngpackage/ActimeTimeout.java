package firsttestngpackage;

import org.testng.annotations.Test;

public class ActimeTimeout {
@Test(enabled=true,timeOut=200)
public void openBrowserAndAppUrl() throws InterruptedException{
	Thread.sleep(180);
	System.out.println("OPen Browser and enter app url");
}
}
