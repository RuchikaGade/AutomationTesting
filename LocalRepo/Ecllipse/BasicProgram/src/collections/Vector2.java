package collections;
import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String>v2=new Vector<String>();
		System.out.println("Default capacity of vector:"+v2.capacity());
		System.out.println("Default size of vector:"+v2.size());
		v2.addElement("tiger");
		v2.addElement("lion");
		v2.addElement("dog");
		v2.addElement("elephant");
		v2.addElement("fox");
		System.out.println("size of vector:"+v2.size());
		v2.addElement("rat");
		v2.addElement("deer");
		v2.addElement("cat");
		System.out.println("printing all the element:"+v2);
		System.out.println("************using for loop***********");
		for(String str:v2) {
			System.out.println(str);
		}
		}

}
