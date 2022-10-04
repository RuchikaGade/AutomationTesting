class C{
	double i;
	C (double j){
		System.out.println("Running class C constructor");
		i=j;
	}
}
public class Cons6 {

	public static void main(String[] args) {
		System.out.println("Main of class c is started");
		C c1=new C(12.32);
		System.out.println("class c global variablei="+c1.i);
		c1.i=44.44;
		System.out.println("class c global variable i="+c1.i);
System.out.println("===========================");
C c2=new C(123.12);
System.out.println("class c global variable i="+c2.i);
C c3=new C(67.67);
System.out.println("class c global variablr i="+c3.i);
		System.out.println("main of class c end here");


	}

}
