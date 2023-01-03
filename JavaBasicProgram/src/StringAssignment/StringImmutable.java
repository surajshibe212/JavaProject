package StringAssignment;

public class StringImmutable {
	
	/**
	 * Class and its data members should be declared as final
	 * Constructor should be parameterized, so that above data members can be initialize 
	 * Only getter() method should be written in the class for data members
	 */
	final String name;
	final double salary;
	StringImmutable(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}
class Sample1{
		public static void main(String[] args) {
			StringImmutable obj=new StringImmutable("Pune",656535);
			System.out.println(obj.getName());
			System.out.println(obj.getSalary());
//			obj.name="nbjh";
//			obj.salary=356565;
			
			StringImmutable obj2=new StringImmutable("Mumbai",2454);
			System.out.println(obj2.getName());
			System.out.println(obj2.getSalary());
		}
}
