package ArrayList;

import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		System.out.println("Initial List:"+l);
		l.add("suraj");
		l.add("indra");
		l.add("bava");
		System.out.println("Now List:"+l);
		l.add(1, "abc");
		System.out.println("Now:"+l);
		l.addFirst("hiii");
		l.addLast("bye");
        System.out.println("Now list:"+l);
        
        for(int i=0;i<l.size();i++) {
        	if(l.get(i).equals("abc")) {
        		l.set(i,"good");
        		break;
        	}
        }
        System.out.println(l);
	}

}
