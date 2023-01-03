package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayList1 {

	public static void main(String[] args) {
		//ArrayList a=new ArrayList(); //or
		List a1=new ArrayList();
		
		//to add elements in list we use add()
		a1.add("Suraj");  // auto up casting, String object will be converted into Object class object
		a1.add(123);  //boxing operation --> Integer class object ---> Auto up casting---> Integer class object will be converted into Object class object
		a1.add(null);
		System.out.println("List elements are: "+a1);
		System.out.println("List element count: "+a1.size());
		System.out.println("Get element at index 2: "+a1.get(1));
		//printing arraylist element
		for(int i=0;i<a1.size();i++) {
			System.out.println("Element at index "+i+" :"+a1.get(i));
		}
		a1.add(2,"pune");
		System.out.println("Using for each loop");
		for(Object o:a1) {
			System.out.println(o);
			
			
		}
		a1.remove(3);
       System.out.println("afte remove:");
		for(Object o:a1) {
			System.out.println(o);
			
		}
		List a2=new ArrayList();
		a2.add("abc");
		a2.add("pqr");
		System.out.println("List :"+a2);
		System.out.println("List 1:"+a1);
		a1.addAll(a2);
		System.out.println("List1:"+a1);
		System.out.println("List"+a2);
		a1.set(0, "apple");           //update value
		System.out.println("List1:"+a1);
		a1.remove(1);
		
		//Collections.sort(a1);
		System.out.println("Lists:"+a1);
		Collections.sort(a1);
		System.out.println(a1);
		
		Iterator itr=a1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());
		
		
		
		
	}

}
