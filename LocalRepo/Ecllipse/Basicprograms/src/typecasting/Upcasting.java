package typecasting;
class city{
	String name="city";
	void zomato() {
		System.out.println("I am zomato");
	}
	void swiggy() {
		System.out.println("I am swiggy method");
	}
	
}
class Amravati extends city{
	String name1="Amravati";
	void zomato() {
		super.zomato();
		System.out.println("I am zomato of class amravati");
	}
	void uber() {
		System.out.println("I am uber of class Amravati");
	}
}
class Pune extends Amravati{
	String name2="Name2";
	void zomato() {
		System.out.println("I am zomato of branch pune");
		
		}
	}
public class Upcasting {
	public static void main(String[] args) {
		city c1=new Amravati();//upcast
		c1.swiggy();
		c1.zomato();
		c1.toString();
		//c1.uber(); can not call this method as it is not present in parent class.
		Amravati a1=(Amravati)c1;//downcast 
		a1.uber();
		a1.swiggy();
		a1.zomato();
		System.out.println(a1.name);
		System.out.println(a1.name1);
		city c2=new Pune();
		c2.zomato();
		Pune p1=(Pune)c2;
	}

}
