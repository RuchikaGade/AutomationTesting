package firsttestngpackage;

import org.testng.annotations.Test;

public class Sample1 {
	int age=26;
	void display() {
		System.out.println("I amdisplay method of sample class1");
	}
	@Test
	public void  testCase1() {
		System.out.println("I am test case1");
	
	System.out.println("age:"+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
