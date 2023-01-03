package assignment;
//sum of natural no=n*(n+1)/2
public class ForNaturalsum {
	//using method 
	static int snnum (int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
			
			}
		return sum;

		
	}

	public static void main(String[] args) {
		int i,num=10,sum=0;
		for(i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of first "+num+" number is " +sum);
		System.out.println("Sum of first natural number is " +snnum(11));

	}

}
