package assignment;

public class WhileArms {
	static void arm(int n) {
		int num=n,check=0,rem;
		while(num>0) {
			rem=num%10;
			check=check+(int)Math.pow(rem, 3);
			num=num/10;
		}
		if(check==n) {
			System.out.println(n+" is an Armstrong Number");
		}else
		{
			System.out.println(n+" is Not an Armstrong Number");
		}
	}

	public static void main(String[] args) {
		WhileArms.arm(153);
		WhileArms.arm(151);
	}

}
