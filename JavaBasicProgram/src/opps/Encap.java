package opps;
class Demo1{
	private int empId=101;
	private double sal=2300;
	public int getEmpid() {
		return empId;
	}
	public double getSal() {
		return sal;
		
	}
	public void setEmpid(int empId) {
		this.empId=empId;
		System.out.println("Emp id is updated now...");
		
	}
	public void setSal(double sal) {
		this.sal=sal;
		System.out.println("Salary is updated now...");
	}
}
public class Encap {

	public static void main(String[] args) {
		Demo1 a=new Demo1();
		System.out.println("Private empid outside the class using getter:"+a.getEmpid());
		System.out.println("Private salary outside the class using getter:"+a.getSal());
		a.setEmpid(201);
		
		System.out.println("Updated Id Private empid outside the class using getter:"+a.getEmpid());
		a.setSal(2015.50);
		System.out.println("Updated salary Private salary outside the class using getter:"+a.getSal());

	}

}
