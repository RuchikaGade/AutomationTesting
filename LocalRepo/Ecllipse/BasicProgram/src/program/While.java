package program;

public class While {

	public static void main(String[] args) {
		int i=0;
		System.out.println("printing numbers from 1 to 5");
		while(i<5) {
			System.out.println("Hello"+i);
			i++;
			char b1='a';
			System.out.println("printing a to z");
			while(b1<='z') {
				System.out.println(b1);
				b1++;
			}
		}

	}

}
