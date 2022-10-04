package basicprogram;
class Ruchika{
	void m() {
		System.out.println("hello m");
	}void n() {
			System.out.println("hello n");
			m();
		}
	}


 class Thiskeyword31 {
	static void methodOne() {
		 System.out.println("inside method one");
	 }
	 void methodTwo() {
		 System.out.println("inside method Two");
		 methodOne();
	 }

	public static void main(String[] args) {
		Thiskeyword31 obj=new Thiskeyword31();
		obj.methodTwo();
		Ruchika a=new Ruchika();
		a.n();
		
		

	}

}
