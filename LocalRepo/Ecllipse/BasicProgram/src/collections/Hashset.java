package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Hashset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String>s1=new HashSet<String>();
		s1.add("ravi");
		s1.add("vijay");
		s1.add("ajay");
		//s1.add("ajay");//it won't get added as it doesn't support duplicate
		System.out.println("printing the values:"+s1);
		System.out.println("removing ravi from set:"+s1.remove("ravi"));
		Set<String>s2=new HashSet<String>();
		s2.add("ajay");
		s2.add("gaurav");
		s2.add("komal");
	s1.addAll(s2);
	System.out.println("printing s1:"+s1);
	s1.removeAll(s2);
	System.out.println("printing s1 after removal:"+s1);
	s1.clear();
	System.out.println("after clearing:"+s1);
	}

}
