package testngsamples;

import org.testng.annotations.Test;

public class IncludeAndExcludeTestMethods {
	@Test
	public void addLocationTestCase() {
		System.out.println("I am in add location test case");
	}
	@Test
	public void addDepartmentTestCase() {
		System.out.println("I am in department test case");
	}
	@Test
	public void addEmployeeTestCase() {
		System.out.println("I am in add employee test case");
	}

}