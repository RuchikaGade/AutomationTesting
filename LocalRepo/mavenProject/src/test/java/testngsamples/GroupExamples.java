package testngsamples;

import org.testng.annotations.Test;

public class GroupExamples {
	@Test (groups="Regression")
	public void testCaseOne() {
		System.out.println("Im in test case one and in regression group");
	}
	@Test(groups="Regression")
	public void testCaseTwo() {
		System.out.println("I am in test case two and in regression group");
	}
		@Test(groups="Smoke Test")
		public void testCaseThree() {
			System.out.println("I am in test case three and in smoke group");
	}
	@Test(groups="Regression")	
	public void testCaseFour() {
		System.out.println("I am in test case four and in regression group");
	}
		@Test(groups="Smoke Test")
		public void testCaseFive() {
			System.out.println("I am in test case five and in smoke group");
	}

}
