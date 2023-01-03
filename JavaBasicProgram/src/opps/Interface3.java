package opps;
interface Printable{
     int age=34;
     void print();
     }
interface Showable{
	public void show();
}
public class Interface3 implements Printable,Showable {
	static int age=45;
	public void print() {
		System.out.println("Hello print");
	}
	public void show() {
		System.out.println("Hello show");
	}

	public static void main(String[] args) {
		Interface3 obj=new Interface3();
		obj.show();
		obj.print();
		System.out.println("age:"+Printable.age);
		System.out.println("age:"+Interface3.age);
		Printable p=new Interface3();
		p.print();
		Showable s=new Interface3();
		s.show();
	}

}
