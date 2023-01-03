package loops;

public class Fibonacci {
	public static void fib(int n) {
		int f1=0,f2=1,f3;
		//System.out.println(f2+ " ");
		for(int i=1;i<=n;i++) {
		System.out.println(f1+ " ");	
		
		f3=f1+f2;
		f1=f2;
		f2=f3;
		}
		
	}

	public static void main(String[] args) {
		fib(10);

	}

}
