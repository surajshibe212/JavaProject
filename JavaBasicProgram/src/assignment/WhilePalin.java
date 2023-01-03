package assignment;

public class WhilePalin {
	public static void pal(int n) {
		int num=n,rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(rev==n) {
			System.out.println("The Number "+n+" is Palindrome");
		}
		else {
			System.out.println("The Number "+n+" is Not Palindrome");
		}
	}

	public static void main(String[] args) {
		WhilePalin.pal(12345);
		WhilePalin.pal(1221);

	}

}
