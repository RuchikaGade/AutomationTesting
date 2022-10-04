package string;
import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Dhanori pune";
		char c= s1.charAt(0);
		System.out.println("character at index 0:"+c);
		// Loop to print one by one character
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
			System.out.println("*************************");
			// to print one by one character of string from the last index
			for (int j = s1.length() - 1; j >= 0; j--) {
				System.out.println(s1.charAt(j));
			}
			System.out.println("**************************");
			String temp = "";// "DhanoriPune";//output: enuPironahD
			for (int p = s1.length() - 1; p >= 0; p--) {
				temp = temp + s1.charAt(p);//""+e=>e+n=>en+u=>enu
			}
			System.out.println("str1: " + s1);
			System.out.println("temp: " + temp);
			System.out.println(reverseString("DhanoriPune"));
			
			String s2="Bangalore";
			System.out.println(reverseString(s2));
			
			Scanner scn=new Scanner(System.in);
			String s3;
			System.out.println("Enter String to be reverse: ");
			s2=scn.next();
			System.out.println("Reverse String is: "+reverseString(s2));

			// System.out.println(palinString("abcd"));
			String s4;
			System.out.println("Enter string to check for palindrome");
			s3=scn.next();
			//palinString(s4);
		}
		}

		static String reverseString(String str) {
			String temp = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				temp = temp + str.charAt(i);
			}
			return temp;
		}

		static void palinString(String str) {
			String s1 = str;
			String temp = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				temp = temp + str.charAt(i);
			}
			if (temp.equals(s1)) {
				System.out.println("Given string is a palindrome..." + str);
			} else {
				System.out.println("Given string is not a palindrome..." + str);
			}
		}
	
			
	
		
		{

	}

}
