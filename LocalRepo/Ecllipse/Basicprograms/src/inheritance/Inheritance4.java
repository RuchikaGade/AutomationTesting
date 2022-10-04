package inheritance;
class vehicle{
	public void wheels() {
		System.out.println("i have wheels");
	}
}
class bike extends vehicle{
	public void countwl() {
		System.out.println("i am  bike and i have 2 wheels");
	}
}
class car1 extends vehicle{

	public void countwlcs() {
		System.out.println("I am a  car and i have a four wheels");
	}
	
}
class scooter extends vehicle{
	public void countwlcs() {
		System.out.println("i am a scooter and has 2 wheels");
	}
}
public class Inheritance4 {
	public static void main(String[] args) {
		scooter sc=new scooter();
		sc.countwlcs();
		sc.wheels();
		//sc.countwlc();
		car1 c1=new car1();
		c1.countwlcs();
		c1.wheels();
		bike b1=new bike();
		b1.countwl();
		b1.wheels();
	}


}
