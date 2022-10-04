package firsttestngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	@BeforeMethod
	  public void beforeMethod() {
		System.out.println("i am before method");
	  }
  @Test
  public void f() {
	  System.out.println("I am test1");
  }
  @Test
  public void f1() {
	  System.out.println("I am test11");}
  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am after");
  }

}
