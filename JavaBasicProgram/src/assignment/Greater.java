package assignment;

public class Greater {
         public void max(int a,int b,int c) {
        	 System.out.println("First number:"+a);
        	 System.out.println("Second number:"+b);
        	 System.out.println("Third number:"+c);
        	 if(a>b && a>c) {
        		 System.out.println("First number "+a+" is greater");
        	 }
        	 else if(b>a && b>c) {
        		 System.out.println("Second number "+b+" is greater");
        	 }else {
        		 System.out.println("Third number "+c+" is greater");
        	 }
         }
	public static void main(String[] args) {
		Greater g=new Greater();
		g.max(12, 25, 2);
        g.max(15, 5, 6);
        g.max(1, 3, 5);
        
	}

}
