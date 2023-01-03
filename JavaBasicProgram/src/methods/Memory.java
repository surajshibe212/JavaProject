package methods;

public class Memory {
	static int salary;  //static global variable
	int empId;         //non static global variable
	void display() {
		System.out.println("I am display()... ");
	}
	static void print() {
		System.out.println("I am print()...");
	}
	
	public static void main(String[] args) {
	//accessing static members
	System.out.println("Static variable salary:"+Memory.salary);
	Memory.print();
	//accessing non static members
	Memory m1=new Memory();
	System.out.println("Non static variable empId:"+m1.empId);
	m1.display();
	//update static members
	Memory.salary=2400;
	System.out.println("Updates salary:"+Memory.salary);
	//update non satic members
    m1.empId=101;
    System.out.println("updated empId:"+m1.empId);
    Memory m2=new Memory();
    System.out.println("New updated value:"+m2.empId);
    m2.display();
    
	}

}
