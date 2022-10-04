package blocks;

public class block3 {
block3(){
	System.out.println("I am zero parameter constructor");
}
{
	System.out.println("Running non static block of class block3");
}
	public static void main(String[] args) {
		System.out.println("Main method starts");
		block3 b3=new block3();
		System.out.println("__________________");
		block3 b4=new block3();
		System.out.println("Main method ends");

	}

}
