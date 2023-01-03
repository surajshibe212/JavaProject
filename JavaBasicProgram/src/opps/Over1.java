package opps;
class Animal1{
	public void move() {
		System.out.println("Animal moves");
	}
}
class Dod extends Animal1{
	public void move() {
		System.out.println("Dog Moves");
	}
	public void bark() {
		System.out.println("Dog barks");
	}
}
public class Over1 {

	public static void main(String[] args) {
		Animal1 n=new Animal1();
		n.move();
		Dod d=new Dod();
		d.move();
		d.bark();
	Animal1 n2=new Dod();
	n2.move();
	}

}
