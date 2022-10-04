class A{
		int i=10;
		A(){
			System.out.println("Running class A comstructor...");
		}
		void display() {
			System.out.println("I am display() of class A");
		}
	}
	class X{
		int j=10;
		X(){
			System.out.println("Running class X constructor");
		}
		void display() {
			System.out.println("Running display method of class X");
		}
		
	}

public class Cons5 {
	
		
		void display(int a) {
			System.out.println("I am display() of class Cons5 ="+a);
		}
	
		public static void main(String[] args) {
		A a1 = new A();
		a1.display();
		System.out.println("class A global variable i="+a1.i);
		X x1 = new X ();
		x1.display();
		System.out.println("class X global variable j="+ x1.j);
		Cons5 c1=new Cons5();
		c1.display(121);
		System.out.println("Main method ends here");
	
		
		// TODO Auto-generated method stub

	}

}
