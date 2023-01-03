package assignment;

public class swap {
	public void swp(int n1,int n2) {
		int a;
		System.out.println("Before swaping number1:"+n1);
		System.out.println("Before swaping number2:"+n2);
		a=n1;
		n1=n2;
		n2=a;
		System.out.println("After swaping number1:"+n1);
		System.out.println("After swaping number2:"+n2);
	}

	public static void main(String[] args) {
		swap s=new swap();
		s.swp(21,14);
		s.swp(2, 50);

	}

}
