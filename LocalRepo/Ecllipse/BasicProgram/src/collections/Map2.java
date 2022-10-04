package collections;
import java.util.Map;
import java.util.HashMap;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1=new HashMap();
		m1.put("key1", "admin");//upcasting
		m1.put("key2", "admin");
		m1.put(null, "admin123");
		System.out.println("Map element count:"+m1);
		System.out.println("size of the map:"+m1.size());
		Map m2=new HashMap();
		m2.put("a1", 111);
		m2.put("a2", 222);
		m2.put("a3", 333);
		m2.put("key2", "444");
		System.out.println("printing m2:"+m2);
		m1.putAll(m2);
		System.out.println("printing new m1:"+m1);
		System.out.println("size of m1:"+m1.size());

	}

}
