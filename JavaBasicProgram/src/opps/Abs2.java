package opps;
abstract class Bikes{
	abstract void run();
	void speed(int a) {
		System.out.println("Bike speed:"+a);
	}
}
class Honda extends Bikes{
	void run() {
		System.out.println("Drive safely");
		super.speed(150);
	}
	void speed(int a) {
		System.out.println("Honda Speed" +a);
		
	}
	void color() {
		System.out.println("Honda color blue");
	}
}
public class Abs2 {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();
		h.speed(120);
		h.color();
		Bikes b=new Honda();
	   b.run();
       b.speed(170);
	}

}
