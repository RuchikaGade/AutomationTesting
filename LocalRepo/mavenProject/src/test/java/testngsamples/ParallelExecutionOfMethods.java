package testngsamples;

import org.testng.annotations.Test;

public class ParallelExecutionOfMethods {
	@Test
	public void testCaseOne() {
		//printing id of the thread on using which test method got executed 
		System.out.println("Test case one withThread Id:- "+Thread.currentThread().getId());
		
	}
	@Test
	public void testCaseTwo() {
		System.out.println("Test case with two thread Id:-" +Thread.currentThread().getId());
	}

}
