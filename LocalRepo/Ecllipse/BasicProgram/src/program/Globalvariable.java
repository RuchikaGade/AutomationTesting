package program;

public class Globalvariable {
 int age;
boolean result;
char grade;
float roi;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("program starts");
Globalvariable ref1=new Globalvariable();
System.out.println("default non static variable age:"+ref1.age);
System.out.println("default non static variable result:"+ref1.result);
System.out.println("default non static variable grade:"+ref1.grade);
System.out.println("default non static variable roi:"+ref1.roi);
System.out.println("program ends");

	}

}
