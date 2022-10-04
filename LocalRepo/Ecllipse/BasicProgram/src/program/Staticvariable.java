package program;

public class Staticvariable {
static int age;
static boolean res;
static char grade;
static float roi;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("default value of age is:"+age);
System.out.println("default value of res is:"+res);
System.out.println("default value of grade is:"+grade);
System.out.println("default value of roi is:"+roi);
System.out.println("**********");
age=25;
res=true;
grade='A';
roi=6.5f;
System.out.println("updated value of age is:"+age);
System.out.println("updated value of res is:"+res);
System.out.println("updated value of grade is:"+grade);
System.out.println("updated value of roi is:"+roi);
System.out.println("program ends");
	}

}
