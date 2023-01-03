package Practice;
class Comp{
	void display() {
		System.out.println("Company display()");
	}
}
class Emp extends Comp{
	void display() {
		System.out.println("Employee display()");
		super.display();
	}
	void callme() {
		System.out.println("Call me");
		
	}
}
public class Inheri1 {

	public static void main(String[] args) {
		Emp e=new Emp();
		e.display();
		e.callme();
		Comp c=new Comp();
		c.display();
	
	}

}
