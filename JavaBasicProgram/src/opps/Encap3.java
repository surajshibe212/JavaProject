package opps;



class Demo3{
	private int a=23;
	private String b="Suraj";
	public int getA() {
		return a;
	}
	public String getB() {
		return b;
	}
	public void setA(int a) {
		this.a=a;
	}
	public void setB(String b) {
		this.b=b;
	}
}
public class Encap3 {

	public static void main(String[] args) {
		Demo3 d=new Demo3();
		//System.out.println("Private value a:"+d.a);
		//System.out.println("Private Value b:"+d.b);
		System.out.println("Private value a:"+d.getA());
		System.out.println("Private Value b:"+d.getB());
        d.setA(26);
        d.setB("Rohit");
    
        System.out.println("Private value a:"+d.getA());
		System.out.println("Private Value b:"+d.getB());
	}

}
