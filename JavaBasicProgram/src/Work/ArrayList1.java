package Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ArrayList1 {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("appple");
		l.add("grapes");
		l.add("guava");
		System.out.println("Size:"+l.size());
		System.out.println("Coollection of list:"+l);
		Collections.sort(l);
		Collections.reverse(l);
		System.out.println("After Reverse:"+l);
		List<String> l1=new ArrayList<String>();
		l1.add("jammu");
		l1.add("kolkata");
		l1.add("andhra");
		l1.add("maharashtra");
		System.out.println("List2:"+l1);
        Iterator itr=l1.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
		Iterator itr1=l.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		l.addAll(l1);
		System.out.println("After add:"+l);
		l.removeAll(l1);
		System.out.println("After remove:"+l);
		
	}

}
