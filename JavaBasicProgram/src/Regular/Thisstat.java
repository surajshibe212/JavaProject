package Regular;
class A10{
	A10(){this(25.4);
		System.out.println("Hello zero");
	}
	A10(double a){
		this(2);
	System.out.println("hello double "+a);
	}
	A10(int b){
		System.out.println("hello int"+b);
	}
}
public class Thisstat {

	public static void main(String[] args) {
		A10 c=new A10();
	}

}
