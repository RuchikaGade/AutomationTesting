package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.SkipException;

public class ActiTimeException {
	/**
	 * when you catch the exception at test case level
	 */
	@Test(expectedExceptions=ArithmeticException.class)
	public void dividedByZeroExample1() {
		System.out.println("Exception test");
	int e=1/0;
	System.out.println("Exception Handling Done");
	}
	@Test(timeOut=1000)//specify time in milliseconds
	public void executeTimeout() throws InterruptedException{
		//Thread.sleep(3000);
		//Thread.sleep(300);
		
	}
	
	
}
