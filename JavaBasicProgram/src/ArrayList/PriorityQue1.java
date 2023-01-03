package ArrayList;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQue1 {

	public static void main(String[] args) {
		Queue<String> u=new PriorityQueue<String>();
		
		//adding element smmall element will be at top
		u.add("huu");
		u.add("apple");
		u.add("abc");
		u.add("parrot");
		u.add("bat");
		System.out.println("Size::"+u.size());
		System.out.println("Queue:"+u);
		//element() returns top most element of the queue, if the queue if empty dn it
		 //will throw an exception by name 'NoSuchElementException'
		System.out.println("Head element of queue:"+u.element());
		
		// peek() returns top most element of the queue, if the queue if empty dn it
				// will return 'null' instead of throwing exception
		System.out.println("Peek element:"+u.peek());
		for (Object o:u) {
			System.out.println(o);
		}
		
		Iterator i=u.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		u.forEach(o ->{
			System.out.println(o);
		});
	}

}
