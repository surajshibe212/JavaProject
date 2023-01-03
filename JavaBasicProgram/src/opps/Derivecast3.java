package opps;
class L{
	public void test() {
		System.out.println("Class l Test");
	}
}
class M extends L{
	public void test2() {
		System.out.println("Class M test");
	}
}
class N extends M{
	void test3() {
		System.out.println("Class N test");
	}
}
public class Derivecast3 {

	public static void main(String[] args) {
		N n=new N();
		M m=(M)n;  //new N   Explicit casting
		m.test();
		m.test2();
		//m.test3();
		L l=new M();   //implicit UP casting 
		l.test();
		//l.test2();
		M m1=(M)l;
		m1.test();
		m1.test2(); //Down Casting
		//M m1=new L(); direct downcasting not possible
			

	}

}
