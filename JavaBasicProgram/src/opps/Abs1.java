package opps;

abstract class Animal{
	abstract public void sound();
	public void sleep() {
		System.out.println("Animal sleep");
	}
}
class Pig extends Animal{
	public void sound() {
		System.out.println("Pig says wee wee");
	}
}
class Dog extends Animal{
	@Override
	public void sound() {
		System.out.println("Dog says bpw bow");
		
	}
}
public class Abs1 {

	public static void main(String[] args) {
		Pig p=new Pig();
		p.sleep();
		p.sound();
		Dog d=new Dog();
		d.sleep();
		d.sound();

	}

}
