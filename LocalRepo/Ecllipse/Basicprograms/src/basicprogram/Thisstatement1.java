package basicprogram;
class P1{
	P1(){
		this(23.23);
		System.out.println("hello zero");}
		P1(double d){
			this(15);
			System.out.println("hello double" + d);}
		P1(int x){
		
				System.out.println("hello int "+x);
					}
		
		
	}


class Thisstatement1 {
	public static void main(String[] args) {
		P1 p1=new P1();
		//P1 p2=new P1(10);
		P1 p3=new P1(10.23);

	}

}
