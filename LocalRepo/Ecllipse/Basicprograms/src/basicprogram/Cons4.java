package basicprogram;

public class Cons4 {
	int roll;
	double salary;
	Cons4(int r,double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Cons4 c1= new Cons4(101,2376.45d);
		c1.display();
		Cons4 c2=new Cons4(201,45389.56d);
		c2.display();
		
		

	}

}
