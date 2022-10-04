class company{
	void display() {
		System.out.println("i am display method of class company");
	}
	}
class employee extends company{
	void display() {
		super.display();
		System.out.println("I am display method pf class employee");
	}
		void callme() {
			System.out.println("i am call me method of class employee");
			}
}
public class Inheritance9 {
public static void main(String[] args) {
		employee e1=new employee();
		e1.display();
		e1.callme();
		System.out.println("************************");
		company c1=new company();
		c1.display();

	}

}
