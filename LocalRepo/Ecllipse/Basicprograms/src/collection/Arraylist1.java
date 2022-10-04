package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Arraylist1 {
public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("mango");
		list.add("banana");
		list.add("apple");
		//list.add(12345);
		System.out.println("sizeof arraylist:"+list.size());
		System.out.println("Elements in arraylist:"+list);
		System.out.println("get elements by index:"+list.get(2));
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
		for(Object fruit:list) {
			System.out.println(fruit);
		}
		System.out.println("get element by index:"+list.get(1));
		list.set(1, "chikoo");
		System.out.println("size if list:"+list);
		Collections.sort(list);
		
		System.out.println("list after sorting:"+list);
		Collections.reverse(list);
		System.out.println("List after reverse:"+list);
		System.out.println("Size of the element:"+list.size());
		list.forEach(a->{
			System.out.println(a);
		});
		System.out.println("traversing list thrugh iterator interface:");
		Iterator itr= list.iterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		//System.out.println(itr.next()); if we use next method at this point it will give us no such element exceptio
		//while(itr.hasNext());{
			//System.out.println(itr.next());
		System.out.println("*********with new iterator object*******");
		Iterator itr2=list.iterator();
		while(itr2.hasNext());{
		System.out.println(itr2.next());
		}
}
}

