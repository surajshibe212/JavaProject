package methods;

public class OverloadNsv {
	public void sq() {
		System.out.println("No param");
	}
	public void sq(int a) {
		int sq=a*a;
		System.out.println("with int param:"+sq);
	}
	public void sq(float a) {
		float sq=a*a;
		System.out.println("with float param"+sq);
	}

	public static void main(String[] args) {

		OverloadNsv o=new OverloadNsv();
		o.sq();
		o.sq(3.1f);
		o.sq(1);
		
	}

}
