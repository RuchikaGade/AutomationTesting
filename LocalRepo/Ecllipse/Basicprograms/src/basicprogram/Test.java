package basicprogram;

class Test {
	void m() {
		System.out.println("hello method m");
	}
	void n() {
		System.out.println("hello method n");
		m();
	}
	
}
class Thiskeyword{
	
	void methodOne() {
		System.out.println("Inside methodOne");
		}

	void methodTwo() {
	System.out.println("Inside method two");
	methodOne();

}
	public static void main(String[] args) {
		Thiskeyword obj = new Thiskeyword();

		obj.methodTwo();
		Test a=new Test();
		a.n();
}

}
