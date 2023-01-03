package Class;

public class Unboxing {

	public static void main(String[] args) {
		Double d=2300.6;
		System.out.println(d);
		//only object can be unboxed
		double sal=d.doubleValue();//unboxing
		System.out.println(sal);
        System.out.println(sal==d);
        
        Boolean b=true;
        boolean b1=b.booleanValue();
        System.out.println(b1);
        Integer i=34;
        double d2=i.doubleValue();
        System.out.println(d2);
	}

}
