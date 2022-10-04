package blocks;

public class block2 {
	static {
		System.out.println("Running static block of class block2");
	}

	public static void main(String[] args) {
		System.out.println("Main method starts");
		System.out.println("I am main method of class block2");
		System.out.println("main method ends");

	}
	static {
		System.out.println("I am static block2 of class block2");
	}

}
