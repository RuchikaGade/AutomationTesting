package New;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test002 {
	@Test(retryAnalyzer = New.RetryAnalyzer1.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void test2() {
		Assert.assertEquals(true, true);
	}
}