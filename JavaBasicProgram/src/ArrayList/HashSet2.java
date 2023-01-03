package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class HashSet2 {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("ram");
		list.add("sham");
		list.add("amol");
		list.add("abhi");
		System.out.println("Size:"+list.size());
		System.out.println("Elements:"+list);
		
		
		HashSet<String> hs=new HashSet<String>();
		System.out.println("Initial Set Elements:"+hs);
		hs.add("hii");
		hs.add("hello");
		hs.add("by");
		hs.add("ok");
		System.out.println("Elements are:"+hs);
		
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println();
		
		hs.forEach(s1 ->{
			System.out.println(s1);
		});
		hs.removeIf(s1 ->s1.contains("by"));
		System.out.println("elements:"+hs);
	}

}
