package program;

public class Whilereverse {

	public static void main(String[] args) {
		int num1=1234,rev=0;
		while(num1!=0) {
			int remainder=num1%10;
			rev = rev*10+remainder;
			num1=num1/10;
		}
		System.out.println("The reverse of given number is:"+rev);
			
	}

	



	}


