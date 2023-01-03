package StringAssignment;

public class StringCountNum {

	public static void main(String[] args) {
		String str="he1234876hey";
		int digit=0;
		/*
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
				digit++;
		}

		System.out.println("Total numbers in string is: "+digit);      */
		System.out.println();
		System.out.println("Another way:");
	
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i)))
				digit++;
		}
		System.out.println("Total numbers in string is: "+digit);
	}
 
}
