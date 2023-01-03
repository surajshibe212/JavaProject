package methods;

public class Interest {
static double p=1000,r=10,t=3;
 static double cal(){
	 double s=(p*t*r)/100;
	 System.out.println("Simple Interest:"+s);
	 return s;
	
}
 static double degreetofar(double temp){
	 System.out.println("Teperature is :"+temp);
	 double cal=(temp*1.8)+32;
	 System.out.println("Temperature:"+cal);
	 return cal;
	 
 }
	public static void main(String[] args) {
		System.out.println("Principal amount:"+Interest.p);
		System.out.println("Rate:"+Interest.r);
		System.out.println("Time:"+Interest.t);
        cal();
        degreetofar(30);
	}

}
