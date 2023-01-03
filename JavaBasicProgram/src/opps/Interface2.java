package opps;
interface Bank{
	float rateOfInt();
}
class Sbi1 implements Bank{
	public float rateOfInt() {
		return 12.9f;
	}
}
class Pnb1 implements Bank{
	public float rateOfInt() {
		return 5.1f;
		
	}
}
public class Interface2 {

	public static void main(String[] args) {
		Sbi1 a=new Sbi1();
		System.out.println("SBI rate:"+a.rateOfInt());
		Pnb1 p=new Pnb1();
		System.out.println("PNB rate:"+p.rateOfInt());
        Bank b=new Pnb1();
        System.out.println("PNB  rate with interface:"+b.rateOfInt());
	}

}
