package program;
import java.util.Scanner;
public class Example3
{
	public static void main(String[]args) 
	{
		Scanner scan=new Scanner(System.in);
		int a, s=0;
		do {
			System.out.print("Enter a no.");
			a=scan.nextInt();
			s=s+a;
			}while(a!=0);	
		System.out.print("sum  is"+s);
		}
}
