package assignment;

public class Positive {
     public void neg(int num) {
    	 if(num>0) {
    	System.out.println(num+" is Positive number");
    	 }else if(num<0) {
    		 System.out.println(num+" is Negative number");
    	 }else
    	 {
    		 System.out.println(" is Zero");
    	 }
     }
	public static void main(String[] args) {
		Positive n=new Positive();
        n.neg(15);
        n.neg(0);
        n.neg(-9);
	}

}
