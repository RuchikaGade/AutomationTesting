
public class MockAssignment {

	public static void main(String[] args) {
		int num =123,rev=0;
		int temp=num;
		for(;num!=0;num=num/10 ) {
				int rem=num%10;
				rev=rev*10+rem;
		}
				System.out.println("reverse of given number ");
				if (temp==rev) {
					System.out.println("Given number is palindrom");
				}	else {
					System.out.println("Given number is not palindrom");
				}
				

	}

}
