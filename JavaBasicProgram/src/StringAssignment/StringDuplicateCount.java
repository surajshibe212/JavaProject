package StringAssignment;

import java.util.Scanner;

public class StringDuplicateCount {

	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		s=sc.nextLine();
		sc.close();
		int dis=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					dis++;
				}
			}
			System.out.println(s.charAt(i)+" "+dis);
			String d=String.valueOf(s.charAt(i)).trim();
			s=s.replaceAll(d, "");
			dis=0;
		}

	}

}
