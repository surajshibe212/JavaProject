package Work;

import java.util.Scanner;

public class StringPal {

	public static void main(String[] args) {
		String org,rev="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string:");
		org=sc.nextLine();
		int len=org.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
     if(org.equals(rev)) {
    	 System.out.println("String is Palindrome");
     }else
     {
    	 System.out.println("String is not palindrome");
     }
	}

}
