package ExceptionHandling;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int sz=sc.nextInt();
		int[] arr=new int[sz];
		sc.close();
		try {
			System.out.println(arr[3]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled"+e);
		}
 System.out.println("hello");
	}

}
