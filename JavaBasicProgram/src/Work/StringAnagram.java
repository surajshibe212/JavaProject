package Work;

import java.util.Arrays;

public class StringAnagram {
	static void isAnag(String s1,String s2) {
		String str1=s1.replaceAll("\\s","");
		String str2=s2.replaceAll("\\s","");
		boolean status=true;
		if(str1.length()!=str2.length()) {
			status=false;
		}
		else {
			char arrS1[]=str1.toLowerCase().toCharArray();
			char arrS2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(arrS1);
			Arrays.sort(arrS2);
			status=Arrays.equals(arrS1, arrS1);
		}
		if(status) {
			System.out.println("anagram");
		}else {
			System.out.println("Not ana");
		}
	}

	public static void main(String[] args) {
		isAnag("Keep","Peee");

	}

}
