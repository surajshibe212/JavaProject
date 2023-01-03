package ExceptionHandling;

public class Exception7 extends Exception {

	public Exception7(String str) {
		//calling conc of parent exception
		super(str);
	}
	
	
}
class Exce{
	public static void valid(int age) throws Exception7 {
		if(age<18) {
			throw new Exception7("Exception7 ..not aligible to vote");
		}
		else {
			System.out.println("Eligible for vote");
		}
	}
public static void main(String[] args) throws Exception7 {
		System.out.println("main ...");
		valid(14);
		System.out.println("ends");

	}

}