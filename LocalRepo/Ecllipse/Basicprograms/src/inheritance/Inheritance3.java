package inheritance;
class fourwheeler{
	public void wheels() {
		System.out.println("I have a four wheels");
	}
}
class car extends fourwheeler{
	public void type() {
		System.out.println("I am a car");
	}
}
class maruti extends  car{
public void company() {
	System.out.println("I am  a maruti");
}
}
public class Inheritance3 {

	public static void main(String[] args) {
	maruti fr=new maruti();
	fr.wheels();
	fr.type();
	fr.company();
	}
		// TODO Auto-generated method stub

	}


