package exceptionhandling;

public class Exceptionhandling6 {

	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {
			System.out.println("common task completed");
			//Given catch block will never excecute as we have already handled the exception by exception class.
			//so this are unreachable block
		//} catch (ArithmeticException e) {
			System.out.println("task1 is completed");
		//} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("task 2 completed");
		}
	//}catch ("object exception") {
		System.out.println("task 2 completed");
		System.out.println("rest of the code...");
	}
}
/**
* unreachable code: a block of code which never executes by JVM
*
*/