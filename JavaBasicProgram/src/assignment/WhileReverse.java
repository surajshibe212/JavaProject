package assignment;

public class WhileReverse {
	public static void rev(int n) {
		int num=n,remain,rever=0;
	while(num!=0) {
		remain=num%10;
		rever=(rever*10)+remain;
		num=num/10;
	}
	System.out.println("The reverse of number "+n+" is "+rever);
	}

	public static void main(String[] args) {
	 WhileReverse.rev(5642);
	 WhileReverse.rev(123456);
	}

}
