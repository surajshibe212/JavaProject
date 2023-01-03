package opps;
interface Drawable{
	int sal=27000;//by default public static final int sal=27000
	void draw();//by default public abstract void draw()
}
class Rect implements Drawable{
	public void draw() {
		System.out.println("Rectangle draw");
	}
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("Circle Draw");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		System.out.println("Salary:"+Drawable.sal);
		Rect r=new Rect();
		r.draw();
		Circle c=new Circle();
		c.draw();
        Drawable d=new Circle();
        d.draw();
	}

}
