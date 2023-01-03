package day1.basics;

public class NonStaticVar {
	int eid;
	double sal;

	public static void main(String[] args) {
		int age=27;
		System.out.println("Age:"+age);
		NonStaticVar n=new NonStaticVar();
		System.out.println("Employee id:"+n.eid);
		System.out.println("Salary:"+n.sal);
		n.eid=100;
		n.sal=2500.12;
		System.out.println("Employee id:"+n.eid);
		System.out.println("Salary:"+n.sal);
        NonStaticVar n1=new NonStaticVar();
        System.out.println("Employee id:"+n1.eid);
		System.out.println("Salary:"+n1.sal);

	}

}
