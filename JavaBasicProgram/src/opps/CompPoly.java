package opps;

public class CompPoly {
   static void sum(int a,int b) {
	   int c=a+b;
	   System.out.println("Addition:"+c);
   }
   static void sum(int a,int b,int d) {
	   int c=a+b+d;
	   System.out.println("Addition:"+c);
   }
	public static void main(String[] args) {
		CompPoly.sum(56, 65, 32);
		
	}

}
