package assignment;

public class WhileDigit {
	public void digit(int n) {
		int count=0,num=n;
		while(num>0) {
			num=num/10;
			count=count+1;
		}
		System.out.println("The number of digit of "+n+" is "+count);
	}

	public static void main(String[] args) {
		WhileDigit w=new WhileDigit();
		w.digit(2564);
		w.digit(123456);

	}

}
