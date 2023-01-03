package ExceptionHandling;

public class Exception2 {

	public static void main(String[] args) {
		try {
			System.out.println("Start");
			int a=25/0;
			System.out.println(a);
			
		}
       catch(Throwable w) {
    	   System.out.println("Eception handle");
    	   System.out.println(w);
       }
		finally {
			System.out.println("Always executed");
	
		}
		System.out.println("ends");
	}
	

}
