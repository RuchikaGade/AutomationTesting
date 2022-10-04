package program;

public class WhileLoop {

	public static void main(String[] args) {
int num=10;
int counter=0;
for(int i=1;i<=num; num++) {
	if(num % i==0){
		++counter;
	}
}
if (counter==2) {
	System.out.println("prime number:"+num);
}
//System.out.println("check give number is prime or not:"+CheckPrimeNumber(10));
//CheckPrimeNumberTillPassedNumber


	}

}
