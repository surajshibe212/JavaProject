package Practice;
abstract class Shape{
	abstract void draw();
	public void print() {
		System.out.println("Print shape");
	}
	static void msg() {
		System.out.println("Message");
	}
	Shape(){
		System.out.println("Conc");
	}
}
class Rect1 extends Shape{
	public void draw() {
		System.out.println("Draw rectangle");
	}
}
class Cir extends Shape{
	public void draw() {
		System.out.println("Draw Circle");
	}
	
}
public class Abs1 {

	public static void main(String[] args) {
		Shape s=new Rect1();
		s.draw();
		s.print();
		Cir c=new Cir();
		c.draw();
		c.print();
        Shape.msg();
	}

}
