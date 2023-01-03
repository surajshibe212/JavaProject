package opps;
class Animal9{
	void eat() {
		System.out.println("Animal eat");
	}
	
}
class Herbivo extends Animal9{
	void eat() {
		System.out.println("Herbvose eat");
	}
}
class Carni extends Animal9{
	void eat() {
		System.out.println("Carniverso eat");
	}
}
public class RunPoly {

	public static void main(String[] args) {
		Animal9 a=new Animal9();
		a.eat();
		Animal9 a1=new Carni();
		a1.eat();

	}

}/**
 * When a method gets to know its implementation at the time of execution/rum time is known as run
 * time poly this can be achieved by using method overriding
 * 1. Inheritance
 * 2. Upcasting
 * 3. Method Overriding
 */
