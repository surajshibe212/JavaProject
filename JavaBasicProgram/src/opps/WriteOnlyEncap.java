package opps;
class Demo5{
	private int pin=1023;
	public void setPin(int pin) {
		this.pin=pin;		
	}
}
public class WriteOnlyEncap {

	public static void main(String[] args) {
		Demo5 r=new Demo5();
		r.setPin(120);
		System.out.println("bye");

	}

}
