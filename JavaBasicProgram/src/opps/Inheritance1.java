package opps;

class A{
	int a=10;
	float b=7f;
}
class B extends A{
	int c=5;
	float d=4f;
	
}

public class Inheritance1 {

	public static void main(String[] args) {
A a1=new A();
System.out.println("a:"+a1.a);
System.out.println("b:"+a1.b);
B b1=new B();
System.out.println("c:"+b1.c);
System.out.println("d:"+b1.d);
System.out.println("a:"+b1.a);
System.out.println("b:"+b1.b);

	}

}
