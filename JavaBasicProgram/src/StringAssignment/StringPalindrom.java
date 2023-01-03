package StringAssignment;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		String str,rev="";
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter String: ");
	    str=s.nextLine();
	    s.close();
	    int len=str.length();
	    for(int i=len-1;i>=0;i--) {
	    	rev=rev+str.charAt(i);
	    }
        
	    if(str.equals(rev)) {
	    	System.out.println(str+" is palindrome");
	    }
	    else {
	    	System.out.println(str+" is not palindrome");
	    }
	}

}
