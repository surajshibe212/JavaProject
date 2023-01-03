package assignment;

public class ForFactorneg {
	static void fact(int num) {
		System.out.println("\nFactor of "+num+" is ");
		for(int i=num;i<=Math.abs(num);++i) {
			if(i==0) {
			continue;
			}
			else {
				if(num % i==0) {
					System.out.print(i+" ");
				}
			}
		
		}
		
	}

	public static void main(String[] args) {
		fact(-10);
		fact(-42);

	}

}
