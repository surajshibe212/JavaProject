package Practice;
interface Draw{
	void dw();
	default void msg() {
		System.out.println("Default method");
	}
	static int cube(int a) {
		return a*a*a;
	}
/*	default static int print() {
		//cant write default and static together
		System.out.println("default static method");
	}   
	private void test() {
		System.out.println("Private method");
	} */
}
class Rect implements Draw{
	public void dw() {
		System.out.println("Drawing Rectangle");
	}
	
}
public class Interface1 {

	public static void main(String[] args) {
		Draw d=new Rect();
		d.dw();
		d.msg();
		System.out.println(Draw.cube(5));

	}

}
