package retryfailedTc;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

	public class RetryAnalyzer implements IRetryAnalyzer {
	int counter=0;
	int retryLimit=2;
	/* 
	 * (non-javadoc)
	 * @see org.testng.IRetryAnalyzer#retry(org.testng.ITestResult)
	 * This method decides how many times a test needs to be return.
	 * TestNG will call this method every time a test fails
	 * so we can put some code  here to decide  when to return the test
	 * Note: This method will return true if test needs to be retried
	 * and false if not 
	 */
	
	public boolean retry(ITestResult result) {
	
	if (counter < retryLimit) 
	{
		counter++;
		return true;
	}
	return false;
}
}
