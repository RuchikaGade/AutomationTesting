
public class primenumber {

	public static void main(String[] args) {
		int num=101,counter=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				++counter;
			}
		}
		if (counter==2) {
			System.out.println("prime number:"+num);
		}else {
				System.out.println("given number is not a prime number:"+num);
			}
		}

	}


