package inheritance;
class A1{
	static int a=10;
	int b=20;
	double c=56.56;
}
class B1 extends  A1{
	static int x=36;
	int y=67;
	double z=76.98;
}
class c1 extends B1{
	static int p=67;
	int q=78;
	double r=123.123;
}
public class Inheritance1 {
public static void main(String[] args) {
	System.out.println("class A1 static variable:"+A1.a);
	System.out.println("class B1 static variable:"+B1.x);
	System.out.println("class C1 static variable:"+c1.p);
	c1 c2=new c1();
	System.out.println("with class c refer :"+c2.b);
	System.out.println("with class c refer:"+c2.c);
	System.out.println("with clss c refer :"+c2.y);
	System.out.println("with refer to class c:"+c2.z);
	System.out.println("with class c refer:"+c2.q);
	System.out.println("with class c refer:"+c2.r);
	System.out.println("*************************");
	B1 b1=new B1();
	System.out.println("with class B refer :"+b1.b);
	System.out.println("with refer class B:"+b1.c);
	System.out.println("with class B refer:"+b1.y);
	System.out.println("with class B refer :"+b1.z);
	

	}

}
