package String;

import java.util.Scanner;

public class String2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String s1=new String("Mumbai");
		String s2=new String("Pune");
		String s3=new String("Mumbai");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		String s4;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		s4=sc.next();
		System.out.println(s4);
	}

}
