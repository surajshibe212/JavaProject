package assignment;

public class ForFactorpos {
	void fact(int n) {
		System.out.print("\nThe factors of "+n+" are ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		ForFactorpos f=new ForFactorpos();
		f.fact(10);
		f.fact(5);

	}

}
