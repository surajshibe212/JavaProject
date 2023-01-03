package opps;
class Grandfather{
	Grandfather(){
		System.out.println("I am class Grandfather constructor");
	}
	void home() {
		System.out.println("I am home of Granfather");
	}
}
class Father extends Grandfather{
	Father(double a){
		super();
		System.out.println("I am Father constructor");
	}
	void myCar() {
		System.out.println("I am car of father");
	}
}
class Child extends Father{
	Child(int i){
		super(12.2);
		System.out.println("I am Child constructor");
	}
	void myBike() {
		System.out.println("I am Bike of child");
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		Child c2=new Child(5);
		c2.home();
		c2.myBike();
		c2.myCar();
		Father f2=c2;//or Father f2=new Child(5)
        f2.home();
        f2.myCar();
        Grandfather g1=c2;
        g1.home();
        
	}

}
