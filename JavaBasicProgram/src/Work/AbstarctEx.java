package Work;
abstract class Rbi{
	abstract double getRate();
	final void loan() {
		System.out.println("As per Rbi loan");
	}
}
class Sbi extends Rbi{

	@Override
	double getRate() {
		
		return 7.5;
	}
	
}
class Axis extends Rbi{
	double getRate() {
		return 10.2;
	}
}
public class AbstarctEx {

	public static void main(String[] args) {
	 Sbi s=new Sbi();
	 s.loan();
	 System.out.println("Sbi rate:"+s.getRate());
	 Rbi r=new Axis();
	 r.loan();
	 System.out.println("Axis rate:"+r.getRate());

	}

}
