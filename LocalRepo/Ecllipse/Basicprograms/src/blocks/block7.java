package blocks;

public class block7 {
	static int age =25;
	double salary=14000.67;
	static {
		age=30;
	}
	{
		salary=34000.78;
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");
		System.out.println("age:"+block7.age);
		System.out.println("**********");
		block7 b1=new block7();
		System.out.println("salary:"+b1.salary);
		System.out.println("main method ends");
		}

}
