package Regular;

public class This1 {
	public static void main(String[] args) {
		A a=new A(1);

	}

}
class A{
	A(){
		this(2);
		System.out.println("hello a");
	}
	A(int x){
		System.out.println(x);
	}
}