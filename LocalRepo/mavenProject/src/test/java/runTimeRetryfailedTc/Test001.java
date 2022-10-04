package runTimeRetryfailedTc;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test001 {
	@Test(retryAnalyzer = retryfailedTc.RetryAnalyzer.class)
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	@Test(retryAnalyzer = retryfailedTc.RetryAnalyzer.class)
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}

}
