package String;

public class String1 {

	public static void main(String[] args) {
		String s1="Mumbai";
		String s2="Pune";
		String s3="Mumbai";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
       System.out.println("Compare s1 and s2:"+(s1==s2));
       System.out.println("Compare s1 and s2:"+(s1==s3));
       System.out.println(s1.toString());
       System.out.println(s1.equals(s2));
       System.out.println(s1.equals(s3));
       
	}

}

/**
in String some methods of object class are override
1. toString() ---> to represent object in string format but in String class it will give values stored in the object
2. equals() -----> to compare two object based on address but in String it compares two object based on there value
3. == to compare two values but in string class it compares two object based on address
*/