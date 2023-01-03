package ArrayList;

import java.util.Map;
import java.util.TreeMap;

public class MapTree {

	public static void main(String[] args) {
		
		Map m=new TreeMap();
		m.put(1,"goat");
		m.put(2, "lion");
		m.put(3, "tiger");
		m.put(5, "cow");
		System.out.println("Elements:"+m);
		System.out.println("Size:"+m.size());
	}

}
