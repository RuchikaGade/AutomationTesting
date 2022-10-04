package firsttestngpackage;

import org.testng.annotations.Test;

public class Sample3 {
	int age=26;
	@ Test
	public void SignUp() {
		System.out.println("I amsignUp method");
		}
	@Test
	public void Login() {
		System.out.println("I am login method");
	}
	@Test
	public void compose() {
		System.out.println("I am compose method");
		System.out.println("age:"+age);
	}

}
