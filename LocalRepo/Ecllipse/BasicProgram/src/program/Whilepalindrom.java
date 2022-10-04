package program;

public class Whilepalindrom {

	public static void main(String[] args) {
		int num=1234,rev=0;
		int temp=num;
		while(num!=0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/=10;
		}
		System.out.println("reverse of given number is:"+rev);
		if(temp==rev) {
		System.out.println("palindrom number");
	}else{
		System.out.println("not a palindrom number");
	}
		

	}

}
