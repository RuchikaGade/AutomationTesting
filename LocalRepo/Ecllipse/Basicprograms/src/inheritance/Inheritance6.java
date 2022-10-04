package inheritance;
class grandfather {
	grandfather(){
		System.out.println("I am class grandfather constructor");
	}
	void myhome() {
		System.out.println("I am home of grandfather");
	}
}
class father extends grandfather{
	father(double d){
		System.out.println("i am constructor of class father");
	}
	void mycar() {
		System.out.println("i am car of father");
	}
}
class child1 extends father {
	child1(int i) {
		super(21.31);
		System.out.println("i am constrctor of class child1");}
	void mybike() {
		System.out.println("i am bike of child1");
}
}
public class Inheritance6 {

	public static void main(String[] args) {
	child1 c1=new child1(21);
	c1.myhome();
c1.mycar();
c1.mybike();
	}

}
