package collections;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		 LinkedList<String>l1=new LinkedList<String>();
		 l1.add("ruchi");
		 l1.add("piu");
		 l1.add("kushal");
		 l1.add("pooja");
		 System.out.println("printing the values:"+l1);
		 System.out.println("size of element:"+l1.size());
		 l1.add(1,"pooja");
		 System.out.println("capacity of element:"+l1);
		 LinkedList<String>l2=new LinkedList<String>();
		 l2.add("komal");
		 l2.add("ram");
		 l2.add("sapna");
		 System.out.println("printing l2:"+l2);
		 l1.addAll(l2);
		 System.out.println("printing l1:"+l1);
		 LinkedList<String>l3=new LinkedList<String>();
		 l3.add("payal");
		 l3.add("kajal");
		 l3.add("sonal");
		 l1.addAll(l3);
		 System.out.println(l1);
		 l1.removeAll(l2);
		 System.out.println(l1);
		 l1.set(5,"chetana");
		 System.out.println(l1);
		 l1.get(1);
		 System.out.println("getting by index:"+l1.get(1));
		 l1.addFirst("Naren");
		 System.out.println("updted list:"+l1);
		 l1.addLast("jatin");
		 System.out.println("printing new values:"+l1);
	}

}
