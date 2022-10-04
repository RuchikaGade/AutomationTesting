package blocks;

public class block5 {
	block5(){
		System.out.println("I am zero parameter constructor");
	}
	static {
		System.out.println("I am static block of class block5");
	}
	{
		System.out.println("I am noon static block of class block5");
	}

	public static void main(String[] args) {
	System.out.println("main method starts");
	block5 b1=new block5();
	System.out.println("************");
	block5 b2=new block5();
	System.out.println("main method ends");

	}

}
