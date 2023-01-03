package ExceptionHandling;

public class Except {
	public static void validAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Not valid age for vote");
		}else {
			System.out.println("Valid age for vote");
		}
	}

	public static void main(String[] args) {
		System.out.println("Start program");
		validAge(10);
		System.out.println("Ends Program");

	}

}
