package program;
import java.util.Scanner;
public class Example9 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
		int b=scan.nextInt();
				int c=scan.nextInt();
				int d=scan.nextInt();
				int x=a>b?a:b;
						int y=c>d?c:d;
						int G=x>y?x:y;
						System.out.println("Greatest no. is"+G);
	}
} 
