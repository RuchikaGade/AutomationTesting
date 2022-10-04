package collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t1=new TreeSet<String>();
		t1.add("varun");
		t1.add("kunal");
		t1.add("sapna");
		System.out.println("printing all element:"+t1);
		System.out.println("transversing loop");
		Iterator <String> itr=t1.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		System.out.println("transversing in descending order");
		Iterator i=t1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		TreeSet<Integer>t2=new TreeSet<Integer>();
		t2.add(55);
		t2.add(44);
		t2.add(23);
		t2.add(11);
		System.out.println("printing the values:"+t2);
		System.out.println("getting first element:"+t2.pollFirst());
		System.out.println("getting last element:"+t2.pollLast());
		TreeSet<String>t3=new TreeSet<String>();
		t3.add("a");
		t3.add("b");
		t3.add("f");
		t3.add("d");
		t3.add("r");
		System.out.println("initial values:"+t3);
		System.out.println("reverse set:"+t3.descendingSet());
		System.out.println("getting head element:"+t3.headSet("d"));
		System.out.println("subste method:"+t3.subSet("a", "f"));
		System.out.println("tailset method:"+t3.tailSet("f"));
		
		}
	}
	}

}
