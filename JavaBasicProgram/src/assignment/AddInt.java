package assignment;

public class AddInt {
	public int add(int a,int b) {
		System.out.println("First Number:"+a);
		System.out.println("First Number:"+b);
		return(a+b);
	}

	public static void main(String[] args) {
		AddInt a1=new AddInt();
		System.out.println("Addition:"+a1.add(10,3));
	}

}
