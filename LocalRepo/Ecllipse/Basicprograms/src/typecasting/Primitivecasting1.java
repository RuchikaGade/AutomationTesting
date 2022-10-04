package typecasting;

public class Primitivecasting1 {

	public static void main(String[] args) {
		int myInt=9;
		double myDouble=myInt;
		double mydouble=(double)myInt;
		//double d=(double)myInt;explicit widening
		System.out.println(myInt);
		System.out.println(myDouble);
double salary=65000.123456789;
int sal=(int)salary;
//narrowing explicit
long f=(long)salary;
float f1=(float)salary;
System.out.println("Actual salary:"+salary);
System.out.println("int salary:"+sal);
System.out.println("long salary:"+f);
System.out.println("float salary:"+f1);
	}

}
