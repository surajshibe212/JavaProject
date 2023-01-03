package ExceptionHandling;

public class Exception5 {
  public static void signaltime(long time) throws InterruptedException {
	  System.out.println("Signal started...");
	  if(time>1000) {
		  Thread.sleep(time);
		  
	  }else {
		  System.out.println("Hello ...");
	  }
	  System.out.println("Signal ends");
  }
	public static void main(String[] args) throws InterruptedException {
  System.out.println("Im main...");
  signaltime(2500);
  System.out.println("Ends..");
	}

}
