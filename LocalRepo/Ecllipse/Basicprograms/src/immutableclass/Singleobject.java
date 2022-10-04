package immutableclass;
 class Singleobject {
	int age=25;
 private Singleobject(){
System.out.println("sampleton class cons");
 }
public static Singleobject singleobj=new Singleobject(); 
public static Singleobject getsampletonobject() {
	return singleobj;
}
public void display(int num) {
	System.out.println("I am display()");
	age= num;
}
}
class demo{
	public static void main(String[] args) {
		//Singleobject s1=new Singleobject();
		Singleobject s1=Singleobject.getsampletonobject();
System.out.println(s1.age);
s1.display(30);
System.out.println(s1.age);
	}

}
