package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist44 {
public static void main(String[] args) {
		ArrayList<String>a1=new ArrayList<String>();
	System.out.println("Before adding nything:"+a1);
		a1.add("Ravi");
		a1.add("vijay");
		a1.add("Ajay");
		a1.add("Hanumat");
		ArrayList<String>a2=new ArrayList<String>();
		a2.add("Ravi");
		a2.add("Hanumat");
		a2.add("Pune");
		System.out.println("ArrayList a1:"+a1);
		System.out.println("ArrayList a2:"+a2);
		a1.retainAll(a2);
		System.out.println("after retaining:"+a1);
		System.out.println("Iterating through loop");
		Iterator itr=a2.iterator();
		while(itr.hasNext());{
		System.out.println(itr.next());
		}
	
		List l1 =new ArrayList();
		l1.add("Pune");
		l1.add("Pune");
		l1.add(123);
		l1.add("Pune");
		l1.add(null);
		System.out.println("Printing List:"+l1);

	}}


