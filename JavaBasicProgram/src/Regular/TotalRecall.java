package Regular;

public class TotalRecall {
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Non satic block1");
	}
	float sal,id ;//non static global variable
	static int eid;//static global variable
	TotalRecall(){
		this(19f);
		System.out.println("Zero param constructor");
	}
	TotalRecall(float id){
		System.out.println("id:"+id);
		System.out.println("id:"+this.id);
		this.id=id;
		System.out.println("id:"+this.id);
	}
   static void display() {
	  
    	System.out.println("Static Method");
    	
    }
   static void display(int eid,float sal) {
	   System.out.println("Eid St:"+eid);
	   System.out.println("Salary St:"+sal);
   }
   void print(){
	  
	   System.out.println("Salary NS:"+sal);
	   this.print(15,18f);
   }
   {
	  
	   System.out.println("Non static block2");
	   print();
   }
   void print(int eid,float sal){
	   System.out.println("Eid NS OVerL:"+eid);
	   System.out.println("Salary NS OVerL:"+sal);
	   System.out.println("Salary Global:"+this.sal);
	   this.sal=sal;
	   System.out.println("Salary Global use this:"+this.sal);
   }
   static {
System.out.println("Static Block2");
   }
	public static void main(String[] args) {
		final int age=33;
		TotalRecall t=new TotalRecall();
		//TotalRecall t1=new TotalRecall(26f);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+t.sal);
		System.out.println("Eid:"+eid);
		display();
		display(10,12f);
		//t.print();
		

	}

}
