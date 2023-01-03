package ArrayList;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector<String> ve=new Vector<String>();
		System.out.println("Default Capacity:"+ve.capacity());
		System.out.println("Vector size:"+ve.size());
		ve.setSize(3);
		System.out.println("New Size:"+ve.size());
		System.out.println("Vector Elements:"+ve);
		ve.add("suraj");
		ve.add("ravi");
		ve.add("abc");
		System.out.println("Elements:"+ve);
		System.out.println(ve.size());
		ve.addElement("prashant");
		System.out.println("Elements:"+ve);
		
		
		Vector<String> v=new Vector<String>();
		System.out.println("Vector Elements:"+v);
		v.addElement("hello");
		v.addElement("hii");
		v.addElement("by");
		System.out.println("Vector Elements:"+v);
		System.out.println("Size:"+v.size());
		for(String str:v) {
			System.out.println(str);
		}
	}

}
