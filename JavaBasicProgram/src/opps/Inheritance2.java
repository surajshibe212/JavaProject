package opps;

class P{
	static int a=10;
	int b=20;
}
class Q extends P{
	static int x=34;
	int y=32;
}
class C extends Q{
	static int p=9;
	int q=12;
}
public class Inheritance2 {

	public static void main(String[] args) {
	System.out.println("Class P static value:"+P.a);

	C c1=new C();
	System.out.println(c1.b);
	System.out.println(c1.q);
	System.out.println(c1.y);
	P b1=new P();
	Q a1=new Q();
	System.out.println(b1.b);
	System.out.println(a1.b);
	}

}
