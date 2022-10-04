package collections;
import java.util.ArrayList;

public class Arraylist0 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Mango");
		list.add(123);
		list.add("Banana");
		list.add(null);
		list.add('c');
		list.add(true);
		list.add(23.34);
		list.add(new Arraylist0());
		list.add("Banana");
		System.out.println("printing the list:"+list.size());

	}

}
