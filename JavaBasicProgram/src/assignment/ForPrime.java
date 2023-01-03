package assignment;

public class ForPrime {
	static void check(int n) {
		int i,m=0,flag=0;
		m=n/2;
		if(n==0||n==1) {
			System.out.println(n+" Not a Prime number");
		}else {
			for(i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+" Not Prime Number");
					flag=1;
					break;
				}
			}
		}if(flag==0) {
			System.out.println(n+" Is Prime number");
		}
	}
      
	public static void main(String[] args) {
		ForPrime.check(10);
		ForPrime.check(11);
		ForPrime.check(2);
		
		}

}
