package StringAssignment;

public class StringIntegertostr {

	public static void main(String[] args) {
		//Strin to integer
		String str="5";
		int result=Integer.parseInt(str);
		System.out.println("String to integer: "+result);
		//or
		String str1="10";
		Integer res=Integer.valueOf(str1);
		System.out.println("String to integer: "+res);
 
		//Integer to string
		int x=10;
		String str2=Integer.toString(x);
		System.out.println("Integer to String :"+str2);
		//or
		String str3=String.valueOf(x);
		System.out.println("Integer to String :"+str3); 
	}

}
