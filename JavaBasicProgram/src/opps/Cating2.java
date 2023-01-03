package opps;

public class Cating2 {
      double a=12;
      double test() {
    	  System.out.println("Running test1");
    	  return 14;
      }
	public static void main(String[] args) {
		Cating2 c=new Cating2();
		float res=(float)c.test();
		c.test();
		System.out.println("Return val:"+res);
		System.out.println(c.test());
		

	}

}
