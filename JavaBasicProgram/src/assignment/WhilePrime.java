package assignment;

public class WhilePrime {
	public void check(int num) {
		int n=2,divCount=0;
		while(n<=num /2) {
			if(num % 2==0) {
				divCount++;
				break;
			}
			n++;
		}
		if(divCount==0) {
			System.out.println(num+" is a Prime Number");
		}
		else {
			System.out.println(num+" is Not a Prime Number");
		}
	}

	public static void main(String[] args) {
		
		WhilePrime p=new WhilePrime();
		p.check(25);
		p.check(22);
		p.check(101);

	}

}
