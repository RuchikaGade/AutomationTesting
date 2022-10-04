package PracticeProgram;

public class Palindrom {

	public static void main(String[] args) {
		int num=456 ,rev=0, rem=0;
		int temp=num;
		while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
		System.out.println("Reverse number:"+rev);
		if(temp==num) {
			System.out.println("Number is palindrom:"+temp);
		}else {
			System.out.println("number is not palindrom");
		}

	}

}}
