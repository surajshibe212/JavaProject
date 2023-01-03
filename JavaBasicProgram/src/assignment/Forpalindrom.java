package assignment;

public class Forpalindrom {
	public void palin(int n) {
		int remain,rever=0,num=n;
		for(;num!=0;) {
			remain=num%10;
			rever=(rever*10)+remain;
			num=num/10;
		}
		if(rever==n) {
			System.out.println("The number is Palindrom");
		}
		else {
			System.out.println("The number is Not Palindrom");
		}
	}

	public static void main(String[] args) {
		Forpalindrom p=new Forpalindrom();
		p.palin(123);
		p.palin(1221);
		
	}

}
