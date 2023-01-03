package ExceptionHandling;

public class Exception4 {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person is not eligible for vote");
		}
		else {
			System.out.println("Eligible for vote");
		}
	}

	public static void main(String[] args) {
		//throwing unchecked exception
		try {
		validate(14);
		//validate(24);
		}catch(ArithmeticException e) {
			System.out.println("Exception handled");
			System.out.println(e);
		}
	}

}
