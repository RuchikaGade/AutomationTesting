package string;
class Demo123{
	private Demo123() {
		System.out.println("I am zero parameter constructor");
	}
	private static Demo123 d1=new Demo123();
	String name="pune";
	static Demo123 getInstance() {
		return d1;
	}
	void print() {
		System.out.println("I am print() of demo class");
		
	}
}

public class SingletonClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo123 d=Demo123.getInstance();
d.print();
System.out.println(d.name);
d.name="Banglore";
System.out.println("d1 ref:"+d.name);
Demo123 d2=Demo123.getInstance();
System.out.println("d2 ref:"+d2.name);
	}

}
