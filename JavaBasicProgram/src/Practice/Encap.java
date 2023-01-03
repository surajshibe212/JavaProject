package Practice;
class Add{
	private int a=10;
	private int b=12;
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setA(int a) {
		this.a=a;
	}
	public void setB(int b) {
		this.b=b;
	}
}
public class Encap {

	public static void main(String[] args) {
		Add a=new Add();
		System.out.println("a:"+a.getA());
		System.out.println("b:"+a.getB());
		a.setA(16);
		a.setB(25);
		System.out.println("Updated a:"+a.getA());
		System.out.println("Updated b:"+a.getB());

	}

}
