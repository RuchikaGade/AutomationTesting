package firsttestngpackage;

import org.testng.annotations.Test;

public class Sample4 {
	int age=26;
	@Test
	public void c_compose() {
		System.out.println("I am compose method");
		}
	@Test
	public void b_login() {
		System.out.println("I am login method");
	}
	@Test
	public void a_Signup() {
		System.out.println("I am signUp method");
	
	System.out.println("age:"+age);
	}
}
