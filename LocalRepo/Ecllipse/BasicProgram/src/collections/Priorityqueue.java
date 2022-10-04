package collections;
//import java .util.Collections;
import java.util. Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
//import java.util.Queue;

public class Priorityqueue {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Queue queue= new PriorityQueue();
		queue.add(123);
		queue.add(245);
		queue.add(10);
		queue.add(105);
		queue.add(50);
		queue.add(1);
		System.out.println("siz eof the queue:"+queue.size());
		System.out.println("elements of queue:"+queue);
		System.out.println("method element:"+queue.element());
		System.out.println(queue.peek());
		System.out.println("*****printing with the help of for loop*******");
		for(Object obj:queue) {
			System.out.println("elements:"+obj);
			//System.out.println("removing smallest element:"+queue.remove());
			//System.out.println("removing by pool method:"+queue.poll());
		}
	
		
	}

}
