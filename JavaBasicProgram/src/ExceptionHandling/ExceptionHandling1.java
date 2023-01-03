package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		int i,j,k;
		Scanner w=new Scanner(System.in);
		System.out.println("Enter 1 st num:");
		i=w.nextInt();
		System.out.println("Enter 1 st num:");
		j=w.nextInt();

		try {
			k=i/j; //ArithmeticException
			System.out.println("res:"+k);
			
		}catch(ArithmeticException e) {
			//System.out.println("Exception handled"+e);
			e.printStackTrace();
		}
System.out.println("Ends");
	}

}
