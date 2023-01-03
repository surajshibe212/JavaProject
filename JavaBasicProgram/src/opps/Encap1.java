package opps;
class Demo2{
	private int ssn;
	private double age;
	//getter and setter methods
	public int getSsn() {
		return ssn;
	}
	public double getAge() {
		return age;
		
	}
	public void setSsn(int ssn) {
		this.ssn=ssn;
		System.out.println("After upating");
	}
	public void setAge(double age) {
		this.age=age;
	}
}
public class Encap1 {

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		System.out.println("Uing Getter Private SSn:"+d.getSsn());
        System.out.println("Using Getter Private Age :"+d.getAge());
        d.setAge(25.2);
        d.setSsn(2500);
        System.out.println("Using Getter Private SSn :"+d.getSsn());
        System.out.println("Using Getter Private Age :"+d.getAge());
        
	}

}
