package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		HashMap<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "mango");
		m.put(2,"guava");
		m.put(3, "apple");
		m.put(5, "orange");
		System.out.println("Size:"+m.size());
		System.out.println("Elements:"+m);
	
		 System.out.println("Iterating Hashmap..");
		
		 for(Map.Entry a:m.entrySet()) {
			 System.out.println(a.getKey()+" "+a.getValue());
			 
			 
		 }
		 HashMap<Integer, String> hm = new HashMap<Integer, String>();

			hm.put(100, "Amit");
			hm.put(101, "Vijay");
			hm.put(102, "Rahul");
			System.out.println("Initial list of elements: " + hm);

			for(Map.Entry a:hm.entrySet()) {
				 System.out.println(a.getKey()+" "+a.getValue());
			}
			
			hm.putIfAbsent(103,"Rohit");
			System.out.println("Elements:"+hm);
			
			m.putAll(hm);
			
			System.out.println("Elements after update:"+m);
			
			 for(Map.Entry a:m.entrySet()) {
				 System.out.println(a.getKey()+" "+a.getValue());
				 
				 
			 }
	}
}
