package string;
class Singleton{
private Singleton() {
	  s="Hell I am String part of singleon class";
}
private static Singleton single_instance=new Singleton();
public String s;
public static Singleton getInstanceOfSingleton() {
	return single_instance;
}
	
}
 class Singletonclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Singleton x=Singleton.getInstanceOfSingleton();
System.out.println("String form x is:"+x.s);
Singleton y=Singleton.getInstanceOfSingleton();
System.out.println("String form y:"+y.s);

	}

}
