package ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
	Set<String> s=new HashSet<String>();	
	// in set if you try to add duplicate element dn it will neglect that element
			// instead of throwing an error
	
	s.add("abc");
	s.add("pqr");
	s.add("xyz");
	s.add("qwe");
	s.add("abc");
	System.out.println("Set:"+s);
	System.out.println("Size:"+s.size());
	
	Iterator<String> itr = s.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}

	s.remove("abc");
	System.out.println(s);
	}

}
