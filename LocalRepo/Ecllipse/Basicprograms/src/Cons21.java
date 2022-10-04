
public class Cons21 {
	
	int age;
	double salary;
	Cons21(){
	System.out.println("*****user defined zero parammeter constructor********");
	age=25;
	salary=32500.56;
	System.out.println("user defined zero parameter constructor ends here");
}

	public static void main(String[] args) {
		Cons21 c1 = new Cons21();
		System.out.println(c1.age);
		System.out.println(c1.salary);

	}

}
