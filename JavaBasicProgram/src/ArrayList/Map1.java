package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		
		Map m=new HashMap();
		m.put(100, "admin");
		m.put(101, "dev");
		m.put(103, "test");
		m.put(105, "HR");
		System.out.println("Elements are:"+m);
		System.out.println("Count of Element:"+m.size());
		m.put(105, "manager");
		System.out.println("Upadated Elements:"+m);
		m.put(104, "manager");
		System.out.println("Upadated Elements:"+m);
    
		 System.out.println("Get key values:"+m.get(103));
		 System.out.println("Key set :"+m.keySet());
		 System.out.println("Values:"+m.values());
	}

}
