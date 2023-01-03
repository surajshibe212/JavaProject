package Class;
/**
 * Immutable Class: its value can't be changed, if you change new object will be created
 * 1. class and data variable should be declared as final
 * 2. constructor should be parameterized, to initialize final data variable
 * 3. use only getter method to get final variables value
 */
final class TestImmut{
	final String name;
	final double salary;
	TestImmut(String s1,double s){
		name=s1;
		salary=s;
	}
	public String getName() {
		return name;
	}
	public double getSal() {
		return salary;
	}
}
public class ImmutableClass {

	public static void main(String[] args) {
		TestImmut t =new TestImmut("Suraj",2500.4);
           System.out.println(t.getName());
           System.out.println(t.getSal());
           TestImmut t1 =new TestImmut("Rohit",2549.4);
           System.out.println(t1.getName());
           System.out.println(t1.getSal());
           
	}

}
