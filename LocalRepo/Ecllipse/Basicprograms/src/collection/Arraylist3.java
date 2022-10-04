package collection;
import java.util.ArrayList;
public class Arraylist3 {
	public static void main(String[] args) {
		ArrayList<Integer>l1=new ArrayList<Integer>();
		l1.add(26);
		l1.add(28);
		ArrayList<Boolean>l2=new ArrayList<Boolean>();
		l2.add(true);
		ArrayList<Character>l3=new ArrayList<Character>();
		l3.add('r');
		ArrayList<String>l4=new ArrayList<String>();
		l4.add("Ravi");
		l4.add("Vijay");
		l4.add("Ajay");
		l4.add("Anuj");
		l4.add("Gaurav");
		l4.add("Hanumat");
System.out.println("displaying the string list:"+l4);
System.out.println("removing vijay from collection:"+l4.remove("Vijay"));
System.out.println("result after removal:"+l4);
System.out.println("removing by index:"+l4.remove(0));
System.out.println("result after removal:"+l4);
//creatinganother object
ArrayList <String>l5=new ArrayList<String>();
l5.add("Hanumat");
l5.add("Ravi");
l4.addAll(l5);
System.out.println("output after adiding l5 to l4 object:"+l4);
l4.removeAll(l5);
System.out.println("output after removal:"+l4);
//removing on basis of condition
//if(l4.contains("Ajay")) {
	//l4.remove("Ajay");
	//System.out.println("using removal condition:"+l4);
	//l4.clear();
	//System.out.println("After clearing all values:"+l4);
}
	}


