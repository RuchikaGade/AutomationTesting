package basicprogram;

public class block4 {
block4(){
	System.out.println("I am zero parameter constructor");
	{
		System.out.println("I am non static block of class block4");
	}
}
	public static void main(String[] args) {
		System.out.println("main method starts");
		block4 b4=new block4();
		System.out.println("*********************");
		block4 b5=new block4();
		System.out.println("Main method ends");
		{
			System.out.println("I am non static block2 of class block4");
		}

	}

}
