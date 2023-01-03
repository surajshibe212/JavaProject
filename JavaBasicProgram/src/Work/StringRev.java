package Work;

import java.util.Scanner;

public class StringRev {

	public static void main(String[] args) {
		String org,rev="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string:");
        org=in.nextLine();
        int len=org.length();
        for(int i=len-1;i>=0;i--) {
        	rev=rev+org.charAt(i);
        }
       System.out.println("Reverse string:"+rev);
	}

}
