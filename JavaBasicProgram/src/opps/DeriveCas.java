package opps;
class Parent{
	public void home() {
		System.out.println("Parent home");
	}
	public void farm() {
		System.out.println("Parent farm");
	}
}
class Chil extends Parent{
	public void car() {
		System.out.println("Child car");
	}
	public void bike() {
		System.out.println("Child bike");
	}
	
}
public class DeriveCas {

	public static void main(String[] args) {
		System.out.println("Rfff and obj of child");
		Chil c=new Chil();
		c.car();
		c.bike();
		c.home();
		c.farm();
		System.out.println("ref and obj of parent");
        Parent p=new Parent();
        p.home();
        p.farm();
       System.out.println("Ref parent obj child");
       Parent s=new Chil(); //auto or up implicit cast
       s.home();
       s.farm();
       Parent p2=(Parent)c;  //explicit up cast
       p2.home();
       p2.farm();
       
       
       
	}

}
