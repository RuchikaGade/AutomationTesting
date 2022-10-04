package firsttestngpackage;

import org.testng.annotations.Test;

public class Sample2 {
	int age=26;
	@Test
	public void testCase1() {
		System.out.println("I am test case1");
	}
	@Test
	public void  testCse2() {
		System.out.println("I am testCase2");
	}
	@Test
	public void testCAse2() {
		System.out.println(" am testCase3");
		System.out.println("age:"+age);
	}

}
