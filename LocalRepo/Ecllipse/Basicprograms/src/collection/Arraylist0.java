package collection;
import java.util.ArrayList;

public class Arraylist0 {
public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("Mango");
		list.add(1234);
		list.add("banana");
		list.add(null);
		list.add('c');
		list.add(12.23);
		list.add(true);
		//list.add(new ArrayList());
		list.add("banana");
		System.out.println("Size of list:"+list.size());
		System.out.println("Elements of list:"+list);
		System.out.println("traversing element through for loop");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			System.out.println("transversing thrught for each loop");
			for(Object fruits:list) {
				System.out.println(fruits);
				System.out.println("Returning element:"+list.get(2));
				list.set(1, "Dates");
				System.out.println("Size of the list:"+list.size());
				System.out.println("Elment of list:"+list);
			}
			
		}
}

}
