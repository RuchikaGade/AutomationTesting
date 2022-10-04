package program;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v1=new Vector<String>();
	System.out.println("Default vector capacity:"+v1.capacity());
	System.out.println("Default vector size:"+v1.size());
	v1.setSize(2);
	System.out.println("Size of vector:"+v1.size());
	v1.addElement("sunday");
	v1.addElement("monday");
	System.out.println("after adding element:"+v1.size());
	v1.addElement("Tuesday");
	System.out.println("size of vector:"+v1.size());
	System.out.println("capacity of vector:"+v1.capacity());

	}

}
