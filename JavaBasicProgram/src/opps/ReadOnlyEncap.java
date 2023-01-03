package opps;
class Demo4{
	private int pincode=102;
	public int getPincode() {
		return pincode;
	}
}
public class ReadOnlyEncap {

	public static void main(String[] args) {
		Demo4 d=new Demo4();
		System.out.println("Pincode:"+d.getPincode());

	}

}
