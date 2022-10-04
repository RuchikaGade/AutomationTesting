package New;

import org.testng.annotations.Test;

public class grouping {
	@Test(groups= "animal")
	public void method1() {
		System.out.println("I am method one");
	}
	@Test(groups="birds")
	public void method2() {
		System.out.println("I am method two");
	}
	@Test(groups= "animal")
	public void method3() {
		System.out.println("I am method three");
	}
	@Test(groups="birds")
	public void method4() {
		System.out.println("I am method 4");
	}
	@Test(groups= "animal")
	public void method6() {
		System.out.println("I am method 6");
	}
	@Test(groups="birds")
	public void method7() {
		System.out.println("I am method 7");
	}

}
