package basicprogram;

public class Method001 {
	 
	 
		public static void addNumber2(int num1, int num2) // int num1=10; int num2=20; | int num1=x=10; int num2=y=20;
		{
			System.out.println("Number1 is :"+num1);
			System.out.println("Number2 is :"+num2);
			int result=num1+num2;
			System.out.println("Addition of two number is: "+result);
		}

		public static int addNumber(int num1, int num2) // int num1=10; int num2=20;
		{
			System.out.println("Number1 is :"+num1);
			System.out.println("Number2 is :"+num2);
			int result=num1+num2;
			System.out.println("Result is: "+result);
			return result;
		}
		public static void main(String[] args) {
			//calling static method which has return type as void with directly passing parameter
			//addNumber2(10, 20);
			//calling static method which has return type as void and passing parameter in form of variables
			int x=10,y=20;
			//addNumber2(x, y);
			//calling static void method from println() - below statement will give compile time exception as void doesn't return any value to JVM
			//System.out.println(addNumber2(10, 20));
			
			//calling static method which has return type as int with directly passing parameter
			addNumber(10, 20);
			System.out.println("********Calling while storing param into a variale*********");
			//calling static method which has return type as void and passing parameter in form of variables
			addNumber(x, y);
			System.out.println("******Calling method from println to get the return value*********");
			//calling static void method from println() - below statement will give 
			System.out.println(addNumber(10, 20));
			System.out.println("*************get the return value from the method to perform further operations**************");
			//get the result after adding to number and perform division
			int res=addNumber(10, 20);
			int finalValue=res/6;
			System.out.println("Final Result: "+finalValue);
		}
	}
	  /*
	   * Method or function both are same
	   
		it contains set of repetitive statements 
	    it can be two types
			- static
			- non static
	- Syntax:
				modifier returntype methodname(args)
				{	
					.........;//statement1
					.........;//statement1
					.........;//statement1
					return value;
				}
		where: 
				modifier = accessmodifier + nonaccessmodifier;
					- accessmodifers --> define visibility of the class members
							* private
							* default
							* protected
*/