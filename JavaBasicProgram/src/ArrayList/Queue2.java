package ArrayList;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {

	public static void main(String[] args) {
		Queue <Integer> i=new PriorityQueue<Integer>();
		// while adding element in Queue, it will always keep smallest element on the top
        System.out.println("Size:"+i.size());
        System.out.println(i);
     // peek() returns top most element of the queue, if the queue if empty dn it
     		// will return 'null' instead of throwing exception
        System.out.println(i.peek());
      //element() returns top most element of the queue, if the queue if empty dn it
		 //will throw an exception by name 'NoSuchElementException'
        System.out.println(i.element());
        

	}

}
