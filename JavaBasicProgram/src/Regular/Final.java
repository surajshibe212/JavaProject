package Regular;

public class Final {
	final int emp=101;
	double sal=2345;
	void run() {
		System.out.println("emp:"+emp);
	}
	final int a;
	Final(){
		a=10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		final int age=87;
		System.out.println("Age:"+age);
		 //age=10;
		System.out.println("Age:"+age);
		//final float age=19;
		System.out.println("Age:"+age);
		
		Final f=new Final();
		f.run();
		System.out.println(f.sal);

	}

}
