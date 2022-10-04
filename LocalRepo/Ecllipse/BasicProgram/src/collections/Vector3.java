package collections;
import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v3=new Vector<String>();
		v3.addElement("ruchi");
		v3.addElement("shipra");
		v3.addElement("kushal");
		v3.addElement("shipra");
		v3.addElement("Babdu");
		v3.addElement("Anu");
		v3.addElement("motu");
		v3.addElement("shubhya");
		v3.addElement("Sam");
		v3.addElement("chotu");
		System.out.println("checking default capacity:"+v3.capacity());
		v3.addElement("vaishu");
		v3.addElement("vithu");
		System.out.println("checking capacity:"+v3.capacity());
		System.out.println("printing all the element:"+v3);
		System.out.println("*****using for loop********");
		for (String s1:v3) {
			System.out.println(s1);
			v3.set(11, "Ruchika");
		}
		v3.get(5);
		System.out.println("getting element by index:"+v3.get(4));
	}

}
