package Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("mango");
		System.out.println("Size:"+list.size());
		System.out.println("list:"+list);
		list.add("abc");
		list.add("pqr");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		for(Object o:list) {
			System.out.println(o);
		}
		list.set(2,"hii");
		System.out.println("New List:"+list);
		Collections.sort(list);
		System.out.println("list:"+list);
		Iterator itr=list.iterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
