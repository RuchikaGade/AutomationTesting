package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.plaf.synth.SynthSepartorUI;
public class Arraylist6 {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(12);
		l1.add(10);
		l1.add(2);
		l1.add(15);
		l1.add(18);
		System.out.println("Element of List:"+l1);
		//Collections.sort(l1);
		//System.out.println("Element of List after sorting:"+l1);
		Collections.reverse(l1);
		System.out.println("Element after reverse:"+l1);
	}

}
