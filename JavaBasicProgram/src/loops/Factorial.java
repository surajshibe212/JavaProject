package loops;

import java.util.Scanner;

public class Factorial {

	private static Scanner sc;

	public static void main(String[] args) {
		int fact=1;
		sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
