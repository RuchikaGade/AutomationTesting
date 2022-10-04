package basicprogram;
class B	{
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
	m();	
	}
	public static void main(String args[]) {
		Thiskeyword3 obj=new  Thiskeyword3();
		obj.methodTwo();
		B a=new B();
		a.n();
	}	
}

 public class Thiskeyword3 {
void methodOne() {
	System.out.println("Inside method ONE");
}
	void methodTwo() {
		System.out.println("Inside method Two");
		methodOne();
	}

}
