package opps;

public class Casting {

	public static void main(String[] args) {
		int a=10;
		double myd=a;  //implicit widening  java compiler doing casting
		double d=(double)a;//explicit widening programmer doing casting
		System.out.println(a);
		System.out.println(myd);
		System.out.println(d);
		
		double sal=2501.1256478;
		int s=(int)sal; //explicit narrowing casting   programmer is doing casting
		long f=(long)sal; //explicit narrowing //programmer doing
		float r=(float)sal; //explicit narrowing
		double q=sal;  //implicit narrowing
		System.out.println(sal);
		System.out.println(s);
		System.out.println(f);
		System.out.println(r);
		System.out.println(q);
		byte m=(byte)sal;
		System.out.println(m);
		short w=(short)sal;
		System.out.println(w);
		
	}

}
