package methods;

public class Method1 {
    static double a=12,b=10;        //static global variables
    double c=15,d=5;      //non static global variable
    
    static double add() {
    	 	return(a+b);
    	
    }
    static void sub() {
    	System.out.println("Substraction without return type:"+(a-b));
    }
	static double add(int p,int q) {
		return(p+q);
	}
	static void sub(int p,int q) {
		System.out.println("Substraction witout retun type and param:"+(p-q));
		
	}
	public double mul() {
		return(c*d);
	}
	public void div() {
		System.out.println("Division without return type:"+(c/d));
		
	}
	public double mul(int p,int q) {
		return(p*q);
		
	}
	public void div(int p,int q) {
		System.out.println("Division without return type and param:"+(p/q));
		
	}
	public static void main(String[] args) {
		
		int n1=10,n2=12;          //local variable
		System.out.println("addition of two local var num:"+(n1+n2));
	    System.out.println("Static global variable a:"+Method1.a); 
	    System.out.println("Static global variable a:"+Method1.b);
	    Method1 g=new Method1();    //object for accessing non static variable
	    System.out.println("Non-Static global variable c:"+g.c);
	    System.out.println("Non-Static global variable d:"+g.d);
	    System.out.println("Addtion with return type:"+add());
	    sub();
		System.out.println("Addtion with return type and param:"+add(20,15));
		sub(15,11);
		System.out.println("Multiplication with return type:"+g.mul());
		g.div();
		System.out.println("Multiplication with return type and param:"+g.mul(7,5));
		g.div(12,4);
		
		
	}

}
