package assignment;

public class ForReverse {
     public void reverse(int n) {
    	 int remain,rever=0 ,num=n;
    	 for(;num!=0;) {
    		 remain=num%10;
    		 rever=(rever*10)+remain;
    		 num=num/10;
    		 
    	 }
    	 System.out.println("The reverse of "+n+" number is "+rever);
     }
	public static void main(String[] args) {
		ForReverse r=new ForReverse();
		r.reverse(2563);
		r.reverse(1234);

	}

}
