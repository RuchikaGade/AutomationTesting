package blocks;

public class block8 {
	int age=25;
	double salary=49000.43;
	void print() {
		System.out.println("age:"+age);
		System.out.println("salary:"+salary);
		
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		block8 b1=new block8();
		b1.print();
		System.out.println("Main() ends");
		{
System.out.println("i am non static block of class block8");
		}
	
		
		
		
		}

	}


