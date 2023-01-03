package methods;

public class Overload1 {
	static double res;
	public static void square() {
		System.out.println("No parameter method");
	}
	public static void square(int a) {
		res =a*a;
		System.out.println("Method with integer arg:"+res);
	}
	public static void square(double a) {
		res =a*a;
		System.out.println("Method with double arg:"+res);
	}
	public static void main(String[] args) {

		Overload1.square();
		Overload1.square(5.1);
		Overload1.square(2);
		Overload1.square(12);
		Overload1.square(0.5);
	}

}
