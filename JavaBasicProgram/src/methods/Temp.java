package methods;

public class Temp {
	static int p=200,t=2,r=6;
    public static void cal() {
    	int z=(p*r*t)/100;
    	System.out.println("Simple Interest:"+z);
    	
    }
    public static int cal1() {
    	return (p*r*t)/100;
    }
    public static void cal(int l,int m,int n) {
    	int z=(l*m*n)/100;
    	System.out.println("Simple Interest without rt and param:"+z);
    }
    public static int cal1(int x,int y,int z) {
    	return (x*y*z)/100;
    }
	public static void main(String[] args) {

		System.out.println("Principal amount:"+Temp.p);
		System.out.println("Time:"+Temp.t);
		System.out.println("Rate:"+Temp.r);
		Temp.cal();
		System.out.println("Simple interest with rt:"+Temp.cal1());
		Temp.cal(2000,5,10);
		Temp.cal(20,5,10);
		System.out.println("Simple interest with rt and param:"+Temp.cal1(100,6,2));
		System.out.println("Simple interest with rt and param:"+Temp.cal1(1000,10,4));
	}

}
