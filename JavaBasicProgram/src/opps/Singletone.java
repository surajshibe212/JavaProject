package opps;
class Sampleton{
	int age=23;
	private Sampleton() {
		System.out.println("Sampleton class private Constructor ");
	}
	static Sampleton singleObj=new Sampleton();
	public static Sampleton getObj() {
		return singleObj;
	}
	void display() {
		System.out.println("Age:"+age);
	}
}
public class Singletone {

	public static void main(String[] args) {
		Sampleton.getObj().display();
		Sampleton.getObj().age=24;
		Sampleton.singleObj.display();
		Sampleton s=Sampleton.getObj();
		s.age=35;
		s.display();
		s.age=65;
		Sampleton sx=Sampleton.getObj();
		sx.display();

	}

}
