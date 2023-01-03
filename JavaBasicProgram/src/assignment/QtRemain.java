package assignment;

public class QtRemain {
	void qtr(int div,int dvs) {
		int qt=div/dvs;
		int rem=div%dvs;
		System.out.println("Quotiont:"+qt);
		System.out.println("Remainder:"+rem);
	}

	public static void main(String[] args) {
		QtRemain r=new QtRemain();
		r.qtr(52,11);
		r.qtr(52,2);
	}

}
