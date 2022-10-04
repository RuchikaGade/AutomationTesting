package inheritance;
class A{
	static int a=10;
	int b=20;
	double c=12.12;
}
class B{
	static int x=20;
	int y=30;
	double z=45.34;
}
class c{
	static int p=89;
	int q=34;
	double r=88.90;
}
public class Inheritance0 {
	public static void main(String[] args) {
		System.out.println("class A static variable:"+A.a);
		System.out.println("class B static variable:"+B.x);
		System.out.println("class c static variable:"+c.p);
		A a1=new A();
		System.out.println("class A non static variable:"+a1.b);
		System.out.println("class A non static variable:"+a1.c);
		B b1=new B();
		System.out.println("class B non static variable:"+b1.y);
		System.out.println("class B non static variable:"+b1.z);
		c c1=new c();
		System.out.println("class c non static variable:"+c1.q);
		System.out.println("class c non static variable:"+c1.r);

	}

}
