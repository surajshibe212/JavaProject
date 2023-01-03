package StringAssignment;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		sc.close();
        for(int i=s.length()-1;i>=0;i--) {
        	reverse=reverse+s.charAt(i);
        }
        System.out.println("Reverse String: "+reverse);
	}

}
