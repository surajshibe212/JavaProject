package assignment;

public class OddEvenChk {
	public static void check(int num) {
		if(num%2==0) {
			System.out.println("The number" +num+" is Even");
		}
		else {
			System.out.println("The number "+num+" is Odd");
		}
	}

	public static void main(String[] args) {
		OddEvenChk.check(15);
	    OddEvenChk.check(10);

	}

}
